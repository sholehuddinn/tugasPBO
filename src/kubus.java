public class kubus {

  private int panjang;
  private int lebar;
  private int tinggi;

  public kubus(int p, int l, int t) {
    setPanjang(p);
    setLebar(l);
    setPanjang(t);
  }
  

  public int getPanjang() {
    return panjang;
  }

  public int getLebar() {
    return lebar;
  }

  public int getTinggi() {
    return tinggi;
  }

  public void setPanjang(int p) {
    if (p < 0) {
      System.out.println("erro");
    } else {
      panjang = p;
    }
  }
  public void setLebar(int l) {
    if (l < 0) {
      System.out.println("erro");
    } else {
      lebar = l;
    }
  }
  public void setTinggi(int t) {
    if (t < 0) {
      System.out.println("erro");
    } else {
      tinggi = t;
    }
  }

}