package com.javarush.task.pro.task15.task1504;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String fileOne = scanner.nextLine();
        String fileTwo = scanner.nextLine();
        try (InputStream is = Files.newInputStream(Paths.get(fileOne));
             OutputStream os = Files.newOutputStream(Paths.get(fileTwo))) {
            byte[] buffer = is.readAllBytes();
            byte[] result = new byte[buffer.length];

            for (int i = 0; i < buffer.length; i+=2) {
                byte z = buffer[i];
                if (i + 1 <= buffer.length - 1) {
                    result[i] = buffer[i + 1];
                    result[i + 1] = z;
                } else {
                    result[i] = z;
                    break;
                }

            }
            os.write(result);
        }
    }
}


