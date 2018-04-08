package com.h3c.solution.platform.spdb;

import org.springframework.stereotype.Component;

/**
 * 使用“@Component”注解，这样就可以使用Spring Boot的依赖注入（IOC）功能，在使用的地方用“@Autowired”注解来注明要注入的地方。
 */
@Component
public class User {
    private String name;
    private String lastLoginTime;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastLoginTime() {
        return lastLoginTime;
    }
    public void setLastLoginTime(String lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
}
