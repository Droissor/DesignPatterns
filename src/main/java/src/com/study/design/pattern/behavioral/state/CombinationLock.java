package src.com.study.design.pattern.behavioral.state;

import java.util.Arrays;

class CombinationLock {

    private String combination;
    public String status;

    public CombinationLock(int[] combination) {
        this.status = "LOCKED";

        StringBuilder stringBuilder = new StringBuilder();

        Arrays.stream(combination).forEach(stringBuilder::append);
        this.combination = stringBuilder.toString();
    }

    public void enterDigit(int digit) {

        if (status.equals("LOCKED")) status = "";

        status = status + digit;

        if (status.equals(combination)) status = "OPEN";

        if (!status.equals("OPEN") && status.length() == combination.length()) status = "ERROR";

        System.out.println(status);
    }
}
