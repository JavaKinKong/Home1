public class Student {
    String name;
    int age;
    private int point;

    String Name(String Name) {
        return name = Name;
    }
    int Age(int Age) {
        age = Age;
        return age;
    }

    public void setLess(int estimation) {
        point += estimation;
    }
    public int getLess() {
        return point;
    }
}
