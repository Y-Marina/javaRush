package com.javarush.task.pro.task15.task1517;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файловые операции
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path filePath = Path.of(scanner.nextLine());
        Path fileNewPath = Path.of(scanner.nextLine());
        //напишите тут ваш код
            if (!Files.exists(Path.of(String.valueOf(filePath)))) {
                Files.createFile(Path.of(String.valueOf(filePath)));
            } else if (!Files.exists(Path.of(String.valueOf(fileNewPath))) && Files.exists(Path.of(String.valueOf(filePath)))) {
                Files.move(filePath, fileNewPath);
            } else if (Files.exists(Path.of(String.valueOf(fileNewPath)))) {
                Files.delete(filePath);
            }
    }
}

