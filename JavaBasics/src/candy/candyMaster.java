package candy;

public class candyMaster {

    public static void main(String[] args) {
//        Define and call the object to the variables
        Candy myCandy = new Candy();

//        Set the data
        myCandy.setName("Strawberry");
        myCandy.setPrice(20000);
        myCandy.setQuantitiy(12);

//        Get & print the data
        System.out.println("Output the data from Candy is : ");
        System.out.println(myCandy.getName());
        System.out.println(myCandy.getPrice());
        System.out.println(myCandy.getQuantitiy());
    }

}
