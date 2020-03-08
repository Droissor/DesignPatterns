package src.com.study.design.pattern.behavioral.nullobject

class NullLogKt : LogKt {

    var records = 0

    override fun getRecordLimit() = records + 1

    override fun getRecordCount() = records

    override fun logInfo(message: String) {
        records++
    }
}