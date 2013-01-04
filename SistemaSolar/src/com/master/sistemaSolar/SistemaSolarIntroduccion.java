package com.master.sistemaSolar;

import com.master.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;

public class SistemaSolarIntroduccion extends Activity {

	private Button bVerIntroduccionSistemaSolar;
	private Button bOcultarIntroduccionSistemaSolar;
	private TextView IntroduccionSistemaSolarT;
	private ImageView IntroduccionSistemaSolarI;
	private TextView IntroduccionSistemaSolarC;

	private Button bVerIntroduccionUbicacion;
	private Button bOcultarIntroduccionUbicacion;
	private TextView IntroduccionUbicacionT;
	private ImageView IntroduccionUbicacionI;
	private TextView IntroduccionUbicacionC;

	private Button bVerIntroduccionPlanetasInteriores;
	private Button bOcultarIntroduccionPlanetasInteriores;
	private TextView IntroduccionPlanetasInterioresT;
	private ImageView IntroduccionPlanetasInterioresI;
	private TextView IntroduccionPlanetasInterioresC;

	private Button bVerIntroduccionPlanetasExteriores;
	private Button bOcultarIntroduccionPlanetasExteriores;
	private TextView IntroduccionPlanetasExterioresT;
	private ImageView IntroduccionPlanetasExterioresI;
	private TextView IntroduccionPlanetasExterioresC;

