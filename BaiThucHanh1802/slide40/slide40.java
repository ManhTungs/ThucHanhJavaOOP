/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide40;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class slide40 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ngay;
        System.out.print("nhap ngay: ");
        ngay=sc.nextInt();
        while(ngay<0&&ngay>7){
            System.out.println("yeu cau nhap ngay tu 0-7");
                ngay=sc.nextInt();
        }
        switch(ngay){
            case 0 : System.out.println("chu nhat");break;
            case 2 : System.out.println("thu hai");break;
            case 3 : System.out.println("thu ba");break;
            case 4 : System.out.println("thu tu");break;
            case 5 : System.out.println("thu nam");break;
            case 6 : System.out.println("thu sau");break;
            case 7 : System.out.println("thu bay");break;
        }
    }
}
