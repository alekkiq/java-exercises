package module_8_1;

public class Pen {
    private boolean capped;
    private Color color;

    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");
        private final String color;
        Color(String color) { this.color = color; };
        @Override public String toString() { return color; }
    }

    public Pen() {
        this.capped = true;
        this.color = Color.RED; // default col
    }

    public Pen(Color color) {
        this.capped = true;
        this.color = color;
    }

    public void capOn() {
        this.capped = true;
    }

    public void capOff() {
        this.capped = false;
    }

    public void changeColor(Color color) {
        if (!this.capped) return;

        this.color = color;
    }

    public String draw() {
        if (this.capped || this.color == null) return "";

        return "Drawing " + this.color;
    }
}
