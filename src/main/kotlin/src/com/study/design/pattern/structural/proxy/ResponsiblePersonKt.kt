package src.com.study.design.pattern.structural.proxy

class ResponsiblePersonKt(personKt: PersonKt) : PersonKt(personKt.age) {

    override fun drink() = if(age > 18) super.drink() else  "too young"

    override fun drive() = if(age > 16) super.drive() else  "too young"

    override fun drinkAndDrive() = "dead"

}