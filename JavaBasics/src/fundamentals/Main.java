package fundamentals;

public class Main {

    public static void main(String[] args) {
//        Define variabel
//        String temp = "a";

//        How to print kebawah
//        System.out.println("Hello World!");

//        how to print variabel
//        System.out.println("Hello "+temp+"!  Good Morning!");
//
//        int a = 10;
//        int b = 5;

//        <dataType> <variableName> = <requiredValues>;
//        int irvan = 20;
//
//        int var1 = 10;
//        int var2 = 54;
//
//        double result;

//        if(var1 == var2){
//            System.out.println("number are equal!");
//        } else{
//            System.out.println("nos!");
//        }

//        result = (double) var1 % (double) var2;
////        result = var1 % var2;
//
//        System.out.println(result);

        int personAge = 64;
        int wifeAge = 60;
        int gap = Math.abs(personAge-wifeAge);

        if((personAge >= 50 && wifeAge >= 40) && gap <= 2){
            System.out.println("Eligible to Get bounty prize!");
        }else{
            System.out.println("Not!");
        }

    }
}
