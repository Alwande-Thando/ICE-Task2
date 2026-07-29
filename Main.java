//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    int[][] weightLoss = {
            {10, 20, 27},{22, 5, 20}, {30, 20, 10}
    };

    System.out.println("GYM WEIGHT LOSS APPLICATION");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.printf("\t\t%-10s%-10s%-10s%-10s %-10s%-10s%-10s%n", "MONTH 1", "MONTH 2", "MONTH 3", "|TOTAL", "AVG", "MIN", "MAX");
    System.out.println("-----------------------------------------------------------------------------");

    for (int i = 0; i < weightLoss.length; i++) {

        int total = 0;
        int min = weightLoss[i][0];
        int max = weightLoss[i][0];

        for (int j = 0; j < weightLoss[i].length; j++) {
            total += weightLoss[i][j];

            if (weightLoss[i][j] < min) {
                min = weightLoss[i][j];
            }

            if (weightLoss[i][j] > max) {
                max = weightLoss[i][j];
            }
        }

        double average = (double) total / weightLoss[i].length;


        System.out.printf("%-8s%-10d%-10d%-10d|%-10s%-10.2f%-10s%-10s%n",
                "Gym " + (i + 1),
                weightLoss[i][0],
                weightLoss[i][1],
                weightLoss[i][2],
                total+"kg",
                average,
                min+"kg",
                max+"kg");
    }
}


