package loteria;

import java.util.Set;
import java.util.TreeSet;

public class Lotofacil {

	public static void main(String[] args) {
		
		Set<Integer> lucky = new TreeSet<Integer>();
		
		for(int i = 0; i < 15; i++) {
			double x = Math.round(Math.random()*24 + 1);
			int y = (int) x;
			
			lucky.add(y);
		}
		while(lucky.size()< 15) {
			double x = Math.round(Math.random()*24 + 1);
			int y = (int) x;
			
			lucky.add(y);
		}
		System.out.println(lucky);
	}

}
