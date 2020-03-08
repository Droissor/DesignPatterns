package src.com.study.design.pattern.behavioral.nullobject;

class NullLog implements Log
{
    Integer records = 0;

    @Override
    public int getRecordLimit() {
        return records+1;
    }

    @Override
    public int getRecordCount() {
        return records;
    }

    @Override
    public void logInfo(String message) { records++;}
}