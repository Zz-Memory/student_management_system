package com.ecut.sms.service.Score;

import com.ecut.sms.dto.Course;
import com.ecut.sms.dto.Score;
import com.ecut.sms.utils.PagingResult;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

/**
 * Description 成绩接口
 * Author: ecut
 * Date2025/6/28 11:30
 **/
public interface ScoreService {
  /**
   * description: 根据班级等信息获取课程信息
   * @param rowBounds
   * @param condition
   * @author ecut
   * @return com.jw.ecut.sms.utils.PagingResult
   * @Date 2025/6/28 11:35
   */
  PagingResult<Course> getCourseList(RowBounds rowBounds, Map<String, Object> condition);
  /**
  * description: 录入成绩
  * @param: List<Score>
  * return: void
  * Author: ecut
  * @Date: 2025/6/28 11:40
  */
  void addEntry(List<Score> list);
  /**
  * description: 导出成绩到Excel
  * @param: Map<String, Object> condition
  * return: List<Course>
  * Author: ecut
  * @Date: 2025/6/28 11:45
  */
  List<Course> getExportList(Map<String, Object> condition);
  /**
  * description: 根据成绩划分等级（不及格、及格、优秀）
  * @param: Map<String, Object> condition
  * return: List<Map<String, Object>>
  * Author: ecut
  * @Date: 2025/6/28 11:50
  */
  List<Map<String, Object>> getUserNum(Map<String, Object> condition);
  /**
   * description: 学生用户根据id获取总学分和总绩点
   * @param: Map<String, Object> condition
   * return: Map<String, Object>
   * Author: ecut
   * @Date: 2025/6/28 11:55
   */
  Map<String, Object> getUserTotal(Map<String, Object> condition);
}
