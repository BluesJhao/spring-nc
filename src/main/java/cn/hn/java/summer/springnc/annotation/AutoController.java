package cn.hn.java.summer.springnc.annotation;

import java.lang.annotation.*;

/**
 * Created by xw2sy on 2017-07-17.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AutoController {
}
