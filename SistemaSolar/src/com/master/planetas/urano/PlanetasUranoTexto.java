package com.master.planetas.urano;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;

import com.master.Planetas;
import com.master.R;

public class PlanetasUranoTexto extends Activity {

	private Button bVerUranoTextoEstructura;
	private Button bOcultarUranoTextoEstructura;
	private TextView UranoTextoEstructura1T;
	private TableLayout UranoTextoEstructura2Tabla;
	private ImageView UranoTextoEstructura3I;
	private TextView UranoTextoEstructura4T;

	private Button bVerUranoTextoAtmosfera;
	private Button bOcultarUranoTextoAtmosfera;
	private TextView UranoTextoAtmosfera1T;

	private Button bVerUranoTextoOrbitaRotacion;
	private Button bOcultarUranoTextoOrbitaRotacion;
	private TextView UranoTextoOrbitaRotacion1T;
	private TextView UranoTextoOrbitaRotacion2T;
	private TextView UranoTextoOrbitaRotacion3T;
	private TextView UranoTextoOrbitaRotacion4T;
	private ImageView UranoTextoOrbitaRotacion5I;
	private TextView UranoTextoOrbitaRotacion6T;

	private Button bVerUranoTextoSatelites;
	private Button bOcultarUranoTextoSatelites;
	private TextView UranoTextoSatelites1T;
	private TextView UranoTextoSatelites2T;
	private ImageView UranoTextoSatelites3I;
	private TextView UranoTextoSatelites4C;
	private TextView UranoTextoSatelites5T;
	private ImageView UranoTextoSatelites6I;
	private TextView UranoTextoSatelites7C;
	private TextView UranoTextoSatelites8T;

	private Button bVerUranoTextoAnillos;
	private Button bOcultarUranoTextoAnillos;
	private TextView UranoTextoAnillos1T;
	private ImageView UranoTextoAnillos2I;
	private TextView UranoTextoAnillos3T;

