package Math;

import IO.Out;
import java.util.Arrays;

public class Sort {

    public Sort() {
    }

    public void getSort(double[] value) {
        double temp = 0;
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < value.length - 1; j++) {
                if (value[j + 1] < value[j]) {
                    temp = value[j + 1];
                    value[j + 1] = value[j];
                    value[j] = temp;
                }
            }
        }
//        Arrays.sort(value);
        Out.print(Arrays.toString(value));
        
//        for (int val = 0; val < value.length; ++val) {
//            System.out.print(value[val] + ", ");
//        }
    }
}
