package com.ecut.sms.dao.WeekCourse;

import com.ecut.sms.domain.WeekCourse;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Description 周课表mapper层
 * Author: ecut
 * Date2025/6/27 15:30
 **/
@Mapper
public interface WeekCourseMapper {
  /**
   * description: 新增week表数据
   * @param weekCourse
   * @return void
   * @author ecut
   * @Date 2025/6/27 15:35
   */
  void add(WeekCourse weekCourse);
  /**
  * description: 修改week表
  * @param: WeekCourse
  * return: void
  * Author: ecut
  * @Date: 2025/6/27 15:40
  */
  void update(WeekCourse weekCourse);
  /**
  * description: 根据专业班级获取课程表信息
  * @param: condition
  * return: List<WeekCourse>
  * Author: ecut
  * @Date: 2025/6/27 15:45
  */
  List<WeekCourse> getWeekCourse(@Param("condition") Map<String, Object> condition);
}
