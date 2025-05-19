import java.io.*;
import java.util.*;

class Balanced {

    static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            switch (ch) {
                case '{', '(', '[' -> stack.push(ch);

                case '}' -> {
                    if (stack.isEmpty() || stack.pop() != '{') return false;
                }
                case ')' -> {
                    if (stack.isEmpty() || stack.pop() != '(') return false;
                }
                case ']' -> {
                    if (stack.isEmpty() || stack.pop() != '[') return false;
                }
                // any other characters are ignored
            }
        }
        return stack.isEmpty();
    }
}

public class Braces {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(Balanced.isBalanced(s));
    }
}
https://github.com/ducquang2/Java-Basic-Skill/blob/master/Decryption.java
