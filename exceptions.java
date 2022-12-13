import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


//    public static void checkIfOldEnough(int age) throws ArithmeticException,Error {
//        if(age>18){
//            System.out.println("user is old enough");
//        }else{
//            throw new ArithmeticException("age is to small");
//        }
//    }


    public static int doSomething(){
            try {
                return 2;
            } catch (Exception e){
                return 3;
            } finally {
                return 4;
            }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        s.nextInt();


//        try {
//            checkIfOldEnough(10);
//        }catch (Exception e){
//            System.out.println(e);
//        }


//        System.out.println(doSomething());

//        Scanner s = new Scanner(System.in);
//
//
//        try {
//            int [] myArray = new int[3];
//            System.out.println(myArray[5]);
//            int x = s.nextInt();
//            int y = 5/0;
//
//        } catch (Exception e) {
//            System.out.println("some error: "+e);
//        } finally {
//            System.out.println("I am in finally block");
//        }




    }
}
