/*
 *****
 *****
 *****
 *****
 *****
 
 */
import java.util.Scanner;
public class pattan_2 {
    public static void main(String[] args) {
        System.out.println("Enter Number of rows");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<=n;i++){
            for(int j=0;j<=n;j++){
                System.out.print("*");
            }
            System.out.println("5");
        }
        sc.close();
    }
    
}
