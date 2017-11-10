package bankszamla;

import java.util.ArrayList;
import java.util.List;

public class BankszamlaClass {

    private final int cost = 123;
    private int allCost;
    private int egyenleg;
    private final List<String> people = new ArrayList<>();

    public int getBalance() {
        return egyenleg;
    }

    public void getPeople() {
        for (int i = 0; i < people.size(); i++) {
            System.out.print(people.get(i) + ", ");
        }
        System.out.println("");
    }

    public void addPeople(String people) throws Exception {
        int i = this.people.size();
        if (i < 3) {
            this.people.add(i, people);
        } else {
            throw new Exception("Nem adható hozzá háromnál több meghatalmazott.");
        }

    }

    public void removePeople(String p) throws Exception{
        int i = 0;
        if (people.size() > 1) {

            while (!people.get(i).equals(p)) {
                i++;
            }
            people.remove(i);
            
        } else {
            throw new Exception("Nem távolítható el a "+ p + " nevű meghatalmazott. "
                    + "Legalább egy meghatalmazottnak lennie kell.");
        }
    }

    public void paymentIn(int befizetes) throws Exception {
        if (!people.isEmpty() && befizetes > 0) {
            egyenleg = egyenleg + befizetes;
            egyenleg = egyenleg - cost;
            allCost += cost;
        } else {
            throw new Exception("Nem adható meg negatív befizetés vagy nincs meghatalmazott hozzárendelve.");
        }

    }

    public void paymentOut(int k) throws Exception {
        if (k > 0 && egyenleg - k > 0) {
            egyenleg = egyenleg - k;
            allCost += cost;

        } else {
            throw new Exception("Nem adható meg negatív kifizetés vagy nincs meghatalmazott hozzárendelve.");
        }
    }

    public int getCost() {
        return cost;
    }

    public int getOverallCost() {
        return allCost;
    }

    public int trCounter() {
        return getOverallCost() / cost;

    }
}
