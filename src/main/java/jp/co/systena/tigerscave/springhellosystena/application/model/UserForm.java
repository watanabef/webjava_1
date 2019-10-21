package jp.co.systena.tigerscave.springhellosystena.application.model;

import javax.validation.constraints.Size;

public class UserForm {

  @Size(max=10)         // 入力最大長
  private String name;

  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }
}
