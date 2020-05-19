package edu.psu.structural.adapter.target;

public class ShapeType {
    private int buttonEnd;
    private int buttonBegining;
    private int buttonHelp;

    public int getButtonEnd() {
        return buttonEnd;
    }

    public void setButtonEnd(int buttonEnd) {
        this.buttonEnd = buttonEnd;
    }

    public int getButtonBegining() {
        return buttonBegining;
    }

    public void setButtonBegining(int buttonBegining) {
        this.buttonBegining = buttonBegining;
    }

    public int getButtonHelp() {
        return buttonHelp;
    }

    public void setButtonHelp(int buttonHelp) {
        this.buttonHelp = buttonHelp;
    }

    @Override
    public String toString() {
        return "ShapeType{" +
                "buttonEnd=" + buttonEnd +
                ", buttonBegining=" + buttonBegining +
                ", buttonHelp=" + buttonHelp +
                '}';
    }
}
