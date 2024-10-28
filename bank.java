import java.util.Scanner;

class Account {
    String cname;
    int accno;
    String type;
    int balance = 0;

    void deposit(int depamo) {
        balance += depamo;
    }

    void withdrawal(int wamo) {
        if (balance <= 0) {
            System.out.println("Account is empty.");
        } else if (wamo > balance) {
            System.out.println("Insufficient balance for withdrawal.");
        } else {
            balance -= wamo;
        }
    }

    void display() {
        System.out.println("Balance is: " + balance);
    }

    int getBalance() {
        return balance;
    }
}

class SavAcc extends Account {
    int roi = 5;
    void getInterest() {
        double interest = balance * (roi / 100.0);
        System.out.println("interest is:"+interest);
        balance += interest; 
        System.out.println("Balance in savings account after interest is: " + balance);
        System.out.println("No cheque book facility.");
    }
}

class CurrAcc extends Account {
    void facility() {
        System.out.println("Cheque book facility provided but no interest facility.");
    }

    void penalty(int m, int p) {
        if (balance < m) {
            System.out.println("Penalty to be paid: " + p);
        } else {
            System.out.println("No penalty applicable.");
        }
    }
}

class Bank {
    public static void main(String args[]) {
        Account a = new Account();
        SavAcc s = new SavAcc();
        CurrAcc c = new CurrAcc();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the customer name:");
        a.cname = in.nextLine();
        System.out.println("Customer name is: " + a.cname);

        System.out.println("Enter the account number:");
        a.accno = in.nextInt();
        System.out.println("Account number is: " + a.accno);

        in.nextLine();
        System.out.println("Enter the type of account (savings/current):");
        a.type = in.nextLine();

        if (a.type.equalsIgnoreCase("savings")) {
            System.out.println("Enter the deposit amount:");
            int A = in.nextInt();
            a.deposit(A);

            System.out.println("Enter the withdrawal amount:");
            int B = in.nextInt();
            a.withdrawal(B);
            a.display();

            s.balance = a.getBalance(); 
            s.getInterest();
        } else if (a.type.equalsIgnoreCase("current")) {
            c.facility();
            System.out.println("Enter the minimum balance:");
            int m = in.nextInt();
            System.out.println("Enter the penalty:");
            int p = in.nextInt();
            c.balance = a.getBalance(); 
            c.penalty(m, p);
        } else {
            System.out.println("Invalid account type.");
        }

    }
}
