package day2;

public class Set {
    private int red;
    private int green;
    private int blue;

    public Set() {
        this.red = 0;
        this.green = 0;
        this.blue = 0;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public void setRed(String red) {
        this.red = Integer.parseInt(red);
    }

    public void setGreen(String green) {
        this.green = Integer.parseInt(green);
    }

    public void setBlue(String blue) {
        this.blue = Integer.parseInt(blue);
    }

    public String toString() {
        return "red: " + red + ", green: " + green + ", blue: " + blue;
    }

    public boolean equals(Object o) {
        if (o instanceof Set) {
            Set other = (Set) o;
            return red == other.red && green == other.green && blue == other.blue;
        }
        return false;
    }

    public int hashCode() {
        return red * 1000000 + green * 1000 + blue;
    }
}
