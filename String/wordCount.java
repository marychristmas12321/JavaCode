package String;

// import java.util.Scanner;

public class wordCount {

    static String reverse(String word) {
        char[] str = word.toCharArray();
        int i = 0;
        int j = str.length - 1;
        while (i < j) {
            // swap
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
        String rev = "";
        for (int k = 0; k < str.length; k++) {
            rev += str[k]; // rev
        }
        return rev;
    }

    static void main() {
        String s = "this is a code";
        s += " ";
        String rev = "";
        int ans = 0;
        String word = "";
        int palinCount = 0;
        String largest = "";
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            if(ch != ' '){
                word += ch;
            }
            else{
                String revWord = reverse(word);
                if(revWord.equals(word)){
                    palinCount++;
                }
                ans++;
                if(word.length() > largest.length()){
                    largest = word;
                }
                rev += word + " ";
                word = "";
            }
        }
        System.out.println("Largest word : " + largest);
        System.out.println("Palindrome Count : " + palinCount);
        System.out.println("Number of words : " + ans);
        System.out.println("real : " + s);
        System.out.println("reverse : " + rev);
    }
}
