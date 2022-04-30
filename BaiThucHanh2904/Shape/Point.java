/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shape;

/**
 *
 * @author Admin
 */
public class Point {

    private char NamePoint;
    private float HoanhDo;
    private float TungDo;

    public Point() {
    }

    
    public Point(char NamePoint, float HoanhDo, float TungDo) {
        this.NamePoint = NamePoint;
        this.HoanhDo = HoanhDo;
        this.TungDo = TungDo;
    }

    public char getNamePoint() {
        return NamePoint;
    }

    public void setNamePoint(char NamePoint) {
        this.NamePoint = NamePoint;
    }

    public float getHoanhDo() {
        return HoanhDo;
    }

    public void setHoanhDo(float HoanhDo) {
        this.HoanhDo = HoanhDo;
    }

    public float getTungDo() {
        return TungDo;
    }

    public void setTungDo(float TungDo) {
        this.TungDo = TungDo;
    }

}
