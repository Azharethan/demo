class Student{
     String name;
     int age;
    public void student(){
        // name="azhar";
        age=23;
        System.out.println(name+" "+ age);
    }
    
}
public class Constructor{
    public static void main(String[] args) {
        Student s = new Student();
        s.name="ethan";
        
        
        s.student();
    }
}