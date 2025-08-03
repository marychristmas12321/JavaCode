import java.util.Scanner;

public class pattern {
    static void main(){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        n = 3;
        int space = 0;
        for(int row = 0; row < n;row++){
            space = 2 * row - 1;
            // alphabet
            int col = 0;
            char ch = 'a';
            while(col < (n - row)){
                System.out.print(ch + " ");
                ch++;
                col++;
            }
            if(row == 0){
                ch--;
                ch--;
            }
            else{
                ch--;
            }
            // space
            while(space > 0){
                System.out.print("  ");
                space--;
            }

            // alphabet 
            while(ch >= 'a'){
                System.out.print(ch + " ");
                ch--;
            }
            System.out.println();
        }

        for(int row = 1;row < n;row++){
            char c = 'a';
            // alphabet
            int alphabet = (row + 1);
            int s = (2 * n - 1) - (2 * alphabet); // space
            // int k = 0;
            while(alphabet > 0){
                System.out.print(c + " ");
                c++;
                alphabet--;
            }
            // space
            while(s > 0){
                System.out.print("  ");
                s--;
            }

            // alphabet
            if(row == n - 1){
                c--;
                c--;
            }
            else{
                c--;
            }
            while(c >= 'a'){
                System.out.print(c + " ");
                c--;
            }
            System.out.println();
        }
        

        sc.close();
    }
}
