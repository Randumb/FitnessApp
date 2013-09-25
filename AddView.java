import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;



public class AddView extends Activity implements OnClickListener {
    
	private int donotselectview=1;
	//Initializing all the views and the buttons
	private TextView bicepcurls,exercisename,tricepextensions,shoulderpress,tricepdips,shoulderextensions,pushups,benchpress,dumbbellflys,pullups,chinups,seatedrows,shrugs,
					 situps,crunches,squats,legextensions,legcurls,running,swimming,biking;
	private Button add_calorie_intake;
	
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.add_view);
        
        //Need Update Weight Button
        //update_weight=(Button)findViewById(R.id.update_weight);
        //update_weight.setOnClickListener(this);
        
        //Adding the calorie button object
        add_calorie_intake=(Button)findViewById(R.id.add_calorie_intake);
        add_calorie_intake.setOnClickListener(this);
        
        //Shouldn't We have a button for Exercise text view objects?
        //Adding the Exercise button object
        //add_exercise=(Button)findViewById(R.id.add_exercise);
        //add_exercise.setOnClickListener(this);
        
        //Adding TextView Objects
        exercisename=(TextView)findViewById(R.id.exercisename);
		exercisename.setOnClickListener(this);
		
        bicepcurls=(TextView)findViewById(R.id.bicepcurls);
		bicepcurls.setOnClickListener(this);
		
        tricepextensions=(TextView)findViewById(R.id.tricepextensions);
		tricepextensions.setOnClickListener(this);
		
		tricepdips=(TextView)findViewById(R.id.tricepdips);
		tricepdips.setOnClickListener(this);
		
        shoulderpress=(TextView)findViewById(R.id.shoulderpress);
		shoulderpress.setOnClickListener(this);
		
		shoulderextensions=(TextView)findViewById(R.id.shoulderextensions);
		shoulderextensions.setOnClickListener(this);
		
        pushups=(TextView)findViewById(R.id.pushups);
		pushups.setOnClickListener(this);
		
        benchpress=(TextView)findViewById(R.id.benchpress);
		benchpress.setOnClickListener(this);
		
        dumbbellflys=(TextView)findViewById(R.id.dumbbellflys);
		dumbbellflys.setOnClickListener(this);
		
        pullups=(TextView)findViewById(R.id.pullups);
		pullups.setOnClickListener(this);
		
        chinups=(TextView)findViewById(R.id.chinups);
		chinups.setOnClickListener(this);
		
        seatedrows=(TextView)findViewById(R.id.seatedrows);
		seatedrows.setOnClickListener(this);
		
        shrugs=(TextView)findViewById(R.id.shrugs);
		shrugs.setOnClickListener(this);
		
        situps=(TextView)findViewById(R.id.situps);
		situps.setOnClickListener(this);
		
        crunches=(TextView)findViewById(R.id.crunches);
		crunches.setOnClickListener(this);
		
        squats=(TextView)findViewById(R.id.squats);
		squats.setOnClickListener(this);
		
        legcurls=(TextView)findViewById(R.id.legcurls);
		legcurls.setOnClickListener(this);
		
        legextensions=(TextView)findViewById(R.id.legextensions);
		legextensions.setOnClickListener(this);
				
        running=(TextView)findViewById(R.id.running);
		running.setOnClickListener(this);
		
        swimming=(TextView)findViewById(R.id.swimming);
		swimming.setOnClickListener(this);
		
        biking=(TextView)findViewById(R.id.biking);
		biking.setOnClickListener(this);
       
    }
