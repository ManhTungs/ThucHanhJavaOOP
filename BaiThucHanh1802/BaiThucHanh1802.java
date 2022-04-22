/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class BaiThucHanh1802 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,count=0; 
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap n > 0");
        n=sc.nextInt();
        while(n<0){
            System.out.println("nhap lai n > 0");
               n=sc.nextInt();
        }
            while(n>0){ 
                count+=n%10;
                n=n/10;
        }
    System.out.println(count);
    }
}