/***********************************************************************
 * Module:  Supervisor.java
 * Author:  fajar
 * Purpose: Defines the Class Supervisor
 ***********************************************************************/

package tugas;
/** @pdOid 5e7a53c7-953f-40b4-b831-e9311d89af0a */
public class Supervisor extends Pegawai {
   /** @pdOid 22371da0-58df-448e-adc4-8487bb58c224 */
   private int tunjanganKomunikasi = 3000000;
   /** @pdOid b879b9fa-650e-4964-8355-341a7cc7c986 */
   private int tunjanganJabatanSupervisor = 3000000;
   
   /** @pdOid a699ae94-b376-4c76-833b-ebbf8e92f382 */
   public int hitungTakeHomePay() {
      int take = super.hitungTakeHomePay() + tunjanganJabatanSupervisor + tunjanganKomunikasi;
      return take;
   }
   
   /** @pdOid f0d88e1b-0f67-4330-8f5d-0c5926e89402 */
   public Supervisor() {
      // TODO: implement
   }

}