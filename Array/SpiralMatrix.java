public class SpiralMatrix {
    static void main(){
        int[][] arr = {
            { 1,  2,  3,  4 },
            { 5,  6,  7,  8 },
            { 9, 10, 11, 12 },
            {13, 14, 15, 16 }
        };
        int n = arr.length;
        int row = n;
        int col = arr[0].length;
        int stRow = 0;
        int stCol = 0;
        int endRow = row - 1;
        int endCol = col - 1;

        int total = n * n;
        int count = 0;
        
        int sum = 0;
        while(count < total){
            for(int i = stCol;i <= endCol && count < total;i++){
                count++;
                sum += arr[stRow][i];
                System.out.print(arr[stRow][i] +", ");
            }
            stRow++;
            for(int i = stRow;i <= endRow && count < total; i++){
                count++;
                sum += arr[i][endCol];
                System.out.print(arr[i][endCol] + ", ");
            }
            endCol--;
            for(int i = endCol;i >= stCol && count < total; i--){
                System.out.print(arr[endRow][i] + ", ");
                sum += arr[endRow][i];
                count++;
            }
            endRow--;
            for(int i = endRow;i >= stRow && count < total;i--){
                System.out.print(arr[i][stCol] + ", ");
                sum += arr[i][stCol];
                count++;
            }
            stCol++;
        }
        System.out.println("\n" + sum);
    }
}
