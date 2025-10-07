public class thisWithout {
    int age;
    String name;

    thisWithout(int ag, String nam) {
        age = ag;
        name = nam;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        thisWithout obj = new thisWithout(21, "Afrin");
        obj.displayInfo();
        System.out.println(obj.age);
    }
}