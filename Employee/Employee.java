/*	ชัชภรณ์ อังคณารุ่งรัตน์
 * 	6709616418 
 */
package question2;
public abstract class Employee {
    private String fullName;
    private int age;
    private String department;
    private int performanceScore;

    public Employee(String fullName, int age, String department, int performanceScore) {
        this.fullName = fullName;
        this.age = age;
        this.department = department;
        this.performanceScore = performanceScore;
    }

    public abstract double getMonthlyPayment();

    public String getFullName() {
        return fullName;
    }

    public String getName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public int getPerformanceScore() {
        return performanceScore;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPerformanceScore(int performanceScore) {
        this.performanceScore = performanceScore;
    }
}


/*
 * พนักงานทุกคนมีคุณสมบัติคือ
o ชื่อ-นามสกุล(fullName) ที่มีรูปแบบการเก็บเป็นชื่อคั่นด้วย “-“ ตามด้วยนามสกุล
o อายุ(age)
o แผนก(department)
o ค่าประสิทธิภาพการทำงาน (performanceScore) ที่มีค่าระหว่าง 0-10 โดยค่ายิ่งมากแปลว่าพนักงานยิ่งมีประสิทธิภาพในการทำงานสูง
o ให้มีเมธอด getter setter ในการคืนค่า และ กำหนดค่า สำหรับคุณสมบัติทุกประการของพนักงาน (fullName, age, department, performanceScore)
o กำหนดให้พนักงานทุกประเภทมีความสามารถในการคำนวณค่าตอบแทนที่ต้องได้รับเมื่อสิ้นเดือน(getMonthlyPayment) พนักงานแต่ละประเภทมีหลักการคำนวณค่าตอบแทนแต่ละเดือนที่แตกต่างกัน กำหนดให้เมธอด getMonthlyPayment เป็น Abstract Method และ คลาส Employee เป็น Abstract Class
o สามารถคืนค่า ชื่อ (getName) นามสกุล (getLastName) โดยดูจาก fullName ของพนักงานได้
o มี overloaded constructor เพื่อให้ตั้งค่าเริ่มต้นของ fullName, age, department และ performanceScore ได้
 */