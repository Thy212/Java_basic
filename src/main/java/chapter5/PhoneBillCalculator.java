package chapter5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PhoneBillCalculator {
    static Scanner sc = new Scanner(System.in);
    static double charge = 0.25;
    static double taxFees = 0.15;

    public static double getPlan(){
        System.out.println("Enter base cost of the plan:");
        double plan = sc.nextDouble();
        return plan;
    }

    public static double getOverageMinutes(){
        System.out.println("Enter overage minutes:");
        double overage = sc.nextDouble();
        return overage;
    }

    public static double overageFees(double overageMinutes){
        double overage = overageMinutes * charge;
        return overage;
    }

    public static double calculateTax(double plan, double overage){
        double tax = (plan + overage) * taxFees;
        return tax;
    }

    public static double calculateTotal(double plan, double overage, double tax){
        double total = plan + overage + tax;
        return total;
    }

    public static void main(String[] args) {
        double plan = getPlan();
        double overageMinutes = getOverageMinutes();
        double overageFees = overageFees(overageMinutes);
        double tax = calculateTax(plan, overageFees);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + plan);
        System.out.println("Overage: $" + overageFees);
        System.out.println("Tax: $" + df.format(tax));
        System.out.println("Total: $" + df.format(calculateTotal(plan, overageFees,tax)));
    }
}
