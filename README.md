# CPU Scheduling Simulator (Java)

## 📌 Project Overview

The **CPU Scheduling Simulator** is a Java-based console application that simulates core **Operating System CPU scheduling algorithms**. The project demonstrates how different scheduling strategies affect **waiting time**, **turnaround time**, and overall CPU performance.

This project was built to gain a **practical understanding of OS scheduling concepts** and their real-world trade-offs.

---

## 🎯 Objectives

* To simulate popular CPU scheduling algorithms
* To calculate performance metrics for each process
* To visualize execution order using a Gantt Chart
* To compare scheduling strategies based on efficiency

---

## ⚙️ Scheduling Algorithms Implemented

1. **First Come First Serve (FCFS)**

   * Processes are executed in the order of arrival
   * Simple but may cause high waiting time

2. **Shortest Job First (SJF – Non-Preemptive)**

   * Selects the process with the smallest burst time
   * Minimizes average waiting time
   * May cause starvation

3. **Priority Scheduling (Non-Preemptive)**

   * Processes are scheduled based on priority
   * Lower priority number indicates higher priority
   * Starvation is possible without aging

---

## 🧱 Project Structure

```
CPUSchedulingSimulator
│
├── Process.java      // Defines process attributes
├── Scheduler.java    // Scheduling algorithms implementation
└── Main.java         // Program execution entry point
```

---

## 📥 Input Details

Each process has the following attributes:

* **PID** – Process ID
* **Arrival Time (AT)**
* **Burst Time (BT)**
* **Priority (PR)**

Example:

```
P1  AT=0  BT=5  PR=2
P2  AT=1  BT=3  PR=1
P3  AT=2  BT=8  PR=3
```

---

## 📤 Output Details

For each scheduling algorithm, the simulator displays:

* Gantt Chart (Execution Order)
* Completion Time (CT)
* Turnaround Time (TAT)
* Waiting Time (WT)

Example Output:

```
PID  AT  BT  PR  CT  TAT  WT
P1   0   5   2   5   5    0
P2   1   3   1   8   7    4
P3   2   8   3   16  14   6
```

---

## 🧠 Key OS Concepts Covered

* CPU Scheduling
* Process States
* Waiting Time & Turnaround Time
* Scheduling Trade-offs
* Starvation
* CPU Idle Time

---

## ⏱️ Time & Space Complexity

| Algorithm | Time Complexity | Space Complexity |
| --------- | --------------- | ---------------- |
| FCFS      | O(n log n)      | O(n)             |
| SJF       | O(n²)           | O(n)             |
| Priority  | O(n²)           | O(n)             |

---

## 🚀 How to Run the Project

1. Install **JDK 11 or above**
2. Clone the repository
3. Open the project in **VS Code / IntelliJ / Eclipse**
4. Run `Main.java`

---

## 🔮 Future Enhancements

* Add **Round Robin Scheduling**
* Implement **Preemptive Algorithms**
* Add file-based input
* Visual GUI for Gantt Chart

---

## 👩‍💻 Author

**Mayuri Shirsath**
B.Tech Computer Engineering

---

## ✅ Conclusion

This project provides a clear understanding of how CPU scheduling algorithms work internally and how they impact system performance. It bridges theoretical OS concepts with practical implementation.
