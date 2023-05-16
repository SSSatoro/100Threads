import java.math.BigInteger;

public class NumberThreads implements Runnable {
    private int number;

    public NumberThreads(int number) {
        super();
        this.number = number;
    }

    public int getNumber() {
        return number;
    }


    @Override
    public void run() {
        BigInteger factorials = BigInteger.ONE;
        for (int i = 1; i < number; i++) {
            factorials = factorials.multiply(BigInteger.valueOf(i));
        }
        System.out.println("factorial of " + number + " = " + factorials);

    }
}
