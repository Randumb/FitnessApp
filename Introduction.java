package myweb.csuchico.edu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Introduction extends Activity implements OnClickListener {

	private Button start;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_introduction);
		
		start=(Button)findViewById(R.id.start);
		start.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.introduction, menu);
		return true;
	}
	
	public void onClick(View v) {
	

		// find out which button was pushed based on its ID
		if (v.getId()== R.id.start) {
			
			Intent i = new Intent(this, CharacterView.class);
	    	
	    	// start the activity based on the Intent
			startActivity(i);
			finish();
			
			
			
		}

		// notify the user which button was clicked
		
	}

}
