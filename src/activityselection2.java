import java.util.*;
public class activityselection2 {
    //when the end time is not given in sorted order
    public static void main(String[] args) {
        int start[] = {3,1, 0, 5, 8, 5};
        int end[] = {4, 2, 6, 7, 9, 9};
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < activities.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
        int max = 1;
        int last = activities[0][2];
        ArrayList<Integer> list = new ArrayList<>();
        list.add(activities[0][0]);
        for (int i = 1; i < start.length; i++) {
            if (activities[i][1]>= last) {
                list.add(activities[i][0]);
                last = activities[i][2];
                max++;
            }
        }
        System.out.println(max);
        for (int i = 0; i < list.size(); i++) {
            System.out.print("A" + list.get(i));
            System.out.print("  ");
        }
    }
}
