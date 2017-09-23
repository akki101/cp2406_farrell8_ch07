import javax.swing.*;

public class countWords {
    public static void main(String[] args) {
        String str;
        int numWord = 0, i, numChar;
        char [] wordEnd = {' ',',','.',';','?','!','-'};
        str = JOptionPane.showInputDialog("Enter a string to count words in it.");
        numChar = str.length();
        for(i = 0; i < numChar; ++i){
            for (char j : wordEnd){
                if (str.charAt(i) == j)  {
                    ++numWord;
                }
            }

        }
        System.out.println("The string contains "+ numWord +" words");
    }
}
