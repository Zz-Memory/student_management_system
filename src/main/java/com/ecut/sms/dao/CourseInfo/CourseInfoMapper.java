package com.ecut.sms.dao.CourseInfo;

import com.ecut.sms.domain.CourseInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * Description 课程信息mapper层
 * Author: ecut
 * Date2025/6/27 11:30
 **/
@Mapper
public interface CourseInfoMapper {
  /**
   * description: 新增课程具体安排（周数等）
   * @param: courseInfo
   * return: void
   * Author: ecut
   * @Date: 2025/6/27 11:35
   */
  void addCourseInfo(CourseInfo courseInfo);
  /**
  * description: 修改课程具体安排（周数等）
  * @param: courseInfo
  * return: void
  * Author: ecut
  * @Date: 2025/6/27 11:40
  */
  void updateCourseInfo(CourseInfo courseInfo);
  /**
  * description: 删除课程具体安排
  * @param: String
  * return: void
  * Author: ecut
  * @Date: 2025/6/27 11:45
  */
  void deleteInfo(@Param("id") String id);
  /**
  * description: 获取课程信息详情
  * @param: Map<String, Object> condition
  * return: CourseInfo
  * Author: ecut
  * @Date: 2025/6/27 11:50
  */
  CourseInfo getInfo(@Param("condition") Map<String, Object> condition);
}
