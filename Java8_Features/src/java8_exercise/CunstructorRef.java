package java8_exercise;

interface EmployeeHolder{
    Employee constructorReferenceMethod(String name, Integer age, String city);
}
class Employee {
    String name;
    Integer age;
    String city;


    public Employee(String name, Integer age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
public class CunstructorRef {
    public static void main(String[] args) {
        EmployeeHolder emp = Employee::new;
        System.out.println(emp.constructorReferenceMethod("Emp",22,"Gzb"));
        System.out.println(emp.constructorReferenceMethod("Emp2",22,"Gzb"));
    }

}
