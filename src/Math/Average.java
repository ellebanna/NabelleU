package Math;

import IO.Input;
import IO.Out;

public class Average {

    public double getAverage(double[] value) {
        double sum = 0;
        int count = 0;
        for (double val : value) {
            sum += val;
            count++;
        }
        return sum / count;
    }

//    public void getInputForAverage() {
//        Out.print("How many numbers? ");
//        int size = (int) Input.getInput();
//        double array[] = new double[size];
//
//        double sum = 0;
//        for (int x = 0; x < size;) {
//            try {
//                Out.print("Enter your number: ");
//                double num = Input.getInput();
//                array[x] = num;
//                sum += num;
//                x++;
//            } catch (Exception e) {
//                Out.print("Numbers Only Please >_<");
//            }
//        }
//        Out.print("Sum: " + sum);
//        Out.print("Average: " + getAverage(array));
//    }
}
