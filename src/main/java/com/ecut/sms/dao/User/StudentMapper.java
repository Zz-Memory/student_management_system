package com.ecut.sms.dao.User;

import com.github.pagehelper.PageRowBounds;
import com.ecut.sms.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Description 学生用户mapper层
 * Author: ecut
 * Date2025/6/27 09:30
 **/
@Mapper
public interface StudentMapper {
  /**
   * description: 新增学生账号信息
   * @param user
   * @return void
   * @author ecut
   * @Date 2025/6/27 09:35
   */
  void addStudent(User user);

  /**
   * description: 删除学生账号
   *
   * @param ids
   * @return void
   * @author ecut
   * @Date 2025/6/27 09:40
   */
  void delete(@Param("ids") List<String> ids);

  /**
   * description: 修改学生账号
   *
   * @param user
   * @return void
   * @author ecut
   * @Date 2025/6/27 09:45
   */
  void update(User user);

  /**
   * description: 获取学生账号信息列表
   * @param rowBounds
   * @author ecut
   * @return java.util.List<com.ecut.sms.dto.User>
   * @Date 2025/6/27 09:50
   */
  List<User> getStudentList(PageRowBounds rowBounds,  @Param("condition") Map<String, Object> condition);
  /**
  * description:
  * @param:
  * return:
  * Author: ecut
  * @Date 2025/6/27 09:55
  */
  List<User> getStudentTree();
  /**
  * description: 根据专业获取该专业下的所有班级
  * @param: String
  * return: List<String>
  * Author: ecut
  * @Date 2025/6/27 10:00
  */
  List<String> getGradeByProfession(@Param("code") String code);
  /**
   * description: 查看人数
   * return: Integer
   * Author: ecut
   * @Date 2025/6/27 10:05
   */
  Integer checkCodeCount(@Param("condition") Map<String, Object> condition);
  /**
   * description: 根据id获取管理员信息
   * @param:
   * return:
   * Author: ecut
   * @Date 2025/6/27 10:10
   */
  User getUserById(@Param("id") String id);
  /**
  * description: 根据id获取学生信息
  * @param:
  * return:
  * Author: ecut
  * @Date 2025/6/27 10:15
  */
  User getStudentById(@Param("id") String id);
}