	private Button bVerIntroduccionOtrosCuerpos;
	private Button bOcultarIntroduccionOtrosCuerpos;
	private TextView IntroduccionOtrosCuerposT;
	private TableLayout TablaIntroduccionOtrosCuerpos;

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.sistema_solar_introduccion);

		// SISTEMA SOLAR
		bVerIntroduccionSistemaSolar = (Button) findViewById(R.id.VerIntroduccionSistemaSolar);
		IntroduccionSistemaSolarT = (TextView) findViewById(R.id.IntroduccionSistemaSolarT);
		IntroduccionSistemaSolarI = (ImageView) findViewById(R.id.IntroduccionSistemaSolarI);
		IntroduccionSistemaSolarC = (TextView) findViewById(R.id.IntroduccionSistemaSolarC);
		bOcultarIntroduccionSistemaSolar = (Button) findViewById(R.id.OcultarIntroduccionSistemaSolar);

		IntroduccionSistemaSolarT.setVisibility(View.GONE);
		IntroduccionSistemaSolarI.setVisibility(View.GONE);
		IntroduccionSistemaSolarC.setVisibility(View.GONE);
		bOcultarIntroduccionSistemaSolar.setVisibility(View.GONE);

		bVerIntroduccionSistemaSolar.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				IntroduccionSistemaSolarT.setVisibility(View.VISIBLE);
				IntroduccionSistemaSolarI.setVisibility(View.VISIBLE);
				IntroduccionSistemaSolarC.setVisibility(View.VISIBLE);
				bOcultarIntroduccionSistemaSolar.setVisibility(View.VISIBLE);
			}
		});

		bOcultarIntroduccionSistemaSolar
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						IntroduccionSistemaSolarT.setVisibility(View.GONE);
						IntroduccionSistemaSolarI.setVisibility(View.GONE);
						IntroduccionSistemaSolarC.setVisibility(View.GONE);
						bOcultarIntroduccionSistemaSolar
								.setVisibility(View.GONE);
					}
				});

		Animation a = AnimationUtils.loadAnimation(this, R.anim.rotate1);
		a.reset();
		bVerIntroduccionSistemaSolar.clearAnimation();
		bVerIntroduccionSistemaSolar.startAnimation(a);

		// UBICACIÓN
		bVerIntroduccionUbicacion = (Button) findViewById(R.id.VerIntroduccionUbicacion);
		IntroduccionUbicacionT = (TextView) findViewById(R.id.IntroduccionUbicacionT);
		IntroduccionUbicacionI = (ImageView) findViewById(R.id.IntroduccionUbicacionI);
		IntroduccionUbicacionC = (TextView) findViewById(R.id.IntroduccionUbicacionC);
		bOcultarIntroduccionUbicacion = (Button) findViewById(R.id.OcultarIntroduccionUbicacion);

		IntroduccionUbicacionT.setVisibility(View.GONE);
		IntroduccionUbicacionI.setVisibility(View.GONE);
		IntroduccionUbicacionC.setVisibility(View.GONE);
		bOcultarIntroduccionUbicacion.setVisibility(View.GONE);

		bVerIntroduccionUbicacion.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				IntroduccionUbicacionT.setVisibility(View.VISIBLE);
				IntroduccionUbicacionI.setVisibility(View.VISIBLE);
				IntroduccionUbicacionC.setVisibility(View.VISIBLE);
				bOcultarIntroduccionUbicacion.setVisibility(View.VISIBLE);
			}
		});

		bOcultarIntroduccionUbicacion.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				IntroduccionUbicacionT.setVisibility(View.GONE);
				IntroduccionUbicacionI.setVisibility(View.GONE);
				IntroduccionUbicacionC.setVisibility(View.GONE);
				bOcultarIntroduccionUbicacion.setVisibility(View.GONE);
			}
		});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate2);
		a.reset();
		bVerIntroduccionUbicacion.clearAnimation();
		bVerIntroduccionUbicacion.startAnimation(a);

		// PLANETAS INTERIORES
		bVerIntroduccionPlanetasInteriores = (Button) findViewById(R.id.VerIntroduccionPlanetasInteriores);
		IntroduccionPlanetasInterioresT = (TextView) findViewById(R.id.IntroduccionPlanetasInterioresT);
		IntroduccionPlanetasInterioresI = (ImageView) findViewById(R.id.IntroduccionPlanetasInterioresI);
		IntroduccionPlanetasInterioresC = (TextView) findViewById(R.id.IntroduccionPlanetasInterioresC);
		bOcultarIntroduccionPlanetasInteriores = (Button) findViewById(R.id.OcultarIntroduccionPlanetasInteriores);

		IntroduccionPlanetasInterioresT.setVisibility(View.GONE);
		IntroduccionPlanetasInterioresI.setVisibility(View.GONE);
		IntroduccionPlanetasInterioresC.setVisibility(View.GONE);
		bOcultarIntroduccionPlanetasInteriores.setVisibility(View.GONE);

		bVerIntroduccionPlanetasInteriores
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						IntroduccionPlanetasInterioresT
								.setVisibility(View.VISIBLE);
						IntroduccionPlanetasInterioresI
								.setVisibility(View.VISIBLE);
						IntroduccionPlanetasInterioresC
								.setVisibility(View.VISIBLE);
						bOcultarIntroduccionPlanetasInteriores
								.setVisibility(View.VISIBLE);
					}
				});

		bOcultarIntroduccionPlanetasInteriores
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						IntroduccionPlanetasInterioresT
								.setVisibility(View.GONE);
						IntroduccionPlanetasInterioresI
								.setVisibility(View.GONE);
						IntroduccionPlanetasInterioresC
								.setVisibility(View.GONE);
						bOcultarIntroduccionPlanetasInteriores
								.setVisibility(View.GONE);
					}
				});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate3);
		a.reset();
		bVerIntroduccionPlanetasInteriores.clearAnimation();
		bVerIntroduccionPlanetasInteriores.startAnimation(a);

		// PLANETAS EXTERIORES
		bVerIntroduccionPlanetasExteriores = (Button) findViewById(R.id.VerIntroduccionPlanetasExteriores);
		IntroduccionPlanetasExterioresT = (TextView) findViewById(R.id.IntroduccionPlanetasExterioresT);
		IntroduccionPlanetasExterioresI = (ImageView) findViewById(R.id.IntroduccionPlanetasExterioresI);
		IntroduccionPlanetasExterioresC = (TextView) findViewById(R.id.IntroduccionPlanetasExterioresC);
		bOcultarIntroduccionPlanetasExteriores = (Button) findViewById(R.id.OcultarIntroduccionPlanetasExteriores);

		IntroduccionPlanetasExterioresT.setVisibility(View.GONE);
		IntroduccionPlanetasExterioresI.setVisibility(View.GONE);
		IntroduccionPlanetasExterioresC.setVisibility(View.GONE);
		bOcultarIntroduccionPlanetasExteriores.setVisibility(View.GONE);

		bVerIntroduccionPlanetasExteriores
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						IntroduccionPlanetasExterioresT
								.setVisibility(View.VISIBLE);
						IntroduccionPlanetasExterioresI
								.setVisibility(View.VISIBLE);
						IntroduccionPlanetasExterioresC
								.setVisibility(View.VISIBLE);
						bOcultarIntroduccionPlanetasExteriores
								.setVisibility(View.VISIBLE);
					}
				});

		bOcultarIntroduccionPlanetasExteriores
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						IntroduccionPlanetasExterioresT
								.setVisibility(View.GONE);
						IntroduccionPlanetasExterioresI
								.setVisibility(View.GONE);
						IntroduccionPlanetasExterioresC
								.setVisibility(View.GONE);
						bOcultarIntroduccionPlanetasExteriores
								.setVisibility(View.GONE);
					}
				});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate4);
		a.reset();
		bVerIntroduccionPlanetasExteriores.clearAnimation();
		bVerIntroduccionPlanetasExteriores.startAnimation(a);

		// OTROS CUERPOS
		bVerIntroduccionOtrosCuerpos = (Button) findViewById(R.id.VerIntroduccionOtrosCuerpos);
		IntroduccionOtrosCuerposT = (TextView) findViewById(R.id.IntroduccionOtrosCuerposT);
		bOcultarIntroduccionOtrosCuerpos = (Button) findViewById(R.id.OcultarIntroduccionOtrosCuerpos);
		TablaIntroduccionOtrosCuerpos = (TableLayout) findViewById(R.id.TablaIntroduccionOtrosCuerpos);

		IntroduccionOtrosCuerposT.setVisibility(View.GONE);
		bOcultarIntroduccionOtrosCuerpos.setVisibility(View.GONE);
		TablaIntroduccionOtrosCuerpos.setVisibility(View.GONE);

		bVerIntroduccionOtrosCuerpos.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				IntroduccionOtrosCuerposT.setVisibility(View.VISIBLE);
				bOcultarIntroduccionOtrosCuerpos.setVisibility(View.VISIBLE);
				TablaIntroduccionOtrosCuerpos.setVisibility(View.VISIBLE);
			}
		});

		bOcultarIntroduccionOtrosCuerpos
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						IntroduccionOtrosCuerposT.setVisibility(View.GONE);
						TablaIntroduccionOtrosCuerpos.setVisibility(View.GONE);
						bOcultarIntroduccionOtrosCuerpos
								.setVisibility(View.GONE);
					}
				});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate5);
		a.reset();
		bVerIntroduccionOtrosCuerpos.clearAnimation();
		bVerIntroduccionOtrosCuerpos.startAnimation(a);

	}

}
