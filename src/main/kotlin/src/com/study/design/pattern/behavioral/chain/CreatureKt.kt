package src.com.study.design.pattern.behavioral.chain

interface CreatureKt {
    fun applyModifier(statistic: Statistic, attributeValue: Int): Int
    fun getAttack(): Int
    fun getDefense(): Int
}
