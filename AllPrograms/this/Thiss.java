class Student{
    String name;
    int age;

void studentInfo(String name ,int age){
    this.name = name;
    this.age= age;

System.out.println(this.name+this.age);
}
}
public class Thiss{
    public static void main(String[] args) {
        Student s1 =new Student();
        s1.studentInfo("Afrin",21);
        Student s2 = new  Student();
        s2.studentInfo("Fida", 23);
        System.out.println(s1.name);
        System.out.println(s2.age);
        gg
        
    }


}
// Clarifies we’re referring to the instance variable, not the parameter.

// Avoids name conflicts.

// Makes code more readable and consistent, especially in constructors or setters.

// if we want to  assigned parameter values to the instance variables. then we use paramete 
// Parameter name ≠ instance variable	❌ Not needed of this 
// Parameter name = instance variable	✅ Needed of this 