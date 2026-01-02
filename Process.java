class Process {
    int pid;
    int arrivalTime;
    int burstTime;
    int priority;
    int completionTime;
    int waitingTime;
    int turnaroundTime;

    Process(int pid, int at, int bt, int p) {
        this.pid = pid;
        this.arrivalTime = at;
        this.burstTime = bt;
        this.priority = p;
    }
}
