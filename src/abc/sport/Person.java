package abc.sport;

public class Person {
    private int result;
    Person calc() {
        return null;
    }
    public void set(int num) {
        this.result = num;
    }
    public void add(int num) {
        this.result = num++;
    }
    public void sub(int num) {
        this.result = result - num;
    }
    public int getResult() {
        return result;
    }
}