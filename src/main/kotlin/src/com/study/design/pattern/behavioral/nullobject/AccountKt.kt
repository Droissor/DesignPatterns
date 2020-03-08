package src.com.study.design.pattern.behavioral.nullobject

class AccountKt(private val log: LogKt) {

    @Throws(Exception::class)
    fun someOperation() {
        val c = log.getRecordCount()

        log.logInfo("Performing an operation")

        if (c + 1 != log.getRecordCount()) throw Exception()
        if (log.getRecordCount() >= log.getRecordLimit()) throw Exception()
    }
}