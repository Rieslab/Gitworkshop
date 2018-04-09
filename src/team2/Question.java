package team2;

import java.util.ArrayList;
import java.util.Random;

public class Question {


	private ArrayList<String> pool_;
	
	public Question(){
		init();
	}
	
	private void init(){
		pool_ = new ArrayList<String>();
		
		// Add Questions here
		pool_.add("What is the most boring thing in the lab?");
		pool_.add("What will be then end of M2?");
		pool_.add("What never fails to disappoint people?");

	}
	
	public String drawNew(){
		Random rand = new Random(); 
		int value = rand.nextInt(pool_.size()); 
		return pool_.get(value);
	}
}
