/*
5. Write a program to print the following pattern :
*****
****
***
**
* 
 */
import java.util.Scanner;
public class Pattern_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
