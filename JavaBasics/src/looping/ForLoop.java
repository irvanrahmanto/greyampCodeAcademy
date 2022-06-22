package looping;

public class ForLoop {
    public static void main(String[] args) {

//        for(int i=1; i<=10; i++){
//            System.out.println("Roll number = " +i);
//        }

        int i;
        int sum = 0;
        int y = 10;

        for(i=1; i<=y; i++){
            sum += i;
            System.out.println("The count = "+i);
        }
        System.out.println("Natural number : "+sum);
    }
}
