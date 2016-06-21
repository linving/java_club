package club.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by 1dian_tech50 on 2016/6/21.
 * User : linving
 * Date : 2016/6/21
 * Time : 11:10
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AOP {
    Class<?> value();
}
