
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
public class AppJava88 {

    public static void main(String[] args) {
        HashMap<String, String> hashMapCity = new HashMap<>();
        hashMapCity.put("HN", "Hà Nội");
        hashMapCity.put("HCM", "Hồ Chí Minh");
        
        hashMapCity.put("HN", "Hà Nam");
        hashMapCity.put("TB", "Thái Bình");
        System.out.println("danh sách các thành phố trong hashMapCity");
        Set<Map.Entry<String,String>> setCity=hashMapCity.entrySet();
        System.out.println(setCity);
        System.out.println("HCM:"+hashMapCity.get("HCM"));
        System.out.println("HP:"+hashMapCity.get("HP"));
        if(hashMapCity.containsKey("Thái Bình")){
            System.out.println("có Hà Nam trong danh sách thành phố");
        }
    }
}
