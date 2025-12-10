//Partie aider de l'ia car fonction de base ne marchait pas


package com.jad.model;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class AsciiLoader {
    public static List<String> load(String fileName) {
        String resourcePath = fileName.startsWith("/") ? fileName : "/" + fileName;
        try (InputStream inputStream = AsciiLoader.class.getResourceAsStream(resourcePath)) {
            if (inputStream == null) {
                throw new IllegalArgumentException("File not found: " + resourcePath);
            }
            String content = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
            return List.of(content.split("\\r?\\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

