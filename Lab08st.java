public class Lab08st
{
    public static void main (String args[])
    {
        System.out.println("\nLab 08\n");

        Bank tom = new Bank("Tom Smith");
        Bank sue = new Bank("Sue Brown", 3000);
        Bank bob = new Bank("Bob Jones", 5000, 10000);

        tom.showBalances();
        sue.showBalances();
        bob.showBalances();

        System.out.println("Tom deposit $1000 in checking and $5000 in savings.");
        tom.checkingDeposit(1000);
        tom.savingsDeposit(5000);
        tom.showBalances();

        System.out.println("Bob withdraws $7000 from checking.");
        bob.checkingWithdrawal(4000);
        bob.showBalances();

        System.out.println("Tom withdraws $4000 from savings.");
        tom.savingsWithdrawal(4000);
        tom.showBalances();

        System.out.println("Sue withdraws $4000 from checking.");
        sue.checkingWithdrawal(4000);
        sue.showBalances();
    }
}  
