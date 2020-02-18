package src.com.study.design.pattern.structural.proxy

open class PersonKt(val age: Int) {

    open fun drink() = "drinking"

    open fun drive()= "driving"

    open fun drinkAndDrive()= "driving while drunk"
}