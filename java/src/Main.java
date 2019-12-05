import java.util.*;

public class Main{
    public static void main(String args[]){
        String str;
        int i;

        //user enter string
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the string : ");
        str = sc.nextLine();
        for (i = 0; i < str.length(); i++)
        {
            // Finding the character whose ASCII value fall under this range
            if (str.charAt(i) < 'A' || str.charAt(i) > 'Z' && str.charAt(i) < 'a' || str.charAt(i) > 'z'){
                // Erase function to erase the character
                str = str.substring(0, i) + str.substring(i + 1);
                i--;
            }
        }
        System.out.print(str);
    }
}
