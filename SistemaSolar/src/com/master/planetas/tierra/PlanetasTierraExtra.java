package com.master.planetas.tierra;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.master.Planetas;
import com.master.R;

public class PlanetasTierraExtra extends Activity {

	private Button bVerTierraExtraTextoAuroras;
	private Button bOcultarTierraExtraTextoAuroras;
	private TextView TierraExtraTextoAurorasT;
	private ImageView TierraExtraTextoAuroras2I;

	private Button bVerTierraExtraTextoFormacion;
	private Button bOcultarTierraExtraTextoFormacion;
	private TextView Formacion1T;
	private TextView Formacion2T;
	private ImageView Formacion3I;
	private TextView Formacion4C;
	private TextView Formacion5T;
	private TextView Formacion6T;
	private ImageView Formacion7I;
	private TextView Formacion8T;
	private TextView Formacion9T;
	private ImageView Formacion10I;
	private TextView Formacion11C;

	private Button bVerTierraTextoExtraFormasColores;
	private Button bOcultarTierraTextoExtraFormasColores;
	private TextView TierraTextoExtraFormasColores1T;
	private TextView TierraTextoExtraFormasColores2T;
	private ImageView TierraTextoExtraFormasColores3I;

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.planetas_tierra_extra);

		// AURORAS
		bVerTierraExtraTextoAuroras = (Button) findViewById(R.id.VerTierraExtraTextoAuroras);
		TierraExtraTextoAurorasT = (TextView) findViewById(R.id.TierraExtraTextoAurorasT);
		TierraExtraTextoAuroras2I = (ImageView) findViewById(R.id.TierraExtraTextoAuroras2I);
		bOcultarTierraExtraTextoAuroras = (Button) findViewById(R.id.OcultarTierraExtraTextoAuroras);

		TierraExtraTextoAurorasT.setVisibility(View.GONE);
		TierraExtraTextoAuroras2I.setVisibility(View.GONE);
		bOcultarTierraExtraTextoAuroras.setVisibility(View.GONE);

		bVerTierraExtraTextoAuroras.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				TierraExtraTextoAurorasT.setVisibility(View.VISIBLE);
				TierraExtraTextoAuroras2I.setVisibility(View.VISIBLE);
				bOcultarTierraExtraTextoAuroras.setVisibility(View.VISIBLE);
			}
		});

		bOcultarTierraExtraTextoAuroras
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						TierraExtraTextoAurorasT.setVisibility(View.GONE);
						TierraExtraTextoAuroras2I.setVisibility(View.GONE);
						bOcultarTierraExtraTextoAuroras
								.setVisibility(View.GONE);
					}
				});

		Animation a = AnimationUtils.loadAnimation(this, R.anim.rotate1);
		a.reset();
		bVerTierraExtraTextoAuroras.clearAnimation();
		bVerTierraExtraTextoAuroras.startAnimation(a);

		// FORMACION
		bVerTierraExtraTextoFormacion = (Button) findViewById(R.id.VerTierraExtraTextoFormacion);
		bOcultarTierraExtraTextoFormacion = (Button) findViewById(R.id.OcultarTierraExtraTextoFormacion);

		Formacion1T = (TextView) findViewById(R.id.Formacion1T);
		Formacion2T = (TextView) findViewById(R.id.Formacion2T);
		Formacion3I = (ImageView) findViewById(R.id.Formacion3I);
		Formacion4C = (TextView) findViewById(R.id.Formacion4C);
		Formacion5T = (TextView) findViewById(R.id.Formacion5T);
		Formacion6T = (TextView) findViewById(R.id.Formacion6T);
		Formacion7I = (ImageView) findViewById(R.id.Formacion7I);
		Formacion8T = (TextView) findViewById(R.id.Formacion8T);
		Formacion9T = (TextView) findViewById(R.id.Formacion9T);
		Formacion10I = (ImageView) findViewById(R.id.Formacion10I);
		Formacion11C = (TextView) findViewById(R.id.Formacion11C);

		bOcultarTierraExtraTextoFormacion.setVisibility(View.GONE);
		Formacion1T.setVisibility(View.GONE);
		Formacion2T.setVisibility(View.GONE);
		Formacion3I.setVisibility(View.GONE);
		Formacion4C.setVisibility(View.GONE);
		Formacion5T.setVisibility(View.GONE);
		Formacion6T.setVisibility(View.GONE);
		Formacion7I.setVisibility(View.GONE);
		Formacion8T.setVisibility(View.GONE);
		Formacion9T.setVisibility(View.GONE);
		Formacion10I.setVisibility(View.GONE);
		Formacion11C.setVisibility(View.GONE);

		bVerTierraExtraTextoFormacion.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				bOcultarTierraExtraTextoFormacion.setVisibility(View.VISIBLE);
				Formacion1T.setVisibility(View.VISIBLE);
				Formacion2T.setVisibility(View.VISIBLE);
				Formacion3I.setVisibility(View.VISIBLE);
				Formacion4C.setVisibility(View.VISIBLE);
				Formacion5T.setVisibility(View.VISIBLE);
				Formacion6T.setVisibility(View.VISIBLE);
				Formacion7I.setVisibility(View.VISIBLE);
				Formacion8T.setVisibility(View.VISIBLE);
				Formacion9T.setVisibility(View.VISIBLE);
				Formacion10I.setVisibility(View.VISIBLE);
				Formacion11C.setVisibility(View.VISIBLE);
			}
		});

		bOcultarTierraExtraTextoFormacion
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						bOcultarTierraExtraTextoFormacion
								.setVisibility(View.GONE);
						Formacion1T.setVisibility(View.GONE);
						Formacion2T.setVisibility(View.GONE);
						Formacion3I.setVisibility(View.GONE);
						Formacion4C.setVisibility(View.GONE);
						Formacion5T.setVisibility(View.GONE);
						Formacion6T.setVisibility(View.GONE);
						Formacion7I.setVisibility(View.GONE);
						Formacion8T.setVisibility(View.GONE);
						Formacion9T.setVisibility(View.GONE);
						Formacion10I.setVisibility(View.GONE);
						Formacion11C.setVisibility(View.GONE);
					}
				});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate2);
		a.reset();
		bVerTierraExtraTextoFormacion.clearAnimation();
		bVerTierraExtraTextoFormacion.startAnimation(a);

		// FORMAS COLORES
		bVerTierraTextoExtraFormasColores = (Button) findViewById(R.id.VerTierraTextoExtraFormasColores);
		bOcultarTierraTextoExtraFormasColores = (Button) findViewById(R.id.OcultarTierraTextoExtraFormasColores);

		TierraTextoExtraFormasColores1T = (TextView) findViewById(R.id.TierraTextoExtraFormasColores1T);
		TierraTextoExtraFormasColores2T = (TextView) findViewById(R.id.TierraTextoExtraFormasColores2T);
		TierraTextoExtraFormasColores3I = (ImageView) findViewById(R.id.TierraTextoExtraFormasColores3I);

		bOcultarTierraTextoExtraFormasColores.setVisibility(View.GONE);
		TierraTextoExtraFormasColores1T.setVisibility(View.GONE);
		TierraTextoExtraFormasColores2T.setVisibility(View.GONE);
		TierraTextoExtraFormasColores3I.setVisibility(View.GONE);

		bVerTierraTextoExtraFormasColores
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						bOcultarTierraTextoExtraFormasColores
								.setVisibility(View.VISIBLE);
						TierraTextoExtraFormasColores1T
								.setVisibility(View.VISIBLE);
						TierraTextoExtraFormasColores2T
								.setVisibility(View.VISIBLE);
						TierraTextoExtraFormasColores3I
								.setVisibility(View.VISIBLE);
					}
				});

		bOcultarTierraTextoExtraFormasColores
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						bOcultarTierraTextoExtraFormasColores
								.setVisibility(View.GONE);
						TierraTextoExtraFormasColores1T
								.setVisibility(View.GONE);
						TierraTextoExtraFormasColores2T
								.setVisibility(View.GONE);
						TierraTextoExtraFormasColores3I
								.setVisibility(View.GONE);
					}
				});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate3);
		a.reset();
		bVerTierraTextoExtraFormasColores.clearAnimation();
		bVerTierraTextoExtraFormasColores.startAnimation(a);

	}

	@Override
	public void onBackPressed() {
		Intent intent = new Intent(this, Planetas.class);
		startActivity(intent);
	}

}