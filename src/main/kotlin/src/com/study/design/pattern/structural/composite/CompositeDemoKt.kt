package src.com.study.design.pattern.structural.composite

import java.util.ArrayList

class CompositeDemoKt

fun main() {
    val manyValues = ManyValues()
    manyValues.add(10)
    manyValues.add(15)
    manyValues.add(20)
    manyValues.add(SingleValue(40).value)

    val valueContainers = ArrayList<ValueContainer>()
    valueContainers.add(SingleValue(80))
    valueContainers.add(manyValues)
    valueContainers.add(SingleValue(5))

    println("Values on MyList: " + MyList(valueContainers).toString())
    println("MyList sum: " + MyList(valueContainers).sum())
}