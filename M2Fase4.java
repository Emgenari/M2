import java.util.*;
public class M2Fase4 {
	
	public static void main(String[] args) {
		
		ArrayList<Character> nom = new ArrayList<Character>();
		
		nom.add('E');
		nom.add('D');
		nom.add('U');
		nom.add('A');
		nom.add('R');
		nom.add('D');
		nom.add('O');
		
		ArrayList<Character> cognom = new ArrayList<Character>();
		
		cognom.add('G');
		cognom.add('E');
		cognom.add('N');
		cognom.add('A');
		cognom.add('R');
		cognom.add('I');
		
		ArrayList<Character> nomcognom = new ArrayList<Character>();

		nomcognom.addAll(nom);
		nomcognom.add(' ');
		nomcognom.addAll(cognom);
		
				System.out.print(nomcognom);
		
			
		
	}

	
}
