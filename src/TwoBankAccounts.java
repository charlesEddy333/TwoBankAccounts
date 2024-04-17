import java.util.Scanner;

public class TwoBankAccounts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double currentBalance = 0.00;
        double savingsBalance = 0.00;

        System.out.println("Enter deposit amount for the current account in the morning: ");
        double currentMorningDeposit = scanner.nextDouble();

        System.out.println("Enter deposit amount for the current account in the afternoon: ");
        double currentAfternoonDeposit = scanner.nextDouble();

        System.out.println("Enter deposit amount for the current account in the evening: ");
        double currentEveningDeposit = scanner.nextDouble();

        System.out.println("Enter deposit amount for the savings account in the morning: ");
        double savingsMorningDeposit = scanner.nextDouble();

        System.out.println("Enter deposit amount for the savings account in the afternoon: ");
        double savingsAfternoonDeposit = scanner.nextDouble();

        System.out.println("Enter deposit amount for the savings account in the evening: ");
        double savingsEveningDeposit = scanner.nextDouble();



        currentBalance += currentMorningDeposit + currentAfternoonDeposit + currentEveningDeposit;
        savingsBalance += savingsMorningDeposit + savingsAfternoonDeposit + savingsEveningDeposit;

        currentBalance = Math.max(0, currentBalance);
        savingsBalance = Math.max(0, savingsBalance);

        System.out.println("Current balance: N" + currentBalance);
        System.out.println("Savings balance: N" + savingsBalance);
    }
}