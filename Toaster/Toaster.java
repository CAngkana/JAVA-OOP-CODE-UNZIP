/*	ชัชภรณ์ อังคณารุ่งรัตน์
 * 	6709616418 
 */
package question1;
import java.util.ArrayList; // ต้อง import ArrayList มาใช้

//สร้าง toaster
public class Toaster {
    private ArrayList<Toastable> items;

    public Toaster() {
        this.items = new ArrayList<>();
    }

    public void add(Toastable item) {
        // เช็คก่อนว่า item ไม่ใช่ null ค่อยเพิ่มลง List
    	// addnewtoastableitem
        if (item != null) {
            this.items.add(item);
        }
    }

    public void print() {
        System.out.println("--- Current Inside Toaster ---");
        // เช็คว่ามีของในเครื่องไหม
        if (items.isEmpty()) {
            System.out.println("Toaster is empty."); // ถ้าไม่มีก็บอกว่าว่าง
        } 
        
        else {
            // ถ้ามีของวนลูปพิมพ์ของแต่ละชิ้นออกมา
            for (Toastable item : this.items) {
                 // print object item ออกมา (จะเรียก .toString() ของ item ให้เอง)
                 System.out.println(item.toString());
            }
        }
        System.out.println("------------------------");
    }
    
}