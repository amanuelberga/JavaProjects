
import java.util.*; 
public class myHairLine {
	
	
	public static void main(String [] args) {
		double sr = 0; 
		ArrayList <Double> ps = new ArrayList<Double>(); 
		for(double i=1; i<=900; i++) {
			sr = Math.sqrt(i); 
			if((sr - Math.floor(sr)) == 0) {
				ps.add(i); 
				System.out.println(i);
			}
		}
		double check = 0; 
	for(int i = 1; i<ps.size(); i++) {
		check = ps.get(i); 
		for(int r=1; r<ps.size(); r++) {
			
			for(int s=0; s<ps.size(); s++) {
				if(check+ps.get(r) == ps.get(s)) {
					System.out.println(check +" + " + ps.get(r) + "= " + ps.get(s));
				}
			}
		}
	}
	}

}
