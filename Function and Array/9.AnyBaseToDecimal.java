import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }
    public static int getValueIndecimal(int n, int b){
        // write your code here
     
        int last=0;
        int decimal=0;
        int pow=1;
        while(n>0){
            last=n%10;
            decimal=decimal+last*pow;
            pow=pow*b;
            n=n/10;
        }
        return decimal;
    }
}