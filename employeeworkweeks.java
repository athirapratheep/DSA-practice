package Practice_java;

import java.util.*;

public class employeeworkweeks {
    public static int maxWeeks(int N, int[] C) {
        int weeks = 0;

        // Loop until no project has modules left to work on
        while (true) {
            // Sort the array of modules in descending order
            Arrays.sort(C);
            // If the most available module is 0, break the loop
            if (C[N - 1] == 0) {
                break;
            }

            // Pick the project with the maximum available modules
            for (int i = N - 1; i >= 0; i--) {
                if (C[i] > 0) {
                    C[i]--; // Decrement the module count for the selected project
                    weeks++; // Increment the week count
                    break;   // Move to the next week, start with a different project
                }
            }
        }

        return weeks;
    }

    public static void main(String[] args) {
        int N = 4; // Number of projects
        int[] C = {3, 2, 4, 1}; // Available modules in each project
        
        // Find the maximum number of weeks the employee can work
        int result = maxWeeks(N, C);
        System.out.println("Maximum number of weeks the employee can work: " + result);
    }
} 
