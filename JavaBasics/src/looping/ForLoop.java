package looping;
import java.util.Scanner;


public class ForLoop {
    public static void main(String[] args) {

//        Number 1
//        for(int i=1; i<=10; i++){
//            System.out.println("Roll number = " +i);
//        }

//        Number 2
//        int sum = 0;
//        for(int i=1; i<=10; i++){
//            sum += i;
//            System.out.println("The count = "+i);
//        }
//        System.out.println("Natural number : "+sum);

//        Number 3
//        Scanner inp = new Scanner(System.in);
//        System.out.println("Enter the number : ");
//        int num = inp.nextInt();
//
//        ForLoop obj = new ForLoop();
//        obj.isMultiple(num);

//        Number 4
//        for (int i=1; i<5; i++){
//            for (int j=1; j<=5; j++){
//                System.out.println("i = "+i + " " + " j ="+j);
//            }
//        }

//        Number 5

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int sc = inp.nextInt();

//        int sc = 4;

        for (int i=1; i<=sc; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }

//    Method for checking condition!
    void isMultiple(int num){
        if(num > 0){
            for (int i=1; i<10; i++){
                System.out.println(num+ " = "+i +"=" + (num*i));
            }
        }else{
            System.out.println("Invalid !! number is negative");
        }
    }
}
