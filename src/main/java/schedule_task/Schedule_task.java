package schedule_task;

public class Schedule_task {

    long[] deadline = {2,2,1,7,5,5,4,7,7,5};
    long[] cost = {92,80,66,55,55,38,35,19,16,2};
    boolean[] used = new boolean[92];
    long sum = 0;
    public long countMaxSum(int n ){
        for (int i = 0; i < n ; i++) {
            long k = deadline[i];
            while(k >= 1 && used[(int) k])
                k--;
            if(k == 0)
                continue;
            used[(int) k] = true;
            sum += cost[i];
        }
        return sum;

    }


    public void parse(String string){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <string.length() ; i++) {
                stringBuilder.append(string.charAt(i)).append(",");
            System.out.println(stringBuilder);
        }
    }
    public static void main(String[] args) {
        Schedule_task schedule_task = new Schedule_task();
       // System.out.println(schedule_task.countMaxSum(5000));
       // schedule_task.parse(schedule_task.line);
    }
}
