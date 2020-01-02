package src.com.study.design.pattern.creational.singleton

import java.util.function.Supplier

class SingletonTesterKt {

    fun isSingleton(func: Supplier<Any>) = func.get() == func.get()

}