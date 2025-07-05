package com.ecut.sms.dao.Upload;

import com.ecut.sms.domain.Upload;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * Description 上传mapper层
 * Author: ecut
 * Date2025/6/27 15:00
 **/
@Mapper
public interface UploadMapper {
  /**
   * description: 上传头像
   *
   * @param: condition
   * return: void
   * Author: ecut
   * @Date: 2025/6/27 15:05
   */
  void add(Upload upload);
  /**
  * description: 获取头像
  * @param: condition
  * return: String
  * Author: ecut
  * @Date: 2025/6/27 15:10
  */
  String getHead(@Param("condition") Map<String, Object> condition);
  /**
  * description: 根据用户id和等级查询用户是否存在
  * @param: condition
  * return: Integer
  * Author: ecut
  * @Date: 2025/6/27 15:15
  */
  Integer checkCount(@Param("condition") Map<String, Object> condition);
  /**
  * description: 修改用户头像
  * @param: upload
  * return: void
  * Author: ecut
  * @Date: 2025/6/27 15:20
  */
  void update(Upload upload);
}
