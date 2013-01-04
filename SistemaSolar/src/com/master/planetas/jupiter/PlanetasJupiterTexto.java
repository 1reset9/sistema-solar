package com.master.planetas.jupiter;

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

public class PlanetasJupiterTexto extends Activity {

	private Button bVerJupiterTextoEstructura;
	private Button bOcultarJupiterTextoEstructura;
	private TextView JupiterTextoEstructura1T;
	private TextView JupiterTextoEstructura2T;
	private TextView JupiterTextoEstructura3T;
	private ImageView JupiterTextoEstructura4I;
	private TextView JupiterTextoEstructura5C;

	private Button bVerJupiterTextoOrbitaRotacion;
	private Button bOcultarJupiterTextoOrbitaRotacion;
	private TextView OrbitaRotacion1T;
	private TextView OrbitaRotacion2T;

	private Button bVerJupiterTextoAnillos;
	private Button bOcultarJupiterTextoAnillos;
	private TextView Anillos1T;
	private TableLayout Anillos2Tabla;
	private TextView Anillos3T;
	private ImageView Anillos4I;
	private TextView Anillos5C;

	private Button bVerJupiterTextoObservacionEstudio;
	private Button bOcultarJupiterTextoObservacionEstudio;
	private TextView ObservacionEstudio1T;
	private TextView ObservacionEstudio2T;
	private TextView ObservacionEstudio3T;
	private TextView ObservacionEstudio4T;
	private TextView ObservacionEstudio44T;
	private ImageView ObservacionEstudio5I;
	private TextView ObservacionEstudio6C;
	private TextView ObservacionEstudio7T;
	private TextView ObservacionEstudio8T;
	private TextView ObservacionEstudio9T;
	private TextView ObservacionEstudio10T;
	private TextView ObservacionEstudio11T;
	private ImageView ObservacionEstudio12I;
	private TextView ObservacionEstudio13C;
	private TextView ObservacionEstudio14T;
	private ImageView ObservacionEstudio15I;
	private TextView ObservacionEstudio16C;
	private TextView ObservacionEstudio17T;
	private TextView ObservacionEstudio18T;
	private TextView ObservacionEstudio19T;
	private ImageView ObservacionEstudio20I;
	private TextView ObservacionEstudio21C;

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.planetas_jupiter_texto);

		// ESTRUCTURA
		bVerJupiterTextoEstructura = (Button) findViewById(R.id.VerJupiterTextoEstructura);
		JupiterTextoEstructura1T = (TextView) findViewById(R.id.JupiterTextoEstructura1T);
		JupiterTextoEstructura2T = (TextView) findViewById(R.id.JupiterTextoEstructura2T);
		JupiterTextoEstructura3T = (TextView) findViewById(R.id.JupiterTextoEstructura3T);
		JupiterTextoEstructura4I = (ImageView) findViewById(R.id.JupiterTextoEstructura4I);
		JupiterTextoEstructura5C = (TextView) findViewById(R.id.JupiterTextoEstructura5C);
		bOcultarJupiterTextoEstructura = (Button) findViewById(R.id.OcultarJupiterTextoEstructura);

		JupiterTextoEstructura1T.setVisibility(View.GONE);
		JupiterTextoEstructura2T.setVisibility(View.GONE);
		JupiterTextoEstructura3T.setVisibility(View.GONE);
		JupiterTextoEstructura4I.setVisibility(View.GONE);
		JupiterTextoEstructura5C.setVisibility(View.GONE);
		bOcultarJupiterTextoEstructura.setVisibility(View.GONE);

		bVerJupiterTextoEstructura.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				JupiterTextoEstructura1T.setVisibility(View.VISIBLE);
				JupiterTextoEstructura2T.setVisibility(View.VISIBLE);
				JupiterTextoEstructura3T.setVisibility(View.VISIBLE);
				JupiterTextoEstructura4I.setVisibility(View.VISIBLE);
				JupiterTextoEstructura5C.setVisibility(View.VISIBLE);
				bOcultarJupiterTextoEstructura.setVisibility(View.VISIBLE);
			}
		});

		bOcultarJupiterTextoEstructura
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						JupiterTextoEstructura1T.setVisibility(View.GONE);
						JupiterTextoEstructura2T.setVisibility(View.GONE);
						JupiterTextoEstructura3T.setVisibility(View.GONE);
						JupiterTextoEstructura4I.setVisibility(View.GONE);
						JupiterTextoEstructura5C.setVisibility(View.GONE);
						bOcultarJupiterTextoEstructura.setVisibility(View.GONE);
					}
				});

		Animation a = AnimationUtils.loadAnimation(this, R.anim.rotate1);
		a.reset();
		bVerJupiterTextoEstructura.clearAnimation();
		bVerJupiterTextoEstructura.startAnimation(a);

		// ÓRBITA Y ROTACIÓN
		bVerJupiterTextoOrbitaRotacion = (Button) findViewById(R.id.VerJupiterTextoOrbitaRotacion);
		bOcultarJupiterTextoOrbitaRotacion = (Button) findViewById(R.id.OcultarJupiterTextoOrbitaRotacion);

		OrbitaRotacion1T = (TextView) findViewById(R.id.OrbitaRotacion1T);
		OrbitaRotacion2T = (TextView) findViewById(R.id.OrbitaRotacion2T);

		bOcultarJupiterTextoOrbitaRotacion.setVisibility(View.GONE);
		OrbitaRotacion1T.setVisibility(View.GONE);
		OrbitaRotacion2T.setVisibility(View.GONE);

		bVerJupiterTextoOrbitaRotacion
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						bOcultarJupiterTextoOrbitaRotacion
								.setVisibility(View.VISIBLE);
						OrbitaRotacion1T.setVisibility(View.VISIBLE);
						OrbitaRotacion2T.setVisibility(View.VISIBLE);
					}
				});

		bOcultarJupiterTextoOrbitaRotacion
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						bOcultarJupiterTextoOrbitaRotacion
								.setVisibility(View.GONE);
						OrbitaRotacion1T.setVisibility(View.GONE);
						OrbitaRotacion2T.setVisibility(View.GONE);
					}
				});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate2);
		a.reset();
		bVerJupiterTextoOrbitaRotacion.clearAnimation();
		bVerJupiterTextoOrbitaRotacion.startAnimation(a);

		// ANILLOS
		bVerJupiterTextoAnillos = (Button) findViewById(R.id.VerJupiterTextoAnillos);
		bOcultarJupiterTextoAnillos = (Button) findViewById(R.id.OcultarJupiterTextoAnillos);

		Anillos1T = (TextView) findViewById(R.id.Anillos1T);
		Anillos2Tabla = (TableLayout) findViewById(R.id.Anillos2Tabla);
		Anillos3T = (TextView) findViewById(R.id.Anillos3T);
		Anillos4I = (ImageView) findViewById(R.id.Anillos4I);
		Anillos5C = (TextView) findViewById(R.id.Anillos5C);

		Anillos1T.setVisibility(View.GONE);
		Anillos2Tabla.setVisibility(View.GONE);
		Anillos3T.setVisibility(View.GONE);
		Anillos4I.setVisibility(View.GONE);
		Anillos5C.setVisibility(View.GONE);
		bOcultarJupiterTextoAnillos.setVisibility(View.GONE);

		bVerJupiterTextoAnillos.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				Anillos1T.setVisibility(View.VISIBLE);
				Anillos2Tabla.setVisibility(View.VISIBLE);
				Anillos3T.setVisibility(View.VISIBLE);
				Anillos4I.setVisibility(View.VISIBLE);
				Anillos5C.setVisibility(View.VISIBLE);
				bOcultarJupiterTextoAnillos.setVisibility(View.VISIBLE);
			}
		});

		bOcultarJupiterTextoAnillos.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				Anillos1T.setVisibility(View.GONE);
				Anillos2Tabla.setVisibility(View.GONE);
				Anillos3T.setVisibility(View.GONE);
				Anillos4I.setVisibility(View.GONE);
				Anillos5C.setVisibility(View.GONE);
				bOcultarJupiterTextoAnillos.setVisibility(View.GONE);
			}
		});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate3);
		a.reset();
		bVerJupiterTextoAnillos.clearAnimation();
		bVerJupiterTextoAnillos.startAnimation(a);

		// OBSERVACIÓN Y ESTUDIO
		bVerJupiterTextoObservacionEstudio = (Button) findViewById(R.id.VerJupiterTextoObservacionEstudio);
		bOcultarJupiterTextoObservacionEstudio = (Button) findViewById(R.id.OcultarJupiterTextoObservacionEstudio);

		ObservacionEstudio1T = (TextView) findViewById(R.id.ObservacionEstudio1T);
		ObservacionEstudio2T = (TextView) findViewById(R.id.ObservacionEstudio2T);
		ObservacionEstudio3T = (TextView) findViewById(R.id.ObservacionEstudio3T);
		ObservacionEstudio4T = (TextView) findViewById(R.id.ObservacionEstudio4T);
		ObservacionEstudio44T = (TextView) findViewById(R.id.ObservacionEstudio44T);
		ObservacionEstudio5I = (ImageView) findViewById(R.id.ObservacionEstudio5I);
		ObservacionEstudio6C = (TextView) findViewById(R.id.ObservacionEstudio6C);
		ObservacionEstudio7T = (TextView) findViewById(R.id.ObservacionEstudio7T);
		ObservacionEstudio8T = (TextView) findViewById(R.id.ObservacionEstudio8T);
		ObservacionEstudio9T = (TextView) findViewById(R.id.ObservacionEstudio9T);
		ObservacionEstudio10T = (TextView) findViewById(R.id.ObservacionEstudio10T);
		ObservacionEstudio11T = (TextView) findViewById(R.id.ObservacionEstudio11T);
		ObservacionEstudio12I = (ImageView) findViewById(R.id.ObservacionEstudio12I);
		ObservacionEstudio13C = (TextView) findViewById(R.id.ObservacionEstudio13C);
		ObservacionEstudio14T = (TextView) findViewById(R.id.ObservacionEstudio14T);
		ObservacionEstudio15I = (ImageView) findViewById(R.id.ObservacionEstudio15I);
		ObservacionEstudio16C = (TextView) findViewById(R.id.ObservacionEstudio16C);
		ObservacionEstudio17T = (TextView) findViewById(R.id.ObservacionEstudio17T);
		ObservacionEstudio18T = (TextView) findViewById(R.id.ObservacionEstudio18T);
		ObservacionEstudio19T = (TextView) findViewById(R.id.ObservacionEstudio19T);
		ObservacionEstudio20I = (ImageView) findViewById(R.id.ObservacionEstudio20I);
		ObservacionEstudio21C = (TextView) findViewById(R.id.ObservacionEstudio21C);

		ObservacionEstudio1T.setVisibility(View.GONE);
		ObservacionEstudio2T.setVisibility(View.GONE);
		ObservacionEstudio3T.setVisibility(View.GONE);
		ObservacionEstudio4T.setVisibility(View.GONE);
		ObservacionEstudio44T.setVisibility(View.GONE);
		ObservacionEstudio5I.setVisibility(View.GONE);
		ObservacionEstudio6C.setVisibility(View.GONE);
		ObservacionEstudio7T.setVisibility(View.GONE);
		ObservacionEstudio8T.setVisibility(View.GONE);
		ObservacionEstudio9T.setVisibility(View.GONE);
		ObservacionEstudio10T.setVisibility(View.GONE);
		ObservacionEstudio11T.setVisibility(View.GONE);
		ObservacionEstudio12I.setVisibility(View.GONE);
		ObservacionEstudio13C.setVisibility(View.GONE);
		ObservacionEstudio14T.setVisibility(View.GONE);
		ObservacionEstudio15I.setVisibility(View.GONE);
		ObservacionEstudio16C.setVisibility(View.GONE);
		ObservacionEstudio17T.setVisibility(View.GONE);
		ObservacionEstudio18T.setVisibility(View.GONE);
		ObservacionEstudio19T.setVisibility(View.GONE);
		ObservacionEstudio20I.setVisibility(View.GONE);
		ObservacionEstudio21C.setVisibility(View.GONE);
		bOcultarJupiterTextoObservacionEstudio.setVisibility(View.GONE);

		bVerJupiterTextoObservacionEstudio
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						ObservacionEstudio1T.setVisibility(View.VISIBLE);
						ObservacionEstudio2T.setVisibility(View.VISIBLE);
						ObservacionEstudio3T.setVisibility(View.VISIBLE);
						ObservacionEstudio4T.setVisibility(View.VISIBLE);
						ObservacionEstudio44T.setVisibility(View.VISIBLE);
						ObservacionEstudio5I.setVisibility(View.VISIBLE);
						ObservacionEstudio6C.setVisibility(View.VISIBLE);
						ObservacionEstudio7T.setVisibility(View.VISIBLE);
						ObservacionEstudio8T.setVisibility(View.VISIBLE);
						ObservacionEstudio9T.setVisibility(View.VISIBLE);
						ObservacionEstudio10T.setVisibility(View.VISIBLE);
						ObservacionEstudio11T.setVisibility(View.VISIBLE);
						ObservacionEstudio12I.setVisibility(View.VISIBLE);
						ObservacionEstudio13C.setVisibility(View.VISIBLE);
						ObservacionEstudio14T.setVisibility(View.VISIBLE);
						ObservacionEstudio15I.setVisibility(View.VISIBLE);
						ObservacionEstudio16C.setVisibility(View.VISIBLE);
						ObservacionEstudio17T.setVisibility(View.VISIBLE);
						ObservacionEstudio18T.setVisibility(View.VISIBLE);
						ObservacionEstudio19T.setVisibility(View.VISIBLE);
						ObservacionEstudio20I.setVisibility(View.VISIBLE);
						ObservacionEstudio21C.setVisibility(View.VISIBLE);
						bOcultarJupiterTextoObservacionEstudio
								.setVisibility(View.VISIBLE);
					}
				});

		bOcultarJupiterTextoObservacionEstudio
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						ObservacionEstudio1T.setVisibility(View.GONE);
						ObservacionEstudio2T.setVisibility(View.GONE);
						ObservacionEstudio3T.setVisibility(View.GONE);
						ObservacionEstudio4T.setVisibility(View.GONE);
						ObservacionEstudio44T.setVisibility(View.GONE);
						ObservacionEstudio5I.setVisibility(View.GONE);
						ObservacionEstudio6C.setVisibility(View.GONE);
						ObservacionEstudio7T.setVisibility(View.GONE);
						ObservacionEstudio8T.setVisibility(View.GONE);
						ObservacionEstudio9T.setVisibility(View.GONE);
						ObservacionEstudio10T.setVisibility(View.GONE);
						ObservacionEstudio11T.setVisibility(View.GONE);
						ObservacionEstudio12I.setVisibility(View.GONE);
						ObservacionEstudio13C.setVisibility(View.GONE);
						ObservacionEstudio14T.setVisibility(View.GONE);
						ObservacionEstudio15I.setVisibility(View.GONE);
						ObservacionEstudio16C.setVisibility(View.GONE);
						ObservacionEstudio17T.setVisibility(View.GONE);
						ObservacionEstudio18T.setVisibility(View.GONE);
						ObservacionEstudio19T.setVisibility(View.GONE);
						ObservacionEstudio20I.setVisibility(View.GONE);
						ObservacionEstudio21C.setVisibility(View.GONE);
						bOcultarJupiterTextoObservacionEstudio
								.setVisibility(View.GONE);
					}
				});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate4);
		a.reset();
		bVerJupiterTextoObservacionEstudio.clearAnimation();
		bVerJupiterTextoObservacionEstudio.startAnimation(a);

	}

	@Override
	public void onBackPressed() {
		Intent intent = new Intent(this, Planetas.class);
		startActivity(intent);
	}

}
