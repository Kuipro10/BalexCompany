public class BalexCompany {
    // Method to calculate the pay for an employee
    public static double calculatePay(double basePay, int hoursWorked) {
        // Check if base pay is below minimum wage
        if (basePay < 8.00) {
            System.out.println("Error: Base pay must be at least $8.00 per hour.");
            return 0.0;
        }
        
        // Check if hours worked exceed 60 hours
        if (hoursWorked > 60) {
            System.out.println("Error: Hours worked cannot exceed 60 hours.");
            return 0.0;
        }
        
        double pay = 0.0;
        
        // Calculate pay
        if (hoursWorked <= 40) {
            pay = hoursWorked * basePay;
        } else {
            // Calculate pay for the first 40 hours
            pay = 40 * basePay;
            // Calculate overtime pay for the remaining hours
            int overtimeHours = hoursWorked - 40;
            pay += overtimeHours * (basePay * 1.5);
        }
        
        return pay;
    }

    public static void main(String[] args) {
        // Employee data
        double[] basePays = {7.50, 8.20, 10.00};
        int[] hoursWorked = {35, 47, 73};
        
        // Calculate and display the pay for each employee
        for (int i = 0; i < basePays.length; i++) {
            System.out.printf("Employee %d: $%.2f%n", i + 1, calculatePay(basePays[i], hoursWorked[i]));
        }
    }
}