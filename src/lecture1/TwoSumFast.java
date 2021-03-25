package lecture1;

import edu.princeton.cs.algs4.BinarySearch;

import java.util.Arrays;

/**
 * description:
 *
 * @author numsi
 * @date 2021/3/23 13:50
 */
public class TwoSumFast {
    public static int count(int[] a){
        Arrays.sort(a);
        int N = a.length;
        int cnt = 0;
        for(int i = 0; i < N; i++){
            if(BinarySearch.rank(-a[i], a) > i) {
                cnt++;
            }
        }
        return cnt;
    }
}
