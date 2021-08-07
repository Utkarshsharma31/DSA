
import java.util.*;
class DecimalToAnyBase{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }
        public static int getValueInBase(int n, int b){
            // write code here
            int last=0;
            int anyBase=0;
            int pow=1;
            while(n>0){
                last=n%b;
                anyBase=anyBase+last*pow;
                pow=pow*10;
                n=n/b;
            }
            return anyBase;
        }
       
        
    
}