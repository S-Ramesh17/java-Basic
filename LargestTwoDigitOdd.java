import java.util.*;
public class LargestTwoDigitOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        List<Character> digits = new ArrayList<>();
        for (char ch : N.toCharArray()) {
            digits.add(ch);
        }
        int max = -1;
        for (int i = 0; i < digits.size(); i++) {
            for (int j = 0; j < digits.size(); j++) {
                if (i != j) {
                    char first = digits.get(i);
                    char second = digits.get(j);
                    if (first == '0') continue;
                    if (second % 2 == 1) {
                        int num = Integer.parseInt("" + first + second);
                        if (num > max) {
                            max = num;
                        }
                    }
                }
            }
        }
        System.out.println(max);
        sc.close();
    }
}
