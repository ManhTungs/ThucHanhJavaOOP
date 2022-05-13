
import java.util.LinkedHashMap;
import java.util.Set;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class AppJava95 {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "Java");
        linkedHashMap.put(2, "C++");
        linkedHashMap.put(3, "PHP");
        linkedHashMap.put(4, "Python");
        System.out.println("Before remove");
        show(linkedHashMap);
        linkedHashMap.remove(2);
        System.out.println("After remove");
        show(linkedHashMap);
    }

    public static void show(LinkedHashMap<Integer, String> linkedHashMap) {
        Set<Integer> keySet = linkedHashMap.keySet();
        for (Integer key : keySet) {
            System.out.println(key + " " + linkedHashMap.get(key));
        }
    }
}
