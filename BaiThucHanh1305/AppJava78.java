
import java.util.HashMap;
import java.util.TreeMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class AppJava78 {
    public static void main(String[] args) {
        HashMap<Integer,Float> hashMap1=new HashMap<>();
        HashMap<String,String> hashMap2=new HashMap<>(10);
        HashMap<Double,Double> hashMap3=new HashMap<>(4,0.75f);
        HashMap<Float,Integer> hashMap4=new HashMap<>(new TreeMap<>());
    }
}
