package com.master.planetas.saturno;

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

public class PlanetasSaturnoTexto extends Activity {

	private Button bVerSaturnoTextoEstructura;
	private Button bOcultarSaturnoTextoEstructura;
	private TextView SaturnoTextoEstructura1T;
	private TextView SaturnoTextoEstructura2T;
	private TextView SaturnoTextoEstructura3T;

	private Button bVerSaturnoTextoAtmosfera;
	private Button bOcultarSaturnoTextoAtmosfera;
	private TextView SaturnoTextoAtmosfera1T;
	private TextView SaturnoTextoAtmosfera2T;
	private TextView SaturnoTextoAtmosfera3T;
	private ImageView SaturnoTextoAtmosfera4I;
	private TextView SaturnoTextoAtmosfera5C;

	private Button bVerSaturnoTextoOrbitaRotacion;
	private Button bOcultarSaturnoTextoOrbitaRotacion;
	private TextView OrbitaRotacion1T;
	private TextView OrbitaRotacion2T;

	private Button bVerSaturnoTextoSatelites;
	private Button bOcultarSaturnoTextoSatelites;
	private TextView SaturnoTextoSatelites1T;
	private ImageView SaturnoTextoSatelites2I;
	private TextView SaturnoTextoSatelites3C;
	private TextView SaturnoTextoSatelites4T;
	private TextView SaturnoTextoSatelites5T;
	private TableLayout SaturnoTextoSatelites6Tabla;

