//Question
    //WAP to reads an integer and find the reverse of the integer.
//Answer

import javax.swing.*;
public class ReverseInteger {
    public static void main(String[] args) {
        long number= Long.parseLong(JOptionPane.showInputDialog("Enter the number to reverse"));
        long originalNumber=number;
        String str= "";
        while(number>0){
            str+=number % 10;
            number=number/10;
        }
        JOptionPane.showMessageDialog(null, "The reverse of the string "+originalNumber+" is "+str);
    }
}
