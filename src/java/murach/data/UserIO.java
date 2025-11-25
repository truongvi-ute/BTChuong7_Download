package murach.data;

import java.io.*;
import murach.business.User;

public class UserIO {

    // Hàm thêm User vào file (Append mode)
    public static void add(User user, String path) {
        try {
            File file = new File(path);
            // FileWriter(file, true) nghĩa là ghi nối tiếp (append) vào cuối file
            PrintWriter out = new PrintWriter(
                    new FileWriter(file, true));
            
            // Ghi dữ liệu theo định dạng: email|firstName|lastName
            out.println(user.getEmail() + "|"
                    + user.getFirstName() + "|"
                    + user.getLastName());
            
            out.close();
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    // Hàm lấy User từ file dựa vào email (được dùng trong checkUser của Servlet)
    public static User getUser(String email, String path) {
        try {
            File file = new File(path);
            BufferedReader in = new BufferedReader(
                    new FileReader(file));
            
            String line = in.readLine();
            while (line != null) {
                String[] t = line.split("\\|");
                // Kiểm tra dòng có đủ 3 phần tử không để tránh lỗi IndexOutOfBounds
                if (t.length >= 3) {
                    String emailAddress = t[0];
                    if (email.equalsIgnoreCase(emailAddress)) {
                        String firstName = t[1];
                        String lastName = t[2];
                        
                        User user = new User();
                        user.setEmail(email);
                        user.setFirstName(firstName);
                        user.setLastName(lastName);
                        
                        in.close();
                        return user;
                    }
                }
                line = in.readLine();
            }
            in.close();
            return null;
        } catch (IOException e) {
            System.out.println(e);
            return null;
        }
    }
}