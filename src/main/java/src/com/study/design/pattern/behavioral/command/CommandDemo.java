package src.com.study.design.pattern.behavioral.command;

import java.util.ArrayList;

public class CommandDemo {

    public static void main(String[] args) {
        ArrayList<Command> commands = new ArrayList<>();
        commands.add(new Command(Command.Action.DEPOSIT, 100));
        commands.add(new Command(Command.Action.WITHDRAW, 1000));

        Account account = new Account();

        commands.forEach(account::process);
        System.out.println(account);
    }
}
