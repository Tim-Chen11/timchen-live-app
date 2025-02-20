package org.timchen.live.user.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author: Tim Chen
 * @Date: 16:47 2024-06-12
 * @Description:
 */
@Data
public class UserDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1222460395980622091L;

    private Long userId;
    private String nickName;
    private String trueName;
    private String avatar;
    private Integer sex;
    private Integer workCity;
    private Integer bornCity;
    private Date bornDate;
    private Date createTime;
    private Date updateTime;
}
