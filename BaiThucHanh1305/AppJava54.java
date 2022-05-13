
import java.util.HashSet;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class AppJava54 {

    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số phần tử:");
        int n = Integer.parseInt(sc.nextLine());
        int a;
        for (int i = 0; i < n; i++) {
            System.out.print("phần tử thứ ["+(i+1)+"]:");
            a = Integer.parseInt(sc.nextLine());
            hashSet.add(a);
        }
        System.out.println(hashSet);
        System.out.println("nhập phần tử muốn thêm");
        int num=Integer.parseInt(sc.nextLine());
        if(!hashSet.contains(num)){
            hashSet.add(num);
            System.out.println("bạn đã thêm thành công");
            System.out.println(hashSet);
        }else{
            System.out.println("phần tử bạn thêm đã bị trùng");
            System.out.println("thêm hàng thất bại...");
        }
    }
}
