package school.mjc.stage0.conditions.task4;

public class TernaryAssignment {
    public void assignAndPrintBasedOnWhichBigger(int first, int second) {
        int result = 0, res;
        res = ((second < first) ? (result += 10) : (result -= 10));
        System.out.println(result);
    }
}
