import java.util.Scanner;
import homework.TestFunctionMap;
import jeeinstudy.ParamTest;

public class main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("[TEST] 입력한 테스트를 수행합니다 : ");
        String test_function = scanner.nextLine();
        TestFunctionMap.functionMap.getOrDefault(test_function, () -> {
            System.out.println("[TEST] 해당하는 테스트 함수가 없습니다.");
        }).run();
    }
}
