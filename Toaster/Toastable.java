/*	ชัชภรณ์ อังคณารุ่งรัตน์
 * 	6709616418 
 */
package question1;

public interface Toastable {
  
     //Method สำหรับการปิ้ง (ต้องมี แต่ละคลาสไปเขียนรายละเอียดเอง)
    void toast();

    /*	Method สำหรับดูสถานะการปิ้งปัจจุบัน (ต้องมี แต่ละคลาสไปเขียนรายละเอียดเอง)
      	return สถานะปัจจุบัน (เช่น "Soft", "Crisp", "Burnt") 	*/
    String getToastState();
}
