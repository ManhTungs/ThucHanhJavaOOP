/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManagerStudent;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Student> infoStudent = new HashSet<>();
        Student std1 = new Student();
        std1.Input();
        Student std2 = new Student();
        std2.Input();
        Student std3 = new Student();
        std3.Input();
        Student std4 = new Student();
        std4.Input();
        infoStudent.add(std1);
        infoStudent.add(std2);
        infoStudent.add(std3);
        infoStudent.add(std4);

        for (Student a : infoStudent) {
            System.out.println("ID:" + a.getStudentID() + "-Tên:" + a.getStudentName());
        }

        Student std = new Student();

        System.out.println("Bạn có muốn thêm sinh viên không\n"
                + "1.Có \n"
                + "2.Không");
        int choose = Integer.parseInt(sc.nextLine());
        if (choose == 1) {
            std.Input();
            if (infoStudent.contains(std)) {
                System.out.println("thông tin sinh viên đã bị trùng");
            } else {
                infoStudent.add(std);
                System.out.println("thêm sinh viên thành công");
            }

        }

        System.out.println("Bạn có muốn xóa sinh viên không\n"
                + "1.Có \n"
                + "2.Không");
        choose = Integer.parseInt(sc.nextLine());
        if (choose == 1) {
            std.Input();
            if (infoStudent.contains(std)) {
                infoStudent.remove(std);
                System.out.println("xóa sinh viên thành công");
            } else {
                System.out.println("sinh viên không tồn tại...");
            }
        }
    }
}
