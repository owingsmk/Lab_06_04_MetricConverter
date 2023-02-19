import java.util.Scanner; //Scanner import
import java.text.DecimalFormat; //decmial format for program

public class MetricConverter {
    public static void main(String[] args) {
        DecimalFormat df2 =new DecimalFormat(".00");


        //Create scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("Please give a measurement in meters: ");
        double meters = input.nextDouble(); //user input for needed variable

        //Formulas to figure meters to the variable needed
        double miles = (meters/1609); //Declare variables
        double feet = (meters/0.305);
        double inches = (meters*39.37);

        if (meters<0){
            System.out.println(meters + " is an Invalid Variable");
            System.exit(0);
        }
        boolean = false;
        System.out.println(meters + " is an Invalid Variable");
        System.exit(0);
        System.out.println("Converted to miles: " + df2.format(miles));
        System.out.println("Converted to miles: " + df2.format(feet));
        System.out.println("Converted to miles: " + df2.format(inches));

    }
}