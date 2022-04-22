/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modal;

/**
 *
 * @author Admin
 */
public class Student extends Person {

    private String CodeStudent;
    private String CodeClass;
    private String PositionOnClass;
    private String Club;
    private boolean coDon;

    public String getCodeStudent() {
        return CodeStudent;
    }

    public void setCodeStudent(String CodeStudent) {
        this.CodeStudent = CodeStudent;
    }

    public String getCodeClass() {
        return CodeClass;
    }

    public void setCodeClass(String CodeClass) {
        this.CodeClass = CodeClass;
    }

    public String getPositionOnClass() {
        return PositionOnClass;
    }

    public void setPositionOnClass(String PositionOnClass) {
        this.PositionOnClass = PositionOnClass;
    }

    public String getClub() {
        return Club;
    }

    public void setClub(String Club) {
        this.Club = Club;
    }

    public Student(String CodeStudent, String CodeClass, String PositionOnClass, String Name, int Age, String Address, String Club, boolean coDon) {
        super(Name, Age, Address);
        this.CodeStudent = CodeStudent;
        this.CodeClass = CodeClass;
        this.PositionOnClass = PositionOnClass;
        this.Club = Club;
        this.coDon = coDon;
    }

    public void inClub() {
        System.out.println("tham gia Club:" + Club);
    }

    public void trangThaiCaNhan() {
        if (coDon == true) {
            System.out.println("chưa có người yêu");
        } else {
            System.out.println("đang hẹn hò");
        }
    }

    public void infoStudent() {
        InDuLieuCaNhan();
        inClub();
        trangThaiCaNhan();
    }
}
