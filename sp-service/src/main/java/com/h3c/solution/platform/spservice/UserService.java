package com.h3c.solution.platform.spservice;


import com.h3c.solution.platform.spdb.User;
import com.h3c.solution.platform.sputil.DateTimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 在 UserService 类上加了 “@Service” 注解，这样Spring会自动完成依赖注入，
 * 在需要 Service 的地方，通过 “@Autowired” 注解注入 ，比如，我们需要User对象时，不是直接 new 出来，
 * 而是通过 Autowired 注入。代码中，设置用户的最后登录时间时，
 * 用到了 “sp-util”的 “DateTimeTool”工具类中的方法。
 */

@Service
public class UserService {


    @Autowired
    private User user;

    public User get(){
        user.setName("Charlie");
        user.setLastLoginTime(DateTimeUtil.format(new Date()));
        return user;
    }


}
