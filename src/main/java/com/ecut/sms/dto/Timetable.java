package com.ecut.sms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description 课表实体类
 * Author: ecut
 * Date2025/6/26 10:30
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Timetable {
  /**
   * id
   */
  private Integer id;
  /**
   * week id
   */
  private Integer weekId;
  /**
   * 专业
   */
  private String profession;
  /**
   * 班级
   */
  private String grade;
  /**
   * 学年
   */
  private Integer year;
  /**
   * 学期
   */
  private Integer term;
}
