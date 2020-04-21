
public class bigState {
     public static void main(String[] args) {
          System.out.println("New York is in the " + getRegion("NY") + " region");
          System.out.println("New Mexico is in the " + getRegion("NM") + " region");
          System.out.println("Louisiana is in the " + getRegion("LA") + " region");
          System.out.println("Kansas is in the " + getRegion("KS") + " region");
          System.out.println("Oregon is in the " + getRegion("OR") + " region");
          System.out.println("Indiana is in the " + getRegion("IN") + " region");
          System.out.println("Colorado is in the " + getRegion("CO") + " region");
          System.out.println("Virginia is in the " + getRegion("VA") + " region");
          System.out.println("The Shire is in the " + getRegion("SH") + " region");
     }
     public static String getRegion(String state) {
          String s = "";
          switch(state) {
               /*** TODO: Write a complete case for each region as described below 
                           New England - ME, VT, NH, MA, CT, RI 
                           Atlantic - NY, NJ, DE, MD, VA, NC, SC 
                           Southeast - GA, FL, MS, AL, LA, TN
                           Midwest - PA, OH, MI, IN, IL, WI, MN, KY, WV, IA, MO
                           Great Plains - ND, SD, KS, NE
                           Mountain - MT, CO, ID, UT, WY
                           Southwest - AR, TX, OK, NM, AZ
                           Pacific - CA, NV, OR, WA, HI, AK
                             ***/
 
               case "RI": 
               case "ME": 
               case "VT":
               case"NH":
               case "MA":
               case "CT":
                    s = "New England";
                    break;
               case  "NY":case "NJ": case "DE": case "MD": case "VA": case "NC": case "SC":
                    s = "Atlantic";
                    break;
               case "GA": case "FL": case "MS": case "AL": case "LA": case "TN":
                  
                    s = "Southeast";
                    break;
               case "PA": case "OH":case "MI": case "IN": case "IL": case "WI": case "MN": case "KY": case "WV": case "IA": case "MO":
                    s = "Midwest";
                    break;
               case "ND": case "SD": case "KS": case "NE":
                    s = "Great Plains";
                    break;
               case "MT":case "CO": case "ID": case "UT": case "WY":
                    s = "Mountain";
                    break;
               case "AR": case "TX": case "OK": case "NM": case "AZ":
                    s = "Southwest";
                    break;
               case "CA": case "NV": case "WA": case "OR": case "HI": case "AK":
                    s = "Pacific";
                    break;
               default:
                    s = "Unknown";
                    break;
          }
          return s;
     }
}
