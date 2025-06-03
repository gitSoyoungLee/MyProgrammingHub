import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int minPricePerPackage = sc.nextInt();
        int minPricePerOne = sc.nextInt();
        
        for(int i=0; i<m-1; i++){
            int pricePerPackage = sc.nextInt();
            int pricePerOne = sc.nextInt();
            
            if(minPricePerPackage > pricePerPackage) minPricePerPackage = pricePerPackage;
            if(minPricePerOne > pricePerOne) minPricePerOne = pricePerOne;
        }
        
        int price1 = minPricePerPackage * (n/6) + minPricePerOne * (n%6);
        int price2 = minPricePerPackage * (n/6 + 1);
        int price3 = minPricePerOne * n;
        int min = price1;
        if(price1 <= price2 && price1 <= price3) min = price1;
        else if(price2 <= price1 && price2 <= price3) min = price2;
        else if(price3 <= price1 && price3 <= price2) min = price3;
        
        System.out.println(min);
        
    }
}