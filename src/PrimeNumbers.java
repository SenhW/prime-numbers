import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        int p = 2;
        ArrayList<Integer> listofInts = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int highest = sc.nextInt();
        for (int i = 2; i <= highest; i++) {
            listofInts.add(i);
        }
        while (highest > p) {
            for (int i = p * 2; i <= highest; i++) {
                if (i % p == 0) {
                    if (listofInts.contains(i)) {
                        listofInts.remove(listofInts.indexOf(i));
                    }
                }
            }
            p++;
        }

        System.out.println(listofInts.toString());
    }
}
