/*
 * ชัชภรณ์ อังคณารุ่งรัตน์ Chatchaporn Angkanrungrat
 * 6709616418
 */
package question1;
import java.lang.Math;

public class Triangle {
    private double a, b, c;
    
    public void setSide(double a, double b, double c) {
        if (a>0 && b>0 && c>0 && checkTriangle(a, b, c) == 1) {
            this.a = a;
            // A = newA;
            this.b = b;
            this.c = c;
            //from now on use this new a b c
        } 
        else {
            System.out.println("Please Set each side of triangle again.");
            System.exit(0);
        }
    }
    // to check if c*c=a*a+b*b
    public int checkTriangle(double a,double b, double c) {
    	if( Math.pow(c,2)==Math.pow(a,2)+Math.pow(b,2) ) {
    		return 1;
    	}
    	else {
    		return 0;
    	}
    	
    }
    public double getArea() {
        double s=(a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    public double getA() { 
    	return a; }
    public double getB() { 
    	return b; }
    public double getC() { 
    	return c; }
}