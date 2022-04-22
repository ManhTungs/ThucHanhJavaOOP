/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package slide35;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class slide35 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap a=");
        a=sc.nextInt();
        System.out.println("nhap b=");
        b=sc.nextInt();
        System.out.println("so lon hon la "+(a>b?a:b));
              
    }
}
