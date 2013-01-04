package com.master;

import com.master.planetas.jupiter.PlanetasJupiter;
import com.master.planetas.luna.PlanetasLuna;
import com.master.planetas.marte.PlanetasMarte;
import com.master.planetas.mercurio.PlanetasMercurio;
import com.master.planetas.neptuno.PlanetasNeptuno;
import com.master.planetas.saturno.PlanetasSaturno;
import com.master.planetas.tierra.PlanetasTierra;
import com.master.planetas.urano.PlanetasUrano;
import com.master.planetas.venus.PlanetasVenus;
import com.master.utilidades.Constantes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Planetas extends Activity {

	private Button bMercurio;
	private Button bVenus;
	private Button bTierra;
	private Button bLuna;
	private Button bMarte;
	private Button bJupiter;
	private Button bSaturno;
	private Button bUrano;
	private Button bNeptuno;

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.planetas);

		// Seleccionamos la pestaña de video como la inicial
		MyApp myApp = ((MyApp) getApplicationContext());
		myApp.setTabSeleccionado(Constantes.tabVideo);

		bMercurio = (Button) findViewById(R.id.Mercurio);
		bMercurio.setOnClickListener(new OnClickListener() {

			public void onClick(View view) {
				lanzarMercurio();
			}
		});

		bVenus = (Button) findViewById(R.id.Venus);
		bVenus.setOnClickListener(new OnClickListener() {

			public void onClick(View view) {
				lanzarVenus();
			}
		});

		bTierra = (Button) findViewById(R.id.Tierra);
		bTierra.setOnClickListener(new OnClickListener() {

			public void onClick(View view) {
				lanzarTierra();
			}
		});

		bLuna = (Button) findViewById(R.id.Luna);
		bLuna.setOnClickListener(new OnClickListener() {

			public void onClick(View view) {
				lanzarLuna();
			}
		});

		bMarte = (Button) findViewById(R.id.Marte);
		bMarte.setOnClickListener(new OnClickListener() {

			public void onClick(View view) {
				lanzarMarte();
			}
		});

		bJupiter = (Button) findViewById(R.id.Jupiter);
		bJupiter.setOnClickListener(new OnClickListener() {

			public void onClick(View view) {
				lanzarJupiter();
			}
		});

		bSaturno = (Button) findViewById(R.id.Saturno);
		bSaturno.setOnClickListener(new OnClickListener() {

			public void onClick(View view) {
				lanzarSaturno();
			}
		});

		bUrano = (Button) findViewById(R.id.Urano);
		bUrano.setOnClickListener(new OnClickListener() {

			public void onClick(View view) {
				lanzarUrano();
			}
		});

		bNeptuno = (Button) findViewById(R.id.Neptuno);
		bNeptuno.setOnClickListener(new OnClickListener() {

			public void onClick(View view) {
				lanzarNeptuno();
			}
		});

	}

	protected void lanzarMercurio() {
		Intent i = new Intent(this, PlanetasMercurio.class);
		startActivity(i);
	}

	protected void lanzarVenus() {
		Intent i = new Intent(this, PlanetasVenus.class);
		startActivity(i);
	}

	protected void lanzarTierra() {
		Intent i = new Intent(this, PlanetasTierra.class);
		startActivity(i);
	}

	protected void lanzarLuna() {
		Intent i = new Intent(this, PlanetasLuna.class);
		startActivity(i);
	}

	protected void lanzarMarte() {
		Intent i = new Intent(this, PlanetasMarte.class);
		startActivity(i);
	}

	protected void lanzarJupiter() {
		Intent i = new Intent(this, PlanetasJupiter.class);
		startActivity(i);
	}

	protected void lanzarSaturno() {
		Intent i = new Intent(this, PlanetasSaturno.class);
		startActivity(i);
	}

	protected void lanzarUrano() {
		Intent i = new Intent(this, PlanetasUrano.class);
		startActivity(i);
	}

	protected void lanzarNeptuno() {
		Intent i = new Intent(this, PlanetasNeptuno.class);
		startActivity(i);
	}

	@Override
	public void onBackPressed() {
		Intent intent = new Intent(this, SistemaSolarActivity.class);
		startActivity(intent);
	}

}
