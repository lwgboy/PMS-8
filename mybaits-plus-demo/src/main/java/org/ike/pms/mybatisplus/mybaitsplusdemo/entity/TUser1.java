package org.ike.pms.mybatisplus.mybaitsplusdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ike
 * @since 2019-04-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_user")
public class TUser1 implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "user_id",type = IdType.ID_WORKER_STR)
    private String userId;

    @TableField("user_name")
    private String userName;

    @TableField("password")
    private String password;

    @TableField("phone")
    private String phone;


}
