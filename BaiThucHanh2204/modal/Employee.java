/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modal;

/**
 *
 * @author Admin
 */
public class Employee extends Person{
    private String CodeEmployee;
    private float salary;
    private String Telent;

    public Employee(String CodeEmployee, float salary, String Name, int Age, String Address,String Telent) {
        super(Name, Age, Address);
        this.CodeEmployee = CodeEmployee;
        this.salary = salary;
        this.Telent=Telent;
    }
    
    public String getCodeEmployee() {
        return CodeEmployee;
    }

    public void setCodeEmployee(String CodeEmployee) {
        this.CodeEmployee = CodeEmployee;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    public void talent(){
        System.out.println("tài lẻ:"+Telent);
    }
    public void infoEmployee(){
        InDuLieuCaNhan();
        talent();
        System.out.println("tiền lương:"+salary+"$");
    }
}
