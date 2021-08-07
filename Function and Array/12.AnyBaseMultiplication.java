import java.util.*;
 class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
 }

 public static int getProduct(int b, int n1, int n2){
    int rv=0;
    int pow=1;
    while(n2>0){

        int d2=n2%10;
        n2=n2/10;
        int singleMultiply=getSingleDigitProduct(b,n1,d2);
         rv=getSum(b,rv,singleMultiply*pow);
         pow=pow*10;
 }
 return rv;
}
 public static int getSingleDigitProduct(int b, int n1, int d2){
    int carry =0;
    int mul=0;
    int pow=1;
    while(n1>0||carry>0){
        int d1=n1%10;
        n1=n1/10;

        int d= d1*d2+carry;

        carry=d/b;
        d=d%b;

        mul=mul+d*pow;
        pow=pow*10;

    }
    return mul;
}

 public static int getSum(int b, int n1, int n2){
    int c=0;
    int sm=0;
    int pow=1;    
    while(n1 > 0 || n2 > 0 || c > 0){
            int d1 = n1%10;
            int d2 = n2%10;
            n1=n1/10;
            n2=n2/10;
            int d = d1+d2+c;
            c=d/b;
            d=d%b;
            sm+=d*pow;
            pow=pow*10;

        }
        return sm;
   }
}