
public class Midtem1_58 {

    public static void main(String[] args) {
        Student s1 = new Student("Somsak");
        Student s2 = new Student("Somchai", 30);
        s1.setAge(18);
        MobilePhone m1 = new MobilePhone("SAMSUNG","Galaxy S7");
        MobilePhone m2 = new MobilePhone("IPhone","7S Plus ");
        m1.setOwner(s1);
        m2.setOwner(s2);
        s1.setAge(20);
        System.out.println(s1.getName() + " is " + s1.getAge() + " years old.");
        System.out.println(s2.getName() + " is " + s2.getAge() + " years old.");
        display(m1);
        display(m2);
    }
    
    public static void display(MobilePhone m){
        System.out.println(m.getBrand() + " series " + m.getSeries() + " is owned by " + m.getOwner().getName());
    }
}



public class Student {
    private String name;
    private int age;
    
    Student(String name){
        this.name = name;
    }
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
}



public class MobilePhone {
    private String brand;
    private String series;
    private Student s;
    
    MobilePhone(String brand, String series){
        this.brand = brand;
        this.series = series;
    }
    
    public void setOwner(Student s){
        this.s = s;
    }
    public Student getOwner(){
        return this.s;
    }
    
    public String getBrand(){
        return this.brand;
    }
    public String getSeries(){
        return this.series;
    }
}
