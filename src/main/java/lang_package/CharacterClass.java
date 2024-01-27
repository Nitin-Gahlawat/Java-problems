//Question
    //WAP to show the working And Methods of the Character Wrapper Class.
//Answer
package lang_package;

public class CharacterClass {
    public static void main(String[] args) {
        Character c = Character.valueOf('a');

        System.out.println("" + Character.toLowerCase('A'));

        System.out.println("" + Character.toUpperCase(c));
        
        System.out.println("" + Character.toTitleCase('A'));
        
        System.out.println(Character.isLetter('5'));
        
        Character.isLetterOrDigit('0');

    }
}
