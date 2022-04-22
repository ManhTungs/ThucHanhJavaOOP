/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modal;

/**
 *
 * @author Admin
 */
public class FullTimeEmpoyee extends Employee {

    private float Subsidize;
    private String Vehicles;

    public FullTimeEmpoyee(float Subsidize, String Vehicles, String CodeEmployee, float salary, String Name, int Age, String Address, String Telent) {
        super(CodeEmployee, salary, Name, Age, Address, Telent);
        this.Subsidize = Subsidize;
        this.Vehicles = Vehicles;
    }
    public void StatusWorking(){
        System.out.println("làm cả ngày");
    }
    public void infoFullTimeEmpoyee(){
        infoEmployee();
        StatusWorking();
        System.out.println("phương tiện di chuyển:"+Vehicles);
    }
}
