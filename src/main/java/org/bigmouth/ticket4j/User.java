/*
 * 文件名称: BuyTickets.java
 * 版权信息: Copyright 2013-2014 By Allen Hu. All right reserved.
 * ----------------------------------------------------------------------------------------------
 * 修改历史:
 * ----------------------------------------------------------------------------------------------
 * 修改原因: 新增
 * 修改人员: Allen.Hu
 * 修改日期: 2014-8-14
 * 修改内容: 
 */
package org.bigmouth.ticket4j;

import org.bigmouth.ticket4j.cookie.CookieCache;
import org.bigmouth.ticket4j.entity.response.CheckUserResponse;
import org.bigmouth.ticket4j.entity.response.LoginSuggestResponse;
import org.bigmouth.ticket4j.entity.response.QueryPassengerResponse;
import org.bigmouth.ticket4j.http.Ticket4jHttpResponse;


public interface User {

    LoginSuggestResponse login(String passCode, Ticket4jHttpResponse ticket4jHttpResponse);
    
    LoginSuggestResponse login(String username, String passwd, String passCode, Ticket4jHttpResponse ticket4jHttpResponse);
    
    CheckUserResponse check(CookieCache cookieCache);
    
    /**
     * @param ticket4jHttpResponse
     * @return 不会为空
     */
    CheckUserResponse check(Ticket4jHttpResponse ticket4jHttpResponse);
    
    QueryPassengerResponse queryPassenger(Ticket4jHttpResponse ticket4jHttpResponse);
    
    String getUsername();
}
