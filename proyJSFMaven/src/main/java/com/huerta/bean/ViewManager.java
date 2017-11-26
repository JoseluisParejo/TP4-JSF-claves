package com.huerta.bean;
import com.huerta.model.Elemento;
import java.io.Serializable;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="obj")

public class ViewManager implements Serializable{
  private String key;
  private String value;
  private String last;
  private boolean good;
  private List<Elemento> listClaves;
  public ViewManager() {
     good=false;
  }
  public String getLast() {
    return last;
  }
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }
  public boolean isGood() {
    return good;
  }
  public String getValue() {
    return value;
  }
  public void setLast(String last) {
    this.last = last;
  }
  public void setValue(String value) {
    this.value = value;
  }
  public String add() {
    System.out.println("=" + this.key + "=" + this.value + "=");
    this.last=this.key;
    this.setKey("");
    this.setValue("");
    return null;
  }
  public String mostrar(){
    return "Key: "+key+"\nValue: "+value+"\nLast: "+last;
  }
}
