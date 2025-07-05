package com.ecut.sms.dao.Profession;

import com.ecut.sms.domain.Profession;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Description 专业mapper层
 * Author: ecut
 * Date2025/6/27 13:30
 **/
@Mapper
public interface ProfessionMapper {
  /**
  * description: 获取所有专业
  * return: List<Profession>
  * Author: ecut
  * @Date: 2025/6/27 13:35
  */
  List<Profession> getProfessionList();
  /**
  * description: 根据专业名查询专业数量（判断是否存在该专业）
  * @param: String
  * return: Integer
  * Author: ecut
  * @Date: 2025/6/27 13:40
  */
  Integer checkProfessionCount(@Param("name") String name);
  /**
  * description: 新增专业
  * @param: Profession
  * return: void
  * Author: ecut
  * @Date: 2025/6/27 13:45
  */
  void addProfession(Profession profession);
  /**
  * description: 删除专业
  * @param: Integer
  * return: void
  * Author: ecut
  * @Date: 2025/6/27 13:50
  */
  void deleteProfession(@Param("id") Integer id);
  /**
  * description: 根据专业名查询专业信息
  * @param: String
  * return: Profession
  * Author: ecut
  * @Date: 2025/6/27 13:55
  */
  Profession getProfessionIdByName(@Param("name") String name);
}
