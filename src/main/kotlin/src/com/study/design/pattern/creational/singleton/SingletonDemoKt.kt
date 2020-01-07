package src.com.study.design.pattern.creational.singleton

class SingletonDemoKt

fun main(){

    val bucketFactory = SingletonBucket.Factory()

    print(SingletonTesterKt().isSingleton(bucketFactory))

}