import java.util.*;
public class Solution {
    public static void rotate(int[] arr,int k){
        int N=arr.length;
        int[] res=new int[N];
        int j=0;
        while(k<N-1){
            res[j]=arr[N-1];
            j++;
            N--;
        }
        

        for(int i=0;i<N;i++){
            
            res[j]=arr[i];      
            j++;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(res[i]+" ");
        }
        
       
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
       int k=sc.nextInt();
       rotate(arr,k);
        
    }
}
