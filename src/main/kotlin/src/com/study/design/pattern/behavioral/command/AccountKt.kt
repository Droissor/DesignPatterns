package src.com.study.design.pattern.behavioral.command

class AccountKt(private var balance: Int = 0) {

    fun process(c: CommandKt) {

        c.success = false

        if (c.action == ActionKt.DEPOSIT) {
            balance += c.amount
            c.success = true
        } else if (c.action == ActionKt.WITHDRAW && balance >= c.amount) {
            balance -= c.amount
            c.success = true
        }
    }

    override fun toString(): String {
        return "AccountKt(balance=$balance)"
    }
}