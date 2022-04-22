/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class App7 {
    public static void main(String[] args) {
        int max=0,a;
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=100;i++){
            a=sc.nextInt();
            if(a>max){
                max=a;
            }
            if(a==0) break;
        }
        System.out.println("so lon nhat trong nhung so vua nhap la " + max);
                
    }
}
