package lesson03.classWork.composition;

public class Insect {
    private int size;
    private String color;

    public Insect (int size, String color){
        this.size =size;
        this.color = color;
    }

    public void setSize(int size) { this.size = size; }

    public void setColor(String color) { this.color = color; }

    public int getSize() { return size; }

    public String getColor() { return color; }
}
