import javax.swing.*;

public class InputCharacterInfo {
    public static void main(String[] args) {
        char aChar;
        String input;
        input = JOptionPane.showInputDialog("Please enter a character0.");
        aChar = input.charAt(0);
        if (Character.isUpperCase(aChar)){
            System.out.println(aChar + "is uppercase.");

        }
        else {
            System.out.println(aChar + "is not uppercase.");

        }
        if (Character.isLowerCase(aChar)){
            System.out.println(aChar + "is lowercase.");

        }
        else {
            System.out.println(aChar + "is not lowercase.");
        }

    }
}
