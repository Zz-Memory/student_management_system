package com.ecut.sms.dao.User;

import com.github.pagehelper.PageRowBounds;
import com.ecut.sms.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Description 教师用户mapper层
 * Author: ecut
 * Date2025/6/27 10:00
 **/
@Mapper
public interface TeacherMapper {

  /**
   * description: 新增教师账号信息
   * @param user
   * @return void
   * @author ecut
   * @Date 2025/6/27 10:05
   */
  void addTeacher(User user);

  /**
   * description: 删除教师账号
   *
   * @param ids
   * @return void
   * @author ecut
   * @Date 2025/6/27 10:10
   */
  void delete(@Param("ids") List<Integer> ids);

  /**
   * description: 修改教师账号
   *
   * @param user
   * @return void
   * @author ecut
   * @Date 2025/6/27 10:15
   */
  void update(User user);

  /**
   * description: 获取教师账号信息列表
   * @param rowBounds
   * @author ecut
   * @return java.util.List<com.ecut.sms.dto.User>
   * @Date 2025/6/27 10:20
   */
  List<User> getTeacherList(PageRowBounds rowBounds, @Param("condition") Map<String, Object> condition);
  /**
   * description:
   * @param:
   * return:
   * Author: ecut
   * @Date 2025/6/27 10:25
   */
  User getUserById(@Param("id") String id);
  /**
   * description: 查看人数
   * return: Integer
   * Author: ecut
   * @Date 2025/6/27 10:30
   */
  Integer checkCodeCount();
}
