//Question
    //WAP to Calculate BMI and tell the user its Category(Underweight,Normal,OverWeight,Obese).
//Answer
import javax.swing.*;
public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        double weight= Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the weight in pounds"));
        double height= Double.parseDouble(JOptionPane.showInputDialog(null,"Enter height in inches"));
        
        final double KG_PER_POUND=0.45359237;
        final double METER_PER_INCH=0.0254;

        double weightInKg=weight*KG_PER_POUND;
        double heightInMeters=height*METER_PER_INCH;

        double bmi=weightInKg/(heightInMeters*heightInMeters);
        if(bmi<18.5)
            JOptionPane.showMessageDialog(null,"The Bmi is "+bmi+"\nUnderweight");
        else if (bmi < 25)
            JOptionPane.showMessageDialog(null,"The Bmi is "+bmi+"\nNormal");
        else if (bmi<30)
            JOptionPane.showMessageDialog(null,"The Bmi is "+bmi+"\nOverWeight");
        else
            JOptionPane.showMessageDialog(null,"The Bmi is "+bmi+"\nObese");
    }
}
