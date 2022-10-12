package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int a = 0;
        int sum = 0;
        for (int i=0; i < lengthOfLastNumber; i++) {
            a = (int) (a + 9 * (Math.pow(10, i)));
            sum = sum + a;
        }
        System.out.println(sum);
    }
}
