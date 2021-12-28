package src.reptilia.ular;

import src.reptilia.Reptilia;

public class Ular extends Reptilia {
  private String name = "Ular";
  private boolean isBerbisa, isNocturnal;
  public Ular(boolean isBerbisa, boolean isNocturnal){
    super("Serpentes", "0", "Tikus", "Semak-semak", false);
    this.isBerbisa(isBerbisa);
    this.setName(name);
    this.isNocturnal = isNocturnal;
  }

  public void isBerbisa(boolean isBerbisa){
    this.isBerbisa = isBerbisa;
  }

  public void setName(String newName){
    this.name = newName;
  }

  public String getName(){
    return this.name;
  }

  public String isBerbisa(){
    return this.isBerbisa ? "Ular ini berbisa" : "Ular ini tidak berbisa";
  }


}
