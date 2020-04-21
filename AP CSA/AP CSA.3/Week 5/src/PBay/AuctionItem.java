package PBay;

public class AuctionItem extends Item{

    private int daysLeft;
    private double currentBid;
    private User highBidder;

    public AuctionItem(String name, double listCost, User owner, int daysLeft) {
        super(name, listCost, owner, true);
       // forSale = true;
        currentBid = listCost;
        this.daysLeft=daysLeft;
        highBidder =  null;
    }

    public double getCurrentBid() {
        return currentBid;
    }

    public int getDaysLeft() {
        return daysLeft;
    }

    public void advanceDay(){
        if(getForSale()==true){
            if(daysLeft<0) {
                purchaseItem(highBidder, currentBid);
                setListCost(currentBid);
                //resetAuction(this.currentBid, this.daysLeft);
            }else{daysLeft--;}
        }
    }

    public String makeBid(User own, double bid){
        if(getForSale()){
            if(bid>currentBid) {
                currentBid = bid;
                highBidder = own;
            }
        }
        return highBidder.getName();
    }

    public void resetAuction(double bid, int days){
        if(highBidder==null){
            currentBid = bid;
            daysLeft = days;
        }
    }

    public String toString(){
        if(getForSale()==true) {
            //“Big League Chew ($4.00, Mike Trout, 10 days left)”
            java.lang.String name="";
            if(getOwner()==null){
                name = "none";
            }else{
                name = getOwner().getName();
            }
            return getName() + "($" + getListCost() + ", " + name + ", " + daysLeft + " days left)";
        }
        return getName() + " ($" + getListCost() + " - " + getOwner().getName() + ")";
    }
}
