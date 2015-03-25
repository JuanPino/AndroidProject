package chapter.two.hello_world;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ConfigPlanet extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_config);
		EditText colonyText = (EditText)findViewById(R.id.editTextColonies);
		colonyText.setText("1", EditText.BufferType.EDITABLE);
		EditText colonistsText = (EditText)findViewById(R.id.editTextColonists);
		colonistsText.setText("100", EditText.BufferType.EDITABLE);
		EditText basesText = (EditText)findViewById(R.id.editTextBases);
		basesText.setText("1", EditText.BufferType.EDITABLE);
		EditText militaryText = (EditText)findViewById(R.id.editTextMilitary);
		militaryText.setText("10", EditText.BufferType.EDITABLE);
		EditText forceFieldOnText = (EditText)findViewById(R.id.editForceFieldOn);
		forceFieldOnText.setText("", EditText.BufferType.EDITABLE);
		EditText forceFieldOffText = (EditText)findViewById(R.id.editForceFieldOff);
		forceFieldOffText.setText("Forcefield is Off", EditText.BufferType.EDITABLE);
		
		
		Button colonyButton = (Button)findViewById(R.id.coloniesButton); 
		colonyButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				
			}
			
		});
		Button colonistsButton = (Button)findViewById(R.id.colonistsButton);
		colonistsButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		}); 
		Button baseButton = (Button)findViewById(R.id.basesButton);
		baseButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				
			}
		});
		Button militaryButton = (Button)findViewById(R.id.militaryButton);
		militaryButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				
			}
		});
		Button forceFieldOnButton = (Button)findViewById(R.id.ffonButton);
		forceFieldOnButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				
			}
		});
		Button forceFieldOffButton = (Button)findViewById(R.id.ffofButton);
		forceFieldOffButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				
			}
		});
		Button doneButton = (Button)findViewById(R.id.doneButton);
		doneButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				
			}
		});
	}
	public boolean onKeyDown(int KeyCode, KeyEvent event) {
		if (KeyCode == KeyEvent.KEYCODE_X) {
			finish();
			return true;
		}
		return false;
	}
}
