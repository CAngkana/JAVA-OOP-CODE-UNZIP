/*	ชัชภรณ์ อังคณารุ่งรัตน์
 * 	6709616418 
 */
package question2;
public class PermanentEmployee extends Employee {
    public static final double SOCIAL_SECURITY_RATE = 0.05;
    public static final double SOCIAL_SECURITY_CAP = 750.0;
    public static final double BONUS_RATE = 0.03;
    public static final int BONUS_THRESHOLD_SCORE = 8;
    private double salary;

    public PermanentEmployee(String fullName, int age, String department, int performanceScore, double salary) {
        super(fullName, age, department, performanceScore);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSocialSecurityDeduction() {
         return Math.min(this.salary * SOCIAL_SECURITY_RATE, SOCIAL_SECURITY_CAP);
    }

    @Override
    public double getMonthlyPayment() {
        double socialSecurityDeduction = getSocialSecurityDeduction();
        double bonus = 0.0;
        if (getPerformanceScore() >= BONUS_THRESHOLD_SCORE) {
            bonus = this.salary * BONUS_RATE;
        }
        return this.salary + bonus - socialSecurityDeduction;
    }
}


/*
 * พนักงานประเภท PermanentEmployee มีคุณสมบัติเฉพาะคือ
o มีเงินเดือนประจำ(salary)
o ตรรกะการคำนวณเงินค่าตอบแทนรายเดือน((getMonthlyPayment)ของพนักงานประจำ 
คือ เงินเดือนหักด้วยเงินส่งกองทุนประกันสังคม ยอดเงินหักส่งกองทุนประกันสังคม(socialSecurityRemittance) รัฐกำหนดให้หักเงินส่งประกันสังคมในแต่ละเดือน โดยหักจากเงินเดือน5% เช่น ถ้าเงินเดือน 10,000 บาท จะถูกหัก 500 บาททุกเดือน 
แต่จะหักสูงสุดไม่เกิน 750 บาท พนักงานที่ได้ค่าประสิทธิภาพ(performanceScore) ที่มากกว่าหรือเท่ากับ 8 จะได้ค่าเบี้ยขยันเพิ่มเป็นจำนวนเงิน 3%ของเงินเดือน
o คุณสมบัติ (Attribute) ทุกคุณสมบัติของพนักงานประเภท PermanentEmployee จะต้องประกาศ
เมธอด getter เพื่อใช้ในการคืนค่าของ Attribute
 */