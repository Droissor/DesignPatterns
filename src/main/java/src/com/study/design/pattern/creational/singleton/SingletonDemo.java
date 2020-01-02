package src.com.study.design.pattern.creational.singleton;

public class SingletonDemo {

    public static void main(String[] args) {

        SingletonBucket.Factory bucketFactory =  new SingletonBucket.Factory();


        System.out.println(SingletonTester.isSingleton(bucketFactory));
    }
}
