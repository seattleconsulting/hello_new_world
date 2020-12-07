package com.example.demo.dto;
import java.io.Serializable;

import lombok.Data;

/**
 * タスク情報 リクエストデータ
 */
@Data
public class TaskRequest implements Serializable {

  /**
    * ID
    */
   private Integer id;


  /**
   * 名前
   */
  private String name;

  /**
   * 担当者
   */
  private String tantosha;

}
