package com.ecut.sms.service.User;

import com.ecut.sms.dto.User;

import java.util.List;
import java.util.Map;

/**
 * Description 用户接口
 * Author: ecut
 * Date2025/6/28 09:00
 **/
public interface UserService {
  /**
   * description: 根据用户、密码登录
   * 
   * @params: condition
   * @return: com.ecut.student_mis.dto.User
   * @Author: ecut
   * @Date 2025/6/28 09:05
   */
  User getStudentInfo(Map<String, Object> condition);

  /**
   * description: 修改密码
   * 
   * @param condition
   * @return void
   * @author ecut
   * @Date 2025/6/28 09:10
   */
  boolean update(Map<String, Object> condition);

  /**
   * description: 获取树状数据
   * return: List<Object>
   * Author: ecut
   * 
   * @Date 2025/6/28 09:15
   */
  List<Object> getTree();

  /**
   * description: 获取token
   * 
   * @param: User
   *              return: String
   *              Author: ecut
   * @Date 2025/6/28 09:20
   */
  String getToken(User user, long time);

  /**
   * description: 根据等级和id获取用户信息
   * 
   * @param: condition
   *                   return: User
   *                   Author: ecut
   * @Date 2025/6/28 09:25
   */
  User findUser(Map<String, Object> condition);

  /**
   * description: 获取默哀模式
   * return: boolean
   * Author: ecut
   * 
   * @Date 2025/6/28 09:30
   */
  boolean getSilent();

  /**
   * description: 修改默哀模式
   * 
   * @param: String
   *                return: boolean
   *                Author: ecut
   * @Date 2025/6/28 09:35
   */
  boolean setSilent(Integer state);
}
