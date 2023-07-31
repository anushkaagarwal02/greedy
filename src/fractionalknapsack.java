import java.util.Arrays;
import java.util.Comparator;

public class fractionalknapsack {
    public static void main(String[] args)
    {
        int[] wt={10,20,30};
        int[] val={60,100,120};
        int maxwt=50;
        double[][]act=new double[val.length][2];
        for(int i=0;i<act.length;i++)
        {
             act[i][0]=i;
             act[i][1]=val[i]/(double)wt[i];
        }
        Arrays.sort(act, Comparator.comparingDouble(o->o[1]));
        int cap=maxwt;
        int finval=0;
        for(int i=act.length-1;i>=0;i--) {
            int idx = (int) act[i][0];
            if (cap >= wt[idx]) {
                finval += val[idx];
                cap -= wt[idx];
            } else{
                finval += (act[i][1] * cap);
            cap = 0;
            break;
        }
        }
        System.out.println(finval);
        }
    }


