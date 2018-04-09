package team1;

import java.util.ArrayList;
import java.util.Random;

public class Answer {

	private ArrayList<String> pool_;
	
	public Answer(){
		init();
	}
	
	private void init(){
		pool_ = new ArrayList<String>();
		
		// Add answers here
		pool_.add("SMAP");
		pool_.add("a pink elephant");
		pool_.add("Kostek");

	}
	
	public String drawNew(){
		Random rand = new Random(); 
		int value = rand.nextInt(pool_.size()); 
		return pool_.get(value);
	}
}
