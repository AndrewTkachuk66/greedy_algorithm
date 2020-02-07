package selection_of_requests_task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RequestsSelectionTest {
    private static final RequestsSelection requestsSelection = new RequestsSelection();

    @Test()
   public void countNumberOfNotIntersectingRequestsShouldThrowRuntimeExIfArraysLengthsNotEquals() {
        assertThrows(RuntimeException.class, () -> {
            requestsSelection.countNumberOfNotIntersectingRequests(new int[]{1, 3, 5}, new int[]{5, 6, 7, 9});
        });
    }

    @Test
    public void countNumberOfNotIntersectingRequestsShouldReturnInteger(){
        assertEquals(2, requestsSelection.countNumberOfNotIntersectingRequests(new int[]{1, 3, 5}, new int[]{5, 6, 7}));
    }
}