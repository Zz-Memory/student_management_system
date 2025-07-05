package com.ecut.sms.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description 课程信息实体类
 * Author: ecut
 * Date2025/6/26 13:00
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseInfo {
  /**
   * id
   */
  private Integer id;
  /**
   * 课程id
   */
  private String courseId;
  /**
   *周数 start
   */
  private Integer start;
  /**
   * 周数 end
   */
  private Integer end;
  /**
   * 教室
   */
  private String room;
  /**
   * 专业
   */
  private String profession;
}
