import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A1093374_0421_1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入電子郵件地址：");
        String email = sc.nextLine();
        
        String regex = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        
        if (matcher.matches()) {
            System.out.println("格式正確！");
        } else {
            System.out.println("格式錯誤！");
        }
    }
}
