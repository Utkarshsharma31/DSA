import java.io.*;
import java.util.*;

class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=scn.nextInt();
    }
   int element=LargestElement(arr);
   System.out.println(element);
}
public static int LargestElement(int[] arr){
    int max=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(max<arr[i]){
            max=arr[i];
        }
    }
    return max;
}
}