package com.example.ArrayPractice;

/**
 * Created by admin on 9/18/14.
 */
public class Temperatures {
    double[] averageDailyTemp = {70, 73, 74, 76, 67, 66, 78};
    double weeklyAverage;
    double tempTotal = 0;

    public void weeklyAverageTemp() {

        for (int i = 0; i < averageDailyTemp.length; i++){
            double x = 0;
            tempTotal += averageDailyTemp[i];
        }
        weeklyAverage = tempTotal / averageDailyTemp.length;
        System.out.println(weeklyAverage);
        System.out.println(tempTotal);
    }
    public void printTemps() {
        for (int i = 0; i <averageDailyTemp.length; i++) {
            System.out.println("The Average temperature of day 1 was: " + averageDailyTemp[i] + "degrees");
        }
        System.out.println("\nThe average temperature for the week was: " + weeklyAverage + "degrees");
    }
}
