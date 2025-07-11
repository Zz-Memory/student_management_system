package com.ecut.sms.service.Upload.impl;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.ecut.sms.dao.Upload.UploadMapper;
import com.ecut.sms.domain.Upload;
import com.ecut.sms.service.Upload.UploadService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Description 上传接口实现类
 * Author: ecut
 * Date2025/6/29 14:30
 **/
@Service
public class UploadServiceImpl implements UploadService {

  private final Log logger = LogFactory.getLog(UploadServiceImpl.class);

  @Resource
  private UploadMapper uploadMapper;

  @Override
  public void upload(Upload upload) {
    Map<String, Object> condition = new HashMap<>();
    condition.put("userId", upload.getUserId());
    condition.put("level", upload.getLevel());
    String oldUrl = uploadMapper.getHead(condition);
    if (oldUrl == null) {
      uploadMapper.add(upload);
    } else {
      File file = new File(oldUrl);
      //文件是否存在
      if (file.exists()) {
        if (file.delete()) {
          logger.info("删除文件成功");
        }
        uploadMapper.update(upload);
      }
    }
  }

  @Override
  public String getHeader(Map<String, Object> condition) {
    String imgUrl = uploadMapper.getHead(condition);
    return imgUrl == null ? "" : imgUrl.substring(imgUrl.indexOf("/"));
  }
}
