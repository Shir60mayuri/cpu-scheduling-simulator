import java.util.*;

class Scheduler {

    // -------- FCFS Scheduling --------
    public static void fcfs(List<Process> processes) {

        processes.sort(Comparator.comparingInt(p -> p.arrivalTime));

        int currentTime = 0;
        System.out.println("\nFCFS Scheduling");
        System.out.print("Gantt Chart: ");

        for (Process p : processes) {
            if (currentTime < p.arrivalTime) {
                currentTime = p.arrivalTime;
            }

            System.out.print("P" + p.pid + " ");

            p.completionTime = currentTime + p.burstTime;
            p.turnaroundTime = p.completionTime - p.arrivalTime;
            p.waitingTime = p.turnaroundTime - p.burstTime;

            currentTime = p.completionTime;
        }

        printTable(processes);
    }

    // -------- SJF (Non-Preemptive) Scheduling --------
    public static void sjf(List<Process> processes) {

        int n = processes.size();
        boolean[] completed = new boolean[n];
        int currentTime = 0, done = 0;

        System.out.println("\nSJF (Non-Preemptive) Scheduling");
        System.out.print("Gantt Chart: ");

        while (done < n) {
            int idx = -1;
            int minBurst = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                Process p = processes.get(i);
                if (!completed[i] && p.arrivalTime <= currentTime && p.burstTime < minBurst) {
                    minBurst = p.burstTime;
                    idx = i;
                }
            }

            if (idx == -1) {
                currentTime++;
                continue;
            }

            Process p = processes.get(idx);
            System.out.print("P" + p.pid + " ");

            p.completionTime = currentTime + p.burstTime;
            p.turnaroundTime = p.completionTime - p.arrivalTime;
            p.waitingTime = p.turnaroundTime - p.burstTime;

            currentTime = p.completionTime;
            completed[idx] = true;
            done++;
        }

        printTable(processes);
    }

    // -------- Priority Scheduling (Non-Preemptive) --------
    public static void priorityScheduling(List<Process> processes) {

        int n = processes.size();
        boolean[] completed = new boolean[n];
        int currentTime = 0, done = 0;

        System.out.println("\nPriority Scheduling (Non-Preemptive)");
        System.out.print("Gantt Chart: ");

        while (done < n) {
            int idx = -1;
            int bestPriority = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                Process p = processes.get(i);
                if (!completed[i] && p.arrivalTime <= currentTime && p.priority < bestPriority) {
                    bestPriority = p.priority;
                    idx = i;
                }
            }

            if (idx == -1) {
                currentTime++;
                continue;
            }

            Process p = processes.get(idx);
            System.out.print("P" + p.pid + " ");

            p.completionTime = currentTime + p.burstTime;
            p.turnaroundTime = p.completionTime - p.arrivalTime;
            p.waitingTime = p.turnaroundTime - p.burstTime;

            currentTime = p.completionTime;
            completed[idx] = true;
            done++;
        }

        printTable(processes);
    }

    // -------- Print Process Table --------
    public static void printTable(List<Process> processes) {

        System.out.println("\n\nPID\tAT\tBT\tPR\tCT\tTAT\tWT");
        for (Process p : processes) {
            System.out.println(
                    "P" + p.pid + "\t" +
                    p.arrivalTime + "\t" +
                    p.burstTime + "\t" +
                    p.priority + "\t" +
                    p.completionTime + "\t" +
                    p.turnaroundTime + "\t" +
                    p.waitingTime
            );
        }
    }
}
