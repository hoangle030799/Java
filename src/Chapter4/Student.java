package Chapter4;

public class Student {
    //class attributes: lớp thuộc tính
    private String name;
    private int age;

//    public Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }


    public String getName() {
        return "Hoàng";
    }

    public int getAge() {
        return 25;
    }

    //class method: lớp hành động, phương pháp, chức năng
    public void learnJava() {
        System.out.println("Learn Java with Hoàng");
    }
}
