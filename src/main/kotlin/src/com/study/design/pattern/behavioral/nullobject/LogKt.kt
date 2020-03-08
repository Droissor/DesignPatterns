package src.com.study.design.pattern.behavioral.nullobject

interface LogKt {
    // max # of elements in the log
    fun getRecordLimit(): Int

    // number of elements already in the log
    fun getRecordCount(): Int

    // expected to increment record count
    fun logInfo(message: String)
}