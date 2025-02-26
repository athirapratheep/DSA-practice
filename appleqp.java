package Practice_java; 
public class appleqp {
    public static int minCost(int N, int a_count, int a_price, int b_count, int b_price) {
        int minCost = 0; // Initialize to 0

        // Loop over the number of boxes bought from Shop A
        for (int i = 0; i * a_count <= N; i++) {
            int applesFromA = i * a_count;
            int remainingApples = N - applesFromA;

            // Check if the remaining apples can be purchased from Shop B
            if (remainingApples % b_count == 0) {
                int j = remainingApples / b_count;
                // Calculate the cost for this combination of boxes from A and B
                int cost = i * a_price + j * b_price;
                if (minCost == 0 || cost < minCost) {
                    minCost = cost; // Update minCost if the new cost is lower
                }
            }
        }

        // If minCost is still 0, return -1 indicating no valid combination
        if (minCost == 0) {
            return -1; // No valid combination found
        }
        return minCost;
    }

    public static void main(String[] args) {
        int N = 19; // Total apples needed
        int a_count = 3; // Number of apples per box from shop A
        int a_price = 10; // Price per box from shop A
        int b_count = 4; // Number of apples per box from shop B
        int b_price = 15; // Price per box from shop B
        
        // Get the minimum cost for purchasing exactly N apples
        int result = minCost(N, a_count, a_price, b_count, b_price);
        if (result == -1) {
            System.out.println("No valid combination found.");
        } else {
            System.out.println("Minimum cost: " + result);
        }
    }
}  
