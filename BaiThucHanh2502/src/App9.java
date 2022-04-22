/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class App9 {
    public static void main(String[] args) {
        long n, m=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap n:");
        n=sc.nextLong();
        while(n>0){
            m*=10;
            m+=n%10;
            n/=10;
        }
        System.out.println("so dao nguoc la "+ m);
    }
}
