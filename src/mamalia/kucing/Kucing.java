package src.mamalia.kucing;

import src.mamalia.Mamalia;

public class Kucing extends Mamalia {
  private String suara, name = "Kucing";
  public Kucing(String newVoices){
    super("Panthera", "4", "Whiskas", "Rumah", false, false);
    this.setVoices(newVoices);
    this.setName(name);
  }

  public void setVoices(String newVoices){
    this.suara = newVoices;
  }

  public void setName(String newName){
    this.name = newName;
  }

  public String getName(){
    return this.name;
  }

  public String getVoices(){
    return this.suara;
  }


}
