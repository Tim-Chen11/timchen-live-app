package org.timchen.live.user.provider.dao.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @Author: Tim Chen
 * @Date: 11:26 2024-07-19
 * @Description:
 */
@Data
@TableName("t_user_tag")
public class UserTagPO {

    @TableId(type = IdType.INPUT)
    private Long userId;

    @TableField(value = "tag_info_01")
    private Long tagInfo01;

    @TableField(value = "tag_info_02")
    private Long tagInfo02;

    @TableField(value = "tag_info_03")
    private Long tagInfo03;

    private Date createTime;

    private Date updateTime;
}
