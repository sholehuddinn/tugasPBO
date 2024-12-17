public class nilai {
  private int tugas;
  private int uts;
  private int uas;

  public nilai() {
    setTugas(50);
    setUts(50);
    setUas(50);
  }

  public void setTugas (int val) {
    if(val < 0) {
      System.out.println("Nilai Tidak Boleh Di Bawah 0");
    } else if (val > 100) {
      System.out.println("Nilai Tidak Boleh Lebih Dari 100");
    } else {
      tugas = val;
    }
  }
  public void setUts (int val) {
    if(val < 0) {
      System.out.println("Nilai Tidak Boleh Di Bawah 0");
    } else if (val > 100) {
      System.out.println("Nilai Tidak Boleh Lebih Dari 100");
    } else {
      uts = val;
    }
  }
  public void setUas (int val) {
    if(val < 0) {
      System.out.println("Nilai Tidak Boleh Di Bawah 0");
    } else if (val > 100) {
      System.out.println("Nilai Tidak Boleh Lebih Dari 100");
    } else {
      uas = val;
    }
  }

  public double getNilai() {
    System.out.println("Nilai Tugas : " + (tugas * (0.2)));
    System.out.println("Nilai UTS : " + (uts * (0.4)));
    System.out.println("Nilai UAS : " + (uas * (0.4)));
    return ((0.2) * tugas) + ((0.4) * uts) + ((0.4) * uas);
  }
}
