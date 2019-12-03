package com.cody;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2019 XXX, Inc. All rights reserved. <p>
 *
 * @author WQL
 * @since 2019年12月3日 0003 18:33
 */
@RefreshScope
@RestController
public class TestController {

    /*@Value("${from}")
    private String from;

    @RequestMapping("/from")
    public String from() {
        return this.from;
    }*/
}
