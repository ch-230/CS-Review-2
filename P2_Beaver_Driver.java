import java.util.ArrayList;
import java.util.List;

public class P2_Beaver_Driver {
	
	public static void check() {
		
		Beaver first = new Beaver();
		if(first.reproduce() != null) {
			System.out.println("A single Beaver cannot reproduce");
			return;
		}
		
		Beaver second = new Beaver();
		if(second.reproduce() == new Beaver()) {
			System.out.println("Two Beavers can reproduce");
			return;
		}
		
		if(Beaver.getPopulation() != 3) {
			System.out.println("Currently, there are 3 Beavers");
			return;
		}
		
		first.eat(10);
		if(first.getLogCount() != 10) {
			System.out.println("First has eaten 10 logs");
			return;
		}
		
		first.die();
		if(first.reproduce() != null) {
			System.out.println("Dead beavers cannot reproduce");
		}
		
		if(Beaver.getPopulation != 2) {
			System.out.println("One beaver has died, so there are only 2 beavers left");
			return;
		}
		
		System.out.println("All tests passed!");
		
		
	}

	public static void main(String[] args) {
		
		check();
		
	}

}
