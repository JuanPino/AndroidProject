package chapter.two.hello_world;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

public class AttackPlanet extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_attack);
		ImageButton bombButton = (ImageButton)findViewById(R.id.bombButton);
		bombButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(AttackPlanet.this, "Bombs Away!" , Toast.LENGTH_SHORT).show();
				
			}} );
		ImageButton invadeButton = (ImageButton)findViewById(R.id.invadeButton);
		invadeButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(AttackPlanet.this, "Troop Sent" , Toast.LENGTH_SHORT).show();
				
			}} );
		ImageButton infectButton = (ImageButton)findViewById(R.id.infectButton);
		infectButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(AttackPlanet.this, "Virus Spread" , Toast.LENGTH_SHORT).show();
				
			}} );
		ImageButton laserButton = (ImageButton)findViewById(R.id.laserButton);
		laserButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(AttackPlanet.this, "Laser Fired" , Toast.LENGTH_SHORT).show();
				
			}} );
		ImageButton exitButton = (ImageButton)findViewById(R.id.exitButton);
		exitButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				
			}} );
	}
	public boolean onKeyDown(int KeyCode, KeyEvent event) {
		if (KeyCode == KeyEvent.KEYCODE_X) {
			finish();
			return true;
		}
		return false;
	}

}
