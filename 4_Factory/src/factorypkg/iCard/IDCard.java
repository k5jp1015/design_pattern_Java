package factorypkg.iCard;
import factorypkg.framework.*;

public class IDCard extends Product{
    private String owner;
    private int serial;
    IDCard(String owner, int serial){
        System.out.println(owner + "のカードを作ります");
        this.owner = owner;
        this.serial = serial;
    }

    @Override
    public void use() {
        System.out.println(owner + "のカードを使います");
    }

    public String getOwner() {
        return owner;
    }
    public int getSerial() {return serial;}
}
