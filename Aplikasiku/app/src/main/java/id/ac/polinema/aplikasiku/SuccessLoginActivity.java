package id.ac.polinema.aplikasiku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SuccessLoginActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_success_login);
	}
	public void postLogin(View view) {
		Intent intent = new Intent(this, SuccessLoginActivity.class);
		startActivity(intent);
		finish();
	}
}
