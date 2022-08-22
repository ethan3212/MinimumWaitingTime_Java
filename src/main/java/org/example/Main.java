package org.example;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] queries = {3, 2, 1, 2, 6};
        System.out.println(minimumWaitingTime(queries));
        System.out.println(minimumWaitingTimeSinglePass(queries));
    }

    // O(nLog(n)) time | O(n) space
    public static int minimumWaitingTime(int[] queries) {
        Arrays.sort(queries);       // O(nLog(n)) time
        ArrayList<Integer> results = new ArrayList<>();     // O(n) space
        int runningQueryCounter = 0;
        for(int query : queries) {      // O(n) time
            results.add(runningQueryCounter);
            runningQueryCounter += query;
        }
        int totalTime = 0;
        for(int time : results) {       // O(n) time
            totalTime += time;
        }
        return totalTime;
    }

    // O(nLog(n)) time | O(1) space
    public static int minimumWaitingTimeSinglePass(int[] queries) {
        Arrays.sort(queries);       // O(nLog(n)) time
        int totalWaitTime = 0;
        for(int i = 0; i < queries.length; i++) {       // O(n) time
            int duration = queries[i];
            int queriesLeft = queries.length - (i + 1);
            totalWaitTime += duration * queriesLeft;
        }
        return totalWaitTime;
    }
}