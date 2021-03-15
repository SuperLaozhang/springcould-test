package com.test.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Company： NanJing xinwang Technology Co.,Ltd
 * Copyright: 2019 Copyright(C). All rights Reserved
 *
 * @Title: com.test.springcloud.entities.ConmonResult
 * @Description:
 * @author: ZhangZiWen
 * @CreateDate: 2021/3/11 23:03
 * <p>
 * Modification  History:
 * Date              Author     Discription
 * 2021/3/11 23:03   ZhangZiWen    Create File.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConmonResult<T> {

    private Integer code;
    private String message;
    private T data;

    public ConmonResult(Integer code,String message){
//        this.code = code;
//        this.message = message;
        this(code,message,null);
    }
}
