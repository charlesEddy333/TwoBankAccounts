import java.util.Scanner;

public class ACC {
    private double balance;

    public double Lab(double IntialBalance) {
        if (IntialBalance > 0.00) {
            balance = IntialBalance;
        }
        return balance;
    }

    public void setBalance(double Balance) {
        balance = Balance;
    }

    public double getBalance() {
        return balance;
    }

    public double creditSaving(double savingDepositM, double savingDepositA, double savingDepositN) {
        return this.balance + savingDepositM + savingDepositA + savingDepositN;
    }

    public double creditCurrent(double savingDepositM, double savingDepositA, double savingDepositN) {
        return this.balance + savingDepositM + savingDepositA + savingDepositN;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ACC saving = new ACC();
        ACC current = new ACC();

        System.out.println("Please enter the deposit amount for the savings account");
        double savingDepositM = scanner.nextDouble();
        double savingDepositA = scanner.nextDouble();
        double savingDepositN = scanner.nextDouble();
        double balanceForSaving = saving.creditSaving(savingDepositM, savingDepositA, savingDepositN);
        System.out.println("The total balance for saving accounts is: ");
        System.out.println("savings balance is: " + balanceForSaving);

        System.out.println("Please enter the deposit amount for the currents account");
        double CurrentDepositM = scanner.nextDouble();
        double CurrentDepositA = scanner.nextDouble();
        double CurrentDepositN = scanner.nextDouble();
        double balanceForCurrent = saving.creditSaving(CurrentDepositM, CurrentDepositA, CurrentDepositN);
        System.out.println("The total balance for saving accounts is: ");
        System.out.println("savings balance is: " + balanceForCurrent);

        System.out.println("Summary...........");
        System.out.println("Saving Balance is: "+ balanceForSaving);
        System.out.println("Current Balance is: "+ balanceForCurrent);
    }
 }