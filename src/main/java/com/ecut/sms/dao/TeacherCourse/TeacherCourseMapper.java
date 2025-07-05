package com.ecut.sms.dao.TeacherCourse;

import com.ecut.sms.domain.TeacherCourse;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Description 教师课程mapper层
 * Author: ecut
 * Date2025/6/27 14:00
 **/
@Mapper
public interface TeacherCourseMapper {
  /**
   * description: 新增
   * @param teacherCourse
   * @return void
   * @author ecut
   * @Date 2025/6/27 14:05
   */
  void add(TeacherCourse teacherCourse);

  /**
   * description: 删除
   *
   * @param ids
   * @return void
   * @author ecut
   * @Date 2025/6/27 14:10
   */
  void delete(@Param("ids") List<Integer> ids);

  /**
   * description: 修改
   *
   * @param teacherCourse
   * @return void
   * @author ecut
   * @Date 2025/6/27 14:15
   */
  void update(TeacherCourse teacherCourse);

  /**
   * description: 根据教师id获取教师课程信息
   * @param: String
   * return: List<TeacherCourse>
   * Author: ecut
   * @Date 2025/6/27 14:20
   */
  List<TeacherCourse> getCourseListById(@Param("id") String id);
  /**
   * description: 获取教师id和专业获取班级、课程名
   * @param:
   * return:
   * Author: ecut
   * @Date 2025/6/27 14:25
   */
  List<TeacherCourse> getGradeInfoByMap(@Param("condition") Map<String, Object> condition);
  /**
  * description: 根据专业、班级和课程名获取所授课的教师id
  * @param: condition
  * return: String
  * Author: ecut
  * @Date 2025/6/27 14:30
  */
  String getTeacherId(@Param("condition") Map<String, Object> condition);
  /**
  * description: 课程表中获取课程详细信息
  * @param: condition
  * return: TeacherCourse
  * Author: ecut
  * @Date 2025/6/27 14:35
  */
  TeacherCourse getCourseInfo(@Param("condition") Map<String, Object> condition);
}
