package selection_of_requests_task;

public class RequestsSelection {

    public int countNumberOfNotIntersectingRequests(int[] leftBounds, int [] rightBounds ){
        int cnt = 1;
        int last = 0;
        if(leftBounds.length != rightBounds.length){
            throw new RuntimeException("Lengths of both arrays must be equals");
        }

        for (int i = 1; i < leftBounds.length; i++) {
            if(leftBounds[i]>= rightBounds[last]){
                cnt++;
                last = i;
            }
        }
        return cnt;
    }
}
