/*	ชัชภรณ์ อังคณารุ่งรัตน์
 * 	6709616418 
 */
package question1;
public class Bread implements Toastable {
    public static final String BURNT = "Burnt";
    public static final String CRISP = "Crisp";
    public static final String SOFT = "Soft";

    private String state;

    //สร้างขนมปัง
    public Bread() {
        this.state = SOFT;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }

   
    public String toString() {
        return "Bread is now " + this.state;
    }

 
    public void toast() {
        switch (this.state) {
            case SOFT:
                this.state = CRISP;
                break;
            case CRISP:
                this.state = BURNT;
                break;
            case BURNT:
                break;
            default:
                break;
        }
    }

    @Override
    public String getToastState() {
        return this.getState();
    }
}