package org.timchen.live.api.service;

import jakarta.servlet.http.HttpServletResponse;
import org.timchen.live.common.interfaces.vo.WebResponseVO;

/**
 * @Author: Tim Chen
 * @Date: 9:50 2024-07-30
 * @Description:
 */
public interface IUserLoginService {

    /**
     * 发送登录验证码
     *
     * @param phone
     * @return
     */
    WebResponseVO sendLoginCode(String phone);

    /**
     * 手机号+验证码登录
     *
     * @param phone
     * @param code
     * @return
     */
    WebResponseVO login(String phone, Integer code, HttpServletResponse response);
}
