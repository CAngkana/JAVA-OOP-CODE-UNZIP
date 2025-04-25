/*	ชัชภรณ์ อังคณารุ่งรัตน์
 * 	6709616418 
 */
package question1;
public class TestToaster {

    public static void main(String[] args) {
        // new object ที่ต้องใช้
        Toaster t = new Toaster(); // สร้างเครื่องปิ้ง
        Bread b = new Bread();     // สร้างขนมปัง Soft
        Cookie c = new Cookie();   // สร้างคุกกี้ Raw

        // เพิ่มขนมปังและคุกกี้ลงในเครื่องปิ้ง
        t.add(b);
        t.add(c);

        // printสถานะเริ่มต้นของของในเครื่องปิ้ง
        System.out.println("Initial state:");
        t.print();

        // ลองปิ้งขนมปังและคุกกี้ (เรียก method toast ของแต่ละอันโดยตรง)
        System.out.println("\nToasting items");
        b.toast(); // ขนมปังจะกลายเป็น Crisp
        c.toast(); // คุกกี้จะกลายเป็น Cooked

        // พิมพ์สถานะหลังจากการปิ้งครั้งแรก
        System.out.println("\nState after 1st toast:");
        t.print();

        // ลองปิ้งอีกครั้ง
        System.out.println("\nToasting items again");
        b.toast(); // ขนมปังจะกลายเป็น Burnt
        c.toast(); // คุกกี้จะกลายเป็น Burnt

        // printสถานะหลังจากการปิ้งครั้งที่สอง
        System.out.println("\nState after 2nd toast:");
        t.print();

        // ลองปิ้งครั้งที่สาม
        System.out.println("\nToasting items again (will burnt soon)");
        b.toast(); // ยังคง Burnt
        c.toast(); // ยังคง Burnt

        // print state สุดท้าย
        System.out.println("\nFinished:");
        t.print();
    }
}
