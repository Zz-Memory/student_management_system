package com.ecut.sms.service.Timetable;

import com.ecut.sms.domain.CourseInfo;
import com.ecut.sms.domain.WeekCourse;

import java.util.List;
import java.util.Map;

/**
 * Description 课表接口
 * Author: ecut
 * Date2025/6/28 14:00
 **/
public interface TimetableService {
  /**
   * description: 新增课程表
   * @param list
   * @return void
   * @author ecut
   * @Date 2025/6/28 14:05
   */
  void add(List<WeekCourse> list);

  /**
   * description: 管理员用户获取课程表
   * @param condition
   * @author ecut
   * @return List<WeekCourse>
   * @Date 2025/6/28 14:10
   */
  List<WeekCourse> getTimetable(Map<String, Object> condition);
  /**
  * description: 学生用户获取课程表
  * @param: condition
  * return: List<WeekCourse>
  * Author: ecut
  * @Date: 2025/6/28 14:15
  */
  List<WeekCourse> getTimetableByStudent(Map<String, Object> condition);
  /**
  * description: 教师用户获取课程表
  * @param: condition
  * return: List<WeekCourse>
  * Author: ecut
  * @Date: 2025/6/28 14:20
  */
  List<WeekCourse> getTimetableByTeacher(Map<String, Object> condition);
  /**
  * description: 新增课程具体安排（周数等）
  * @param: CourseInfo
  * return: void
  * Author: ecut
  * @Date: 2025/6/28 14:25
  */
  void updateCourseInfo(CourseInfo courseInfo);
}
