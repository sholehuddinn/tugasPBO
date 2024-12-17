package tugas;
/***********************************************************************
 * Module:  Pegawai.java
 * Author:  fajar
 * Purpose: Defines the Class Pegawai
 ***********************************************************************/

/** @pdOid efa44bc2-abf4-4e5e-904d-99f5ffd7cc07 */
public class Pegawai {
   /** @pdOid 059e81bb-74aa-4119-97ba-7954a43b58f7 */
   private String nomorPokokPegawai;
   /** @pdOid 16ea494b-44dd-4633-a5d1-3070cc26b1ed */
   private String name;
   /** @pdOid d0955913-611f-42e9-99e6-c45c6644f459 */
   private int gajiPokok;
   /** @pdOid 727c0103-e97d-4613-b9d2-680d855e68d3 */
   private int tunjanganKehadiran;
   /** @pdOid e3e63a0d-10da-4efe-ab64-35d334ce36a4 */
   private int tunjanganLembur;
   /** @pdOid 8051ede7-cca2-47f1-b732-230620d6a839 */
   private int jumlahKehaddiran;
   /** @pdOid 87620457-f286-4dd0-b689-b6125caf7ca6 */
   private int jumlahLembur;
   
   /** @pdOid a92b93f0-8fd1-4b04-824c-d7d5e2daef1c */
   public int getJumlahLembur() {
      return jumlahLembur;
   }
   
   /** @param newJumlahLembur
    * @pdOid f3849052-c6f1-459b-a41d-b0e636f8ad62 */
   public void setJumlahLembur(int newJumlahLembur) {
      jumlahLembur = newJumlahLembur;
   }
   
   /** @pdOid 635d52b2-f041-4334-9520-918f5fd493a8 */
   public String getNomorPokokPegawai() {
      return nomorPokokPegawai;
   }
   
   /** @param newNomorPokokPegawai
    * @pdOid 9113e53b-76d8-4397-89d9-af25277b3261 */
   public void setNomorPokokPegawai(String newNomorPokokPegawai) {
      nomorPokokPegawai = newNomorPokokPegawai;
   }
   
   /** @pdOid bc144ead-a520-47af-bd2f-0532bf1a7a70 */
   public String getName() {
      return name;
   }
   
   /** @param newName
    * @pdOid db2344e3-7559-4e4b-a884-7ab6a8fe7a7a */
   public void setName(String newName) {
      name = newName;
   }
   
   /** @pdOid 4c797955-618b-4bb1-a211-36c45f423a13 */
   public int getGajiPokok() {
      return gajiPokok;
   }
   
   /** @param newGajiPokok
    * @pdOid e69531d4-a2d5-4045-82f4-415e374fadf1 */
   public void setGajiPokok(int newGajiPokok) {
      gajiPokok = newGajiPokok;
   }
   
   /** @pdOid 19adccd3-c3fc-42d9-8fff-8c11fa9f572d */
   public int getTunjanganKehadiran() {
      return tunjanganKehadiran;
   }
   
   /** @param newTunjanganKehadiran
    * @pdOid cd89a3de-7bb3-4c45-9fb0-6e37850307d7 */
   public void setTunjanganKehadiran(int newTunjanganKehadiran) {
      tunjanganKehadiran = newTunjanganKehadiran;
   }
   
   /** @pdOid 275c5481-4e57-4aa8-9f8b-007b5450b978 */
   public int getTunjanganLembur() {
      return tunjanganLembur;
   }
   
   /** @param newTunjanganLembur
    * @pdOid f955f045-a499-4dfc-91d3-0e8a395a817c */
   public void setTunjanganLembur(int newTunjanganLembur) {
      tunjanganLembur = newTunjanganLembur;
   }
   
   /** @pdOid 0496b5f0-f6a4-416a-90c5-0c438e32af34 */
   public int getJumlahKehaddiran() {
      return jumlahKehaddiran;
   }
   
   /** @param newJumlahKehaddiran
    * @pdOid 3d507b94-1f39-4c9b-9274-a8fb36e53739 */
   public void setJumlahKehaddiran(int newJumlahKehaddiran) {
      jumlahKehaddiran = newJumlahKehaddiran;
   }
   
   /** @pdOid 1dbd89df-91ac-445e-8fe5-d2069a1e9787 */
   public int hitungTakeHomePay() {
      int takeHomePay = gajiPokok + hitungTunjanganKehaddiran() + hitungTunjanganLembur();
      return takeHomePay;
   }

   public int hitungTunjanganKehaddiran() {
      return jumlahKehaddiran * tunjanganKehadiran;
   }

   public int hitungTunjanganLembur() {
      return jumlahLembur * tunjanganLembur;
   }

}