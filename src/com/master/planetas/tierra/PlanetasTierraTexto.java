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
import android.widget.TableLayout;
import android.widget.TextView;

import com.master.Planetas;
import com.master.R;

public class PlanetasTierraTexto extends Activity {

	private Button bVerTierraTextoEstructura;
	private Button bOcultarTierraTextoEstructura;
	private TextView TierraTextoEstructura1T;
	private ImageView TierraTextoEstructura2I;
	private TextView TierraTextoEstructura4T;
	private TableLayout TierraTextoEstructura5;
	private TextView TierraTextoEstructura6T;
	private TextView TierraTextoEstructura7T;
	private ImageView TierraTextoEstructura8I;

	private Button bVerTierraTextoSuperficie;
	private Button bOcultarTierraTextoSuperficie;
	private TextView Superficie1T;
	private ImageView Superficie2I;
	private TextView Superficie3C;
	private TextView Superficie4T;
	private TextView Superficie5T;
	private ImageView Superficie6I;
	private TextView Superficie7C;
	private TextView Superficie8T;
	private TextView Superficie9T;

	private Button bVerTierraTextoOrbitaRotacion;
	private Button bOcultarTierraTextoOrbitaRotacion;
	private TextView OrbitaRotacion1T;
	private TextView OrbitaRotacion2T;
	private ImageView OrbitaRotacion3I;
	private TextView OrbitaRotacion4C;
	private TextView OrbitaRotacion5T;
	private ImageView OrbitaRotacion6I;
	private TextView OrbitaRotacion7C;
	private TextView OrbitaRotacion8T;
	private TextView OrbitaRotacion9T;

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.planetas_tierra_texto);

		// ESTRUCTURA
		bVerTierraTextoEstructura = (Button) findViewById(R.id.VerTierraTextoEstructura);
		TierraTextoEstructura1T = (TextView) findViewById(R.id.TierraTextoEstructura1T);
		TierraTextoEstructura2I = (ImageView) findViewById(R.id.TierraTextoEstructura2I);
		TierraTextoEstructura4T = (TextView) findViewById(R.id.TierraTextoEstructura4T);
		TierraTextoEstructura5 = (TableLayout) findViewById(R.id.TierraTextoEstructura5);
		TierraTextoEstructura6T = (TextView) findViewById(R.id.TierraTextoEstructura6T);
		TierraTextoEstructura7T = (TextView) findViewById(R.id.TierraTextoEstructura7T);
		TierraTextoEstructura8I = (ImageView) findViewById(R.id.TierraTextoEstructura8I);
		bOcultarTierraTextoEstructura = (Button) findViewById(R.id.OcultarTierraTextoEstructura);

		TierraTextoEstructura1T.setVisibility(View.GONE);
		TierraTextoEstructura2I.setVisibility(View.GONE);
		TierraTextoEstructura4T.setVisibility(View.GONE);
		TierraTextoEstructura5.setVisibility(View.GONE);
		TierraTextoEstructura6T.setVisibility(View.GONE);
		TierraTextoEstructura7T.setVisibility(View.GONE);
		TierraTextoEstructura8I.setVisibility(View.GONE);
		bOcultarTierraTextoEstructura.setVisibility(View.GONE);

		bVerTierraTextoEstructura.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				TierraTextoEstructura1T.setVisibility(View.VISIBLE);
				TierraTextoEstructura2I.setVisibility(View.VISIBLE);
				TierraTextoEstructura4T.setVisibility(View.VISIBLE);
				TierraTextoEstructura5.setVisibility(View.VISIBLE);
				TierraTextoEstructura6T.setVisibility(View.VISIBLE);
				TierraTextoEstructura7T.setVisibility(View.VISIBLE);
				TierraTextoEstructura8I.setVisibility(View.VISIBLE);
				bOcultarTierraTextoEstructura.setVisibility(View.VISIBLE);
			}
		});

		bOcultarTierraTextoEstructura.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				TierraTextoEstructura1T.setVisibility(View.GONE);
				TierraTextoEstructura2I.setVisibility(View.GONE);
				TierraTextoEstructura4T.setVisibility(View.GONE);
				TierraTextoEstructura5.setVisibility(View.GONE);
				TierraTextoEstructura6T.setVisibility(View.GONE);
				TierraTextoEstructura7T.setVisibility(View.GONE);
				TierraTextoEstructura8I.setVisibility(View.GONE);
				bOcultarTierraTextoEstructura.setVisibility(View.GONE);
			}
		});

		Animation a = AnimationUtils.loadAnimation(this, R.anim.rotate1);
		a.reset();
		bVerTierraTextoEstructura.clearAnimation();
		bVerTierraTextoEstructura.startAnimation(a);

		// SUPERFICIE
		bVerTierraTextoSuperficie = (Button) findViewById(R.id.VerTierraTextoSuperficie);
		bOcultarTierraTextoSuperficie = (Button) findViewById(R.id.OcultarTierraTextoSuperficie);

		Superficie1T = (TextView) findViewById(R.id.Superficie1T);
		Superficie2I = (ImageView) findViewById(R.id.Superficie2I);
		Superficie3C = (TextView) findViewById(R.id.Superficie3C);
		Superficie4T = (TextView) findViewById(R.id.Superficie4T);
		Superficie5T = (TextView) findViewById(R.id.Superficie5T);
		Superficie6I = (ImageView) findViewById(R.id.Superficie6I);
		Superficie7C = (TextView) findViewById(R.id.Superficie7C);
		Superficie8T = (TextView) findViewById(R.id.Superficie8T);
		Superficie9T = (TextView) findViewById(R.id.Superficie9T);

		bOcultarTierraTextoSuperficie.setVisibility(View.GONE);
		Superficie1T.setVisibility(View.GONE);
		Superficie2I.setVisibility(View.GONE);
		Superficie3C.setVisibility(View.GONE);
		Superficie4T.setVisibility(View.GONE);
		Superficie5T.setVisibility(View.GONE);
		Superficie6I.setVisibility(View.GONE);
		Superficie7C.setVisibility(View.GONE);
		Superficie8T.setVisibility(View.GONE);
		Superficie9T.setVisibility(View.GONE);

		bVerTierraTextoSuperficie.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				bOcultarTierraTextoSuperficie.setVisibility(View.VISIBLE);
				Superficie1T.setVisibility(View.VISIBLE);
				Superficie2I.setVisibility(View.VISIBLE);
				Superficie3C.setVisibility(View.VISIBLE);
				Superficie4T.setVisibility(View.VISIBLE);
				Superficie5T.setVisibility(View.VISIBLE);
				Superficie6I.setVisibility(View.VISIBLE);
				Superficie7C.setVisibility(View.VISIBLE);
				Superficie8T.setVisibility(View.VISIBLE);
				Superficie9T.setVisibility(View.VISIBLE);
			}
		});

		bOcultarTierraTextoSuperficie.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				bOcultarTierraTextoSuperficie.setVisibility(View.GONE);
				Superficie1T.setVisibility(View.GONE);
				Superficie2I.setVisibility(View.GONE);
				Superficie3C.setVisibility(View.GONE);
				Superficie4T.setVisibility(View.GONE);
				Superficie5T.setVisibility(View.GONE);
				Superficie6I.setVisibility(View.GONE);
				Superficie7C.setVisibility(View.GONE);
				Superficie8T.setVisibility(View.GONE);
				Superficie9T.setVisibility(View.GONE);
			}
		});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate2);
		a.reset();
		bVerTierraTextoSuperficie.clearAnimation();
		bVerTierraTextoSuperficie.startAnimation(a);

		// ORBITA ROTACION
		bVerTierraTextoOrbitaRotacion = (Button) findViewById(R.id.VerTierraTextoOrbitaRotacion);
		bOcultarTierraTextoOrbitaRotacion = (Button) findViewById(R.id.OcultarTierraTextoOrbitaRotacion);

		OrbitaRotacion1T = (TextView) findViewById(R.id.OrbitaRotacion1T);
		OrbitaRotacion2T = (TextView) findViewById(R.id.OrbitaRotacion2T);
		OrbitaRotacion3I = (ImageView) findViewById(R.id.OrbitaRotacion3I);
		OrbitaRotacion4C = (TextView) findViewById(R.id.OrbitaRotacion4C);
		OrbitaRotacion5T = (TextView) findViewById(R.id.OrbitaRotacion5T);
		OrbitaRotacion6I = (ImageView) findViewById(R.id.OrbitaRotacion6I);
		OrbitaRotacion7C = (TextView) findViewById(R.id.OrbitaRotacion7C);
		OrbitaRotacion8T = (TextView) findViewById(R.id.OrbitaRotacion8T);
		OrbitaRotacion9T = (TextView) findViewById(R.id.OrbitaRotacion9T);

		OrbitaRotacion1T.setVisibility(View.GONE);
		OrbitaRotacion2T.setVisibility(View.GONE);
		OrbitaRotacion3I.setVisibility(View.GONE);
		OrbitaRotacion4C.setVisibility(View.GONE);
		OrbitaRotacion5T.setVisibility(View.GONE);
		OrbitaRotacion6I.setVisibility(View.GONE);
		OrbitaRotacion7C.setVisibility(View.GONE);
		OrbitaRotacion8T.setVisibility(View.GONE);
		OrbitaRotacion9T.setVisibility(View.GONE);
		bOcultarTierraTextoOrbitaRotacion.setVisibility(View.GONE);

		bVerTierraTextoOrbitaRotacion.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				OrbitaRotacion1T.setVisibility(View.VISIBLE);
				OrbitaRotacion2T.setVisibility(View.VISIBLE);
				OrbitaRotacion3I.setVisibility(View.VISIBLE);
				OrbitaRotacion4C.setVisibility(View.VISIBLE);
				OrbitaRotacion5T.setVisibility(View.VISIBLE);
				OrbitaRotacion6I.setVisibility(View.VISIBLE);
				OrbitaRotacion7C.setVisibility(View.VISIBLE);
				OrbitaRotacion8T.setVisibility(View.VISIBLE);
				OrbitaRotacion9T.setVisibility(View.VISIBLE);
				bOcultarTierraTextoOrbitaRotacion.setVisibility(View.VISIBLE);
			}
		});

		bOcultarTierraTextoOrbitaRotacion
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						OrbitaRotacion1T.setVisibility(View.GONE);
						OrbitaRotacion2T.setVisibility(View.GONE);
						OrbitaRotacion3I.setVisibility(View.GONE);
						OrbitaRotacion4C.setVisibility(View.GONE);
						OrbitaRotacion5T.setVisibility(View.GONE);
						OrbitaRotacion6I.setVisibility(View.GONE);
						OrbitaRotacion7C.setVisibility(View.GONE);
						OrbitaRotacion8T.setVisibility(View.GONE);
						OrbitaRotacion9T.setVisibility(View.GONE);
						bOcultarTierraTextoOrbitaRotacion
								.setVisibility(View.GONE);
					}
				});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate3);
		a.reset();
		bVerTierraTextoOrbitaRotacion.clearAnimation();
		bVerTierraTextoOrbitaRotacion.startAnimation(a);

	}

	@Override
	public void onBackPressed() {
		Intent intent = new Intent(this, Planetas.class);
		startActivity(intent);
	}

}
