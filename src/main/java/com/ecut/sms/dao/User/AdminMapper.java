package com.ecut.sms.dao.User;

import com.github.pagehelper.PageRowBounds;
import com.ecut.sms.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Description 管理员用户mapper层
 * Author: ecut
 * Date2025/6/27 10:30
 **/
@Mapper
public interface AdminMapper {
  /**
   * description: 新增管理员账号信息
   * @param user
   * @return void
   * @author ecut
   * @Date 2025/6/27 10:35
   */
  void add(User user);

  /**
   * description: 删除管理员账号
   *
   * @param ids
   * @return void
   * @author ecut
   * @Date 2025/6/27 10:40
   */
  void delete(@Param("ids") List<Integer> ids);

  /**
   * description: 修改管理员账号
   *
   * @param user
   * @return void
   * @author ecut
   * @Date 2025/6/27 10:45
   */
  void update(User user);

  /**
   * description: 获取管理员账号信息列表
   * @param rowBounds
   * @author ecut
   * @return java.util.List<com.ecut.sms.dto.User>
   * @Date 2025/6/27 10:50
   */
  List<User> getAdminList(PageRowBounds rowBounds, @Param("condition") Map<String, Object> condition);
  /**
  * description: 根据管理员id获取管理员信息
  * @param: String
  * return: User
  * Author: ecut
  * @Date 2025/6/27 10:55
  */
  User getUserById(@Param("id") String id);
  /**
   * description: 查看管理员人数
   * return: Integer
   * Author: ecut
   * @Date 2025/6/27 11:00
   */
  Integer checkCodeCount();
}
