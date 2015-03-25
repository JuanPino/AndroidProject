package chapter.two.hello_world;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class NewPlanet extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add);
		Button doneButton = (Button)findViewById(R.id.doneAddingButton);
		doneButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
		ImageView marsImage = (ImageView)findViewById(R.id.imageMars);
		marsImage.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				WorldGen mars = new WorldGen("Mars", 642, 3.7, 0);
				mars.setPlanetColonies(1);
				Toast.makeText(NewPlanet.this, "Mars Created", Toast.LENGTH_SHORT ).show();
				
				
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
