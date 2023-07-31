import java.util.ArrayList;
//when end time is in sorted order
public class activityselection {
    public static void main(String[] args)
    {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        int endact=0;
        ArrayList<Integer> list=new ArrayList<>();
        int maxact=1;
        list.add(0);
        for(int i=1;i<start.length;i++)
        {
            if(start[i]>=endact)
            {
                list.add(i);
                endact=end[i];
                maxact++;
            }
        }
        System.out.println(maxact);
        for(int i=0;i<list.size();i++)
        {
        System.out.print("A"+list.get(i));
            System.out.print("  ");
        }

    }
}
