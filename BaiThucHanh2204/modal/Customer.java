/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modal;

/**
 *
 * @author Admin
 */
public class Customer extends Person{
    private int DiemTichLuy;
    private String FormalityOder;

    public Customer(int DiemTichLuy, String FormalityOder, String Name, int Age, String Address) {
        super(Name, Age, Address);
        this.DiemTichLuy = DiemTichLuy;
        this.FormalityOder = FormalityOder;
    }

    public int getDiemTichLuy() {
        return DiemTichLuy;
    }

    public void setDiemTichLuy(int DiemTichLuy) {
        this.DiemTichLuy = DiemTichLuy;
    }

    public String getFormalityOder() {
        return FormalityOder;
    }

    public void setFormalityOder(String FormalityOder) {
        this.FormalityOder = FormalityOder;
    }
    
    public void sale(){
        if(DiemTichLuy<10){
            System.out.println("không được giảm giá");
        }else if(DiemTichLuy>=10&&DiemTichLuy<20){
            System.out.println("hóa đơn thanh toán được giảm 5%");
        }else{
            System.out.println("hóa đơn thanh toán được giảm 10%");
        }
    }
    public void infoCustomer(){
        InDuLieuCaNhan();
        sale();
    }  
}
