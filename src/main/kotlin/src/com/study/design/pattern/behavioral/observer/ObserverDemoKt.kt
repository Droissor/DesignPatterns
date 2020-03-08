package src.com.study.design.pattern.behavioral.observer

class ObservableDemoKt

fun main() {
    val game = GameKt()

    val rat = RatKt(game)
    RatKt(game)
    RatKt(game)
    rat.close()
    RatKt(game)
}