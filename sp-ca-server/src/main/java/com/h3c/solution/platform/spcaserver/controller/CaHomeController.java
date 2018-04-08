package com.h3c.solution.platform.spcaserver.controller;

import com.h3c.solution.platform.spcommon.ApiResult;
import com.h3c.solution.platform.spcommon.ApiResultCode;
import com.h3c.solution.platform.spdb.User;
import com.h3c.solution.platform.spservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("api/ca")
@RestController
public class CaHomeController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public ApiResult<User> get(){
        User user = userService.get();
        ApiResult<User> result = new ApiResult<>();
        result.setCode(ApiResultCode.OK);
        result.setMessage("CA获取成功");
        result.setData(user);

        return result;
    }


}
