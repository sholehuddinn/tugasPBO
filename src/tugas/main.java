package tugas;

import java.util.*;


public class main {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    Pegawai pegawai = new Pegawai();
    Supervisor supervisor = new Supervisor();
    Direktur direktur = new Direktur();
    Manager manager = new Manager();

    System.out.print("Masukkan Nama : ");
    pegawai.setName(in.nextLine()); 

    System.out.print("Masukkan Jumlah Kehadiran : ");
    pegawai.setJumlahKehaddiran(in.nextInt());
    
    System.out.print("Masukkan Lembur : ");
    pegawai.setJumlahLembur(in.nextInt());

    System.out.println("Masukkan Gaji Pokok : ");
    pegawai.setGajiPokok(in.nextInt());

    System.out.print("Masukkan Tunjangan Kehadiran : ");
    pegawai.setTunjanganKehadiran(in.nextInt());

    System.out.print("Maukkan Tunjangan Lembur : ");
    pegawai.setTunjanganKehadiran(in.nextInt());

    System.out.println("Nama : " + pegawai.getName());

    System.out.println("Take Home Pay Pegawai : " + pegawai.hitungTakeHomePay());

    System.out.println("Take Home Pay Manager : " + manager.hitungTakeHomePay());

    System.out.println("Take Home Pay supervisor : " + supervisor.hitungTakeHomePay());

    System.out.println("Take Home Pay direktur : " + direktur.hitungTakeHomePay());






    

    



    



    
  }
}
