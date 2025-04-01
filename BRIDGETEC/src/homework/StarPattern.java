package homework;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StarPattern {
    public static void add() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void minus() {
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            
        }
        List<Integer> numbers = new ArrayList<>();

        numbers.add(3001)
        for (int i = 10; i >= 1; i--) {
            System.out.println(numbers[i]);
        }
    }
}
