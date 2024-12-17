/***********************************************************************
 * Module:  Direktur.java
 * Author:  fajar
 * Purpose: Defines the Class Direktur
 ***********************************************************************/
package tugas;

/** @pdOid 4e364ba9-d295-49a8-94c8-9329ae996289 */
public class Direktur extends Manager {
   /** @pdOid ffc1c830-482e-4422-a544-703d0c05978c */
   private int tunjanganPerumahan = 1000000;
   /** @pdOid 1d3486cf-1994-4c6e-9a7a-cf02e28afc1d */
   private int tunjanganJabatanDeirektur = 10000000;
   
   /** @pdOid f7006091-2036-4f15-9d5d-31d478f8befe */
   public int hitungTakeHomePay() {
      int take = super.hitungTakeHomePay() + tunjanganPerumahan + tunjanganJabatanDeirektur;
      return take;
   }
   
   /** @pdOid 1f729a5d-c491-44d4-b77a-9354bb89aa17 */
   public Direktur() {
      super();
   }

}