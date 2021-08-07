import java.util.*;
  
   class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     int decimal=getValueIndecimal(n,sourceBase);
     int anybase=getValueInBase(decimal,destBase);
     System.out.println(anybase);
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