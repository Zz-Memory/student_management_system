package com.ecut.sms.service.Upload;

import com.ecut.sms.domain.Upload;

import java.util.Map;

/**
 * Description 上传接口
 * Author: ecut
 * Date2025/6/28 14:30
 **/
public interface UploadService {
  /**
   * description: 上传头像
   * @param: upload
   * return: void
   * Author: ecut
   * @Date: 2025/6/28 14:35
   */
  void upload(Upload upload);
  /**
  * description: 获取头像
  * @param: condition
  * return: String
  * Author: ecut
  * @Date: 2025/6/28 14:40
  */
  String getHeader(Map<String, Object> condition);
}
