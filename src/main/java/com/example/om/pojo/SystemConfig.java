package com.example.om.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="systemconfig")
public class SystemConfig
{

  @Id
  private int id = 1;
  private String start_time;
  private String end_time;
  private int status;

  public int getStatus()
  {
    return this.status;
  }
  public void setStatus(int status) {
    this.status = status;
  }
  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getStart_time() {
    return this.start_time;
  }
  public void setStart_time(String start_time) {
    this.start_time = start_time;
  }
  public String getEnd_time() {
    return this.end_time;
  }
  public void setEnd_time(String end_time) {
    this.end_time = end_time;
  }
}