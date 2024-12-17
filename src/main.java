public class main {
  public static void main(String[] args) {
    balok blk1=new balok();
    balok blk2=new balok();
    
    blk1.lebar=21;
    blk1.panjang=90;
    blk1.tinggi=21;

    blk2.lebar=21;
    blk2.panjang=40; 
    blk2.tinggi=24;


    System.out.println("volume ballok ="+ blk1.hitungbalok());
    System.out.println("volume balok adalah="+ blk2.hitungbalok());

  }
  
}
