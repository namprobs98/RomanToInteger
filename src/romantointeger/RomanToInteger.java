/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package romantointeger;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Slime nightmare
 */
public class RomanToInteger {

    /**
     * @param args the command line arguments
     */
    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int result = 0;
        // Duyệt qua chuỗi La Mã từ trái sang phải
        for (int i = 0; i < s.length(); i++) {
            // Lấy giá trị tương ứng với ký tự hiện tại
            int current = romanMap.get(s.charAt(i));
            // Nếu giá trị của ký tự sau lớn hơn giá trị của ký tự hiện tại, thì trừ giá trị hiện tại đi
            if (i < s.length() - 1 && romanMap.get(s.charAt(i + 1)) > current) {
                result -= current;
            } else { // Ngược lại, cộng giá trị hiện tại vào kết quả
                result += current;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(romanToInt(str));
    }

}
