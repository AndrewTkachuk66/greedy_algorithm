package selection_of_applications_task;

public class SelAppTask {
  int cnt = 1;
  int last = 0;
  int[] l = {2,5,1,1,4,1,0,2,7,18};
  int [] r = {4,6,7,7,9,11,14,15,16,19};
  public void sumOfApp(int n){
      for (int i = 1; i < n; i++) {
          if(l[i]>= r[last]){
              cnt++;
              last = i;

          }
      }
      System.out.println(cnt);
  }

    public static void main(String[] args) {
        SelAppTask selAppTask = new SelAppTask();
        selAppTask.sumOfApp(10);
    }
}
