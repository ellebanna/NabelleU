
package Math;
public class Quadratic {
    public double quadPlus(double a,double b,double c) {
        return (-b + (Math.sqrt((b * b) - (4 * (a * c))))) / 2 * a;  
    }
    public double quadMinus(double a,double b,double c) {
        return (-b - (Math.sqrt((b * b) - (4 * (a * c))))) / 2 * a;  
    }  
}
