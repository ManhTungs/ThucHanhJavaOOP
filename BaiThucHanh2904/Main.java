
import Shape.Point;
import Shape.Triangle;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        Point a = new Point('A', 5, 3);
        Point b = new Point('B', 1, 2);
        Point c = new Point('C', 3, 4);
        Triangle tamGiac = new Triangle();
        tamGiac.checkTypeTriangle(a, b, c);
        
    }
}
