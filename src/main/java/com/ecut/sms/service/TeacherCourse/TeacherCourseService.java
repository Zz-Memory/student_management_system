package com.ecut.sms.service.TeacherCourse;

import com.ecut.sms.domain.TeacherCourse;

import java.util.List;
import java.util.Map;

/**
 * Description 教师课程接口
 * Author: ecut
 * Date2025/6/28 13:30
 **/
public interface TeacherCourseService {
  /**
   * description: 新增
   * @param list
   * @return void
   * @author ecut
   * @Date 2025/6/28 13:35
   */
  void add(List<TeacherCourse> list);

  /**
   * description: 删除
   *
   * @param ids
   * @return void
   * @author ecut
   * @Date 2025/6/28 13:40
   */
  void delete(List<Integer> ids);

  /**
   * description: 修改
   * @param teacherCourse
   * @return void
   * @author ecut
   * @Date 2025/6/28 13:45
   */
  void update(TeacherCourse teacherCourse);

  /**
   * description: 根据教师id获取教师课程信息
   * @param: String
   * return: List<TeacherCourse>
   * Author: ecut
   * @Date 2025/6/28 13:50
   */
  List<TeacherCourse> getCourseListById(String id);
  /**
  * description: 根据教师id获取教师用户所管理的专业、班级、课程名等信息
  * @param: String
  * return: List<Map<String, Object>>
  * Author: ecut
  * @Date 2025/6/28 13:55
  */
  List<Map<String, Object>> getProfessionInfo(String teacherId);
  /**
  * description: 管理员用户获取所有的班级和课程，渲染成下拉框选择
  * return: List<Map<String, Object>>
  * Author: ecut
  * @Date 2025/6/28 14:00
  */
  List<Map<String, Object>> getProfessionInfoByAdmin();
  /**
  * description: 课程表中获取课程详细信息
  * @param: Map<String, Object> condition
  * return: TeacherCourse
  * Author: ecut
  * @Date 2025/6/28 14:05
  */
  TeacherCourse getCourseInfo(Map<String, Object> condition);
}
