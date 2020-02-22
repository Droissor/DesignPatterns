package src.com.study.design.pattern.behavioral.command;

class Account {

    private int balance = 0;

    public void process(Command c) {

        c.success = false;

        if (c.action == Command.Action.DEPOSIT) {
            balance += c.amount;
            c.success = true;
        } else if (c.action == Command.Action.WITHDRAW && balance >= c.amount) {
            balance -= c.amount;
            c.success = true;
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }
}
