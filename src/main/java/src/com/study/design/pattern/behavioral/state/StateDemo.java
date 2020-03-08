package src.com.study.design.pattern.behavioral.state;

public class StateDemo {
    public static void main(String[] args) {
        CombinationLock combinationLock = new CombinationLock(new int[]{1,2,3,4,5});

        combinationLock.enterDigit(1);
        combinationLock.enterDigit(2);
        combinationLock.enterDigit(3);
        combinationLock.enterDigit(4);
        combinationLock.enterDigit(5);
        combinationLock.enterDigit(6);
    }
}
