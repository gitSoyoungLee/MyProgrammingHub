import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[9];
        for(int i=0;i<9;i++){
            arr[i]=sc.nextInt();
        }
        
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        System.out.print(sortedArr[8]+" ");
        
        for(int i=0; i<9; i++){
            if(arr[i]==sortedArr[8]) {
                System.out.print(i+1);
                break;
            }
        }
        
    }
}