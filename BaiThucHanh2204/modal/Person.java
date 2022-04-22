/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modal;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Person {

    Scanner sc = new Scanner(System.in);
    private String Name;
    private int Age;
    private String Address;

    public Person(String Name, int Age, String Address) {
        this.Name = Name;
        this.Age = Age;
        this.Address = Address;
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void NhapDuLieuCaNhan() {
        System.out.print("nhập tên :");
        Name = sc.nextLine();
        System.out.print("nhập địa chỉ:");
        Address = sc.nextLine();
        System.out.print("nhập tuổi:");
        Age=sc.nextInt();
    }
    public void InDuLieuCaNhan(){
        System.out.println("tên :"+ Name);
        System.out.println("địa chỉ:"+ Address);
        System.out.println("tuổi:"+ Age);
    }
}
