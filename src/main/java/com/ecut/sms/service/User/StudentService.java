package com.ecut.sms.service.User;

import com.ecut.sms.dto.User;
import com.ecut.sms.utils.PagingResult;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

/**
 * Description 学生账号接口
 * Author: ecut
 * Date2025/6/28 09:30
 **/
public interface StudentService {
  /**
  * description: 新增学生账号
  * @param user
  * @return void
  * @author ecut
  * @Date 2025/6/28 09:35
  */
  void addStudent(User user);

  /**
   * description: 删除学生账号
   *
   * @param ids
   * @return void
   * @author ecut
   * @Date 2025/6/28 09:40
   */
  void delete(List<String> ids);

  /**
   * description: 修改学生账号
   *
   * @param user
   * @return void
   * @author ecut
   * @Date 2025/6/28 09:45
   */
  void update(User user);

  /**
   * description: 获取学生账号信息列表
   * @param rowBounds
   * @param condition
   * @author ecut
   * @return com.jw.ecut.sms.utils.PagingResult
   * @Date 2025/6/28 09:50
   */
  PagingResult<User> getStudentList(RowBounds rowBounds, Map<String, Object> condition);
}
