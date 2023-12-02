package day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int sum = 0;

        try {
            Scanner scanner = new Scanner(new File("src/day1/input"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                line = line.replaceAll("one", "one1one");
                line = line.replaceAll("two", "two2two");
                line = line.replaceAll("three", "three3three");
                line = line.replaceAll("four", "four4four");
                line = line.replaceAll("five", "five5five");
                line = line.replaceAll("six", "six6six");
                line = line.replaceAll("seven", "seven7seven");
                line = line.replaceAll("eight", "eight8eight");
                line = line.replaceAll("nine", "nine9nine");

                System.out.println(line);

                String lineNumbers = line.replaceAll("[^0-9]", "");

                System.out.println(lineNumbers);

                if (lineNumbers.length() != 0) {
                    String firstAndLastNumber = lineNumbers.charAt(0) + "" + lineNumbers.charAt(lineNumbers.length() - 1);
                    int firstAndLastNumberInt = Integer.parseInt(firstAndLastNumber);
                    System.out.println(firstAndLastNumberInt);
                    sum += firstAndLastNumberInt;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(sum);
    }
}

