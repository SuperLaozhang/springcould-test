package com.test.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Company： NanJing xinwang Technology Co.,Ltd
 * Copyright: 2019 Copyright(C). All rights Reserved
 *
 * @Title: com.test.rule.MyRule
 * @Description: Ribbon的规则替换不能在ComponentScan扫描下
 * @author: ZhangZiWen
 * @CreateDate: 2021/3/17 14:28
 * <p>
 * Modification  History:
 * Date              Author     Discription
 * 2021/3/17 14:28   ZhangZiWen    Create File.
 */
@Configuration
public class MyRule {


    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
