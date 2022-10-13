package org.djflying.javase.corejava.io.operatefiles;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.UserPrincipal;
import java.util.ArrayList;
import java.util.List;

/**
 * Files Tester
 *
 * @author dj4817
 * @version $Id: FilesTest.java, v 0.1 2018/5/17 17:04 dj4817 Exp $$
 */
public class FilesTest {

    /**
     * the main method
     *
     * @param args
     */
    public static void main(String[] args) throws Exception {

        System.out.println("Files Tester");
        //********************************1.Reading and Writing Files BEGIN********************************//
        Path relativePath = Paths.get(Content.BASEDIR + "/config.properties");
        Path absolutePath = relativePath.toAbsolutePath();
        // 1.1 readAllBytes from a file
        byte[] bytes = Files.readAllBytes(absolutePath);
        String content = new String(bytes, "UTF-8");
        System.out.println("1.1 readAllBytes from a file: ");
        System.out.println(content);
        System.out.println();
        // 1.2 readAllLines from a file
        List<String> strings = Files.readAllLines(absolutePath);
        System.out.println("1.2 readAllLines from a file: ");
        strings.stream().forEach(s -> System.out.println(s));
        System.out.println();
        // 1.3 write a string to a file
        // Attention: it will override the original content.
        Files.write(absolutePath, "".getBytes("UTF-8"));
        String newContent = new String(Files.readAllBytes(absolutePath), "UTF-8");
        System.out.println("1.3 write a string to a file: ");
        System.out.println(newContent);
        System.out.println();
        // 1.4 append a string to a file
        Files.write(absolutePath, "base.dir=D:\\\\Workspaces\\\\JavaSE\n".getBytes("UTF-8"), StandardOpenOption.APPEND);
        Files.write(absolutePath, "base.ip=192.168.1.1\n".getBytes("UTF-8"), StandardOpenOption.APPEND);
        Files.write(absolutePath, "base.port=8080\n".getBytes("UTF-8"), StandardOpenOption.APPEND);
        String newContent2 = new String(Files.readAllBytes(absolutePath), "UTF-8");
        System.out.println("1.4 append a string to a file: ");
        System.out.println(newContent2);
        System.out.println();
        // 1.5 write a collection of lines to a file
        List<String> lines = new ArrayList<>();
        lines.add("base.dir=D:\\\\Workspaces\\\\JavaSE");
        lines.add("base.ip=192.168.1.1");
        lines.add("base.port=8080");
        Files.write(absolutePath, lines);
        String newContent3 = new String(Files.readAllBytes(absolutePath), "UTF-8");
        System.out.println("1.5 write a collection of lines to a file: ");
        System.out.println(newContent3);
        System.out.println();
        // 1.6 use InputStream/OutputStream or Reader/Writer
        InputStream inputStream = Files.newInputStream(absolutePath);
        OutputStream outputStream = Files.newOutputStream(absolutePath);
        Reader reader = Files.newBufferedReader(absolutePath, Charset.defaultCharset());
        Writer writer = Files.newBufferedWriter(absolutePath, Charset.defaultCharset());
        //********************************1.Reading and Writing Files END********************************//

        //********************************2.Creating Files and Directories BEGIN********************************//
        // 2.1 create a new directory
        Path testDirectory = Files.createDirectory(Paths.get(Content.BASEDIR + "/testdirectory"));
        System.out.println("2.1 create a new directory: ");
        System.out.println(testDirectory.toString());
        System.out.println();
        // 2.2 create intermediate directories
        Path testIntermediate = Files.createDirectories(Paths.get(Content.BASEDIR + "/testintermediate/test/intermediate"));
        System.out.println("2.2 create intermediate directories: ");
        System.out.println(testIntermediate.toString());
        System.out.println();
        // 2.3 create an empty file
        //Path testCreateFile = Files.createDirectory(Paths.get(Content.BASEDIR + "/testcreatefile"));
        //Path file = Files.createFile(testCreateFile);
        //System.out.println("2.3 create an empty file: ");
        //System.out.println(file.toString());
        //System.out.println();
        // 2.4 create a temporary file or directory
        Path testCreateTemporaryFile = Files.createDirectory(Paths.get(Content.BASEDIR + "/testcreatetemporaryfile"));
        Path newPath = Files.createTempFile(testCreateTemporaryFile, "a", ".txt");
        System.out.println("2.4 create a temporary file or directory: ");
        System.out.println(newPath.toString());
        System.out.println();
        //********************************2.Creating Files and Directories END********************************//

        //********************************3.Copying, Moving and Deleting Files BEGIN********************************//
        // 3.1 copy a file
        //Path copyPath = Files.copy(absolutePath, Paths.get(Content.BASEDIR + "/copydirectory/"));
        //System.out.println("3.1 copy a file:");
        //System.out.println(copyPath.toString());
        // 3.2 move a file

        // 3.3 delete a file
        //********************************3.Copying, Moving and Deleting Files END********************************//

        //********************************4.Getting File Information BEGIN********************************//
        // 4.1 get file size
        long fileSize = Files.size(Paths.get(Content.BASEDIR + "/PathsTest.java"));
        System.out.println("4.1 get file size: ");
        System.out.println("the size of PathsTest.java is: " + fileSize);
        System.out.println();
        // 4.2 get file owner
        UserPrincipal userPrincipal = Files.getOwner(Paths.get(Content.BASEDIR + "/PathsTest.java"));
        System.out.println("4.2 get file owner: ");
        System.out.println("the owner of PathsTest.java is: " + userPrincipal.getName());
        System.out.println();
        // 4.3 get basic file attributes
        BasicFileAttributes attributes = Files.readAttributes(Paths.get(Content.BASEDIR + "/PathsTest.java"), BasicFileAttributes.class);
        System.out.println("4.3 get basic file attributes: ");
        System.out.println("is it a directory? " + attributes.isDirectory());
        System.out.println("created time is: " + attributes.creationTime());
        System.out.println("last accessed time is: " + attributes.lastAccessTime());
        System.out.println("last modified time is: " + attributes.lastModifiedTime());
        System.out.println("the size is: " + attributes.size());
        //********************************4.Getting File Information END********************************//

        //********************************5.Visiting Directory Entries BEGIN********************************//
        // 5.1 traversal a directory
        System.out.println("5.1 traversal a directory: ");
        try {
            Files.walk(Paths.get(Content.BASEDIR)).forEach(path -> {
                System.out.println(path.toString());
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        // 5.2 find a special file from a directory
        System.out.println("5.2 find a special file from a directory: ");
        //TODO
        // 5.3 copy one directory to another directory
        //TODO
        //********************************5.Visiting Directory Entries END********************************//

        //********************************6.Using Directory Streams BEGIN********************************//
        // 6.1 traversal a directory with newDirectoryStream method
        // Attention: can't visit all descendants of a directory
        System.out.println("6.1 traversal a directory with newDirectoryStream method: ");
        try {
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(Content.BASEDIR));
            for (Path path : directoryStream) {
                System.out.println(path.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        // 6.2 find special files from a directory
        // Attention: can't visit all descendants of a directory
        System.out.println("6.2 find special files from a directory: ");
        try {
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(Content.BASEDIR), "*.java");
            for (Path p : directoryStream) {
                System.out.println(p.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        // 6.3 traversal a directory with walkFileTree method
        System.out.println("6.3 traversal a directory with walkFileTree method: ");
        Files.walkFileTree(Paths.get(Content.BASEDIR), new SimpleFileVisitor<Path>() {

            /**
             * Invoked for a directory before entries in the directory are visited.
             * <p>
             * <p> Unless overridden, this method returns {@link FileVisitResult#CONTINUE
             * CONTINUE}.
             *
             * @param dir
             * @param attrs
             */
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                System.out.println(dir.toString());
                return FileVisitResult.CONTINUE;
            }

            /**
             * Invoked for a file in a directory.
             * <p>
             * <p> Unless overridden, this method returns {@link FileVisitResult#CONTINUE
             * CONTINUE}.
             *
             * @param file
             * @param attrs
             */
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                System.out.println(file.toString());
                return FileVisitResult.CONTINUE;
            }

            /**
             * Invoked for a file that could not be visited.
             * <p>
             * <p> Unless overridden, this method re-throws the I/O exception that prevented
             * the file from being visited.
             *
             * @param file
             * @param exc
             */
            @Override
            public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
                return FileVisitResult.SKIP_SUBTREE;
            }

            /**
             * Invoked for a directory after entries in the directory, and all of their
             * descendants, have been visited.
             * <p>
             * <p> Unless overridden, this method returns {@link FileVisitResult#CONTINUE
             * CONTINUE} if the directory iteration completes without an I/O exception;
             * otherwise this method re-throws the I/O exception that caused the iteration
             * of the directory to terminate prematurely.
             *
             * @param dir
             * @param exc
             */
            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                return FileVisitResult.CONTINUE;
            }
        });
        // 6.4 delete the directory tree
        //TODO
        //********************************6.Using Directory Streams END********************************//

    }
}
