/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modal;

import ui.Car;

/**
 *
 * @author Admin
 */
public class TaxiCar implements Car{
    public void Move(){
        System.out.println("di chuyển bằng 4 bánh xe");
    }
    public void Stop(){
        System.out.println("phanh bằng công nghệ phanh ABS ");
    }
    public void TurnRight(){
        System.out.println("rẽ phải bằng vô lăng");
    }
    public void TurnLeft(){
        System.out.println("rẽ trái bằng vô lăng");
    }
    public void Reverse(){
        System.out.println("quay đầu bằng vô lăng");
    }
}
