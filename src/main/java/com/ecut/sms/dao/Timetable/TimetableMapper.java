package com.ecut.sms.dao.Timetable;

import com.ecut.sms.dto.Timetable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Description 课表mapper层
 * Author: ecut
 * Date2025/6/27 14:30
 **/
@Mapper
public interface TimetableMapper {
  /**
   * description: 新增课程表
   * @param timetable
   * @return void
   * @author ecut
   * @Date 2025/6/27 14:35
   */
  void add(Timetable timetable);

  /**
   * description: 获取timetable课程表信息
   * @param condition
   * @author ecut
   * @return List<Timetable>
   * @Date 2025/6/27 14:40
   */
  List<Timetable> getTimetable(@Param("condition") Map<String, Object> condition);

  /**
  * description: 根据专业班级查看课程表数量（验证是否添加课程表）
  * @param: Map<String, Object> condition
  * return: Integer
  * Author: ecut
  * @Date: 2025/6/27 14:45
  */
  Integer checkCount(@Param("condition") Map<String, Object> condition);
  /**
  * description: 删除 timetable表
  * @param: Map<String, Object> condition
  * return:void
  * Author: ecut
  * @Date: 2025/6/27 14:50
  */
  void deleteTimeTable(@Param("condition") Map<String, Object> condition);
}
