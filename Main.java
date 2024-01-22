package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int bubblegum = 202;
        int toffee = 118;
        int icecream = 2250;
        int milkchocolate = 1680;
        int doughnut = 1075;
        int pancake = 80;

        double income = bubblegum + toffee + icecream + milkchocolate + doughnut + pancake;

        System.out.println("Earned amount:");
        System.out.println("Bubblegum: $" + bubblegum);
        System.out.println("Toffee: $" + toffee);
        System.out.println("Ice cream: $" + icecream);
        System.out.println("Milk chocolate: $" + milkchocolate);
        System.out.println("Doughnut: $" + doughnut);
        System.out.println("Pancake: $" + pancake);
        System.out.println();
        System.out.println("Income: $" + income);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Staff expenses: ");
        int staffExpenses = scanner.nextInt();
        System.out.println("Other expenses: ");
        int otherExpenses = scanner.nextInt();
        double netIncome = income - staffExpenses - otherExpenses;
        System.out.println("Net Income: $" + netIncome);
    }
}