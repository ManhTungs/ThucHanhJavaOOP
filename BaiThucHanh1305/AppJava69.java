
import java.util.Scanner;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class AppJava69 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeSet<Integer> treeSetInteger = new TreeSet<>();
        System.out.print("nhập số phần tử bạn muốn nhập:");
        int n = Integer.parseInt(sc.nextLine());
        int a;
        for (int i = 0; i < n; i++) {
            System.out.print("phần tử thứ [" + (i + 1) + "]:");
            a = Integer.parseInt(sc.nextLine());
            treeSetInteger.add(a);
        }
        System.out.println("các phần tử vừa nhập vào bàn phím");
        System.out.println(treeSetInteger);
        
        int num=Integer.parseInt(sc.nextLine());
        if(!treeSetInteger.contains(num)){
            treeSetInteger.add(num);
            System.out.println("bạn đã thêm thành công");
            System.out.println(treeSetInteger);
        }else{
            System.out.println("phần tử bạn thêm đã bị trùng");
            System.out.println("thêm hàng thất bại...");
        }
    }
    
}
