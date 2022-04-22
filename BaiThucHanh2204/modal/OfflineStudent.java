/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modal;

/**
 *
 * @author Admin
 */
public class OfflineStudent extends Student {

    private boolean DaKhaiBaoYTeVoiNhaTruong;
    private boolean DuongTinhCovid19;

    public OfflineStudent(boolean DaKhaiBaoYTeVoiNhaTruong, boolean DuongTinhCovid19, String CodeStudent, String CodeClass, String PositionOnClass, String Name, int Age, String Address, String Club, boolean coDon) {
        super(CodeStudent, CodeClass, PositionOnClass, Name, Age, Address, Club, coDon);
        this.DaKhaiBaoYTeVoiNhaTruong = DaKhaiBaoYTeVoiNhaTruong;
        this.DuongTinhCovid19 = DuongTinhCovid19;
    }

    public boolean isDaKhaiBaoYTeVoiNhaTruong() {
        return DaKhaiBaoYTeVoiNhaTruong;
    }

    public void setDaKhaiBaoYTeVoiNhaTruong(boolean DaKhaiBaoYTeVoiNhaTruong) {
        this.DaKhaiBaoYTeVoiNhaTruong = DaKhaiBaoYTeVoiNhaTruong;
    }

    public boolean isDuongTinhCovid19() {
        return DuongTinhCovid19;
    }

    public void setDuongTinhCovid19(boolean DuongTinhCovid19) {
        this.DuongTinhCovid19 = DuongTinhCovid19;
    }

    public void statusGoToSchool() {
        if (DuongTinhCovid19 == false && DaKhaiBaoYTeVoiNhaTruong == true) {
            System.out.println("đủ điều kiện đến trường");
        } else {
            System.out.println("không đủ điều kiện đến trường");
        }
    }

    public void infoOfflineStudent() {
        infoStudent();
        statusGoToSchool();
    }
}
