/*	ชัชภรณ์ อังคณารุ่งรัตน์
 * 	6709616418 
 */
package question2;
public class HourlyEmployee extends Employee {
    public static final double MIN_HOURLY_WAGE_RATE = 50.0;
    public static final int DEFAULT_HOURS_PER_SESSION = 8;
    private int workingSessionsPerMonth;

    public HourlyEmployee(String fullName, int age, String department, int performanceScore, int workingSessionsPerMonth) {
        super(fullName, age, department, performanceScore);
        this.workingSessionsPerMonth = workingSessionsPerMonth;
    }

    public int getWorkingSessionsPerMonth() {
        return workingSessionsPerMonth;
    }

    public void setWorkingSessionsPerMonth(int workingSessionsPerMonth) {
        this.workingSessionsPerMonth = workingSessionsPerMonth;
    }

    public double calculatePersonalHourlyWage() {
        int score = getPerformanceScore();
        if (score <= 5) {
            return MIN_HOURLY_WAGE_RATE;
        } else {
            double bonusFactor = (score - 5) * 0.10;
            return MIN_HOURLY_WAGE_RATE * (1.0 + bonusFactor);
        }
    }

    @Override
    public double getMonthlyPayment() {
        double hourlyWage = calculatePersonalHourlyWage();
        return hourlyWage * this.workingSessionsPerMonth * DEFAULT_HOURS_PER_SESSION;
    }
}



/*พนักงานประเภท HourlyEmployee มีคุณสมบัติพิเศษคือ
o จำนวนกะ(ชนิดเลขจำนวนเต็ม) ทำงานต่อเดือน(workingSessionsPerMonth) แต่ละคนไม่เท่ากัน
o จำนวนชั่วโมงทำงานต่อกะที่กำหนดเท่ากันสำหรับพนักงานทำงานเป็นกะทุกคนคือ 8 ชั่วโมงต่อกะ(หมายเหตุ จำนวนชม.ทำงานต่อวัน สามารถเปลี่ยนแปลงได้ในอนาคต แต่ค่าต้องเป็นค่าเดียวกันสำหรับพนักงานที่ทำงานเป็นกะทุกคน)
o อัตราค่าจ้างขั้นตํ่ารายชั่วโมง (MIN_HOURLY_WAGE_RATE) ที่เท่ากันสำหรับพนักงานทุกคนคือ 50 บาทต่อชม. ค่าจ้างขั้นตํ่านี้เป็นค่าคงที่
o อัตราค่าจ้างรายชั่วโมงรายบุคคล(calculatePersonalHourlyWage) เป็นการคำนวณหาค่าจ้างรายชั่วโมงของพนักงานที่ทำงานเป็นกะแต่ละคน โดยค่าจ้างจะแตกต่างกันขึ้นกับค่าประสิทธิภาพการทำงานของพนักงานแต่ละคน ถ้าค่าประสิทธิภาพอยู่ระหว่าง 0-5 จะได้ค่าจ้างรายชั่วโมงเท่ากับค่าจ้างขั้นตํ่า ค่าประสิทธิภาพที่เพิ่มจาก 5 ทุก 1 จะทำให้ได้ค่าจ้างรายชั่วโมงเพิ่ม 10%ของค่าจ้างขั้นตํ่า เช่น พนักงานที่มีค่าประสิทธิภาพการทำงานเป็น 6 จะได้ค่าจ้างรายชั่วโมงเพิ่ม 10%จากค่าจ้างขั้นตํ่ารายชั่วโมง
o ตรรกะการคำนวณเงินค่าตอบแทนรายเดือน(getMonthlyPayment) ของพนักงานทำงานเป็นกะ ให้คำนวณจากจำนวนชั่วโมง ค่าจ้างรายชม.ของพนักงานขึ้นกับประสิทธิภาพการทำงาน และ จำนวนกะที่ทำงานต่อเดือน
 */
