import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        char[] arr = s.next().toCharArray();

        int count=0;
        for(int i=0; i<arr.length;i++) {
            if(i<=arr.length -2 && arr[i]=='c' && (arr[i+1]=='=' || arr[i+1]=='-')) {
                count++;
                i+=1;
            }
            else if(i<=arr.length -3 && arr[i]=='d' && arr[i+1]=='z' && arr[i+2]=='=') {
                count++;
                i+=2;
            }
            else if(i<=arr.length -2 && arr[i]=='d' && arr[i+1]=='-') {
                count++;
                i+=1;
            }
            else if(i<=arr.length -2 && arr[i]=='l' && arr[i+1]=='j') {
                count++;
                i+=1;
            }
            else if(i<=arr.length -2 && arr[i]=='n' && arr[i+1]=='j') {
                count++;
                i+=1;
            }
            else if(i<=arr.length -2 && arr[i]=='s' && arr[i+1]=='=') {
                count++;
                i+=1;
            }
            else if(i<=arr.length -2 && arr[i]=='z' && arr[i+1]=='=') {
                count++;
                i+=1;
            }
            else count++;
        }

        System.out.println(count);
    }
}