package org.djflying.javase.corejava.io.operatefiles;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * file tool: list the file information
 *
 * @author David
 * @version : DU.java, v 0.1 2020/3/16 10:14 David Exp $$
 */
public class DU {

    private static final String DIR  = "dir:";
    private static final String FILE = "file:";

    public static void main(String[] args) {
        String input;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("please input the directory you want to scan(press q to exit)");
            input = sc.nextLine();
            if (input.equals("") || input.charAt(0) == 113) {
                System.exit(0);
            }
            // format the input
            String formattedInput = formatInput(input);
            // check the input
            File file = new File(formattedInput);
            if (!file.exists()) {
                System.out.println("file not exist, please check your input!");
                System.out.println();
                continue;
            }
            // scan the file list
            List<CustomFile> files = list(file);
            // sort the file list
            List<CustomFile> sortedFiles = files.stream().sorted(Comparator.comparing(CustomFile::getSize).reversed()).collect(Collectors.toList());
            // output the file list
            sortedFiles.stream().forEach(sortedFile -> {
                System.out.println(sortedFile.getType() + sortedFile.getName() + "    " + sortedFile.getSize() + "Byte(" + sortedFile.getSize() / 1024 / 1024 + "MB)");
            });
            System.out.println();
        }
    }

    /**
     * format the input
     *
     * @param input
     * @return
     */
    private static String formatInput(String input) {
        String formattedInput = "";
        if (!input.contains(":")) {
            formattedInput = input + ":";
        }
        if (input.contains("\\")) {
            formattedInput = input.replace("\\", "/");
        }
        return formattedInput;
    }

    /**
     * list all the files or directories
     *
     * @param file
     */
    private static List<CustomFile> list(File file) {

        List<CustomFile> files = new ArrayList<>();
        if (file.isFile()) {
            files.add(new CustomFile(FILE, file.getName(), getFileSize(file)));
        } else {
            for (File f : file.listFiles()) {
                if (f.isFile()) {
                    files.add(new CustomFile(FILE, f.getName(), getFileSize(f)));
                } else {
                    files.add(new CustomFile(DIR, f.getName(), getFileSize(f)));
                }
            }
        }
        return files;
    }

    /**
     * get the size of the given file
     *
     * @param file file or directory
     * @return the size
     */
    private static Long getFileSize(File file) {
        if (file.isDirectory()) {
            File[] children = file.listFiles();
            Long size = 0L;
            if (children != null && children.length > 0) {
                for (File f : children) {
                    size += getFileSize(f);
                }
            }
            return size;
        } else {
            return file.length();
        }

    }

    /**
     * the custom file object
     */
    private static class CustomFile {
        /** the file type: dir|file */
        private String type;
        /** the file name */
        private String name;
        /** the file size*/
        private Long   size;

        public CustomFile() {
        }

        public CustomFile(String type, String name, Long size) {
            this.type = type;
            this.name = name;
            this.size = size;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Long getSize() {
            return size;
        }

        public void setSize(Long size) {
            this.size = size;
        }
    }
}
