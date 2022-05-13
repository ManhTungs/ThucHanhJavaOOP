
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class AppJava98 {
    public static void main(String[] args) {
        TreeMap<String,Double> treeMap1=new TreeMap<>();
        Map<Float,Integer>map=new HashMap<>();       
        TreeMap<Float,Integer>treeMap2=new TreeMap<>(map);
    }
}
