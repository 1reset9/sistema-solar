package com.master;

import com.master.sistemaSolar.SistemaSolarAsteroides;
import com.master.sistemaSolar.SistemaSolarCompararPlanetas;
import com.master.sistemaSolar.SistemaSolarFormacion;
import com.master.sistemaSolar.SistemaSolarIntroduccion;
import com.master.sistemaSolar.SistemaSolarPlanetasEnanos;
import com.master.sistemaSolar.sol.SistemaSolarSol;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SistemaSolar extends Activity {

	private Button bIntroduccion;
	private Button bFormacion;
	private Button bSol;
	private Button bAsteroides;
	private Button bPlanetasEnanos;
	private Button bComparacionPlanetas;

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.sistema_solar);

		bIntroduccion = (Button) findViewById(R.id.Introduccion);
		bIntroduccion.setOnClickListener(new OnClickListener() {

			public void onClick(View view) {
				lanzarIntroduccion();
			}
		});

		bFormacion = (Button) findViewById(R.id.Formacion);
		bFormacion.setOnClickListener(new OnClickListener() {

			public void onClick(View view) {
				lanzarFormacion();
			}
		});

		bSol = (Button) findViewById(R.id.Sol);
		bSol.setOnClickListener(new OnClickListener() {

			public void onClick(View view) {
				lanzarSol();
			}
		});

		bAsteroides = (Button) findViewById(R.id.Asteroides);
		bAsteroides.setOnClickListener(new OnClickListener() {

			public void onClick(View view) {
				lanzarAsteroides();
			}
		});

		bPlanetasEnanos = (Button) findViewById(R.id.PlanetasEnanos);
		bPlanetasEnanos.setOnClickListener(new OnClickListener() {

			public void onClick(View view) {
				lanzarPlanetasEnanos();
			}
		});

		bComparacionPlanetas = (Button) findViewById(R.id.ComparacionPlanetas);
		bComparacionPlanetas.setOnClickListener(new OnClickListener() {

			public void onClick(View view) {
				lanzarComparacionPlanetas();
			}
		});

	}

	protected void lanzarIntroduccion() {
		Intent i = new Intent(this, SistemaSolarIntroduccion.class);
		startActivity(i);
	}

	protected void lanzarFormacion() {
		Intent i = new Intent(this, SistemaSolarFormacion.class);
		startActivity(i);
	}

	protected void lanzarSol() {
		Intent i = new Intent(this, SistemaSolarSol.class);
		startActivity(i);
	}

	protected void lanzarAsteroides() {
		Intent i = new Intent(this, SistemaSolarAsteroides.class);
		startActivity(i);
	}

	protected void lanzarPlanetasEnanos() {
		Intent i = new Intent(this, SistemaSolarPlanetasEnanos.class);
		startActivity(i);
	}

	protected void lanzarComparacionPlanetas() {
		Intent i = new Intent(this, SistemaSolarCompararPlanetas.class);
		startActivity(i);
	}

	@Override
	public void onBackPressed() {
		Intent intent = new Intent().setClass(getBaseContext(),
				SistemaSolarActivity.class);
		startActivity(intent);
		return;
	}

}
