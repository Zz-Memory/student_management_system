package com.ecut.sms.dao.User;

import com.ecut.sms.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * Description 用户mapper层
 * Author: ecut
 * Date2025/6/27 09:00
 **/
@Mapper
public interface UserMapper {
  /**
   * description: 根据学生用户、密码登录
   * 
   * @params: condition
   * @return: com.ecut.sms.dto.User
   * @Author: ecut
   * @Date 2025/6/27 09:05
   */
  User getStudentInfo(@Param("condition") Map<String, Object> condition);

  /**
   * description: 根据老师用户、密码登录
   * 
   * @params: condition
   * @return: com.ecut.sms.dto.User
   * @Author: ecut
   * @Date 2025/6/27 09:10
   */
  User getTeacherInfo(@Param("condition") Map<String, Object> condition);

  /**
   * description: 根据管理员用户、密码登录
   * 
   * @params: condition
   * @return: com.ecut.sms.dto.User
   * @Author: ecut
   * @Date 2025/6/27 09:15
   */
  User getAdminInfo(@Param("condition") Map<String, Object> condition);

  /**
   * description: 修改密码
   * 
   * @params: condition
   * @return: void
   * @Author: ecut
   * @Date 2025/6/27 09:20
   */
  void update(@Param("condition") Map<String, Object> condition);

  /**
   * description: 查询是否与原密码相同
   * 
   * @params: condition
   * @return: Integer
   * @Author: ecut
   * @Date 2025/6/27 09:25
   */
  Integer checkPasswordCount(@Param("condition") Map<String, Object> condition);

  /**
   * description: 获取默哀模式
   * return: Integer
   * Author: ecut
   * 
   * @Date 2025/6/27 09:30
   */
  Integer getSilent();

  /**
   * description: 获取默哀模式
   * return: Integer
   * Author: ecut
   * 
   * @Date 2025/6/27 09:35
   */
  void setSilent(@Param("state") Integer state);
}
