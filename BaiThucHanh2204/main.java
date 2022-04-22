
import modal.FullTimeEmpoyee;
import modal.OfflineStudent;
import modal.ParTimeEmpoyee;
import modal.Student;
import modal.VIPCustomer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class main {

    public static void main(String[] args) {
        OfflineStudent student=new OfflineStudent(true, false, "2021050709", "DCCTCT65D1","học sinh bình thường" , "Nguyễn Mạnh Tùng", 19, "Đan Phượng-Hà Nội", "không tham gia", true);
        student.infoOfflineStudent();
        System.out.println("----------------------------");
        ParTimeEmpoyee empoyee1=new ParTimeEmpoyee(13, 18, "vinfast lux A 2.0 Turbor", "775400", 100, "Nguyễn Mạnh Tùng", 19, "Đan Phượng-Hà Nội", "đánh đàn");
        empoyee1.infoPartTimeEmpoyee();
        System.out.println("----------------------------");
        FullTimeEmpoyee empoyee2=new FullTimeEmpoyee(30, "BMW 530i", "775401", 300, "Nguyễn Mạnh Tùng", 19, "Đan Phượng-Hà Nội", "múa");
        System.out.println("----------------------------");
        VIPCustomer vip=new VIPCustomer("LandMark 72-Phạm Hùng", "Nguyễn Mạnh Tùng", 19, "Đan Phượng-Hà Nội", "band ngọt");
        vip.infoVIPCustomer();

    } 
}
