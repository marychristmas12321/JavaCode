import java.util.Scanner;

public class code {

    static boolean prime(int n){
        if(n == 1){ // 1
            return false;
        }
        if(n == 2){ // 2
            return true;
        }
        for(int i = 2;i < n;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    static void main(){
        int n;
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // number 20 -> less 20

        for(int i = 3;i < n;i += 2){
            if(i + 2 < n){
                if(prime(i) && prime(i + 2)){
                    System.out.println(i + ", " + (i + 2));
                }
            }
            else{
                break;
            }
        }
        sc.close();
    }
}