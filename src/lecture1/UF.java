package lecture1;

/**
 * description:压缩路径的加权quick-union算法
 *
 * @author numsi
 * @date 2021/3/23 15:31
 */
public class UF {
    private int[] id; //父链接数组
    private int[] sz;//各根节点对应的分量大小
    private int count;//分量数量

    public UF(int N){
        count = N;
        id = new int[N];
        for(int i = 0; i < N; i++){
            id[i] = i;
        }
        sz = new int[N];
        for(int i = 0; i < N; i++) {
            sz[i] = 1;
        }
    }
    public int count(){
        return count;
    }
    public boolean connected(int p, int q){
        return find(p) == find(q);
    }
    public int find(int p){
        t = p;
        while (t != id[t]){
            t = id[t];
        }
        id[p] = t;
        return t;
    }
    public void union(int p, int q){
        int i = find(p);
        int j = find(q);
        if(i == j){
            return;
        }
        if(sz[i] < sz[j]){
            id[i] = j;
            sz[j] += sz[i];
        }else {
            id[j] = i;
            sz[i] += sz[j];
        }
        count--;
    }
}
