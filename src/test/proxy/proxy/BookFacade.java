package test.proxy.proxy;

import club.Interceptor.LogInterceptor;
import club.annotation.AOP;
import club.bll.UserBLL;

/**
 * Created by 1dian_tech50 on 2016/6/21.
 * User : linving
 * Date : 2016/6/21
 * Time : 11:49
 */
public class BookFacade {
    @AOP(LogInterceptor.class)
    public void addBook() {
        System.out.println("增加图书的普通方法...");
    }
}
