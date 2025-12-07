package myfirstpackage;

public class MySecondClass {
    private int first;
    private int second;
    
    public MySecondClass(int first, int second) {
        this.first = first;
        this.second = second;
    }
    
    public void setFirst(int value) {
        this.first = value;
    }
    
    public void setSecond(int value) {
        this.second = value;
    }
    
    public int multiply() {
        return this.first * this.second;
    }
}