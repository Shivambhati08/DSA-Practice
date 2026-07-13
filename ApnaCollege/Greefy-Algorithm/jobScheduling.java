
import java.util.ArrayList;
import java.util.Collections;

public class jobScheduling {
    static class Job{
        int id;
        int deadline;
        int profit;
        Job(int i, int d, int p){
            id = 1;
            deadline = d;
            profit = p;
        }
    }
    public static void main(String[] args) {
        int[][] jobinfo = {{4,20}, {1,10},{1,40},{1,30}};

        ArrayList<Job> jobs = new ArrayList<>();
        for (int i = 0; i < jobinfo.length; i++) {
            jobs.add(new Job(i, jobinfo[i][0], jobinfo[i][0]));
        }
        Collections.sort(jobs, (a, b) -> b.profit - a.profit);
        int time = 0;
        int count = 1;
        for(int i = 0; i < jobinfo.length; i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                count++;
                time++;
            }
        }
        System.out.println(count);
    }
}
