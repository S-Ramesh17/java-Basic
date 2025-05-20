import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int N = sc.nextInt();
        Set<Integer> resultSet = new HashSet<>();

        Queue<String> queue = new LinkedList<>();
        queue.offer(A);
        queue.offer(B);

        while (!queue.isEmpty()) {
            String numStr = queue.poll();
            int num = Integer.parseInt(numStr);
            if (num <= N) {
                resultSet.add(num);
                queue.offer(numStr + A);
                queue.offer(numStr + B);
            }
        }
        List<Integer> resultList = new ArrayList<>(resultSet);
        Collections.sort(resultList);
        for (int number : resultList) {
            System.out.print(number + " ");
        }
        sc.close();
    }
}
