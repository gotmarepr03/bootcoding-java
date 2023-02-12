// Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost. Round the result to the nearest integer.

// Example

// A tip of 15% * 100 = 15, and the taxes are 8% * 100 = 8. Print the value  and return from the function.

// Function Description
// Complete the solve function in the editor below.

// solve has the following parameters:

// int meal_cost: the cost of food before tip and tax
// int tip_percent: the tip percentage
// int tax_percent: the tax percentage
// Returns The function returns nothing. Print the calculated value, rounded to the nearest integer.

// Note: Be sure to use precise values for your calculations, or you may end up with an incorrectly rounded result.

// Input Format

// There are  lines of numeric input:
// The first line has a double,  (the cost of the meal before tax and tip).
// The second line has an integer,  (the percentage of  being added as tip).
// The third line has an integer,  (the percentage of  being added as tax).

import java.util.Scanner;

public class TypeCast {

    public static void solution(double meal_cost, int tip_percent, int tax_percent) {
        double tip = meal_cost * tip_percent / 100;
        double tax = meal_cost * tax_percent / 100;
        double total_cost = tip + tax + meal_cost;

        // converting "Double" value into "Int" value using "TypeCasting"
        int rounded_total_cost = (int) total_cost;

        double temp = (total_cost - rounded_total_cost);

        if (temp < 0.50) {

            System.out.println(rounded_total_cost);
        } else {
            System.out.println(((int) total_cost + 1));
        }

    }

    public static void main(String[] args) {

        // USing Scanner For user Input Value;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Meal Cost : --");
        double meal_cost = sc.nextDouble();

        System.out.println("Enter the Tip Percent : --");
        int tip_percent = sc.nextInt();

        System.out.println("Enter the Tax Percent : --");
        int tax_percent = sc.nextInt();

        // closing the Scanner;
        sc.close();

        System.out.println("Rounded Total Meal Cost is :");

        // CAlling the "solution" Methode;
        solution(meal_cost, tip_percent, tax_percent);

    }

}
