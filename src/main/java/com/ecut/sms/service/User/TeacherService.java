package com.ecut.sms.service.User;

import com.ecut.sms.dto.User;
import com.ecut.sms.utils.PagingResult;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

/**
 * Description 教师账号接口
 * Author: ecut
 * Date2025/6/28 10:00
 **/
public interface TeacherService {
  /**
   * description: 新增教师账号
   * @param user
   * @return void
   * @author ecut
   * @Date 2025/6/28 10:05
   */
  void addTeacher(User user);

  /**
   * description: 删除教师账号
   *
   * @param ids
   * @return void
   * @author ecut
   * @Date 2025/6/28 10:10
   */
  void delete(List<Integer> ids);

  /**
   * description: 修改教师账号
   *
   * @param user
   * @return void
   * @author ecut
   * @Date 2025/6/28 10:15
   */
  void update(User user);

  /**
   * description: 获取教师账号信息列表
   * @param rowBounds
   * @param condition
   * @author ecut
   * @return com.jw.ecut.sms.utils.PagingResult
   * @Date 2025/6/28 10:20
   */
  PagingResult<User> getTeacherList(RowBounds rowBounds, Map<String, Object> condition);
}
