package lecture1;



import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author numsi
 * @date 2021/3/10 15:47
 */
public class BinarySearch {
    public static int rank(int key, int[] a)
    {
        int lo = 0;
        int hi = a.length - 1;
        while(lo <= hi)
        {
            int mid = lo + (hi - lo) / 2;
            if(key < a[mid])
            {
                hi = mid - 1;
            }else if(key > a[mid])
            {
                lo = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int[] whitelist = new int[10];
//        int i = 0;
//        for(i=0;i<whitelist.length;i++)
//        {
//            whitelist[i] = input.nextInt();
//        }
//        System.out.println(Arrays.toString(whitelist));
//        Arrays.sort(whitelist);
//        System.out.println(Arrays.toString(whitelist));
//
//        while(true)
//        {
//            int key = input.nextInt();
//            if(rank(key, whitelist) == -1){
//                System.out.println(key);
//            }
//
//        }

        double sum = 0.0;
        int cnt = 0;
        while(!StdIn.isEmpty())
        {
            sum += StdIn.readDouble();
            cnt++;
        }
        double avg = sum / cnt;
        StdOut.printf("avg is %.5f\n", avg);
    }
}
