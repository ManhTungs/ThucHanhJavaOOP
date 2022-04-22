
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class App5 {
    public static void main(String[] args) {
        int n,count=0;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("nhap n>0):");
            n=sc.nextInt();
        }while(n<=0);
        for(int i=1;i<n;i++){
            if(n%i==0) count+=i;         
        }
        if(count==n) System.out.println("la so hoan thien");
        else System.out.println("khong la so hoan thien");
    }
}