//Responds to on Click Events
    
    public void onClick(View v) {
    	
         String exercisename="";
         String exerciseAttr1="";
         String exerciseAttr2="";
         int exerciseNo=0;
    	
    	
    	// find out which button  or textview was pushed based on its ID
    	switch (v.getId())
    	{
    		case R.id.add_calorie_intake:  exercisename="Calorie Intake";
    									   exerciseAttr1="Amount of Calories";
    									   exerciseAttr2="Number of Portions";
    									   exerciseNo=1;
    									   break;
           ///For non Touchable views like Arms Abs etc  									   
    		case R.id.exercisename:		   donotselectview=0;
    									   exercisename="";
    									   exerciseAttr1="";
    									   exerciseAttr2="";
    									   
    									   break;   
    		case R.id.bicepcurls:		   exercisename="Bicep Curls";
			   							   exerciseAttr1="Weight";
			   							   exerciseAttr2="Reps";
			   							   exerciseNo=2;
			   							   break;   
    		case R.id.tricepextensions:	   exercisename="Tricep Extensions";
			   							   exerciseAttr1="Weight";
			   							   exerciseAttr2="Reps";
			   							   exerciseNo=3;
			   							   break;   
    		case R.id.shoulderpress:	   exercisename="Shoulder Press";
			   							   exerciseAttr1="Weight";
			   							   exerciseAttr2="Reps";
			   							   exerciseNo=4;
			   							   break;   
    		case R.id.tricepdips:		   exercisename="Tricep Dips";
			   							   exerciseAttr1="User Weight";
			   							   exerciseAttr2="Reps";
			   							   exerciseNo=5;
			   							   break;   
    		case R.id.shoulderextensions:  exercisename="Shoulder Extensions";
			   							   exerciseAttr1="Weight";
			   							   exerciseAttr2="Reps";
			   							   exerciseNo=6;
			   							   break;   
    		case R.id.pushups:			   exercisename="Push Ups";
			   							   exerciseAttr1="User Weight";
			   							   exerciseAttr2="Reps";
			   							   exerciseNo=7;
			   							   break;   
    		case R.id.benchpress:		   exercisename="Bench Press";
    									   exerciseAttr1="Weight";
    									   exerciseAttr2="Reps";
    									   exerciseNo=8;
    									   break;   
    		case R.id.dumbbellcurls:	   exercisename="Dumb-Bell Curls";
			                               exerciseAttr1="Weight";
			                               exerciseAttr2="Reps";
			                               exerciseNo=9;
			                               break;   
    		case R.id.pullups:			   exercisename="Pull Ups";
			   							   exerciseAttr1="User Weight";
			   							   exerciseAttr2="Reps";
			   							   exerciseNo=10;
			   							   break;   
    		case R.id.chinups:			   exercisename="Chin Ups";
			   							   exerciseAttr1="User Weight";
			   							   exerciseAttr2="Reps";
			   							   exerciseNo=11;
			   							   break;   
    		case R.id.seatedrows:		   exercisename="Seated Rows";
			   							   exerciseAttr1="Weight";
			   							   exerciseAttr2="Reps";
			   							   exerciseNo=12;
			   							   break;   
    		case R.id.shrugs:			   exercisename="Shrugs";
			   							   exerciseAttr1="Weight";
			   							   exerciseAttr2="Reps";
			   							   exerciseNo=13;
			   							   break;   
    		case R.id.situps:			   exercisename="Sit Ups";
			   							   exerciseAttr1="User Weight";
			   							   exerciseAttr2="Reps";
			   							   exerciseNo=14;
			   							   break;   
    		case R.id.crunches:			   exercisename="Crunches";
			   							   exerciseAttr1="User Weight";
			   							   exerciseAttr2="Reps";
			   							   exerciseNo=15;
			   							   break;   
    		case R.id.squats:			   exercisename="Squats";
			   							   exerciseAttr1="Weight";
			   							   exerciseAttr2="Reps";
			   							   exerciseNo=16;
			   							   break;     
    		case R.id.legextensions:	   exercisename="Leg Extensions";
			   							   exerciseAttr1="Weight";
			   							   exerciseAttr2="Reps";
			   							   exerciseNo=17;
			   							   break;   
    		case R.id.legcurls:		   	   exercisename="Leg Curls";
			   							   exerciseAttr1="User Weight";
			   							   exerciseAttr2="Reps";
			   							   exerciseNo=18;
			   							   break;   
    		case R.id.running:			   exercisename="Running";
			   							   exerciseAttr1="Distance";
			   							   exerciseAttr2="Time";
			   							   exerciseNo=19;
			   							   break;   
    		case R.id.swimming:			   exercisename="Swimming";
			   							   exerciseAttr1="Distance";
			   							   exerciseAttr2="Time";
			   							   exerciseNo=20;
			   							   break;   
    		case R.id.biking:			   exercisename="Biking";
    									   exerciseAttr1="Distance";
    									   exerciseAttr2="Time";
    									   exerciseNo=21;
    									   break;   
    		default:					   donotselectview=0;
    									   exercisename="";
    									   exerciseAttr1="";
    									   exerciseAttr2="";
			   							   break;
    			}
    	
    	goToInputView(exercisename,exerciseAttr1,exerciseAttr2,exerciseNo);
    }
    
    
    	private void goToInputView(String exercisename,String exerciseAttr1,String exerciseAttr2,int exerciseNo)
    	{
    	//Start new activity only if views other than donotselcted views are clicked
    	if(donotselectview !=0)
    	{
    	 ///Start Activity and pass in the parameters accordingly(note Inputview.putextra is used to pass data betwwen activities using key value pairs)
    		Intent inputview = new Intent(this, InputView.class);
			inputview.putExtra("exercisename",exercisename);
			inputview.putExtra("exerciseAttr1", exerciseAttr1);
			inputview.putExtra("exerciseAttr2", exerciseAttr2);
			inputview.putExtra("exerciseNo",exerciseNo);
	    	// start the activity based on the Intent
			startActivity(inputview);
    	}
    	
    	donotselectview=1;
    	

		}
    
    
    

}
