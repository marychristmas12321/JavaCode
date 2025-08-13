class BinarySearch{
    static void main(){
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int target = 2; // take ip 
        boolean flag = false;
        int position = -1;
        while(start <= end){
            if(start == end){
                if(target == arr[start]){
                    position = start;
                    flag = true;
                    break;
                }
                else{
                    break;
                }
            }
            int mid = (start + end) / 2;
            if(target == arr[mid]){
                position = mid;
                flag = true;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        if(flag){
            System.out.println("Found at : " + position);
        }
        else{
            System.out.println("Not Found : " + position);
        }
    }
}