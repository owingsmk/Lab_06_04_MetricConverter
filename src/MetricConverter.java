import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {

        //Declare variables

        //Create scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("Please give a measurement in meters: ");
        double meters = input.nextDouble(); //user input for needed variable
        //Formulas to figure meters to the variable needed
        double miles = (meters/1609)
        double feet = (meters/0.305)
        double inches = (meters*39.37)

        if (meters<0){
            System.out.println(meters + " is an Invalid Variable");
        }

        System.out.print("Converted to miles: " + miles);
        System.out.print("Converted to miles: " + feet);
        System.out.print("Converted to miles: " + inches);

    }
}