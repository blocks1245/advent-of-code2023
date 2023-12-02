package day2;

import java.util.ArrayList;

public class Game {
    private ArrayList<Set> sets = new ArrayList<>();
    private int ID;
    public Game(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void addSet(Set set) {
        sets.add(set);
    }

    public ArrayList<Set> getSets() {
        return sets;
    }

    public Integer getMinColourPower() {
        int power;
        int minRed = 0;
        int minGreen = 0;
        int minBlue = 0;

        for (Set set : sets) {
            if (set.getRed() > minRed) {
                minRed = set.getRed();
            }
            if (set.getGreen() > minGreen) {
                minGreen = set.getGreen();
            }
            if (set.getBlue() > minBlue) {
                minBlue = set.getBlue();
            }
        }
        power = minRed * minGreen * minBlue;
        return power;
    }
}
