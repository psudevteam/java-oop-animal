package src.reptilia;
import src.animalia.Animalia;

public class Reptilia extends Animalia{
  private String jenis, jumlah_kaki, makanan, habitat;
  private boolean isNocturnal;

  public Reptilia(String newJenis, String newKaki, String newFood, String newEnv, boolean isNocturnal){
    super("Reptilia", newFood, newEnv, false, isNocturnal);
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
