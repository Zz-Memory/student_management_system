package com.ecut.sms.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description 专业实体类
 * Author: ecut
 * Date2025/6/26 11:30
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Profession {
  /**
   * 专业id
   */
  private Integer id;
  /**
   * 专业名
   */
  private String name;
}
