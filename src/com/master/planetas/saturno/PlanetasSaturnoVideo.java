package com.master.planetas.saturno;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.master.Planetas;
import com.master.R;
import com.master.planetas.saturno.PlanetasSaturnoVerVideo;

public class PlanetasSaturnoVideo extends Activity {

	private Button bVerVideo;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.planetas_saturno_video);

		bVerVideo = (Button) findViewById(R.id.Boton_VerVideo);
		bVerVideo.setOnClickListener(new OnClickListener() {

			public void onClick(View view) {
				lanzarVideo();
			}
		});

	}

	protected void lanzarVideo() {
		Intent i = new Intent(this, PlanetasSaturnoVerVideo.class);
		startActivity(i);
	}

	@Override
	public void onBackPressed() {
		Intent intent = new Intent(this, Planetas.class);
		startActivity(intent);
	}

}