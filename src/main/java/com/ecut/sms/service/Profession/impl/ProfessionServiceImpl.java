package com.ecut.sms.service.Profession.impl;

import com.ecut.sms.dao.Profession.ProfessionMapper;
import com.ecut.sms.domain.Profession;
import com.ecut.sms.service.Profession.ProfessionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description 专业接口实现类
 * Author: ecut
 * Date2025/6/29 13:00
 **/
@Service
public class ProfessionServiceImpl implements ProfessionService {
  @Resource
  private ProfessionMapper professionMapper;

  @Override
  public List<Profession> getProfessionList() {
    return professionMapper.getProfessionList();
  }
}
