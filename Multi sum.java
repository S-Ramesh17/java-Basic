import java.util.Scanner;

class Arithmetic {

    public Integer sum(Integer[] ints) {
        int total = 0;
        for (int num : ints) {
            total += num;
        }
        return total;
    }

    public String sum(String[] strings) {
        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            sb.append(s);
        }
        return sb.toString();
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arithmetic arith = new Arithmetic();

        String type = sc.nextLine().trim();
        int n = sc.nextInt();
        sc.nextLine(); // consume the leftover newline

        if (type.equals("Integer")) {
            Integer[] ints = new Integer[n];
            String[] tokens = sc.nextLine().split(" ");
            for (int i = 0; i < n; i++) {
                ints[i] = Integer.parseInt(tokens[i]);
            }
            System.out.println(arith.sum(ints));
        } else {
            String[] strings = sc.nextLine().split(" ");
            System.out.println(arith.sum(strings));
        }
        sc.close();
    }
}
