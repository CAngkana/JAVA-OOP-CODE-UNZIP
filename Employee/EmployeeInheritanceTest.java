/*	ชัชภรณ์ อังคณารุ่งรัตน์
 * 	6709616418 
 */
package question2;
import java.util.ArrayList;
import java.util.Locale;
public class EmployeeInheritanceTest {
	
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new PermanentEmployee("Somchai-Hankla", 25, "IT", 8, 20000.0));
        employees.add(new PermanentEmployee("Somsong-Bunthum", 22, "IT", 4, 12000.0));
        employees.add(new HourlyEmployee("Manee-Dumnum", 21, "Production", 6, 25));
        employees.add(new HourlyEmployee("Piti-Rukthai", 25, "Production", 5, 30));
        employees.add(new HourlyEmployee("Veera-Rukdee", 30, "Production", 8, 20));

        printMonthlyPaymentSlip(employees);
    }

    public static void printMonthlyPaymentSlip(ArrayList<Employee> employees) 
    {
        if (employees == null || employees.isEmpty() ) {
            return;
        }

        for (Employee emp : employees) 
        {
            String fullName = emp.getFullName();
            String firstName = "";
            String lastName = "";
            int hyphenIndex = fullName.indexOf('-');
            
            if (hyphenIndex != -1) {
                firstName = fullName.substring(0, hyphenIndex);
                lastName = fullName.substring(hyphenIndex + 1);
            } 
            else {
                firstName = fullName;
                lastName = "-";
            }

            String department = emp.getDepartment();
            int age = emp.getAge();
            double monthlyPayment = emp.getMonthlyPayment();

            System.out.println("\n***********************************");
            System.out.printf("Payment Slip of %S%n", fullName.toUpperCase());
            System.out.println("***********************************");
            System.out.printf("%-15s: %-15s %-15s: %-15s%n", "First Name", firstName, "Last Name", lastName);
            System.out.printf("%-15s: %-15s %-15s: %d%n", "Department", department, "Age", age);
            System.out.printf(Locale.US, "%-15s: %,.2f Baht%n", "Monthly Payment", monthlyPayment);
            // ฝาก chatgpt จัดรูป format ให้

            if (emp instanceof PermanentEmployee) {
            	//instanceof คืนค่า true ถ้าวัตถุที่ทดสอบเป็น instance ของ classname ถ้าไม่เช่นนั้น = false
                PermanentEmployee permEmp = (PermanentEmployee) emp;
                double socialSecurity = permEmp.getSocialSecurityDeduction();
                 System.out.printf(Locale.US, "%-15s: %,.2f Baht%n", "Social Security", socialSecurity);
            }

            System.out.println("***********************************");
        } //จบ foreach
    } //จบ main
}
