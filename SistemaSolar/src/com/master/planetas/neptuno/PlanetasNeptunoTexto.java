package com.master.planetas.neptuno;

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

public class PlanetasNeptunoTexto extends Activity {

	private Button bVerNeptunoTextoEstructura;
	private Button bOcultarNeptunoTextoEstructura;
	private TextView NeptunoTextoEstructura1T;
	private TableLayout NeptunoTextoEstructura2Tabla;
	private ImageView NeptunoTextoEstructura3I;
	private TextView NeptunoTextoEstructura33C;
	private TextView NeptunoTextoEstructura4T;

	private Button bVerNeptunoTextoOrbitaRotacion;
	private Button bOcultarNeptunoTextoOrbitaRotacion;
	private TextView NeptunoTextoOrbitaRotacion1T;
	private TextView NeptunoTextoOrbitaRotacion2T;
	private TextView NeptunoTextoOrbitaRotacion3T;

	private Button bVerNeptunoTextoSatelites;
	private Button bOcultarNeptunoTextoSatelites;
	private TextView NeptunoTextoSatelites1T;
	private ImageView NeptunoTextoSatelites3I;
	private TextView NeptunoTextoSatelites4C;
	private TextView NeptunoTextoSatelites5T;

	private Button bVerNeptunoTextoAnillos;
	private Button bOcultarNeptunoTextoAnillos;
	private TextView NeptunoTextoAnillos1T;
	private TableLayout NeptunoTextoAnillos2Tabla;
	private ImageView NeptunoTextoAnillos3I;
	private TextView NeptunoTextoAnillos4T;
	private TextView NeptunoTextoAnillos5T;

