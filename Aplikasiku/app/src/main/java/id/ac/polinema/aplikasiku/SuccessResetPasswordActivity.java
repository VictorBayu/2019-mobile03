package id.ac.polinema.aplikasiku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SuccessResetPasswordActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_success_reset_password);
	}
	public void postChangePassword(View view) {
		Intent intent;
		intent = new Intent(this, SuccessResetPasswordActivity.class);
		startActivity(intent);
		finish();
	}
}
