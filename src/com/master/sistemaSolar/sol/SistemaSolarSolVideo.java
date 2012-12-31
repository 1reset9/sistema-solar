package com.master.sistemaSolar.sol;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.master.R;
import com.master.SistemaSolar;

public class SistemaSolarSolVideo extends Activity {

	private Button bVerVideo;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.sistema_solar_sol_video);

		bVerVideo = (Button) findViewById(R.id.Boton_VerVideo);
		bVerVideo.setOnClickListener(new OnClickListener() {

			public void onClick(View view) {
				lanzarVideo();
			}
		});

	}

	protected void lanzarVideo() {
		Intent i = new Intent(this, SistemaSolarSolVerVideo.class);
		startActivity(i);
	}

	public void onBackPressed() {
		Intent intent = new Intent(this, SistemaSolar.class);
		startActivity(intent);
	}

}
