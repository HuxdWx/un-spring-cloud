package org.huxd.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Huxd
 * @version 1.0
 * @description: TODO
 * @date 2022/1/10 13:37
 */
@Data
@TableName("account")
public class Account implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    private int id;
    private String accountCode;
    private String accountName;
    private int amount;
}
