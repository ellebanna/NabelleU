package IO;

import java.util.Scanner;

public class Input {

    public Input() {
    }

    public static double getInput() {
        
        try{
            Scanner input = new Scanner(System.in);
            return input.nextDouble();
        }catch(Exception e){
            Out.print("You entered Invalid Input!");
        }
        return 0;
    }
}
