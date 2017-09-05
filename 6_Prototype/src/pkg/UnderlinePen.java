package pkg;

import pkg.framework.Product;

public class UnderlinePen implements Product{
    private char ulchar;
    public UnderlinePen(char ulchar){
        this.ulchar = ulchar;
    }
    @Override
    public void use(String s){
        int lenght = s.getBytes().length;
        System.out.println("\"" + s + "\"" );
//        System.out.println(" ");
        for (int i = 0; i < lenght; i++){
            System.out.print(ulchar);
        }
        System.out.println("");
    }

    @Override
    public Product createClone() {
        Product p = null;
        try{
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return p;
    }
}
