package myweb.csuchico.edu;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class InputView extends Activity implements OnClickListener {
 
	String names,attr1,attr2; ///Initializing variables for the textview
	int exerciseNo=0;
	private Button submit,cancel;
	private TextView exerciseName,exerciseAttribute1,exerciseAttribute2;
	private EditText parameter1,parameter2;
	
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);  
	        setContentView(R.layout.input_view);
	        
	        ///Getting Extras from Intent passed in the previous activity
	        Bundle extras = getIntent().getExtras();
	        if (extras != null) {
	            names = extras.getString("exercisename");
	            attr1=extras.getString("exerciseAttr1");
	            attr2=extras.getString("exerciseAttr2");
	            exerciseNo=extras.getInt("exerciseNo");
	        }
	       
	        //Submit Button Object Setup
	        submit=(Button)findViewById(R.id.submit);
	        submit.setOnClickListener(this);
	        
	        //Cancle Button Object Setup
	        cancel=(Button)findViewById(R.id.cancel);
	        cancel.setOnClickListener(this);
	        
	        //Display Parameter 1
	        exerciseName=(TextView)findViewById(R.id.exerciseName);
	        exerciseName.setText(names);
	        
	        //Display Parameter 2
	        exerciseAttribute1=(TextView)findViewById(R.id.exerciseAttribute1);
	        exerciseAttribute1.setText(attr1);
	        
	        //Dispaly Parameter 3
	        exerciseAttribute2=(TextView)findViewById(R.id.exerciseAttribute2);
	        exerciseAttribute2.setText(attr2);
	        
	        parameter1=(EditText)findViewById(R.id.parameter1);
	        parameter2=(EditText)findViewById(R.id.parameter2);
	        }

	    public void onClick(View v) {
	    	

			// find out which button was pushed based on its ID
			if (v.getId()== R.id.submit) {
				
				///get the two values input by the user
				int x=Integer.parseInt(parameter1.getText().toString());
			  //  exerciseName.setText(parameter1.getText());
			    
			    int y =Integer.parseInt(parameter2.getText().toString());
			    
			    calculateEnergy(x,y);
			    finish();
			}
			
			if (v.getId()== R.id.cancel) {
				finish();
			}
			
		}   
	    
	    /*Note Pass parameters in this order to the saveStats function
	     * 	   1)Strength(Arms)
	           2)Strength(Legs)
	           3)Agility
	           4)Defense
	           5)Stamina
	           6)Health */
	    private void calculateEnergy(int param1,int param2)
	    {
	      //Initializing variables to zero
	      int strengtha=0;
	      int strengthl =0;
	      int agility=0;
	      int defense=0;
	      int health=0;
	      
	      switch(exerciseNo)
	      {
	      		case 1:
	      			//int  m= param1+param2;
	      			//exerciseName.setText(Integer.toString(m));
	      			break;

	      		case 2:
	      			strengtha = (param1 * param2) / (bicepCurl_Level * 3 + 20);
	      			defense = strengtha/20;
	      			
	      			bicepCurl_Exp = bicepCurl_Exp + strengtha + defense;
	      			
	      			while(bicepCurl_Exp >= 100){
	    	    		bicepCurl_Exp = bicepCurl_Exp - 100;
	    	    		bicepCurl_Level++;
	    	    	}
	      		    break;   
	      		
	      		case 3:
	      			strengtha = (param1 * param2) / (tricepExtension_Level * 2 + 15);
	      			defense = strengtha/20;
	      			
	      			tricepExtension_Exp = tricepExtension_Exp + strengtha + defense;
	      			
	      			while(tricepExtension_Exp >= 100){
	    	    		tricepExtension_Exp = tricepExtension_Exp - 100;
	    	    		tricepExtension_Level++;
	    	    	}
	      			break;   
	      		
	      		case 4:
	      			strengtha = (param1 * param2) / (shoulderPress_level * 4 + 30);
	      			defense = strengtha/10;
	      			agility = strengtha/20;
	      			
	      			shoulderPress_Exp = shoulderPress_Exp + strengtha + defense + agility;
	      			
	      			while(shoulderPress_Exp >= 100){
	    	    		shoulderPress_Exp = shoulderPress_Exp - 100;
	    	    		shoulderPress_Level++;
	    	    	}
	      			break;
	      			
	      		case 5:
	      			strengtha = (param1 * param2) / (tricepDips_Level * 5 + 100);
	      			defense = strengtha/10;
	      			agility = strengtha/20;
	      			
	      			bicepCurl_Exp = bicepCurl_Exp + strengtha + defense + agility;
	      			
	      			while(bicepCurl_Exp >= 100){
	    	    		bicepCurl_Exp = bicepCurl_Exp - 100;
	    	    		bicepCurl_Level++;
	    	    	}
	      			break;
			   
	      		case 6:
	      			strengtha = (param1 * param2) / (shoulderExtend_Level * 2 + 20);
	      			defense = strengtha/20;
	      			agility = strengtha/10;
	      			
	      			shoulderExtend_Exp = shoulderExtend_Exp + strengtha + defense + agility;
	      			
	      			while(shoulderExtend_Exp >= 100){
	    	    		shoulderExtend_Exp = shoulderExtend_Exp - 100;
	    	    		shoulderExtend_Level++;
	    	    	}
	      			break;
			   
	      		case 7:
	      			strengtha = (sqrt(param1) * param2) / (pushUp_Level * 2 + 15);
	      			defense = strengtha/10;
	      			agility = strengtha/20;
	      			
	      			pushUp_Exp = pushUp_Exp + strengtha + defense + agility;
	      			
	      			while(pushUp_Exp >= 100){
	    	    		pushUp_Exp = pushUp_Exp - 100;
	    	    		pushUp_Level++;
	    	    	}
	      			break;
			    
	      		case 8:
	      			strengtha = (param1 * param2) / (bench_Level * 4 + 40);
	      			defense = strengtha/10;
	      			agility = strengtha/20;
	      			
	      			bench_Exp = bench_Exp + strengtha + defense + agility;
	      			
	      			while(bench_Exp >= 100){
	    	    		bench_Exp = bench_Exp - 100;
	    	    		bench_Level++;
	    	    	}
	      			break;
		   
	      		case 9:
	      			strengtha = (param1 * param2) / (dumbbellFlys_Level * 2 + 10);
	      			defense = strengtha/20;
	      			agility = strengtha/10;
	      			
	      			dumbbellFlys_Exp = dumbbellFlys_Exp + strengtha + defense + agility;
	      			
	      			while(dumbbellFlys_Exp >= 100){
	    	    		dumbbellFlys_Exp = dumbbellFlys_Exp - 100;
	    	    		dumbbellFlys_Level++;
	    	    	}
	      			break;
         
	      		case 10:
	      			defense = (param1 * param2) / (pullUp_Level * 4 + 30);
	      			agility = defense/20;
	      			
	      			pullUp_Exp = pullUp_Exp + defense + agility;
	      			
	      			while(pullUp_Exp >= 100){
	    	    		pullUp_Exp = pullUp_Exp - 100;
	    	    		pullUp_Level++;
	    	    	}
	      			break;
			     
	      		case 11:
	      			defense = (param1 * param2) / (chinUp_Level * 5 + 100);
	      			agility = defense/15;
	      			
	      			chinUp_Exp = chinUp_Exp + defense + agility;
	      			
	      			while(chinUp_Exp >= 100){
	    	    		chinUp_Exp = chinUp_Exp - 100;
	    	    		chinUp_Level++;
	    	    	}
	      			break;
			      
	      		case 12:
	      			defense = (param1 * param2) / (seatedRows_Level * 3 + 50);
	      			agility = defense/10;
	      			
	      			seatedRows_Exp = seatedRows_Exp + defense + agility;
	      			
	      			while(seatedRows_Exp >= 100){
	    	    		seatedRows_Exp = seatedRows_Exp - 100;
	    	    		seatedRows_Level++;
	    	    	}
	      			break;
			    
	      		case 13:
	      			defense = (param1 * param2) / (shrugs_Level * 5 + 100);
	      			agility = defense/10;
	      			
	      			shrugs_Exp = shrugs_Exp + defense + agility;
	      			
	      			while(shrugs_Exp >= 100){
	    	    		shrugs_Exp = shrugs_Exp - 100;
	    	    		shrugs_Level++;
	    	    	}
	      			break;
			   
	      		case 14:
	      			defense = (sqrt(param1) * param2) / (sitUp_Level * 2 + 10);
	      			agility = defense/10;
	      			
	      			sitUp_Exp = sitUp_Exp + defense + agility;
	      			
	      			while(sitUp_Exp >= 100){
	    	    		sitUp_Exp = sitUp_Exp - 100;
	    	    		sitUp_Level++;
	    	    	}
	      			break;
			    
	      		case 15:
	      			defense = (sqrt(param1) * param2) / (crunches_Level * 5 + 10);
	      			agility = defense/10;
	      			
	      			crunches_Exp = crunches_Exp + defense + agility;
	      			
	      			while(crunches_Exp >= 100){
	    	    		crunches_Exp = crunches_Exp - 100;
	    	    		crunches_Level++;
	    	    	}
	      			break;
			     
	      		case 16:
	      			strengthl = (param1 * param2) / (squats_Level * 3 + 50);
	      			defense = strengthl/10;
	      			
	      			squats_Exp = squats_Exp + strengthl + defense;
	      			
	      			while(squats_Exp >= 100){
	    	    		squats_Exp = squats_Exp - 100;
	    	    		squats_Level++;
	    	    	}
	      			break;
			     
	      		case 17:
	      			strengthl = (param1 * param2) / (legExtension_Level * 5 + 30);
	      			defense = strengthl/20;
	      			agility = strengthl/20;
	      			
	      			legExtension_Exp = legExtension_Exp + strengthl + defense + agility;
	      			
	      			while(legExtension_Exp >= 100){
	    	    		legExtension_Exp = legExtension_Exp - 100;
	    	    		legExtension_Level++;
	    	    	}
	      			break;
			    
	      		case 18:
	      			strengthl = (param1 * param2) / (legCurls_Level * 5 + 30);
	      			defense = strengthl/20;
	      			agility = strengthl/20;
	      			
	      			legCurls_Exp = legCurls_Exp + strengthl + defense + agility;
	      			
	      			while(legCurls_Exp >= 100){
	    	    		legCurls_Exp = legCurls_Exp - 100;
	    	    		legCurls_Level++;
	    	    	}
	      			break;
			      
	      		case 19:
	      			agility = param1 * 1000 / param2 / running_Level;
	      			health = agility/10;
	      			strengthl = agility/10;
	      			
	      			running_Exp = running_Exp + agility + health + strengthl;
	      			
	      			while(running_Exp >= 100){
	    	    		running_Exp = running_Exp - 100;
	    	    		running_Level++;
	    	    	}
	      			break;
			     
	      		case 20:
	      			agility = param2 * 10 / swimming_Level;
	      			health = agility/10;
	      			defense = agility/10;
	      			
	      			swimming_Exp = swimming_Exp + agility + health + defense;
	      			
	      			while(swimming_Exp >= 100){
	    	    		swimming_Exp = swimming_Exp - 100;
	    	    		swimming_Level++;
	    	    	}
	      			break;
			    
	      		case 21:
	      			agility = param1 * 500 / param2 / biking_Level;
	      			health = agility/20;
	      			strengthl = agility/20;
	      			
	      			biking_Exp = biking_Exp + agility + health + strengthl;
	      			
	      			while(biking_Exp >= 100){
	    	    		biking_Exp = biking_Exp - 100;
	    	    		biking_Level++;
	    	    	}
	      			break;

	      		default:break;					   
			  
	      	} 	       
	      saveStats(strengtha,strengthl,agility, defense,health);
	    }
	    
	    
	    private int sqrt(int param1) {
			// TODO Auto-generated method stub
			return 0;
		}

		///Saves stats to file for further use
	    private void saveStats(int strengtha,int strengthl,int agility,int defense,int health)
	    {
	    	// Temp variable for user level to see if they leveled up
	    	int tmp_userLevel = 0;
	    
	    	// Let user know what exp they received for exercise
	    	// Pop up alert that looks like so:
	    	
	    	//-------------------------------------
	    	// 				Exp Awarded
	    	//-------------------------------------
	    	// Arm Strength: strengtha
	    	// Leg Strength: strengthl
	    	// Agility:		 agility
	    	// Defense:		 defense
	    	// Health: 		 health
	    	//-------------------------------------
	    	//					OK
	    	//-------------------------------------

	    	
	    	
	    	// Set new exp = left_over_exp + new exp so you can add correct exp
	    	strengtha = strengtha + extra_strengtha;
	    	strengthl = strengthl + extra_strengthl;
	    	agility = agility + extra_agility;
	    	defense = defense + extra_defense;
	    	health = health + extra_health;

	    	// Increase Statistic Level for every 100 points
	    	while(strengtha >= 100){
	    		strengtha = strengtha - 100;
	    		users_ArmStrength++;
	    		users_Exp++;
	    	}
	    	while(strengthl >= 100){
	    		strengthl = strengthl - 100;
	    		users_LegStrength++;
	    		users_Exp++;
	    	}
	    	while(agility >= 100){
	    		agility = agility - 100;
	    		users_Agility++;
	    		users_Exp++;
	    	}
	    	while(defense >= 100){
	    		defense = defense - 100;
	    		users_Defense++;
	    		users_Exp++;
	    	}
	    	while(health >= 100){
	    		health = health - 100;
	    		users_Health++;
	    		users_Exp++;
	    	}
	    	
	    	// Save left over exercise exp in corresponding extra_variable
	    	extra_strengtha = strengtha;
	    	extra_strengthl = strengthl;
	    	extra_agility = agility;
	    	extra_defense = defense;
	    	extra_health = health;
	    	
	    	// Upgrade user level if need be
	    	switch(users_Exp){
	    		case users_Exp<4:
	    			tmp_userLevel = 1;
	    			break;
	    		case 3<users_Exp<9:
	    			tmp_userLevel = 2;
	    			break;
	    		case 8<users_Exp<16:
	    			tmp_userLevel = 3;
	    			break;
	    		case 15<users_Exp<25:
	    			tmp_userLevel = 4;
	    			break;
	    		case 24<users_Exp<36:
	    			tmp_userLevel = 5;
	    			break;
	    		case 35<users_Exp<49:
	    			tmp_userLevel = 6;
	    			break;
	    		case 48<users_Exp<64:
	    			tmp_userLevel = 7;
	    			break;
	    		case 63<users_Exp<81:
	    			tmp_userLevel = 8;
	    			break;
	    		case 80<users_Exp<100:
	    			tmp_userLevel = 9;
	    			break;
	    		case 99<users_Exp<121:
	    			tmp_userLevel = 10;
	    			break;
	    		case 120<users_Exp<144:
	    			tmp_userLevel = 11;
	    			break;
	    		case 143<users_Exp<168:
	    			tmp_userLevel = 12;
	    			break;
	    		case 167<users_Exp<196:
	    			tmp_userLevel = 13;
	    			break;
	    		case 195<users_Exp<225:
	    			tmp_userLevel = 14;
	    			break;
	    		case 224<users_Exp<256:
	    			tmp_userLevel = 15;
	    			break;
	    		case 255<users_Exp<289:
	    			tmp_userLevel = 16;
	    			break;
	    		case 288<users_Exp<324:
	    			tmp_userLevel = 17;
	    			break;
	    		case 323<users_Exp<361:
	    			tmp_userLevel = 18;
	    			break;
	    		case 360<users_Exp<400:
	    			tmp_userLevel = 19;
	    			break;
	    		case users_Exp>399:
	    			tmp_userLevel = 20;
	    			break;
	    		default:
	    			// User is higher level than 20 or an error occurred
	    			break;
	    	}
	    	
	    	// Congratulate user on leveling up if need be
	    	if (tmp_userLevel != userLevel)
	    	{
	    		// Then user must have leveled up
	    		// Set user level equal to new level
	    		userLevel = tmp_userLevel;
	    		
	    		// Let user know what level reached
	    		// Pop up alert that looks like so:
		    	
		    	//-------------------------------------
		    	// 			Congratulations!
		    	//-------------------------------------
		    	// 		You Have Reached Level...
		    	// 
		    	// 
		    	// 				userLevel
		    	// 
		    	//-------------------------------------
		    	//					OK
		    	//-------------------------------------
	    	}
	    }
}
