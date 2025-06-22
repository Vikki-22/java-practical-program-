public class ArraySum {
    public static void main(String[] args) {
        int[][] array = new int[5][];
        
        // Manually assigning row sizes to accommodate 17 elements
        array[0] = new int[4];
        array[1] = new int[4];
        array[2] = new int[3];
        array[3] = new int[3];
        array[4] = new int[3];

        // Fill the array with values (for example: 1 to 17)
        int value = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = value++;
            }
        }

        // Calculate the sum of all elements
        int sum = 0;
        for (int[] row : array) {
            for (int num : row) {
                sum += num;
            }
        }

        // Display the array and the sum
        System.out.println("Array Elements:");
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println("Sum of all elements: " + sum);
    }
}
