package ManagerStudent;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class Student {

    private String StudentID;
    private String StudentName;
    Scanner sc = new Scanner(System.in);

    public Student() {
    }

    public Student(String StudentID, String StudentName) {
        this.StudentID = StudentID;
        this.StudentName = StudentName;
    }

    public void Input() {
        System.out.print("Nhập ID:");
        StudentID = sc.nextLine();
        System.out.print("Nhập họ tên sinh viên:");
        StudentName = sc.nextLine();
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

}
