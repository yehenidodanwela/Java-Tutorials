package Tutorial07;

import java.io.*;
import java.util.*;

public class Challenge_ReadMultiDimensionalArray {
    public static void main(String[] args) {
        String filename = "numbers.txt";
        createFileIfNotExists(filename);

        // Step 2: Read file into a 2D list
        List<List<Integer>> multiDimList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.trim().split("\\s+");
                List<Integer> row = new ArrayList<>();
                for (String token : tokens) {
                    row.add(Integer.parseInt(token));
                }
                multiDimList.add(row);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // Step 3: Count number occurrences
        Map<Integer, Integer> countMap = new HashMap<>();
        for (List<Integer> row : multiDimList) {
            for (int num : row) {
                if (num > 0) {
                    countMap.put(num, countMap.getOrDefault(num, 0) + 1);
                }
            }
        }

        // Step 4: Print the 2D array and duplicates
        System.out.println("Multi-Dimensional Array:");
        for (List<Integer> row : multiDimList) {
            System.out.println(row);
        }

        System.out.println("\nPositive Numbers That Appear Multiple Times:");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("**" + entry.getKey() + "**");
            }
        }
    }

    private static void createFileIfNotExists(String filename) {
        File file = new File(filename);
        if (file.exists()) return;

        String content = "14 38 43 64 48 45 74\n" +
                "38 49 74 96 73 07 73 28\n" +
                "93 40 75 43 85 65\n" +
                "38 07 14 68 53 57 10";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(content);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

    }
}

