/***********************************************************************
 * Module:  Manager.java
 * Author:  fajar
 * Purpose: Defines the Class Manager
 ***********************************************************************/

package tugas;

/** @pdOid 7c2b8805-3eb5-4cd0-87b3-e6536204b4cf */
public class Manager extends Supervisor {
   /** @pdOid 2db19830-ee24-4beb-82a5-63f73f0fea16 */
   private int tunjanganTransporttasi = 2000000;
   /** @pdOid aeb120c7-8622-4fd1-b4c1-13beb03391d6 */
   private int tunjanganJabatanManager = 20000000;
   
   /** @pdOid 2c517f01-badd-40d0-a265-bbe49ae906f3 */
   public int hitungTakeHomePay() {
      int take = super.hitungTakeHomePay() + tunjanganTransporttasi + tunjanganJabatanManager;
      return take;
   }
   
   /** @pdOid 0f743fc6-3e32-4795-ac5e-3786dc03ae0e */
   public Manager() {
      super();
      tunjanganTransporttasi = 0;
      tunjanganJabatanManager = 0;
   }

}