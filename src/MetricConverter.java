import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {

        //Declare variables
        double meters;
        double miles;
        double feet;
        double inches;

        //Create scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("Please give a measurement in meters: ");
        double meters = input.nextDouble(); //user input for needed variable
        //Formulas to figure meters to the variable needed
        miles = (meters/1609)
        feet = (meters/0.305)
        inches = (meters*39.37)

        System.out.print("Converted to miles: " + miles);
        System.out.print("Converted to miles: " + feet);
        System.out.print("Converted to miles: " + inches);

    }
}