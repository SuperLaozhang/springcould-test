package com.test.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Company： NanJing xinwang Technology Co.,Ltd
 * Copyright: 2019 Copyright(C). All rights Reserved
 *
 * @Title: com.test.springcloud.entities.Payment
 * @Description:
 * @author: ZhangZiWen
 * @CreateDate: 2021/3/11 22:54
 * <p>
 * Modification  History:
 * Date              Author     Discription
 * 2021/3/11 22:54   ZhangZiWen    Create File.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    private Long id;
    private String serial;
}
