package src.com.study.design.pattern.creational.builder

class CodeBuilderKt(private val className: String) {

    private val properties = mutableMapOf<String, String>()

    fun addField(name: String, type: String): CodeBuilderKt {
        properties[name] = type
        return this
    }

    override fun toString() =
        buildString {
            this.appendln("class $className (")

            properties.forEach {
                this.appendln("   val ${it.key}: ${it.value},")
            }

            this.append(")")

        }.reversed().replaceFirst(Regex(","), "").reversed()
}