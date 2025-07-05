package com.ecut.sms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.ecut.sms.dao")
public class StudentMisApplication {

  public static void main(String[] args) {
    SpringApplication.run(StudentMisApplication.class, args);
  }

}
