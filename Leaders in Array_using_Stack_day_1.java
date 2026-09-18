import java.util.*;
import java.util.Stack;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[N-1];
        Stack<Integer> st=new Stack<>();
        st.push(max);
        for(int i=N-1;0<i;i--){
            if(arr[i-1]>=max){
                max=arr[i-1];
                st.push(max);
            }
        }
        Collections.reverse(st);
        System.out.println(st);
        System.out.print("Original Array: ");
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
