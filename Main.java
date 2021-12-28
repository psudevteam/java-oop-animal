import src.mamalia.kucing.Kucing;
import src.reptilia.ular.Ular;

public class Main {
  public static void main(String[] args){

    Kucing haha = new Kucing("Meong");
    System.out.println("Nama Hewan : " + haha.getName());
    System.out.println("Nama Latin : " + haha.getJenis());
    System.out.println("Suara : " + haha.getVoices());
    System.out.println("Jumlah Kaki : " + haha.getKaki());
    System.out.println("Jenis Makanan : " + haha.getFood());
    System.out.println("Habitat : " + haha.getEnv());
    System.out.println("Genus : " + haha.getGenus());
    System.out.println(haha.isBipedal());
    System.out.println(haha.isNocturnal());
    System.out.println("\n");

    Ular euy = new Ular(true, false);

    System.out.println("Nama Hewan : " + euy.getName());
    System.out.println("Nama Latin : " + euy.getJenis());
    System.out.println("Apakah Berbisa : " + euy.isBerbisa());
    System.out.println("Jumlah Kaki : " + euy.getKaki());
    System.out.println("Jenis Makanan : " + euy.getFood());
    System.out.println("Habitat : " + euy.getEnv());
    System.out.println("Genus : " + euy.getGenus());
    System.out.println(euy.isBipedal());
    System.out.println(euy.isNocturnal());

  }
}
