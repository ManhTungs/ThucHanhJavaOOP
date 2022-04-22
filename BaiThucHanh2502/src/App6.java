
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class App6 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("nhap n>0):");
            n=sc.nextInt();
        }while(n<=0);
        for(int i=6;i<=n;i++){
            if(check(i)) System.out.print(i+"  ");
        }
    }
    public static boolean check(int n){
        int count=0;
        for(int i=1;i<n;i++){
            if(n%i==0) count+=i;         
        }
        if(count==n) return true;
        else return false;
    }
}