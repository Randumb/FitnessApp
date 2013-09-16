package myweb.csuchico.edu;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;



public class CharacterView extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
	private TextView curls;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.character_view);
        curls=(TextView)findViewById(R.id.curls);
		curls.setOnClickListener(this);
       
    }

    public void onClick(View v) {
    	

		// find out which button was pushed based on its ID
		if (v.getId()== R.id.curls) {
		
			Intent inputview = new Intent(this, InputView.class);
			inputview.putExtra("exercisename","Curls");
			inputview.putExtra("exerciseAttr1", "Weight");
			inputview.putExtra("exerciseAttr2", "Reps");
	    	// start the activity based on the Intent
			startActivity(inputview);
			
			}

		// notify the user which button was clicked
		}
    
    
    

}
