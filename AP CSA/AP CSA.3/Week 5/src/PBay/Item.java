package PBay;

public class Item {
    private String name;
    private double listCost;
    private User owner;
    private boolean forSale;

    public Item(String name, double listCost, User owner, boolean forSale){
        this.name = name;
        this.listCost = Math.round(listCost*100)/100;
        this.owner = owner;
        this.forSale = forSale;
    }

    public String getName() {
        return name;
    }

    public double getListCost() {
        return listCost;
    }

    public User getOwner() {
        return owner;
    }

    public boolean getForSale() {
        return forSale;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public void setListCost(double listCost) {
        this.listCost = Math.round(listCost*100)/100.0;
    }

    public void toggleForSale(){
        forSale=!(forSale);
    }

    public void purchaseItem(User buyer, double amount){
//        System.out.print(buyer.toString());
        if(buyer!=null) {
            buyer.updateBalance((amount * -1));
            owner = buyer;
        }
        this.owner.updateBalance(amount);

        toggleForSale();
    }

    public String toString() {
        return name + " ($" + listCost + " - " + owner.getName() + ")";
                //“Baseball bat ($10.00 – Mike Trout)”
    }

}
