package com.ecut.sms.dao.Course;

import com.github.pagehelper.PageRowBounds;
import com.ecut.sms.dto.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Description 课程mapper层
 * Author: ecut
 * Date2025/6/27 11:00
 **/
@Mapper
public interface CourseMapper {
  /**
   * description: 新增课程信息
   * @param course
   * @return void
   * @author ecut
   * @Date 2025/6/27 11:05
   */
  void addCourse(Course course);

  /**
   * description: 删除课程信息
   *
   * @param ids
   * @return void
   * @author ecut
   * @Date 2025/6/27 11:10
   */
  void delete(@Param("ids") List<Integer> ids);

  /**
   * description: 修改课程信息
   *
   * @param course
   * @return void
   * @author ecut
   * @Date 2025/6/27 11:15
   */
  void update(Course course);
  /**
  * description: 获取课程信息
  * param: rowBounds
  * param: condition
  * return: List<Course>
  * Author: ecut
  * @Date 2025/6/27 11:20
  */
  List<Course> getCourseList(PageRowBounds rowBounds, @Param("condition") Map<String, Object> condition);
  /**
   * description: 查看课程最大id
   * return: Integer
   * Author: ecut
   * @Date 2025/6/27 11:25
   */
  String checkCodeCount(@Param("condition") Map<String, Object> condition);
  /**
  * description: 根据专业、学期获取课程列表
  * @param: condition
  * return:  List<Course>
  * Author: ecut
  * @Date 2025/6/27 11:30
  */
  List<Course> getCourseByMap(@Param("condition") Map<String, Object> condition);

  /**
   * description: 根据课程id获取课程信息
   * @param: String
   * return: Course
   * Author: ecut
   * @Date 2025/6/27 11:35
   */
  Course getCourseById(@Param("courseId") String courseId);
}
