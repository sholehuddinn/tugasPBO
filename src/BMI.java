public class BMI {

  // inisialisasi variabel
  public String category;
  private int bb;
  private int tb ;
  public double hasil;

  public void setTb (int Tb) {
    if (tb < 0) {
      System.out.println("eror");
    } else {
      tb = Tb;
    }
  }

  public void setBb (int Bb) {
    if (tb < 0) {
      System.out.println("eror");
    } else {
      bb = Bb;
    }
  }

  // fungsi untuk menghitung bmi
  public double hitung_bmi() {
    // karena nanti inputan tinggi badan berupa Cm
    // maka tb di bagi 100
    hasil = bb / Math.pow((tb / 100), 2);
    return hasil;
  }

  // fungsi untuk melihat status dari bmi
  public void hasil_bmi() {
    if (hasil < 18.5) {
      System.out.println("Kekurangan Berat Badan");
    } else if (hasil >= 18.5 && hasil < 25) {
      System.out.println("Normal (ideal)");
    } else if (hasil >= 25 && hasil < 30) {
      System.out.println("Kelebihan Berat Badan");
    } else if (hasil >= 30) {
      System.out.println("Kegemukan (Obesitas)");
    }
  }
}
