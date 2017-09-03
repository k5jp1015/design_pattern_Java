package factorypkg.iCard;

import factorypkg.framework.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IDCardFactory extends Factory {

    private HashMap database = new HashMap();
    private List<String> owners = new ArrayList<String>();
    private int serial = 100;



    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner,this.serial++);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
        database.put(((IDCard) product).getSerial(), ((IDCard)product).getOwner());
    }

    public List getOwners() {
        return owners;
    }
}
