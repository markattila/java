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
            System.out.print(people.get(i) + ",");
        }
        System.out.println("");

    }

    public void addPeople(String people) throws Exception{
        int i = this.people.size();
        if (i < 3) {
            this.people.add(i, people);
        } else {
            throw new Exception("Nem adható hozzá háromnál több meghatalmazott.");
        }

    }

    public boolean removePeople(String p) {
        int i = 0;
        if(people.size() > 1){
            
        
        while (people.get(i) != p) {
            i++;
        }
        people.remove(i);
        return true;
        }else{
            return false;
        }
        
        
    }

    public boolean paymentIn(int b) {
        if (!people.isEmpty() && b > 0) {
            egyenleg = egyenleg + b;
            egyenleg = egyenleg - cost;
            allCost += cost;
            return true;
        }
        return false;
    }

    public boolean paymentOut(int k) {
        if (k > 0 && egyenleg - k > 0) {
            egyenleg = egyenleg - k;
            allCost += cost;
            return true;
        }
        return false;
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
