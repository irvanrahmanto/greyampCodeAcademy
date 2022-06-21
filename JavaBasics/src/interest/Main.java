package interest;

public class Main {
    public static void main(String[] args) {
        Interest x = new Interest();

//        x.countInterest();
        int calculateInterest = x.countInterest(10,10,10);
        System.out.println("Result for the Interest is : ");
        System.out.println(calculateInterest);
    }
}
