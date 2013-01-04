package com.master.planetas.marte;

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

public class PlanetasMarteTexto extends Activity {

	private Button bVerMarteTextoEstructura;
	private Button bOcultarMarteTextoEstructura;
	private TextView MarteTextoEstructura1T;

	private Button bVerMarteTextoSuperficie;
	private Button bOcultarMarteTextoSuperficie;
	private TextView Superficie1T;
	private TextView Superficie2T;
	private ImageView Superficie3I;
	private TextView Superficie4C;
	private TextView Superficie5T;
	private TextView Superficie6T;
	private ImageView Superficie7I;
	private TextView Superficie8C;
	private TextView Superficie9T;
	private ImageView Superficie10I;
	private TextView Superficie11C;
	private TextView Superficie12T;

	private Button bVerMarteTextoOrbitaRotacion;
	private Button bOcultarMarteTextoOrbitaRotacion;
	private TextView OrbitaRotacion1T;
	private ImageView OrbitaRotacion2I;
	private TextView OrbitaRotacion3T;

	private Button bVerMarteTextoSatelitesNaturales;
	private Button bOcultarMarteTextoSatelitesNaturales;
	private TextView SatelitesNaturales1T;
	private ImageView SatelitesNaturales2I;
	private TextView SatelitesNaturales3C;
	private TextView SatelitesNaturales4T;
	private ImageView SatelitesNaturales5I;
	private TextView SatelitesNaturales6C;
	private TextView SatelitesNaturales7T;
	private ImageView SatelitesNaturales8I;
	private TextView SatelitesNaturales9C;

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.planetas_marte_texto);

		// ESTRUCTURA
		bVerMarteTextoEstructura = (Button) findViewById(R.id.VerMarteTextoEstructura);
		MarteTextoEstructura1T = (TextView) findViewById(R.id.MarteTextoEstructura1T);
		bOcultarMarteTextoEstructura = (Button) findViewById(R.id.OcultarMarteTextoEstructura);

		MarteTextoEstructura1T.setVisibility(View.GONE);
		bOcultarMarteTextoEstructura.setVisibility(View.GONE);

		bVerMarteTextoEstructura.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				MarteTextoEstructura1T.setVisibility(View.VISIBLE);
				bOcultarMarteTextoEstructura.setVisibility(View.VISIBLE);
			}
		});

		bOcultarMarteTextoEstructura.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				MarteTextoEstructura1T.setVisibility(View.GONE);
				bOcultarMarteTextoEstructura.setVisibility(View.GONE);
			}
		});

		Animation a = AnimationUtils.loadAnimation(this, R.anim.rotate1);
		a.reset();
		bVerMarteTextoEstructura.clearAnimation();
		bVerMarteTextoEstructura.startAnimation(a);

		// SUPERFICIE
		bVerMarteTextoSuperficie = (Button) findViewById(R.id.VerMarteTextoSuperficie);
		bOcultarMarteTextoSuperficie = (Button) findViewById(R.id.OcultarMarteTextoSuperficie);

		Superficie1T = (TextView) findViewById(R.id.Superficie1T);
		Superficie2T = (TextView) findViewById(R.id.Superficie2T);
		Superficie3I = (ImageView) findViewById(R.id.Superficie3I);
		Superficie4C = (TextView) findViewById(R.id.Superficie4C);
		Superficie5T = (TextView) findViewById(R.id.Superficie5T);
		Superficie6T = (TextView) findViewById(R.id.Superficie6T);
		Superficie7I = (ImageView) findViewById(R.id.Superficie7I);
		Superficie8C = (TextView) findViewById(R.id.Superficie8C);
		Superficie9T = (TextView) findViewById(R.id.Superficie9T);
		Superficie10I = (ImageView) findViewById(R.id.Superficie10I);
		Superficie11C = (TextView) findViewById(R.id.Superficie11C);
		Superficie12T = (TextView) findViewById(R.id.Superficie12T);

		bOcultarMarteTextoSuperficie.setVisibility(View.GONE);
		Superficie1T.setVisibility(View.GONE);
		Superficie2T.setVisibility(View.GONE);
		Superficie3I.setVisibility(View.GONE);
		Superficie4C.setVisibility(View.GONE);
		Superficie5T.setVisibility(View.GONE);
		Superficie6T.setVisibility(View.GONE);
		Superficie7I.setVisibility(View.GONE);
		Superficie8C.setVisibility(View.GONE);
		Superficie9T.setVisibility(View.GONE);
		Superficie10I.setVisibility(View.GONE);
		Superficie11C.setVisibility(View.GONE);
		Superficie12T.setVisibility(View.GONE);

		bVerMarteTextoSuperficie.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				bOcultarMarteTextoSuperficie.setVisibility(View.VISIBLE);
				Superficie1T.setVisibility(View.VISIBLE);
				Superficie2T.setVisibility(View.VISIBLE);
				Superficie3I.setVisibility(View.VISIBLE);
				Superficie4C.setVisibility(View.VISIBLE);
				Superficie5T.setVisibility(View.VISIBLE);
				Superficie6T.setVisibility(View.VISIBLE);
				Superficie7I.setVisibility(View.VISIBLE);
				Superficie8C.setVisibility(View.VISIBLE);
				Superficie9T.setVisibility(View.VISIBLE);
				Superficie10I.setVisibility(View.VISIBLE);
				Superficie11C.setVisibility(View.VISIBLE);
				Superficie12T.setVisibility(View.VISIBLE);
			}
		});

		bOcultarMarteTextoSuperficie.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				bOcultarMarteTextoSuperficie.setVisibility(View.GONE);
				Superficie1T.setVisibility(View.GONE);
				Superficie2T.setVisibility(View.GONE);
				Superficie3I.setVisibility(View.GONE);
				Superficie4C.setVisibility(View.GONE);
				Superficie5T.setVisibility(View.GONE);
				Superficie6T.setVisibility(View.GONE);
				Superficie7I.setVisibility(View.GONE);
				Superficie8C.setVisibility(View.GONE);
				Superficie9T.setVisibility(View.GONE);
				Superficie10I.setVisibility(View.GONE);
				Superficie11C.setVisibility(View.GONE);
				Superficie12T.setVisibility(View.GONE);
			}
		});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate2);
		a.reset();
		bVerMarteTextoSuperficie.clearAnimation();
		bVerMarteTextoSuperficie.startAnimation(a);

		// ORBITA ROTACION
		bVerMarteTextoOrbitaRotacion = (Button) findViewById(R.id.VerMarteTextoOrbitaRotacion);
		bOcultarMarteTextoOrbitaRotacion = (Button) findViewById(R.id.OcultarMarteTextoOrbitaRotacion);

		OrbitaRotacion1T = (TextView) findViewById(R.id.OrbitaRotacion1T);
		OrbitaRotacion2I = (ImageView) findViewById(R.id.OrbitaRotacion2I);
		OrbitaRotacion3T = (TextView) findViewById(R.id.OrbitaRotacion3T);

		OrbitaRotacion1T.setVisibility(View.GONE);
		OrbitaRotacion2I.setVisibility(View.GONE);
		OrbitaRotacion3T.setVisibility(View.GONE);
		bOcultarMarteTextoOrbitaRotacion.setVisibility(View.GONE);

		bVerMarteTextoOrbitaRotacion.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				OrbitaRotacion1T.setVisibility(View.VISIBLE);
				OrbitaRotacion2I.setVisibility(View.VISIBLE);
				OrbitaRotacion3T.setVisibility(View.VISIBLE);
				bOcultarMarteTextoOrbitaRotacion.setVisibility(View.VISIBLE);
			}
		});

		bOcultarMarteTextoOrbitaRotacion
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						OrbitaRotacion1T.setVisibility(View.GONE);
						OrbitaRotacion2I.setVisibility(View.GONE);
						OrbitaRotacion3T.setVisibility(View.GONE);
						bOcultarMarteTextoOrbitaRotacion
								.setVisibility(View.GONE);
					}
				});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate3);
		a.reset();
		bVerMarteTextoOrbitaRotacion.clearAnimation();
		bVerMarteTextoOrbitaRotacion.startAnimation(a);

		// SATÉLITES NATURALES
		bVerMarteTextoSatelitesNaturales = (Button) findViewById(R.id.VerMarteTextoSatelitesNaturales);
		bOcultarMarteTextoSatelitesNaturales = (Button) findViewById(R.id.OcultarMarteTextoSatelitesNaturales);

		SatelitesNaturales1T = (TextView) findViewById(R.id.SatelitesNaturales1T);
		SatelitesNaturales2I = (ImageView) findViewById(R.id.SatelitesNaturales2I);
		SatelitesNaturales3C = (TextView) findViewById(R.id.SatelitesNaturales3C);
		SatelitesNaturales4T = (TextView) findViewById(R.id.SatelitesNaturales4T);
		SatelitesNaturales5I = (ImageView) findViewById(R.id.SatelitesNaturales5I);
		SatelitesNaturales6C = (TextView) findViewById(R.id.SatelitesNaturales6C);
		SatelitesNaturales7T = (TextView) findViewById(R.id.SatelitesNaturales7T);
		SatelitesNaturales8I = (ImageView) findViewById(R.id.SatelitesNaturales8I);
		SatelitesNaturales9C = (TextView) findViewById(R.id.SatelitesNaturales9C);

		SatelitesNaturales1T.setVisibility(View.GONE);
		SatelitesNaturales2I.setVisibility(View.GONE);
		SatelitesNaturales3C.setVisibility(View.GONE);
		SatelitesNaturales4T.setVisibility(View.GONE);
		SatelitesNaturales5I.setVisibility(View.GONE);
		SatelitesNaturales6C.setVisibility(View.GONE);
		SatelitesNaturales7T.setVisibility(View.GONE);
		SatelitesNaturales8I.setVisibility(View.GONE);
		SatelitesNaturales9C.setVisibility(View.GONE);
		bOcultarMarteTextoSatelitesNaturales.setVisibility(View.GONE);

		bVerMarteTextoSatelitesNaturales
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						SatelitesNaturales1T.setVisibility(View.VISIBLE);
						SatelitesNaturales2I.setVisibility(View.VISIBLE);
						SatelitesNaturales3C.setVisibility(View.VISIBLE);
						SatelitesNaturales4T.setVisibility(View.VISIBLE);
						SatelitesNaturales5I.setVisibility(View.VISIBLE);
						SatelitesNaturales6C.setVisibility(View.VISIBLE);
						SatelitesNaturales7T.setVisibility(View.VISIBLE);
						SatelitesNaturales8I.setVisibility(View.VISIBLE);
						SatelitesNaturales9C.setVisibility(View.VISIBLE);
						bOcultarMarteTextoSatelitesNaturales
								.setVisibility(View.VISIBLE);
					}
				});

		bOcultarMarteTextoSatelitesNaturales
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						SatelitesNaturales1T.setVisibility(View.GONE);
						SatelitesNaturales2I.setVisibility(View.GONE);
						SatelitesNaturales3C.setVisibility(View.GONE);
						SatelitesNaturales4T.setVisibility(View.GONE);
						SatelitesNaturales5I.setVisibility(View.GONE);
						SatelitesNaturales6C.setVisibility(View.GONE);
						SatelitesNaturales7T.setVisibility(View.GONE);
						SatelitesNaturales8I.setVisibility(View.GONE);
						SatelitesNaturales9C.setVisibility(View.GONE);
						bOcultarMarteTextoSatelitesNaturales
								.setVisibility(View.GONE);
					}
				});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate4);
		a.reset();
		bVerMarteTextoSatelitesNaturales.clearAnimation();
		bVerMarteTextoSatelitesNaturales.startAnimation(a);

	}

	@Override
	public void onBackPressed() {
		Intent intent = new Intent(this, Planetas.class);
		startActivity(intent);
	}

}