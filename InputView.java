package myweb.csuchico.edu;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class InputView extends Activity implements OnClickListener {
 
	String names,attr1,attr2;
	private Button submit,cancel;
	private TextView exerciseName,exerciseAttribute1,exerciseAttribute2;
	private EditText parameter1,parameter2;
	
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);  
	        setContentView(R.layout.input_view);
	        
	        Bundle extras = getIntent().getExtras();
	        if (extras != null) {
	            names = extras.getString("exercisename");
	            attr1=extras.getString("exerciseAttr1");
	            attr2=extras.getString("exerciseAttr2");
	        }
	       
	        submit=(Button)findViewById(R.id.submit);
	        submit.setOnClickListener(this);
	        
	        cancel=(Button)findViewById(R.id.cancel);
	        cancel.setOnClickListener(this);
	        
	        exerciseName=(TextView)findViewById(R.id.exerciseName);
	        exerciseName.setText(names);
	        
	        exerciseAttribute1=(TextView)findViewById(R.id.exerciseAttribute1);
	        exerciseAttribute1.setText(attr1);
	        
	        exerciseAttribute2=(TextView)findViewById(R.id.exerciseAttribute2);
	        exerciseAttribute2.setText(attr2);
	        
	        parameter1=(EditText)findViewById(R.id.parameter1);
	        parameter2=(EditText)findViewById(R.id.parameter2);
	    }

	    public void onClick(View v) {
	    	

			// find out which button was pushed based on its ID
			if (v.getId()== R.id.submit) {
				int x=Integer.parseInt(parameter1.getText().toString());
				
			//	exerciseName.setText(parameter1.getText());
				
				
				
				
				
				
			
				
				
				}
			if (v.getId()== R.id.cancel) {
				
				finish();
				
				
				
				
				
				
			}

			// notify the user which button was clicked
			}
	    
	    
	    
}
