package jeeinstudy;
import java.util.Scanner; // 이거는 꼭 해줘야 하는 부분

public class ScannerTest {
    public static void namePrint() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요:");
        String name =  scanner.nextLine(); //문자열 입력받기
        System.out.println(name + "입니다");
    }
}
