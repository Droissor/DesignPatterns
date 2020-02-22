package src.com.study.design.pattern.behavioral.command

class CommandKt(val action: ActionKt, val amount: Int) {
    var success: Boolean = false
}