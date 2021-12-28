package src.animalia;

public abstract class Animalia {
  private String genus, makanan, habitat;
  private boolean isBipedal, isNocturnal;
  public Animalia(String newGenus, String newFood, String newEnv, boolean isBipedal, boolean isNocturnal) {
      this.setGenus(newGenus);
      this.setFood(newFood);
      this.setEnv(newEnv);
      this.isNocturnal(isNocturnal);
      this.isBipedal(isBipedal);
  }

  public void setGenus(String newGenus){
    this.genus = newGenus;
  }

  public void setFood(String newFood){
    this.makanan = newFood;
  }

  public void setEnv(String newEnv){
    this.habitat = newEnv;
  }

  public void isBipedal(boolean isBipedal){
    this.isBipedal = isBipedal;
  }

  public void isNocturnal(boolean isNocturnal){
    this.isNocturnal = isNocturnal;
  }

  public String getGenus(){
    return this.genus;
  }

  public String getFood(){
    return this.makanan;
  }

  public String getEnv(){
    return this.habitat;
  }

  public String isBipedal(){
    return this.isBipedal ? "Hewan ini berjalan dengan dua kaki" : "Hewan ini tidak berjalan dengan dua kaki";
  }

  public String isNocturnal(){
    return this.isNocturnal ? "Hewan ini mencari makanan pada malam hari " : "Hewan ini mencari makanan di siang hari";
  }
}
