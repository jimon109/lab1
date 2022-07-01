package P10;

public class Human {
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String name;
    int age;

    public static void main(String[] args) {
        Human jimon = new Human("Warawut",20);
        Human earn = new Human("Thidatrip",20);
        System.out.println("Human Nane is" + jimon.name);
        System.out.println("Human age is" + jimon.age);
        System.out.println("Human Nane is" + earn.name);
        System.out.println("Human age is" + earn.age);
    }


}