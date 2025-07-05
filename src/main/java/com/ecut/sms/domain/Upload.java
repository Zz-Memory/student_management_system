package com.ecut.sms.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description 上传实体类
 * Author: ecut
 * Date2025/6/26 14:00
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Upload {
  /**
   * id
   */
  private Integer id;
  /**
   * 用户 id
   */
  private String userId;
  /**
   * 用户等级
   */
  private Integer level;
  /**
   * 储存地址
   */
  private String url;
}
