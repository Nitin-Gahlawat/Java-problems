//Question 
    //WAP to Dispaly Unicode in a GUI.
//Answer
import javax.swing.JOptionPane;
public class DisplayUnicode {
    public static void main(String[] args) {
        String str="\u6b22 \u8fce \u03b1 \u03b2 \u03b3 ";
        String title="\u6B22 \u8FCE WELCOME";
        JOptionPane.showMessageDialog(null,str ,title,JOptionPane.INFORMATION_MESSAGE);
    }
}
