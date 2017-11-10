
package bankszamla;

public class Bankszamla {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws Exception{
       BankszamlaClass szamla1 = new BankszamlaClass();
       try{
           szamla1.addPeople("Attila");
       
       System.out.println(szamla1.getBalance());
       szamla1.paymentIn(280000);
       szamla1.paymentOut(60000);
       szamla1.addPeople("Eniko");
       szamla1.addPeople("Személy3");
       System.out.println(szamla1.getBalance());
       szamla1.getPeople();
       System.out.println(szamla1.getOverallCost());
       szamla1.removePeople("Attila");
       szamla1.getPeople();
       szamla1.paymentOut(18000);
       szamla1.removePeople("Eniko");
       szamla1.getPeople();
       System.out.println(szamla1.getBalance());
    
       }catch(Exception e){
           System.out.println(e);
       };
    }
}