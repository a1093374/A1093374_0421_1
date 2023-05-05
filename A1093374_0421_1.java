import java.util.Scanner;

public class A1093374_0421_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入電子郵件信箱：");
        String email = scanner.nextLine();

        boolean isValid = true;

        
        String[] parts = email.split("@");
        if (parts.length != 2) {
            isValid = false;
        } else {
            String username = parts[0];
            for (int i = 0; i < username.length(); i++) {
                char c = username.charAt(i);
                if (c < 'a' || c > 'z') {
                    isValid = false;
                    break;
                }
            }

          
            String domain = parts[1];
            for (int i = 0; i < domain.length(); i++) {
                char c = domain.charAt(i);
                if (c < 'a' || c > 'z') {
                    isValid = false;
                    break;
                }
            }
        }

        if (isValid) {
            System.out.println("輸入的電子郵件信箱格式正確。");
        } else {
            System.out.println("輸入的電子郵件信箱格式不正確。");
        }
    }
}