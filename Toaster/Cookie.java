/*	ชัชภรณ์ อังคณารุ่งรัตน์
 * 	6709616418 
 */
package question1;
public class Cookie implements Toastable {

    public static final String RAW = "Raw";
    public static final String COOKED = "Cooked";
    public static final String BURNT = "Burnt";

    private String state;

    public Cookie() {
        this.state = RAW;
    }

    public void setState(String state) {
         this.state = state;
    }

    public String getState() {
         return this.state;
    }


    @Override
    public String toString() {
        return "Cookie is now " + this.state;
    }

    @Override
    public void toast() {
        switch (this.state) {
            case RAW:
                this.state = COOKED;
                break;
            case COOKED:
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
