package src.com.study.design.pattern.structural.flyweight

class FlyweightDemoKt

fun main() {
    val sentence = SentenceKt("hello world")
    sentence.getWord(1).capitalize = true
    print(sentence) // writes 'hello WORLD'
}