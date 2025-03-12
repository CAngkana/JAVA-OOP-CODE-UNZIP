/*
 * ชัชภรณ์ อังคณารุ่งรัตน์ Chatchaporn Angkanrungrat
 * 6709616418
 */
package question1;
public class TestTriangle {
    public static void main(String[] args) {
    	 Triangle t1 = new Triangle();
         t1.setSide(3, 4, 5);
         
         System.out.printf("Area of Triangle with sides (%.2f, %.2f, %.2f) = %.2f\n",
                           t1.getA(), t1.getB(), t1.getC(), t1.getArea());
    }
}
