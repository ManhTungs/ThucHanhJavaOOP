
import java.util.HashSet;
import java.util.Scanner;


public class AppJava56 {

    public static void main(String[] args) {
        HashSet<String> subject = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        subject.add("Toán");
        subject.add("Ngữ văn");
        subject.add("English");
        subject.add("Thể dục");
        subject.add("Vật lý");
        subject.add("Hóa học");
        subject.add("Địa lý");
        System.out.println("danh sách môn học");
        System.out.println(subject);
        System.out.println("Nhập môn học cần xóa");
        String subjectRemoved=sc.nextLine();
        if(subject.contains(subjectRemoved)){
            subject.remove(subjectRemoved);
            System.out.println("bạn đã xóa môn học thành công");
            System.out.println("danh sách môn học sau khi xóa");
            System.out.println(subject);
        }else{
            System.out.println("Môn học không tồn tại");
            System.out.println("xóa môn học thất bại...");
        }
    }
}
