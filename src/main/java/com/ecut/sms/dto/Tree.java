package com.ecut.sms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description 树形结构
 * Author: ecut
 * Date2025/6/26 11:00
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tree {
  private String name;
  private String [] school;
  private String [] profession;
}
