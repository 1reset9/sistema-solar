package com.master.planetas.marte;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.master.Planetas;
import com.master.R;
import com.master.planetas.marte.PlanetasMarteVerVideo;

public class PlanetasMarteVideo extends Activity {

	private Button bVerVideo;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.planetas_marte_video);

		bVerVideo = (Button) findViewById(R.id.Boton_VerVideo);
		bVerVideo.setOnClickListener(new OnClickListener() {

			public void onClick(View view) {
				lanzarVideo();
			}
		});

	}

	protected void lanzarVideo() {
		Intent i = new Intent(this, PlanetasMarteVerVideo.class);
		startActivity(i);
	}

	@Override
	public void onBackPressed() {
		Intent intent = new Intent(this, Planetas.class);
		startActivity(intent);
	}

}