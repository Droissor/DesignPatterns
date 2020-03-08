package src.com.study.design.pattern.behavioral.state

class StateDemoKt

fun main() {
    val combinationLock = CombinationLockKt(intArrayOf(1, 2, 3, 4, 5))

    combinationLock.enterDigit(1)
    combinationLock.enterDigit(2)
    combinationLock.enterDigit(3)
    combinationLock.enterDigit(4)
    combinationLock.enterDigit(5)
    combinationLock.enterDigit(6)
}