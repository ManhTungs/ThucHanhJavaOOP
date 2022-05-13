
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class AppJava108 {

    public static void main(String[] args) {
        TreeMap<Integer, Double> treeMap = new TreeMap<>();
        treeMap.put(1, 9d);
        treeMap.put(4, 10.1d);
        treeMap.put(2, 7.2d);
        treeMap.put(8, 20.28d);
        System.out.println("Các phần tử có trong treeMap:");
        Set<Map.Entry<Integer,Double>> setTreeMap=treeMap.entrySet();
        System.out.println("các entry có trong setTreeMap:");
        System.out.println(setTreeMap);
    }
}
