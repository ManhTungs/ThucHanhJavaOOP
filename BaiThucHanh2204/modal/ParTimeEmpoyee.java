/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modal;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ParTimeEmpoyee extends Employee {

    private int Starhour;
    private int EndHour;
    private String Vehicles;

    public ParTimeEmpoyee(int Starhour, int EndHour, String Vehicles, String CodeEmployee, float salary, String Name, int Age, String Address, String Telent) {
        super(CodeEmployee, salary, Name, Age, Address, Telent);
        this.Starhour = Starhour;
        this.EndHour = EndHour;
        this.Vehicles = Vehicles;
    }

    public int getStarhour() {
        return Starhour;
    }

    public void setStarhour(int Starhour) {
        this.Starhour = Starhour;
    }

    public int getEndHour() {
        return EndHour;
    }

    public void setEndHour(int EndHour) {
        this.EndHour = EndHour;
    }

    public void WorkingTime() {
        System.out.println("giờ bắt đầu: " + Starhour);
        System.out.println("giờ kết thúc: " + EndHour);
    }

    public void infoPartTimeEmpoyee() {
        infoEmployee();
        WorkingTime();
        System.out.println("phương tiện đi làm:" + Vehicles);
    }

}
