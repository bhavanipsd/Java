package interview;

public class UpperLower {

    public static void main(String[] args) {
        String s1 = "hi hello good";
        String a[] = s1.split(" ");
        

        if (a.length > 2) {
            s1 = s1.toLowerCase();  // Convert the entire string to lowercase
            a = s1.split(" ");      // Split it again after converting to lowercase
        }

    
        for (String word : a) {
            System.out.println(word);
        }
    }
}
