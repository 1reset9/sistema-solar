package com.master.planetas.luna;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import com.master.MyApp;
import com.master.R;
import com.master.planetas.luna.PlanetasLuna;
import com.master.utilidades.Constantes;

public class PlanetasLunaVerVideo extends Activity {

	private VideoView video;
	private Button bVideo;
	private Button bTexto;
	private Button bFotos;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.planetas_ver_video);

		video = (VideoView) findViewById(R.id.Video);

		video.setVideoURI(Uri.parse("android.resource://com.master/raw/luna"));

		video.setMediaController(new MediaController(this));
		video.requestFocus();
		video.start();

		bVideo = (Button) findViewById(R.id.Boton_Video);
		bVideo.setOnClickListener(new OnClickListener() {

			public void onClick(View view) {
				lanzarPantalla(Constantes.tabVideo);
			}
		});

		bTexto = (Button) findViewById(R.id.Boton_Texto);
		bTexto.setOnClickListener(new OnClickListener() {

			public void onClick(View view) {
				lanzarPantalla(Constantes.tabTexto);
			}
		});

		bFotos = (Button) findViewById(R.id.Boton_Fotos);
		bFotos.setOnClickListener(new OnClickListener() {

			public void onClick(View view) {
				lanzarPantalla(Constantes.tabFotos);
			}
		});

	}

	protected void lanzarPantalla(int pestana) {
		MyApp myApp = ((MyApp) getApplicationContext());
		myApp.setTabSeleccionado(pestana);
		Intent i = new Intent(this, PlanetasLuna.class);
		startActivity(i);
	}

}
