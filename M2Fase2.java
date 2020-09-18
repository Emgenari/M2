import java.util.*;
public class M2Fase2 {

	public static void main(String[] args) {
				
		ArrayList<Character> nom = new ArrayList<Character>();
		
		nom.add('E');
		nom.add('D');
		nom.add('U');
		nom.add('A');
		nom.add('R');
		nom.add('D');
		nom.add('O');
		
		for (int i=0;i<nom.size();i++) {
			
			if(nom.get(i)=='A'||nom.get(i)=='E'||nom.get(i)=='I'||nom.get(i)=='O'||nom.get(i)=='U') {
				System.out.println(nom.get(i) + " es una vocal.");
			}
		
			else {
				System.out.println(nom.get(i) + " es una consonante.");
			}				
		}	
		}
}
