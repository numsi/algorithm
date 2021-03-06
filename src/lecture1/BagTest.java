package lecture1;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author numsi
 * @date 2021/3/20 16:14
 */
public class BagTest {
    public static void main(String[] args) {
        Bag<Double> numbers = new Bag<Double>();
        while (!StdIn.isEmpty())
        {
            numbers.add(StdIn.readDouble());
        }
        int N = numbers.size();

        double sum = 0.0;
        for (Double x:numbers) {
            sum += x;
        }
        double mean = sum/N;
        sum = 0.0;
        /*
        bag在迭代的时候是无序的
         */
        for(Double x : numbers){
            sum += (x - mean) * (x - mean);
        }
        double std = Math.sqrt(sum / (N-1));
        StdOut.printf("mean:%.2f\n", mean);
        StdOut.printf("Std dev:%.2f\n", std);
    }
}