	private Button bVerUranoTextoObservacionEstudio;
	private Button bOcultarUranoTextoObservacionEstudio;
	private TextView UranoTextoObservacionEstudio1T;
	private TextView UranoTextoObservacionEstudio2T;
	private ImageView UranoTextoObservacionEstudio3I;
	private TextView UranoTextoObservacionEstudio4T;
	private TextView UranoTextoObservacionEstudio5T;

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.planetas_urano_texto);

		// Estructura

		bVerUranoTextoEstructura = (Button) findViewById(R.id.VerUranoTextoEstructura);
		UranoTextoEstructura1T = (TextView) findViewById(R.id.UranoTextoEstructura1T);
		UranoTextoEstructura2Tabla = (TableLayout) findViewById(R.id.UranoTextoEstructura2Tabla);
		UranoTextoEstructura3I = (ImageView) findViewById(R.id.UranoTextoEstructura3I);
		UranoTextoEstructura4T = (TextView) findViewById(R.id.UranoTextoEstructura4T);
		bOcultarUranoTextoEstructura = (Button) findViewById(R.id.OcultarUranoTextoEstructura);

		UranoTextoEstructura1T.setVisibility(View.GONE);
		UranoTextoEstructura2Tabla.setVisibility(View.GONE);
		UranoTextoEstructura3I.setVisibility(View.GONE);
		UranoTextoEstructura4T.setVisibility(View.GONE);
		bOcultarUranoTextoEstructura.setVisibility(View.GONE);

		bVerUranoTextoEstructura.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				UranoTextoEstructura1T.setVisibility(View.VISIBLE);
				UranoTextoEstructura2Tabla.setVisibility(View.VISIBLE);
				UranoTextoEstructura3I.setVisibility(View.VISIBLE);
				UranoTextoEstructura4T.setVisibility(View.VISIBLE);
				bOcultarUranoTextoEstructura.setVisibility(View.VISIBLE);
			}
		});

		bOcultarUranoTextoEstructura.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				UranoTextoEstructura1T.setVisibility(View.GONE);
				UranoTextoEstructura2Tabla.setVisibility(View.GONE);
				UranoTextoEstructura3I.setVisibility(View.GONE);
				UranoTextoEstructura4T.setVisibility(View.GONE);
				bOcultarUranoTextoEstructura.setVisibility(View.GONE);
			}
		});

		Animation a = AnimationUtils.loadAnimation(this, R.anim.rotate1);
		a.reset();
		bVerUranoTextoEstructura.clearAnimation();
		bVerUranoTextoEstructura.startAnimation(a);

		// Atmósfera

		bVerUranoTextoAtmosfera = (Button) findViewById(R.id.VerUranoTextoAtmosfera);
		bOcultarUranoTextoAtmosfera = (Button) findViewById(R.id.OcultarUranoTextoAtmosfera);
		UranoTextoAtmosfera1T = (TextView) findViewById(R.id.UranoTextoAtmosfera1T);

		bOcultarUranoTextoAtmosfera.setVisibility(View.GONE);
		UranoTextoAtmosfera1T.setVisibility(View.GONE);

		bVerUranoTextoAtmosfera.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				UranoTextoAtmosfera1T.setVisibility(View.VISIBLE);
				bOcultarUranoTextoAtmosfera.setVisibility(View.VISIBLE);
			}
		});

		bOcultarUranoTextoAtmosfera.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				bOcultarUranoTextoAtmosfera.setVisibility(View.GONE);
				UranoTextoAtmosfera1T.setVisibility(View.GONE);
			}
		});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate2);
		a.reset();
		bVerUranoTextoAtmosfera.clearAnimation();
		bVerUranoTextoAtmosfera.startAnimation(a);

		// Orbita y Rotacion

		bVerUranoTextoOrbitaRotacion = (Button) findViewById(R.id.VerUranoTextoOrbitaRotacion);
		bOcultarUranoTextoOrbitaRotacion = (Button) findViewById(R.id.OcultarUranoTextoOrbitaRotacion);
		UranoTextoOrbitaRotacion1T = (TextView) findViewById(R.id.UranoTextoOrbitaRotacion1T);
		UranoTextoOrbitaRotacion2T = (TextView) findViewById(R.id.UranoTextoOrbitaRotacion2T);
		UranoTextoOrbitaRotacion3T = (TextView) findViewById(R.id.UranoTextoOrbitaRotacion3T);
		UranoTextoOrbitaRotacion4T = (TextView) findViewById(R.id.UranoTextoOrbitaRotacion4T);
		UranoTextoOrbitaRotacion5I = (ImageView) findViewById(R.id.UranoTextoOrbitaRotacion5I);
		UranoTextoOrbitaRotacion6T = (TextView) findViewById(R.id.UranoTextoOrbitaRotacion6T);

		UranoTextoOrbitaRotacion1T.setVisibility(View.GONE);
		UranoTextoOrbitaRotacion2T.setVisibility(View.GONE);
		UranoTextoOrbitaRotacion3T.setVisibility(View.GONE);
		UranoTextoOrbitaRotacion4T.setVisibility(View.GONE);
		UranoTextoOrbitaRotacion5I.setVisibility(View.GONE);
		UranoTextoOrbitaRotacion6T.setVisibility(View.GONE);
		bOcultarUranoTextoOrbitaRotacion.setVisibility(View.GONE);

		bVerUranoTextoOrbitaRotacion.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				UranoTextoOrbitaRotacion1T.setVisibility(View.VISIBLE);
				UranoTextoOrbitaRotacion2T.setVisibility(View.VISIBLE);
				UranoTextoOrbitaRotacion3T.setVisibility(View.VISIBLE);
				UranoTextoOrbitaRotacion4T.setVisibility(View.VISIBLE);
				UranoTextoOrbitaRotacion5I.setVisibility(View.VISIBLE);
				UranoTextoOrbitaRotacion6T.setVisibility(View.VISIBLE);
				bOcultarUranoTextoOrbitaRotacion.setVisibility(View.VISIBLE);
			}
		});

		bOcultarUranoTextoOrbitaRotacion
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						UranoTextoOrbitaRotacion1T.setVisibility(View.GONE);
						UranoTextoOrbitaRotacion2T.setVisibility(View.GONE);
						UranoTextoOrbitaRotacion3T.setVisibility(View.GONE);
						UranoTextoOrbitaRotacion4T.setVisibility(View.GONE);
						UranoTextoOrbitaRotacion5I.setVisibility(View.GONE);
						UranoTextoOrbitaRotacion6T.setVisibility(View.GONE);
						bOcultarUranoTextoOrbitaRotacion
								.setVisibility(View.GONE);
					}
				});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate3);
		a.reset();
		bVerUranoTextoOrbitaRotacion.clearAnimation();
		bVerUranoTextoOrbitaRotacion.startAnimation(a);

		// Satélites Naturales

		bVerUranoTextoSatelites = (Button) findViewById(R.id.VerUranoTextoSatelites);
		UranoTextoSatelites1T = (TextView) findViewById(R.id.UranoTextoSatelites1T);
		UranoTextoSatelites2T = (TextView) findViewById(R.id.UranoTextoSatelites2T);
		UranoTextoSatelites3I = (ImageView) findViewById(R.id.UranoTextoSatelites3I);
		UranoTextoSatelites4C = (TextView) findViewById(R.id.UranoTextoSatelites4C);
		UranoTextoSatelites5T = (TextView) findViewById(R.id.UranoTextoSatelites5T);
		UranoTextoSatelites6I = (ImageView) findViewById(R.id.UranoTextoSatelites6I);
		UranoTextoSatelites7C = (TextView) findViewById(R.id.UranoTextoSatelites7C);
		UranoTextoSatelites8T = (TextView) findViewById(R.id.UranoTextoSatelites8T);
		bOcultarUranoTextoSatelites = (Button) findViewById(R.id.OcultarUranoTextoSatelites);

		UranoTextoSatelites1T.setVisibility(View.GONE);
		UranoTextoSatelites2T.setVisibility(View.GONE);
		UranoTextoSatelites3I.setVisibility(View.GONE);
		UranoTextoSatelites4C.setVisibility(View.GONE);
		UranoTextoSatelites5T.setVisibility(View.GONE);
		UranoTextoSatelites6I.setVisibility(View.GONE);
		UranoTextoSatelites7C.setVisibility(View.GONE);
		UranoTextoSatelites8T.setVisibility(View.GONE);
		bOcultarUranoTextoSatelites.setVisibility(View.GONE);

		bVerUranoTextoSatelites.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				UranoTextoSatelites1T.setVisibility(View.VISIBLE);
				UranoTextoSatelites2T.setVisibility(View.VISIBLE);
				UranoTextoSatelites3I.setVisibility(View.VISIBLE);
				UranoTextoSatelites4C.setVisibility(View.VISIBLE);
				UranoTextoSatelites5T.setVisibility(View.VISIBLE);
				UranoTextoSatelites6I.setVisibility(View.VISIBLE);
				UranoTextoSatelites7C.setVisibility(View.VISIBLE);
				UranoTextoSatelites8T.setVisibility(View.VISIBLE);
				bOcultarUranoTextoSatelites.setVisibility(View.VISIBLE);
			}
		});

		bOcultarUranoTextoSatelites
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						UranoTextoSatelites1T.setVisibility(View.GONE);
						UranoTextoSatelites2T.setVisibility(View.GONE);
						UranoTextoSatelites3I.setVisibility(View.GONE);
						UranoTextoSatelites4C.setVisibility(View.GONE);
						UranoTextoSatelites5T.setVisibility(View.GONE);
						UranoTextoSatelites6I.setVisibility(View.GONE);
						UranoTextoSatelites7C.setVisibility(View.GONE);
						UranoTextoSatelites8T.setVisibility(View.GONE);
						bOcultarUranoTextoSatelites.setVisibility(View.GONE);
					}
				});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate4);
		a.reset();
		bVerUranoTextoSatelites.clearAnimation();
		bVerUranoTextoSatelites.startAnimation(a);

		// Sistema de Anillos

		bVerUranoTextoAnillos = (Button) findViewById(R.id.VerUranoTextoAnillos);
		UranoTextoAnillos1T = (TextView) findViewById(R.id.UranoTextoAnillos1T);
		UranoTextoAnillos2I = (ImageView) findViewById(R.id.UranoTextoAnillos2I);
		UranoTextoAnillos3T = (TextView) findViewById(R.id.UranoTextoAnillos3T);
		bOcultarUranoTextoAnillos = (Button) findViewById(R.id.OcultarUranoTextoAnillos);

		UranoTextoAnillos1T.setVisibility(View.GONE);
		UranoTextoAnillos2I.setVisibility(View.GONE);
		UranoTextoAnillos3T.setVisibility(View.GONE);
		bOcultarUranoTextoAnillos.setVisibility(View.GONE);

		bVerUranoTextoAnillos.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				UranoTextoAnillos1T.setVisibility(View.VISIBLE);
				UranoTextoAnillos2I.setVisibility(View.VISIBLE);
				UranoTextoAnillos3T.setVisibility(View.VISIBLE);
				bOcultarUranoTextoAnillos.setVisibility(View.VISIBLE);
			}
		});

		bOcultarUranoTextoAnillos.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				UranoTextoAnillos1T.setVisibility(View.GONE);
				UranoTextoAnillos2I.setVisibility(View.GONE);
				UranoTextoAnillos3T.setVisibility(View.GONE);
				bOcultarUranoTextoAnillos.setVisibility(View.GONE);
			}
		});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate5);
		a.reset();
		bVerUranoTextoAnillos.clearAnimation();
		bVerUranoTextoAnillos.startAnimation(a);

		// Observación y Estudio

		bVerUranoTextoObservacionEstudio = (Button) findViewById(R.id.VerUranoTextoObservacionEstudio);
		UranoTextoObservacionEstudio1T = (TextView) findViewById(R.id.UranoTextoObservacionEstudio1T);
		UranoTextoObservacionEstudio2T = (TextView) findViewById(R.id.UranoTextoObservacionEstudio2T);
		UranoTextoObservacionEstudio3I = (ImageView) findViewById(R.id.UranoTextoObservacionEstudio3I);
		UranoTextoObservacionEstudio4T = (TextView) findViewById(R.id.UranoTextoObservacionEstudio4T);
		UranoTextoObservacionEstudio5T = (TextView) findViewById(R.id.UranoTextoObservacionEstudio5T);
		bOcultarUranoTextoObservacionEstudio = (Button) findViewById(R.id.OcultarUranoTextoObservacionEstudio);

		UranoTextoObservacionEstudio1T.setVisibility(View.GONE);
		UranoTextoObservacionEstudio2T.setVisibility(View.GONE);
		UranoTextoObservacionEstudio3I.setVisibility(View.GONE);
		UranoTextoObservacionEstudio4T.setVisibility(View.GONE);
		UranoTextoObservacionEstudio5T.setVisibility(View.GONE);
		bOcultarUranoTextoObservacionEstudio.setVisibility(View.GONE);

		bVerUranoTextoObservacionEstudio
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						UranoTextoObservacionEstudio1T
								.setVisibility(View.VISIBLE);
						UranoTextoObservacionEstudio2T
								.setVisibility(View.VISIBLE);
						UranoTextoObservacionEstudio3I
								.setVisibility(View.VISIBLE);
						UranoTextoObservacionEstudio4T
								.setVisibility(View.VISIBLE);
						UranoTextoObservacionEstudio5T
								.setVisibility(View.VISIBLE);
						bOcultarUranoTextoObservacionEstudio
								.setVisibility(View.VISIBLE);
					}
				});

		bOcultarUranoTextoObservacionEstudio
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						UranoTextoObservacionEstudio1T.setVisibility(View.GONE);
						UranoTextoObservacionEstudio2T.setVisibility(View.GONE);
						UranoTextoObservacionEstudio3I.setVisibility(View.GONE);
						UranoTextoObservacionEstudio4T.setVisibility(View.GONE);
						UranoTextoObservacionEstudio5T.setVisibility(View.GONE);
						bOcultarUranoTextoObservacionEstudio
								.setVisibility(View.GONE);
					}
				});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate6);
		a.reset();
		bVerUranoTextoObservacionEstudio.clearAnimation();
		bVerUranoTextoObservacionEstudio.startAnimation(a);

	}

	@Override
	public void onBackPressed() {
		Intent intent = new Intent(this, Planetas.class);
		startActivity(intent);
	}

}
