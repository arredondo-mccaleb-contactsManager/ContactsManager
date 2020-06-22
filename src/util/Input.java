package util;
import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public void clearNextLine() {
        this.scanner.nextLine();
    }

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        return this.scanner.nextLine();
    }

    public boolean yesNo(){
        String userInput = this.scanner.next();
        return userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y");
    }

    //better practice instructor walk through. .hasNextInt() returns boolean. Uses recursion instead of loop, but had to use "scanner.next()" to clear out scanner and allows for a new input from user.
//        public int getInt(){
//            if (scanner.hasNextInt()){
//                return scanner.nextInt();
//            }else {
//                System.out.println("Invalid Input. Enter Valid integer.");
//                scanner.next();
//                return getInt();
//            }
//        }
//    private static int integer;
    public int getInt(){
        try {
            int integer = Integer.valueOf(getString());
            return integer;
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
            System.out.println("Invalid Input. Enter Valid integer.");
            return getInt();
        }
    }


    //instructor walk through using recursion
    public int getInt(int min, int max) {
        int userInt = getInt();
        if (userInt >= min && userInt <= max){
            return userInt;
        }else {
            System.out.println("Please enter an integer in the correct range of " + min + "-"+ max);
            return getInt(min, max);
        }
    }

//    public double getDouble(){
//        return this.scanner.nextDouble();
//    }

    public double getDouble(){
        try {
            double dub = Double.valueOf(getString());
            return dub;
        }catch (NumberFormatException e){
            System.out.println("Invalid Input. Enter Valid double.");
            System.out.println(e.getMessage());
            return getDouble();
        }
    }

    public double getDouble(Double min, Double max){
        double userInt = this.scanner.nextDouble();
        if (userInt < min || userInt > max) {
            boolean gateKeeper = true;
            while (gateKeeper) {
                System.out.printf("That integer is not within the bounds.\nPlease enter an integer between %f and %f", min, max);
                int userInt2 = this.scanner.nextInt();
                if (userInt2 >= min && userInt2 <= max) {
                    gateKeeper = false;
                }
            }
        }
        return userInt;
    }
}
