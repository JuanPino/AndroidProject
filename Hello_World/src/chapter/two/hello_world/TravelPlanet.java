package chapter.two.hello_world;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;
import android.widget.VideoView;

public class TravelPlanet extends  Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_travel);
		VideoView travelVideo = (VideoView)findViewById(R.id.travelVideoView);
		travelVideo.setOnTouchListener(new View.OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				Toast.makeText(TravelPlanet.this, "Going Home", Toast.LENGTH_SHORT).show();
				finish();
				return true;
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
