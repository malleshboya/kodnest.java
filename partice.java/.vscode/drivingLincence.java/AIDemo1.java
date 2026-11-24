
import java.util.*;

public class AIDemo1 {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = scan.nextInt();

        System.out.println("Enter the Elements:");

        for (int i = 1; i <= n; i++) {
            int element = scan.nextInt();
            al.add(element);
        }

        System.out.println("ArrayList: " + al);

        System.out.println();

        System.out.println("Traverse using FOR-LOOP");

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

        System.out.println();

        System.out.println("Traverse using FOR-EACH-LOOP");

        for (Integer x : al) {
            System.out.println(x);
        }

        scan.close();
    }
}
