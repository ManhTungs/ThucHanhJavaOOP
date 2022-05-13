
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class AppJava94 {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();
        hm.put(100, "Nguyen");
        hm.put(101, "Manh");
        hm.put(102, "Tung");
        for (Map.Entry<Integer, String> m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("Before invoking remove method" + hm);
        hm.remove(101);
        System.out.println("After invoking remove method" + hm);

    }
}
