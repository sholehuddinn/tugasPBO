import java.util.Scanner;

public class App {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    nilai ni = new nilai();

    System.out.print("Masukkan Nilai Tugas : " );
    ni.setTugas(scanner.nextInt());

    System.out.print("Masukkan Nilai UTS : ");
    ni.setUts(scanner.nextInt());

    System.out.print("Masukkan Nilai UAS : ");
    ni.setUas(scanner.nextInt());

    
    System.out.println(ni.getNilai());
  }
}
