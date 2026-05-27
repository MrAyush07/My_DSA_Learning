package Ayush.Recursion;
import java.util.*;
public class Sieve_of_Eratosthenes {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter a number: ");
        int n=sc.nextInt();
        boolean []arr=new boolean[n+1];
        sieve(n,arr);
    }
    static void sieve(int n, boolean []arr){
        for(int i=2;i*i<=n;i++){
            if(!arr[i]){
                for(int j=i*2;j<=n;j+=i){
                    arr[j]=true;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(!arr[i]){
                System.out.print(i+" ");
            }
        }
    }
}
// Time complexity of the code is : O(N*log(logN))
