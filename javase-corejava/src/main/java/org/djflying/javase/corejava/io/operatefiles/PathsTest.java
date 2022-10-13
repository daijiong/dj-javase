package org.djflying.javase.corejava.io.operatefiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * Paths Tester
 *
 * @author dj4817
 * @version $Id: PathsTest.java, v 0.1 2018/5/17 16:20 dj4817 Exp $$
 */
public class PathsTest {

    public static final String CONFIGFILE = "javase-corejava\\src\\main\\java\\org\\djflying\\javase\\corejava\\inputandoutput\\operatefiles\\config.properties";

    /**
     * the main method
     *
     * @param args
     */
    public static void main(String[] args) throws Exception {

        System.out.println("Paths Tester:");
        // 1.create an absolute path
        Path absolutePath = Paths.get("\\home", "harry");
        System.out.println("1.create an absolute path: " + absolutePath.toString());

        // 2.create a relative path
        Path relativePath = Paths.get("myprog", "conf", "user.properties");
        System.out.println("2.create a relative path: " + relativePath.toString());

        // 3.create a path from a config file
        Properties properties = new Properties();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(CONFIGFILE));
        properties.load(bufferedReader);
        String baseDir = properties.getProperty("base.dir");
        Path basePath = Paths.get(baseDir);
        System.out.println("3.create a path from a config file: " + basePath.toString());

        // 4.resolve a path
        Path workRelative = Paths.get("work");
        Path workPath = basePath.resolve(workRelative);
        //Path workPath = basePath.resolve("work");
        System.out.println("4.resolve a path: " + workPath.toString());

        // 5.resolveSibling a path
        Path tempPath = workPath.resolveSibling("temp");
        System.out.println("5.resolveSibling a path: " + tempPath.toString());

        // 6.relativize a path
        Path relativizePath = basePath.relativize(workPath);
        System.out.println("6.relativize a path: " + relativizePath.toString());

        // 7.normalize a path
        Path wrongPath = Paths.get("/home/harry/../fred/./input.txt");
        Path normalizePath = wrongPath.normalize();
        System.out.println("7.normalize a path: " + normalizePath.toString());

        // 8.toAbsolutePath a path
        Path toAbsolutePath = relativePath.toAbsolutePath();
        System.out.println("8.toAbsolutePath a path: " + toAbsolutePath.toString());

        // 9.get root path
        Path rootPath = absolutePath.getRoot();
        System.out.println("9.get root path: " + rootPath.toString());

        // 10.get parent path
        Path parentPath = absolutePath.getParent();
        System.out.println("10.get parent path: " + parentPath.toString());

        // 11.get filename
        Path filename = absolutePath.getFileName();
        System.out.println("11.get filename: " + filename.toString());

        // 12.to a file
        File file = absolutePath.toFile();
        System.out.println("12.to a file: " + file.toString());

    }
}
