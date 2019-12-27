package src.com.study.design.pattern.creational.prototype

data class LineKt(
    var start: PointKt,
    var end: PointKt
) {
    fun deepCopy() = this.copy()

    override fun toString(): String {
        return "LineKt(start=$start, end=$end)"
    }
}