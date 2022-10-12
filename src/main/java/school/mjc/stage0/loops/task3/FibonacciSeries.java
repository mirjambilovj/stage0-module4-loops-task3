package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int n2=1,n1=0;
        for (int i=0;i<lastFibonacci;i++) {
            System.out.println(n1);
            int n3 = n2 + n1;
            n1=n2;
            n2=n3;
        }
    }
}
