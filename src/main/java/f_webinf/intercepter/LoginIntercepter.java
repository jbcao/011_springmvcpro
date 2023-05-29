package f_webinf.intercepter;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 功能
 *
 * @author caojianbang
 * @date 26.8.22 12:30 AM
 */
public class LoginIntercepter implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getSession().getAttribute("user") == null) {
            request.setAttribute("msg", "您好，请乖乖登录");
            request.getRequestDispatcher("/WEB-INF/jsp/f-login.jsp").forward(request,response);
            return false;
        }
        return true;
    }
}
