/**
 * author: Zwh
 * create: 2022-06-27 10:36
 * version: 1.0
 * desc
 **/
public class Student {
    private String name;
    private int age;
    public static String location = "双汇";

    public void printMessage(){
        System.out.println(this.name + " " + this.age + " " + Student.location);
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student zs = new Student("张三", 18);
        Student ls = new Student("李四", 20);

        zs.printMessage();
        ls.printMessage();
    }
}
