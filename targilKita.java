public class Main {
    public static void main(String[] args) {


        // Person p1 = new Person("Beni",20,888777666); //error Abstract class cannot be instantiated
        Person p1 = new Student("Sarah", 16, 333666123, 88, "software development");
        Person p2 = new Employee("Moshe", 48, 77999555, 18000, "Doctor");

        System.out.println(p1);
        System.out.println(p2);




    //        Person[] personsArray = {p1, p2};

    //        for (int i = 0; i < personsArray.length; i++) {
    //            personsArray[i].whoAmI();
    //        }


        //Targil kita:
        //1) create abstract class "Person": name, age, id
        //2) create 2 subclasses "Employee", "Student"
        //2.1) Employee: Salary, job
        //2.2) Student should have avgGrade, mikzoa
        //3) create instances of Student and Person (objects)

        //3.1) create abstract method in Person void whoAmI(),
        //whoAmI() should print for example
        //student: My name Is Beni and I am study software development
        //employ: My name Is Sarah and I am a Doctor and my salary is 10000
        //3.2) print those with help of Array of Persons


    }
}





abstract public class Person{

     String name;
     int age;
     int id;

    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    abstract public void whoAmI();

    @Override
    abstract public String toString();
}





public class Student extends Person {

    int avgGrade;
    String mikzoa;

    public Student(String name, int age, int id, int avgGrade, String mikzoa) {
        super(name, age, id);
        this.avgGrade = avgGrade;
        this.mikzoa = mikzoa;
    }

    @Override
    public void whoAmI() {
        System.out.println("My name Is "+this.name +" and I am study "+this.mikzoa);
    }

    @Override
    public String toString() {
        return "Student{" +
                "avgGrade=" + avgGrade +
                ", mikzoa='" + mikzoa + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}




public class Employee extends Person {

    // Salary, job

    int salary;
    String job;


    public Employee(String name, int age, int id, int salary, String job) {
        super(name, age, id);
        this.salary = salary;
        this.job = job;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", job='" + job + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    @Override
    public void whoAmI() {
        //My name Is Sarah and I am a Doctor and my salary is 10000
        System.out.println("My name Is " + this.name + " and I am a " + this.job + " and my salary is " + this.salary);
    }
}

