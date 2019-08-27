package olimpic_task;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class OlimpicTask {
    private int tasksCount = 0;
    private int timeSum = 0;
    private int totalTimeForTasks = 50000;
    private int[] timesForAllTasks = new int[1000];

    private int[] arrayFromFile() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("olimpic.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int i = 0;
        while (scanner.hasNextInt()) {
            timesForAllTasks[i++] = scanner.nextInt();
        }
        return timesForAllTasks;
    }

    public int countTasksAndTimePenalty(int[] sortTimesForTasks, int totalTimeForAllTasks) {
        int i;
        for (i = 0; i < sortTimesForTasks.length; i++) {
            if (timeSum <= totalTimeForAllTasks) {
                timeSum += sortTimesForTasks[i];
                tasksCount++;
            }
            if (timeSum > totalTimeForAllTasks) {
                rollBack(sortTimesForTasks[i]);
                break;
            }
        }
        return sortTimesForTasks[i];
    }

    public void rollBack(int lastTime) {
        timeSum -= lastTime;
        tasksCount--;
    }

    public void printResult() {
        System.out.println("Array of times: " + Arrays.toString(timesForAllTasks));
        System.out.println("Number of tasks-" + tasksCount);
        System.out.println("Number of timepenalty-" + timeSum);
    }

    public static void main(String[] args) {
        OlimpicTask olimpicTask = new OlimpicTask();
        int[] arrayOfTimes = olimpicTask.arrayFromFile();
        Arrays.sort(arrayOfTimes);
        System.out.println("Sorted array: " + Arrays.toString(arrayOfTimes));
        olimpicTask.countTasksAndTimePenalty(arrayOfTimes, olimpicTask.totalTimeForTasks);
        olimpicTask.printResult();
    }
}
