package org.djflying.javase.corejava.io.operatefiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * Zip Tester
 *
 * @author dj4817
 * @version $Id: ZipTest.java, v 0.1 2018/6/11 16:40 dj4817 Exp $$
 */
public class ZipTest {

    /**
     * the main method
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {

        String zipName = args[0];
        showContents(zipName);
        System.out.println("---");
        showContents2(zipName);
    }

    /**
     * Here, we use the classic zip API
     *
     * @param zipName
     * @throws IOException
     */
    public static void showContents(String zipName) throws IOException {

        try (ZipInputStream zin = new ZipInputStream(new FileInputStream(zipName))) {
            ZipEntry entry;
            while ((entry = zin.getNextEntry()) != null) {
                System.out.println(entry.getName());
                Scanner in = new Scanner(zin, "UTF-8");
                while (in.hasNextLine()) {
                    System.out.println("   " + in.nextLine());
                }
                // DO NOT CLOSE in
                zin.closeEntry();
            }
        }
    }

    /**
     * Here, we make a Java SE 7 file system
     *
     * @param zipName
     * @throws IOException
     */
    public static void showContents2(String zipName) throws IOException {

        FileSystem fs = FileSystems.newFileSystem(Paths.get(zipName), null);
        Files.walkFileTree(fs.getPath("/"), new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) throws IOException {
                System.out.println(path);
                for (String line : Files.readAllLines(path, Charset.forName("UTF-8"))) {
                    System.out.println("   " + line);
                }
                return FileVisitResult.CONTINUE;
            }
        });
    }
}
