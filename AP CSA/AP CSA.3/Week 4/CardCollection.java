import java.util.ArrayList;
import java.util.List;

public class CardCollection {

    private String owner;
    private List <Card> myCollection;

    public CardCollection(String owner, List <Card> myCollection){
        this.owner = owner;
        myCollection = new ArrayList<Card>();
    }

    public boolean addCard(Card n){
        for(int i=0; i<myCollection.size();i++){
            if(myCollection.get(i).compareTo(n)==1||myCollection.get(i).compareTo(n)==-1){
                myCollection.set(i,n);
                return true;
            }
        }
        return false;
    }

    public void removeCard(int n){
        myCollection.remove(n);
    }


    public int getSize(){return myCollection.size();}

    public List<Card> mergeCollections(CardCollection n) {
        List<Card> duplicate = new ArrayList<Card>();
        for (int i = 0; i < n.getSize(); i++) {
            for(int j=0; j<this.getSize(); j++){
                if(n.myCollection.get(i)!=this.myCollection.get(j)) {
                    this.addCard(n.myCollection.get(i));
                }else{
                    duplicate.add(n.myCollection.get(i));
                }
            }
        }
        return duplicate;
    }

    public String toString() {
        String a = "";
        for(int i = 0;i<owner.length();i++){
            a+="-";
        }
        return owner + "\n" + a + "\n" + myCollection.toString();


    }
    public static void main(String[] args) {

   ArrayList<Card> al = new ArrayList<Card>();

   CardCollection cc = new CardCollection("Robyn", al);

   cc.addCard(new Card("A", "A", 2000, 2001));

   cc.addCard(new Card("B", "A", 1999, 2001));

   cc.addCard(new Card("C", "A", 2003, 2001));

   cc.addCard(new Card("D", "A", 2005, 2001));

   System.out.println(cc.toString());

   // ArrayList<Card> at = new ArrayList<Card>();
// 
//    CardCollection cd = new CardCollection("Chris", at);
// 
//    cd.addCard(new Card("E", "A", 2000, 2001));
// 
//    cd.addCard(new Card("F", "A", 1999, 2001));
// 
//    cd.addCard(new Card("C", "A", 2003, 2001));
// 
//    cd.addCard(new Card("G", "A", 2005, 2001));
// 
//    System.out.println(cd.toString());
// 
//    List<Card> lc = cc.mergeCollection(cd);
// 
//    for (int i = 0; i < lc.size(); i++) {
// 
//        System.out.println(lc.get(i).toString());
// 
//    }
// 
//    System.out.println(cc.toString());

}
}
