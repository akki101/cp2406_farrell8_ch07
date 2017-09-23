import javax.swing.*;

public class Alphabetize
{
    public static void main(String[] args)
    {
        String first, second, third;

        first = JOptionPane.showInputDialog("Enter first string : ");
        second = JOptionPane.showInputDialog("Enter second string : ");
        third = JOptionPane.showInputDialog("Enter third string : ");

        if(first.toLowerCase().compareTo(second.toLowerCase()) < 0 &&
                second.toLowerCase().compareTo(third.toLowerCase()) < 0)
            System.out.println("The strings are in alphabetical order");
        else
            System.out.println("The string are not in alphabetical order");
    }
}