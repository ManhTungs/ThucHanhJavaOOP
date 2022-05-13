
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class AppJava86 {

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("CSLT", "Cơ sở lập trình");
        hashMap.put("C++", "C++");
        hashMap.put("C#", "C#");
        hashMap.put("PHP", "PHP");
        hashMap.put("Java", "Java");
        Set<Map.Entry<String,String>> setHashMap=hashMap.entrySet();
        System.out.println("các Entry có trong setHashMap");
        System.out.println(setHashMap);
                
    }
}
