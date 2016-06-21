package club.jdk.proxy;

import club.annotation.AOP;

/**
 * Created by 1dian_tech50 on 2016/6/21.
 * User : linving
 * Date : 2016/6/21
 * Time : 10:58
 */
public class RealSubject  implements Subject {
    @Override
    public void rent() {
        System.out.println("I want to rent my house");
    }

    @Override
    @AOP(value = RealSubject.class)
    public void hello(String str) {
        System.out.println("hello: " + str);
    }

    public void wrod(){
        System.out.println("hello:");
    }

}
