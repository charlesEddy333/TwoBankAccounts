public class SavingsAccount {
    public static void main(String[] args) {

        double savingsBalance = 0.00;

        double savingsMorningDeposit= 400.00;
        double savingsAfternoonDeposit= 450.00;
        double savingsEveningDeposit= 500.00;

        savingsBalance += savingsMorningDeposit + savingsAfternoonDeposit + savingsEveningDeposit;
        savingsBalance=Math.max(0,savingsBalance);


        System.out.println("savings balance: N"+savingsBalance);
    }
}
