/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class App10 {
    public static void main(String[] args) {
        long n, count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap n:");
        n=sc.nextLong();
        while(n>0){
            count++;
            n/=10;
        }
        System.out.println("n co "+ count+" chu so");
    }
}
