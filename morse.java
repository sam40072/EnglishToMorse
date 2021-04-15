import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class morse {

    public static void main(String[] args) {
        
       Scanner myScanner = new Scanner(System.in);
       System.out.println("Enter something to be translated : ");
       String scannerInput = myScanner.nextLine();
       String newString = "";
       myScanner.close();
           
       
       for (char ch : scannerInput.toCharArray()) {
        newString = newString + EnglishToMorse(Character.toString(ch)) + " ";
       
    }
    System.out.println(newString);
}

       
    
    
    public static String EnglishToMorse(String Letter)
    {
        Map<String, String> morse = new HashMap<String, String>();
        morse.put("a", "._");
        morse.put("b", "_...");
        morse.put("c", "_._.");
        morse.put("d", "_..");
        morse.put("e", ".");
        morse.put("f", ".._.");
        morse.put("g", "__.");
        morse.put("h", "....");
        morse.put("i", "..");
        morse.put("j", ".___");
        morse.put("k", "_._");
        morse.put("l", "._..");
        morse.put("m", "__");
        morse.put("n", "_.");
        morse.put("o", "___");
        morse.put("p", ".__.");
        morse.put("q", "__._");
        morse.put("r", "._.");
        morse.put("s", "...");
        morse.put("t", "_");
        morse.put("u", ".._");
        morse.put("v", "..._");
        morse.put("w", ".__");
        morse.put("y", "_.__");
        morse.put("z", "__..");
        morse.put(" ", "   ");
        return morse.get(Letter);

    }
    
}