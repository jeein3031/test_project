package homework;

import java.util.Map;
import homework.StarPattern;
import homework.Calculat;
import jeeinstudy.ScannerTest;

public class TestFunctionMap {
    public static final Map<String, Runnable> functionMap = Map.of(
        "test_001", () -> {
            StarPattern.add();
        },
        "test_002", () -> {
            StarPattern.minus();
        },
        "test_003", () -> {
            Calculat.sum();
        },
        "test_004", () -> {
            Calculat.even_odd_sum();
        },
        "test_005", () -> {
            ScannerTest.namePrint();
        }
    );
}
