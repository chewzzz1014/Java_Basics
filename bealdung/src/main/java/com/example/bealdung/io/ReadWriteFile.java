package com.example.bealdung.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadWriteFile {

    public static void main(String[] args) {

    }


    // transform InputStream to String
    private static String readFromInputStream(InputStream inputStream) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
        }
        return stringBuilder.toString();
    }

    // read file on classpath
    public void readFileFromClassPath() throws IOException {
        Class currentClass = ReadWriteFile.class;
        InputStream inputStream = currentClass.getResourceAsStream("/fileTest.txt");
        String data = readFromInputStream(inputStream);
    }


    // read small file (Files class)
    public void readSmallFile() throws IOException {
        Path path = Paths.get("src/test/resources/fileTest.txt");
        String read = Files.readAllLines(path).get(0);
    }


    // read large file
    public void readLargeFile() throws IOException {
        Path path = Paths.get("src/test/resources/fileTest.txt");
        BufferedReader reader = Files.newBufferedReader(path);
        String line = reader.readLine();
    }


    // read file in form of stream
    public void readFileStream() throws URISyntaxException, IOException {
        Path path = Paths.get(
                getClass()
                        .getClassLoader()
                        .getResource("fileTest.txt").toURI()
        );

        Stream<String> lines = Files.lines(path);
        String data = lines.collect(Collectors.joining("\n"));
        lines.close();
    }

}
