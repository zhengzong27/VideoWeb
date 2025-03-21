package com.liucm.util;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class StringUtil {

	// 首字母转大写方法...

	// 首字母转小写方法...

    /* 正确注释整个内部类
    @Component
    @Order(1)
    public class AppRestrict implements ApplicationRunner {
        @Override
        public void run(ApplicationArguments args) throws Exception {
            // 原有逻辑...
        }
    }
    */
}