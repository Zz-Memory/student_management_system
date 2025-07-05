package com.ecut.sms.service.Course;

import com.ecut.sms.dto.Course;
import com.ecut.sms.utils.PagingResult;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

/**
 * Description 课程接口
 * Author: ecut
 * Date2025/6/28 11:00
 **/
public interface CourseService {
  /**
   * description: 新增课程信息
   * @param course
   * return void
   * @author ecut
   * @Date 2025/6/28 11:05
   */
  void addCourse(Course course);
  /**
   * description: 删除课程信息
   *
   * @param ids
   * @return void
   * @author ecut
   * @Date 2025/6/28 11:10
   */
  void delete(List<Integer> ids);

  /**
   * description: 修改课程信息
   *
   * @param course
   * @return void
   * @author ecut
   * @Date 2025/6/28 11:15
   */
  void update(Course course);
  /**
  * description: 查询课程信息
  * @param: rowBounds
  * @param: condition
  * return: com.jw.ecut.sms.utils.PagingResult
  * Author: ecut
  * @Date 2025/6/28 11:20
  */
  PagingResult<Course> getCourseList(RowBounds rowBounds, Map<String, Object> condition);
  /**
  * description: 根据专业、学期获取课程列表
  * @param:  Map<String, Object> condition
  * return: List<Course>
  * Author: ecut
  * @Date 2025/6/28 11:25
  */
  List<Course> getCourseByMap(Map<String, Object> condition);
}

