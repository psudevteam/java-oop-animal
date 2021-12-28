package src.mamalia;
import src.animalia.Animalia;

public class Mamalia extends Animalia{
  private String jenis, jumlah_kaki, makanan, habitat;
  private boolean isBipedal, isNocturnal;

  public Mamalia(String newJenis, String newKaki, String newFood, String newEnv, boolean isBipedal, boolean isNocturnal){
    super("Mamalia", newFood, newEnv, isBipedal, isNocturnal);
    this.setJenis(newJenis);
    this.setKaki(newKaki);
  }

  public void setJenis(String newJenis){
    this.jenis = newJenis;
  }

  public void setKaki(String newKaki){
    this.jumlah_kaki = newKaki;
  }

  public String getJenis(){
    return this.jenis;
  }

  public String getKaki(){
    return this.jumlah_kaki;
  }

}
