package String;

// import java.util.Scanner;

public class palindrome {
    static void main() {
        String s = "this is a code"; 
        s += " ";

        

        // reverse then check
        char[] str = s.toCharArray();
        int i = 0;
        int j = str.length - 1;
        while(i < j){
            // swap 
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
        String rev = "";
        for(int k = 0;k < str.length;k++){
            rev += str[k]; // rev 
        }
        if(rev.equals(s)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
