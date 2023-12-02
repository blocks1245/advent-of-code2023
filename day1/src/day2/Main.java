package day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    ArrayList<Game> games = new ArrayList<>();
    Integer redMax = 12;
    Integer greenMax = 13;
    Integer blueMax = 14;

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int sum = 0;
        try {
            Scanner scanner = new Scanner(new File("src/day2/input"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                addGame(line);
            }
            for (Game game : games) {
                sum += game.getMinColourPower();
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void addGame(String line) {
        String[] lineSplit = line.split(": ");
        Game game = new Game(Integer.parseInt(lineSplit[0].replaceAll("Game ", "")));
        String[] sets = lineSplit[1].split("; ");
        for (String set : sets) {
            String[] setSplit = set.split(", ");
            Set set1 = new Set();
            for (String s : setSplit) {
                if (s.contains("red")) {
                    String[] redSplit = s.split(" ");
                    set1.setRed(redSplit[0]);
                } else if (s.contains("green")) {
                    String[] greenSplit = s.split(" ");
                    set1.setGreen(greenSplit[0]);
                } else if (s.contains("blue")) {
                    String[] blueSplit = s.split(" ");
                    set1.setBlue(blueSplit[0]);
                }
            }
            game.addSet(set1);
        }
        games.add(game);
    }
}
