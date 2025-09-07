import java.util.Scanner;

public class reverse {

    public static String reverseString(String str){
        String ans = "";
        for(int i = str.length() - 1;i >= 0;i--){
            ans += str.charAt(i);
        }
        return ans;
    }

    public static int checkVowel(String str){
        String vowel = "aeiouAEIOU";
        int count = 0;
        for(int i = 0;i < str.length();i++){
            char ch = str.charAt(i);
            if(vowel.indexOf(ch) != -1){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        str = sc.next();
        System.out.println(str);

        sc.close();
    }
}
