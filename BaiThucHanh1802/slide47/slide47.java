/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide47;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class slide47 {
    public static void main(String[] args) {
        int tong=0,num;
        Scanner sc=new Scanner(System.in);
        do {
            num=sc.nextInt();
            tong+=num;
        }while (tong<100);
        System.out.println(tong);
    }
}
