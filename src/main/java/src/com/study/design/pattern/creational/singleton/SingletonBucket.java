package src.com.study.design.pattern.creational.singleton;

import java.util.function.Supplier;

public class SingletonBucket {

    private SingletonBucket(){}

    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public static class Factory implements Supplier{

        private SingletonBucket singletonBucket;

        @Override
        public Object get() {

            if(singletonBucket == null)
                singletonBucket = new SingletonBucket();

            return singletonBucket;
        }
    }
}