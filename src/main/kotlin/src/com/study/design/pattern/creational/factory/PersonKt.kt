package src.com.study.design.pattern.creational.factory

class PersonKt (
    val name: String,
    private val id: Int
) {
    override fun toString() = "$id: $name"
}