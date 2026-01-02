import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Process> processes = new ArrayList<>();
        processes.add(new Process(1, 0, 5, 2));
        processes.add(new Process(2, 1, 3, 1));
        processes.add(new Process(3, 2, 8, 3));

        Scheduler.fcfs(new ArrayList<>(processes));
        Scheduler.sjf(new ArrayList<>(processes));
        Scheduler.priorityScheduling(new ArrayList<>(processes));
    }
}