	private Button bVerSaturnoTextoObservacionEstudio;
	private Button bOcultarSaturnoTextoObservacionEstudio;
	private TextView ObservacionEstudio1T;
	private TextView ObservacionEstudio2T;
	private TextView ObservacionEstudio3T;
	private TextView ObservacionEstudio4T;
	private ImageView ObservacionEstudio5I;
	private TextView ObservacionEstudio6T;
	private TextView ObservacionEstudio7T;
	private TextView ObservacionEstudio8T;
	private TextView ObservacionEstudio9T;
	private TextView ObservacionEstudio10T;
	private ImageView ObservacionEstudio11I;
	private TextView ObservacionEstudio12C;
	private TextView ObservacionEstudio13T;
	private ImageView ObservacionEstudio14I;
	private TextView ObservacionEstudio15C;

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.planetas_saturno_texto);

		// ESTRUCTURA
		bVerSaturnoTextoEstructura = (Button) findViewById(R.id.VerSaturnoTextoEstructura);
		SaturnoTextoEstructura1T = (TextView) findViewById(R.id.SaturnoTextoEstructura1T);
		SaturnoTextoEstructura2T = (TextView) findViewById(R.id.SaturnoTextoEstructura2T);
		SaturnoTextoEstructura3T = (TextView) findViewById(R.id.SaturnoTextoEstructura3T);
		bOcultarSaturnoTextoEstructura = (Button) findViewById(R.id.OcultarSaturnoTextoEstructura);

		SaturnoTextoEstructura1T.setVisibility(View.GONE);
		SaturnoTextoEstructura2T.setVisibility(View.GONE);
		SaturnoTextoEstructura3T.setVisibility(View.GONE);
		bOcultarSaturnoTextoEstructura.setVisibility(View.GONE);

		bVerSaturnoTextoEstructura.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				SaturnoTextoEstructura1T.setVisibility(View.VISIBLE);
				SaturnoTextoEstructura2T.setVisibility(View.VISIBLE);
				SaturnoTextoEstructura3T.setVisibility(View.VISIBLE);
				bOcultarSaturnoTextoEstructura.setVisibility(View.VISIBLE);
			}
		});

		bOcultarSaturnoTextoEstructura
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						SaturnoTextoEstructura1T.setVisibility(View.GONE);
						SaturnoTextoEstructura2T.setVisibility(View.GONE);
						SaturnoTextoEstructura3T.setVisibility(View.GONE);
						bOcultarSaturnoTextoEstructura.setVisibility(View.GONE);
					}
				});

		Animation a = AnimationUtils.loadAnimation(this, R.anim.rotate1);
		a.reset();
		bVerSaturnoTextoEstructura.clearAnimation();
		bVerSaturnoTextoEstructura.startAnimation(a);

		// ATMÓSFERA
		bVerSaturnoTextoAtmosfera = (Button) findViewById(R.id.VerSaturnoTextoAtmosfera);
		SaturnoTextoAtmosfera1T = (TextView) findViewById(R.id.SaturnoTextoAtmosfera1T);
		SaturnoTextoAtmosfera2T = (TextView) findViewById(R.id.SaturnoTextoAtmosfera2T);
		SaturnoTextoAtmosfera3T = (TextView) findViewById(R.id.SaturnoTextoAtmosfera3T);
		SaturnoTextoAtmosfera4I = (ImageView) findViewById(R.id.SaturnoTextoAtmosfera4I);
		SaturnoTextoAtmosfera5C = (TextView) findViewById(R.id.SaturnoTextoAtmosfera5C);
		bOcultarSaturnoTextoAtmosfera = (Button) findViewById(R.id.OcultarSaturnoTextoAtmosfera);

		SaturnoTextoAtmosfera1T.setVisibility(View.GONE);
		SaturnoTextoAtmosfera2T.setVisibility(View.GONE);
		SaturnoTextoAtmosfera3T.setVisibility(View.GONE);
		SaturnoTextoAtmosfera4I.setVisibility(View.GONE);
		SaturnoTextoAtmosfera5C.setVisibility(View.GONE);
		bOcultarSaturnoTextoAtmosfera.setVisibility(View.GONE);

		bVerSaturnoTextoAtmosfera.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				SaturnoTextoAtmosfera1T.setVisibility(View.VISIBLE);
				SaturnoTextoAtmosfera2T.setVisibility(View.VISIBLE);
				SaturnoTextoAtmosfera3T.setVisibility(View.VISIBLE);
				SaturnoTextoAtmosfera4I.setVisibility(View.VISIBLE);
				SaturnoTextoAtmosfera5C.setVisibility(View.VISIBLE);
				bOcultarSaturnoTextoAtmosfera.setVisibility(View.VISIBLE);
			}
		});

		bOcultarSaturnoTextoAtmosfera.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				SaturnoTextoAtmosfera1T.setVisibility(View.GONE);
				SaturnoTextoAtmosfera2T.setVisibility(View.GONE);
				SaturnoTextoAtmosfera3T.setVisibility(View.GONE);
				SaturnoTextoAtmosfera4I.setVisibility(View.GONE);
				SaturnoTextoAtmosfera5C.setVisibility(View.GONE);
				bOcultarSaturnoTextoAtmosfera.setVisibility(View.GONE);
			}
		});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate2);
		a.reset();
		bVerSaturnoTextoAtmosfera.clearAnimation();
		bVerSaturnoTextoAtmosfera.startAnimation(a);

		// ÓRBITA Y ROTACIÓN
		bVerSaturnoTextoOrbitaRotacion = (Button) findViewById(R.id.VerSaturnoTextoOrbitaRotacion);
		bOcultarSaturnoTextoOrbitaRotacion = (Button) findViewById(R.id.OcultarSaturnoTextoOrbitaRotacion);

		OrbitaRotacion1T = (TextView) findViewById(R.id.OrbitaRotacion1T);
		OrbitaRotacion2T = (TextView) findViewById(R.id.OrbitaRotacion2T);

		bOcultarSaturnoTextoOrbitaRotacion.setVisibility(View.GONE);
		OrbitaRotacion1T.setVisibility(View.GONE);
		OrbitaRotacion2T.setVisibility(View.GONE);

		bVerSaturnoTextoOrbitaRotacion
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						bOcultarSaturnoTextoOrbitaRotacion
								.setVisibility(View.VISIBLE);
						OrbitaRotacion1T.setVisibility(View.VISIBLE);
						OrbitaRotacion2T.setVisibility(View.VISIBLE);
					}
				});

		bOcultarSaturnoTextoOrbitaRotacion
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						bOcultarSaturnoTextoOrbitaRotacion
								.setVisibility(View.GONE);
						OrbitaRotacion1T.setVisibility(View.GONE);
						OrbitaRotacion2T.setVisibility(View.GONE);
					}
				});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate3);
		a.reset();
		bVerSaturnoTextoOrbitaRotacion.clearAnimation();
		bVerSaturnoTextoOrbitaRotacion.startAnimation(a);

		// SATÉLITES
		bVerSaturnoTextoSatelites = (Button) findViewById(R.id.VerSaturnoTextoSatelites);
		bOcultarSaturnoTextoSatelites = (Button) findViewById(R.id.OcultarSaturnoTextoSatelites);

		SaturnoTextoSatelites1T = (TextView) findViewById(R.id.SaturnoTextoSatelites1T);
		SaturnoTextoSatelites2I = (ImageView) findViewById(R.id.SaturnoTextoSatelites2I);
		SaturnoTextoSatelites3C = (TextView) findViewById(R.id.SaturnoTextoSatelites3C);
		SaturnoTextoSatelites4T = (TextView) findViewById(R.id.SaturnoTextoSatelites4T);
		SaturnoTextoSatelites5T = (TextView) findViewById(R.id.SaturnoTextoSatelites5T);
		SaturnoTextoSatelites6Tabla = (TableLayout) findViewById(R.id.SaturnoTextoSatelites6Tabla);

		SaturnoTextoSatelites1T.setVisibility(View.GONE);
		SaturnoTextoSatelites2I.setVisibility(View.GONE);
		SaturnoTextoSatelites3C.setVisibility(View.GONE);
		SaturnoTextoSatelites4T.setVisibility(View.GONE);
		SaturnoTextoSatelites5T.setVisibility(View.GONE);
		SaturnoTextoSatelites6Tabla.setVisibility(View.GONE);
		bOcultarSaturnoTextoSatelites.setVisibility(View.GONE);

		bVerSaturnoTextoSatelites.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				SaturnoTextoSatelites1T.setVisibility(View.VISIBLE);
				SaturnoTextoSatelites2I.setVisibility(View.VISIBLE);
				SaturnoTextoSatelites3C.setVisibility(View.VISIBLE);
				SaturnoTextoSatelites4T.setVisibility(View.VISIBLE);
				SaturnoTextoSatelites5T.setVisibility(View.VISIBLE);
				SaturnoTextoSatelites6Tabla.setVisibility(View.VISIBLE);
				bOcultarSaturnoTextoSatelites.setVisibility(View.VISIBLE);
			}
		});

		bOcultarSaturnoTextoSatelites.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				SaturnoTextoSatelites1T.setVisibility(View.GONE);
				SaturnoTextoSatelites2I.setVisibility(View.GONE);
				SaturnoTextoSatelites3C.setVisibility(View.GONE);
				SaturnoTextoSatelites4T.setVisibility(View.GONE);
				SaturnoTextoSatelites5T.setVisibility(View.GONE);
				SaturnoTextoSatelites6Tabla.setVisibility(View.GONE);
				bOcultarSaturnoTextoSatelites.setVisibility(View.GONE);
			}
		});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate4);
		a.reset();
		bVerSaturnoTextoSatelites.clearAnimation();
		bVerSaturnoTextoSatelites.startAnimation(a);

		// OBSERVACIÓN Y ESTUDIO
		bVerSaturnoTextoObservacionEstudio = (Button) findViewById(R.id.VerSaturnoTextoObservacionEstudio);
		bOcultarSaturnoTextoObservacionEstudio = (Button) findViewById(R.id.OcultarSaturnoTextoObservacionEstudio);

		ObservacionEstudio1T = (TextView) findViewById(R.id.ObservacionEstudio1T);
		ObservacionEstudio2T = (TextView) findViewById(R.id.ObservacionEstudio2T);
		ObservacionEstudio3T = (TextView) findViewById(R.id.ObservacionEstudio3T);
		ObservacionEstudio4T = (TextView) findViewById(R.id.ObservacionEstudio4T);
		ObservacionEstudio5I = (ImageView) findViewById(R.id.ObservacionEstudio5I);
		ObservacionEstudio6T = (TextView) findViewById(R.id.ObservacionEstudio6T);
		ObservacionEstudio7T = (TextView) findViewById(R.id.ObservacionEstudio7T);
		ObservacionEstudio8T = (TextView) findViewById(R.id.ObservacionEstudio8T);
		ObservacionEstudio9T = (TextView) findViewById(R.id.ObservacionEstudio9T);
		ObservacionEstudio10T = (TextView) findViewById(R.id.ObservacionEstudio10T);
		ObservacionEstudio11I = (ImageView) findViewById(R.id.ObservacionEstudio11I);
		ObservacionEstudio12C = (TextView) findViewById(R.id.ObservacionEstudio12C);
		ObservacionEstudio13T = (TextView) findViewById(R.id.ObservacionEstudio13T);
		ObservacionEstudio14I = (ImageView) findViewById(R.id.ObservacionEstudio14I);
		ObservacionEstudio15C = (TextView) findViewById(R.id.ObservacionEstudio15C);

		ObservacionEstudio1T.setVisibility(View.GONE);
		ObservacionEstudio2T.setVisibility(View.GONE);
		ObservacionEstudio3T.setVisibility(View.GONE);
		ObservacionEstudio4T.setVisibility(View.GONE);
		ObservacionEstudio5I.setVisibility(View.GONE);
		ObservacionEstudio6T.setVisibility(View.GONE);
		ObservacionEstudio7T.setVisibility(View.GONE);
		ObservacionEstudio8T.setVisibility(View.GONE);
		ObservacionEstudio9T.setVisibility(View.GONE);
		ObservacionEstudio10T.setVisibility(View.GONE);
		ObservacionEstudio11I.setVisibility(View.GONE);
		ObservacionEstudio12C.setVisibility(View.GONE);
		ObservacionEstudio13T.setVisibility(View.GONE);
		ObservacionEstudio14I.setVisibility(View.GONE);
		ObservacionEstudio15C.setVisibility(View.GONE);
		bOcultarSaturnoTextoObservacionEstudio.setVisibility(View.GONE);

		bVerSaturnoTextoObservacionEstudio
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						ObservacionEstudio1T.setVisibility(View.VISIBLE);
						ObservacionEstudio2T.setVisibility(View.VISIBLE);
						ObservacionEstudio3T.setVisibility(View.VISIBLE);
						ObservacionEstudio4T.setVisibility(View.VISIBLE);
						ObservacionEstudio5I.setVisibility(View.VISIBLE);
						ObservacionEstudio6T.setVisibility(View.VISIBLE);
						ObservacionEstudio7T.setVisibility(View.VISIBLE);
						ObservacionEstudio8T.setVisibility(View.VISIBLE);
						ObservacionEstudio9T.setVisibility(View.VISIBLE);
						ObservacionEstudio10T.setVisibility(View.VISIBLE);
						ObservacionEstudio11I.setVisibility(View.VISIBLE);
						ObservacionEstudio12C.setVisibility(View.VISIBLE);
						ObservacionEstudio13T.setVisibility(View.VISIBLE);
						ObservacionEstudio14I.setVisibility(View.VISIBLE);
						ObservacionEstudio15C.setVisibility(View.VISIBLE);
						bOcultarSaturnoTextoObservacionEstudio
								.setVisibility(View.VISIBLE);
					}
				});

		bOcultarSaturnoTextoObservacionEstudio
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						ObservacionEstudio1T.setVisibility(View.GONE);
						ObservacionEstudio2T.setVisibility(View.GONE);
						ObservacionEstudio3T.setVisibility(View.GONE);
						ObservacionEstudio4T.setVisibility(View.GONE);
						ObservacionEstudio5I.setVisibility(View.GONE);
						ObservacionEstudio6T.setVisibility(View.GONE);
						ObservacionEstudio7T.setVisibility(View.GONE);
						ObservacionEstudio8T.setVisibility(View.GONE);
						ObservacionEstudio9T.setVisibility(View.GONE);
						ObservacionEstudio10T.setVisibility(View.GONE);
						ObservacionEstudio11I.setVisibility(View.GONE);
						ObservacionEstudio12C.setVisibility(View.GONE);
						ObservacionEstudio13T.setVisibility(View.GONE);
						ObservacionEstudio14I.setVisibility(View.GONE);
						ObservacionEstudio15C.setVisibility(View.GONE);
						bOcultarSaturnoTextoObservacionEstudio
								.setVisibility(View.GONE);
					}
				});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate5);
		a.reset();
		bVerSaturnoTextoObservacionEstudio.clearAnimation();
		bVerSaturnoTextoObservacionEstudio.startAnimation(a);

	}

	@Override
	public void onBackPressed() {
		Intent intent = new Intent(this, Planetas.class);
		startActivity(intent);
	}

}