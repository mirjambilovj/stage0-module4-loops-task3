package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int i;
        for (i=0;t != 0; t = t/10) {
            i = i + t%10;
        }
        System.out.println(Math.abs(i));
    }
}
