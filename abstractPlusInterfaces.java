public class Main {
    public static void main(String[] args) {
        
         Animal animal1 = new Dog(7,"bobik");
         Animal animal2 = new Cat(5,"lulu");

         Animal [] animalsArray = {animal1, animal2};

        for (int i = 0; i < animalsArray.length; i++) {
            animalsArray[i].eat();
        }


    }
}


public abstract class Animal {

    private int age;

    private String name;

    public int getAge() {
        return age;
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    abstract public void eat();


    public void saySomething(){
        System.out.println("i am animal and my age is " + this.age);
    }
}


public class Cat extends Animal implements AnimalActivities{
    public Cat(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("Myow Myow nyom nyom nyom");
    }

    @Override
    public void running() {
        System.out.println("I am cat I am running");
    }

    @Override
    public void sleeping() {

    }

    @Override
    public void multiply() {

    }
}




public class Dog extends Animal{

    public Dog(int age, String name) {
        super(age, name);
    }


    @Override
    public void eat() {
        System.out.println("Woof Woof NOM NOM NOM..");
    }

}




public interface AnimalActivities {


    public void running();

    public void sleeping();

    public void multiply();
}


