public class CurrentBalance{
    public static void main(String[] args) {
        double currentBalance = 0.00;


        double currentMorningDeposit= 300.00;
        double currentAfternoonDeposit= 350.00;
        double currentEveningDeposit= 400.00;

        currentBalance += currentMorningDeposit + currentAfternoonDeposit + currentEveningDeposit;

        currentBalance=Math.max(0,currentBalance);

        System.out.println("Current balance: N"+currentBalance);

    }
}