	private Button bVerNeptunoTextoObservacionEstudio;
	private Button bOcultarNeptunoTextoObservacionEstudio;
	private TextView NeptunoTextoObservacionEstudio1T;
	private TextView NeptunoTextoObservacionEstudio2T;
	private TextView NeptunoTextoObservacionEstudio3T;
	private ImageView NeptunoTextoObservacionEstudio4I;
	private TextView NeptunoTextoObservacionEstudio5C;

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.planetas_neptuno_texto);

		// Estructura
		bVerNeptunoTextoEstructura = (Button) findViewById(R.id.VerNeptunoTextoEstructura);
		NeptunoTextoEstructura1T = (TextView) findViewById(R.id.NeptunoTextoEstructura1T);
		NeptunoTextoEstructura2Tabla = (TableLayout) findViewById(R.id.NeptunoTextoEstructura2Tabla);
		NeptunoTextoEstructura3I = (ImageView) findViewById(R.id.NeptunoTextoEstructura3I);
		NeptunoTextoEstructura33C = (TextView) findViewById(R.id.NeptunoTextoEstructura33C);
		NeptunoTextoEstructura4T = (TextView) findViewById(R.id.NeptunoTextoEstructura4T);
		bOcultarNeptunoTextoEstructura = (Button) findViewById(R.id.OcultarNeptunoTextoEstructura);

		NeptunoTextoEstructura1T.setVisibility(View.GONE);
		NeptunoTextoEstructura2Tabla.setVisibility(View.GONE);
		NeptunoTextoEstructura3I.setVisibility(View.GONE);
		NeptunoTextoEstructura33C.setVisibility(View.GONE);
		NeptunoTextoEstructura4T.setVisibility(View.GONE);
		bOcultarNeptunoTextoEstructura.setVisibility(View.GONE);

		bVerNeptunoTextoEstructura.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				NeptunoTextoEstructura1T.setVisibility(View.VISIBLE);
				NeptunoTextoEstructura2Tabla.setVisibility(View.VISIBLE);
				NeptunoTextoEstructura3I.setVisibility(View.VISIBLE);
				NeptunoTextoEstructura33C.setVisibility(View.VISIBLE);
				NeptunoTextoEstructura4T.setVisibility(View.VISIBLE);
				bOcultarNeptunoTextoEstructura.setVisibility(View.VISIBLE);
			}
		});

		bOcultarNeptunoTextoEstructura
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						NeptunoTextoEstructura1T.setVisibility(View.GONE);
						NeptunoTextoEstructura2Tabla.setVisibility(View.GONE);
						NeptunoTextoEstructura3I.setVisibility(View.GONE);
						NeptunoTextoEstructura33C.setVisibility(View.GONE);
						NeptunoTextoEstructura4T.setVisibility(View.GONE);
						bOcultarNeptunoTextoEstructura.setVisibility(View.GONE);
					}
				});

		Animation a = AnimationUtils.loadAnimation(this, R.anim.rotate1);
		a.reset();
		bVerNeptunoTextoEstructura.clearAnimation();
		bVerNeptunoTextoEstructura.startAnimation(a);

		// Orbita y Rotacion
		bVerNeptunoTextoOrbitaRotacion = (Button) findViewById(R.id.VerNeptunoTextoOrbitaRotacion);
		bOcultarNeptunoTextoOrbitaRotacion = (Button) findViewById(R.id.OcultarNeptunoTextoOrbitaRotacion);
		NeptunoTextoOrbitaRotacion1T = (TextView) findViewById(R.id.NeptunoTextoOrbitaRotacion1T);
		NeptunoTextoOrbitaRotacion2T = (TextView) findViewById(R.id.NeptunoTextoOrbitaRotacion2T);
		NeptunoTextoOrbitaRotacion3T = (TextView) findViewById(R.id.NeptunoTextoOrbitaRotacion3T);

		NeptunoTextoOrbitaRotacion1T.setVisibility(View.GONE);
		NeptunoTextoOrbitaRotacion2T.setVisibility(View.GONE);
		NeptunoTextoOrbitaRotacion3T.setVisibility(View.GONE);
		bOcultarNeptunoTextoOrbitaRotacion.setVisibility(View.GONE);

		bVerNeptunoTextoOrbitaRotacion
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						NeptunoTextoOrbitaRotacion1T
								.setVisibility(View.VISIBLE);
						NeptunoTextoOrbitaRotacion2T
								.setVisibility(View.VISIBLE);
						NeptunoTextoOrbitaRotacion3T
								.setVisibility(View.VISIBLE);
						bOcultarNeptunoTextoOrbitaRotacion
								.setVisibility(View.VISIBLE);
					}
				});

		bOcultarNeptunoTextoOrbitaRotacion
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						NeptunoTextoOrbitaRotacion1T.setVisibility(View.GONE);
						NeptunoTextoOrbitaRotacion2T.setVisibility(View.GONE);
						NeptunoTextoOrbitaRotacion3T.setVisibility(View.GONE);
						bOcultarNeptunoTextoOrbitaRotacion
								.setVisibility(View.GONE);
					}
				});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate2);
		a.reset();
		bVerNeptunoTextoOrbitaRotacion.clearAnimation();
		bVerNeptunoTextoOrbitaRotacion.startAnimation(a);

		// Satélites Naturales
		bVerNeptunoTextoSatelites = (Button) findViewById(R.id.VerNeptunoTextoSatelites);
		NeptunoTextoSatelites1T = (TextView) findViewById(R.id.NeptunoTextoSatelites1T);
		NeptunoTextoSatelites3I = (ImageView) findViewById(R.id.NeptunoTextoSatelites3I);
		NeptunoTextoSatelites4C = (TextView) findViewById(R.id.NeptunoTextoSatelites4C);
		NeptunoTextoSatelites5T = (TextView) findViewById(R.id.NeptunoTextoSatelites5T);
		bOcultarNeptunoTextoSatelites = (Button) findViewById(R.id.OcultarNeptunoTextoSatelites);

		NeptunoTextoSatelites1T.setVisibility(View.GONE);
		NeptunoTextoSatelites3I.setVisibility(View.GONE);
		NeptunoTextoSatelites4C.setVisibility(View.GONE);
		NeptunoTextoSatelites5T.setVisibility(View.GONE);
		bOcultarNeptunoTextoSatelites.setVisibility(View.GONE);

		bVerNeptunoTextoSatelites.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				NeptunoTextoSatelites1T.setVisibility(View.VISIBLE);
				NeptunoTextoSatelites3I.setVisibility(View.VISIBLE);
				NeptunoTextoSatelites4C.setVisibility(View.VISIBLE);
				NeptunoTextoSatelites5T.setVisibility(View.VISIBLE);
				bOcultarNeptunoTextoSatelites.setVisibility(View.VISIBLE);
			}
		});

		bOcultarNeptunoTextoSatelites.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				NeptunoTextoSatelites1T.setVisibility(View.GONE);
				NeptunoTextoSatelites3I.setVisibility(View.GONE);
				NeptunoTextoSatelites4C.setVisibility(View.GONE);
				NeptunoTextoSatelites5T.setVisibility(View.GONE);
				bOcultarNeptunoTextoSatelites.setVisibility(View.GONE);
			}
		});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate3);
		a.reset();
		bVerNeptunoTextoSatelites.clearAnimation();
		bVerNeptunoTextoSatelites.startAnimation(a);

		// Sistema de Anillos
		bVerNeptunoTextoAnillos = (Button) findViewById(R.id.VerNeptunoTextoAnillos);
		NeptunoTextoAnillos1T = (TextView) findViewById(R.id.NeptunoTextoAnillos1T);
		NeptunoTextoAnillos2Tabla = (TableLayout) findViewById(R.id.NeptunoTextoAnillos2Tabla);
		NeptunoTextoAnillos3I = (ImageView) findViewById(R.id.NeptunoTextoAnillos3I);
		NeptunoTextoAnillos4T = (TextView) findViewById(R.id.NeptunoTextoAnillos4T);
		NeptunoTextoAnillos5T = (TextView) findViewById(R.id.NeptunoTextoAnillos5T);
		bOcultarNeptunoTextoAnillos = (Button) findViewById(R.id.OcultarNeptunoTextoAnillos);

		NeptunoTextoAnillos1T.setVisibility(View.GONE);
		NeptunoTextoAnillos2Tabla.setVisibility(View.GONE);
		NeptunoTextoAnillos3I.setVisibility(View.GONE);
		NeptunoTextoAnillos4T.setVisibility(View.GONE);
		NeptunoTextoAnillos5T.setVisibility(View.GONE);
		bOcultarNeptunoTextoAnillos.setVisibility(View.GONE);

		bVerNeptunoTextoAnillos.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				NeptunoTextoAnillos1T.setVisibility(View.VISIBLE);
				NeptunoTextoAnillos2Tabla.setVisibility(View.VISIBLE);
				NeptunoTextoAnillos3I.setVisibility(View.VISIBLE);
				NeptunoTextoAnillos4T.setVisibility(View.VISIBLE);
				NeptunoTextoAnillos5T.setVisibility(View.VISIBLE);
				bOcultarNeptunoTextoAnillos.setVisibility(View.VISIBLE);
			}
		});

		bOcultarNeptunoTextoAnillos.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				NeptunoTextoAnillos1T.setVisibility(View.GONE);
				NeptunoTextoAnillos2Tabla.setVisibility(View.GONE);
				NeptunoTextoAnillos3I.setVisibility(View.GONE);
				NeptunoTextoAnillos4T.setVisibility(View.GONE);
				NeptunoTextoAnillos5T.setVisibility(View.GONE);
				bOcultarNeptunoTextoAnillos.setVisibility(View.GONE);
			}
		});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate4);
		a.reset();
		bVerNeptunoTextoAnillos.clearAnimation();
		bVerNeptunoTextoAnillos.startAnimation(a);

		// Observación y Estudio
		bVerNeptunoTextoObservacionEstudio = (Button) findViewById(R.id.VerNeptunoTextoObservacionEstudio);
		NeptunoTextoObservacionEstudio1T = (TextView) findViewById(R.id.NeptunoTextoObservacionEstudio1T);
		NeptunoTextoObservacionEstudio2T = (TextView) findViewById(R.id.NeptunoTextoObservacionEstudio2T);
		NeptunoTextoObservacionEstudio3T = (TextView) findViewById(R.id.NeptunoTextoObservacionEstudio3T);
		NeptunoTextoObservacionEstudio4I = (ImageView) findViewById(R.id.NeptunoTextoObservacionEstudio4I);
		NeptunoTextoObservacionEstudio5C = (TextView) findViewById(R.id.NeptunoTextoObservacionEstudio5C);
		bOcultarNeptunoTextoObservacionEstudio = (Button) findViewById(R.id.OcultarNeptunoTextoObservacionEstudio);

		NeptunoTextoObservacionEstudio1T.setVisibility(View.GONE);
		NeptunoTextoObservacionEstudio2T.setVisibility(View.GONE);
		NeptunoTextoObservacionEstudio3T.setVisibility(View.GONE);
		NeptunoTextoObservacionEstudio4I.setVisibility(View.GONE);
		NeptunoTextoObservacionEstudio5C.setVisibility(View.GONE);
		bOcultarNeptunoTextoObservacionEstudio.setVisibility(View.GONE);

		bVerNeptunoTextoObservacionEstudio
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						NeptunoTextoObservacionEstudio1T
								.setVisibility(View.VISIBLE);
						NeptunoTextoObservacionEstudio2T
								.setVisibility(View.VISIBLE);
						NeptunoTextoObservacionEstudio3T
								.setVisibility(View.VISIBLE);
						NeptunoTextoObservacionEstudio4I
								.setVisibility(View.VISIBLE);
						NeptunoTextoObservacionEstudio5C
								.setVisibility(View.VISIBLE);
						bOcultarNeptunoTextoObservacionEstudio
								.setVisibility(View.VISIBLE);
					}
				});

		bOcultarNeptunoTextoObservacionEstudio
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						NeptunoTextoObservacionEstudio1T
								.setVisibility(View.GONE);
						NeptunoTextoObservacionEstudio2T
								.setVisibility(View.GONE);
						NeptunoTextoObservacionEstudio3T
								.setVisibility(View.GONE);
						NeptunoTextoObservacionEstudio4I
								.setVisibility(View.GONE);
						NeptunoTextoObservacionEstudio5C
								.setVisibility(View.GONE);
						bOcultarNeptunoTextoObservacionEstudio
								.setVisibility(View.GONE);
					}
				});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate5);
		a.reset();
		bVerNeptunoTextoObservacionEstudio.clearAnimation();
		bVerNeptunoTextoObservacionEstudio.startAnimation(a);

	}

	@Override
	public void onBackPressed() {
		Intent intent = new Intent(this, Planetas.class);
		startActivity(intent);
	}

}