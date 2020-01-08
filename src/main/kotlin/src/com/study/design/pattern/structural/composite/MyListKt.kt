package src.com.study.design.pattern.structural.composite

class MyListKt(private val collection: Collection<ValueContainerKt>) : ArrayList<ValueContainerKt>() {

    fun sum(): Int {
        var amount = 0

        collection.forEach { valueContainer ->
            valueContainer.forEach {
                amount += it
            }
        }

        return amount
    }
}