import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class AccountServices {

    private Map<Integer, Accounts> hmap;
    private int counter;

    public AccountServices(){
        counter = 1;
        hmap = new HashMap<Integer, Accounts>();
    }

    public void addAccount(String firstName, String lastName){
        Accounts newAccount = new Accounts(firstName, lastName, counter);
        hmap.put(counter, newAccount);
        ++counter;
    }

    public String viewAccount(int accountNumber){
        Accounts currentAccount = hmap.get(1);
        return currentAccount.getFirstName() + " " + currentAccount.getLastName();
    }

    public JSONObject convertToJSON(){
        return new JSONObject(hmap);
    }

    public int countInstances(String name){
        int instances = 0;
        for (int i = 1; i < hmap.size(); ++i){
            String firstName = hmap.get(i).getFirstName();
            if (firstName.equals(name)){
                ++instances;
            }
        }
        return instances;
    }
}