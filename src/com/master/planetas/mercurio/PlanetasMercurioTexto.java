package com.master.planetas.mercurio;

import com.master.Planetas;
import com.master.R;

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

public class PlanetasMercurioTexto extends Activity {

	private Button bVerMercurioTextoEstructura;
	private Button bOcultarMercurioTextoEstructura;
	private TextView MercurioTextoEstructura;

	private Button bVerMercurioTextoSuperficie;
	private Button bOcultarMercurioTextoSuperficie;
	private TextView Superficie1T;
	private TextView Superficie2T;
	private ImageView Superficie3I;
	private TextView Superficie4T;
	private TextView Superficie5T;
	private TextView Superficie6T;
	private TextView Superficie7T;
	private TextView Superficie8T;
	private ImageView Superficie9I;
	private TextView Superficie10T;

	private Button bVerMercurioTextoOrbitaRotacion;
	private Button bOcultarMercurioTextoOrbitaRotacion;
	private TextView OrbitaRotacion1T;
	private TextView OrbitaRotacion2T;
	private TextView OrbitaRotacion3T;
	private ImageView OrbitaRotacion4I;
	private TextView OrbitaRotacion5T;

	private Button bVerMercurioTextoObservacionEstudio;
	private Button bOcultarMercurioTextoObservacionEstudio;
	private TextView ObservacionEstudio1T;
	private TextView ObservacionEstudio2T;
	private TextView ObservacionEstudio3T;
	private ImageView ObservacionEstudio4I;
	private TextView ObservacionEstudio5T;
	private TextView ObservacionEstudio6T;
	private TextView ObservacionEstudio7T;
	private ImageView ObservacionEstudio8I;
	private TextView ObservacionEstudio9T;

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.planetas_mercurio_texto);

		// ESTRUCTURA
		bVerMercurioTextoEstructura = (Button) findViewById(R.id.VerMercurioTextoEstructura);
		MercurioTextoEstructura = (TextView) findViewById(R.id.MercurioTextoEstructura);
		bOcultarMercurioTextoEstructura = (Button) findViewById(R.id.OcultarMercurioTextoEstructura);

		MercurioTextoEstructura.setVisibility(View.GONE);
		bOcultarMercurioTextoEstructura.setVisibility(View.GONE);

		bVerMercurioTextoEstructura.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				MercurioTextoEstructura.setVisibility(View.VISIBLE);
				bOcultarMercurioTextoEstructura.setVisibility(View.VISIBLE);
			}
		});

		bOcultarMercurioTextoEstructura
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						MercurioTextoEstructura.setVisibility(View.GONE);
						bOcultarMercurioTextoEstructura
								.setVisibility(View.GONE);
					}
				});

		// Animation a = AnimationUtils.loadAnimation(this, R.anim.);
		Animation a = AnimationUtils.loadAnimation(this, R.anim.rotate1);
		a.reset();
		bVerMercurioTextoEstructura.clearAnimation();
		bVerMercurioTextoEstructura.startAnimation(a);

		// SUPERFICIE
		bVerMercurioTextoSuperficie = (Button) findViewById(R.id.VerMercurioTextoSuperficie);
		bOcultarMercurioTextoSuperficie = (Button) findViewById(R.id.OcultarMercurioTextoSuperficie);
		Superficie1T = (TextView) findViewById(R.id.Superficie1T);
		Superficie2T = (TextView) findViewById(R.id.Superficie2T);
		Superficie3I = (ImageView) findViewById(R.id.Superficie3I);
		Superficie4T = (TextView) findViewById(R.id.Superficie4T);
		Superficie5T = (TextView) findViewById(R.id.Superficie5T);
		Superficie6T = (TextView) findViewById(R.id.Superficie6T);
		Superficie7T = (TextView) findViewById(R.id.Superficie7T);
		Superficie8T = (TextView) findViewById(R.id.Superficie8T);
		Superficie9I = (ImageView) findViewById(R.id.Superficie9I);
		Superficie10T = (TextView) findViewById(R.id.Superficie10T);

		bOcultarMercurioTextoSuperficie.setVisibility(View.GONE);
		Superficie1T.setVisibility(View.GONE);
		Superficie2T.setVisibility(View.GONE);
		Superficie3I.setVisibility(View.GONE);
		Superficie4T.setVisibility(View.GONE);
		Superficie5T.setVisibility(View.GONE);
		Superficie6T.setVisibility(View.GONE);
		Superficie7T.setVisibility(View.GONE);
		Superficie8T.setVisibility(View.GONE);
		Superficie9I.setVisibility(View.GONE);
		Superficie10T.setVisibility(View.GONE);

		bVerMercurioTextoSuperficie.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				Superficie1T.setVisibility(View.VISIBLE);
				Superficie2T.setVisibility(View.VISIBLE);
				Superficie3I.setVisibility(View.VISIBLE);
				Superficie4T.setVisibility(View.VISIBLE);
				Superficie5T.setVisibility(View.VISIBLE);
				Superficie6T.setVisibility(View.VISIBLE);
				Superficie7T.setVisibility(View.VISIBLE);
				Superficie8T.setVisibility(View.VISIBLE);
				Superficie9I.setVisibility(View.VISIBLE);
				Superficie10T.setVisibility(View.VISIBLE);
				bOcultarMercurioTextoSuperficie.setVisibility(View.VISIBLE);
			}
		});

		bOcultarMercurioTextoSuperficie
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						bOcultarMercurioTextoSuperficie
								.setVisibility(View.GONE);
						Superficie1T.setVisibility(View.GONE);
						Superficie2T.setVisibility(View.GONE);
						Superficie3I.setVisibility(View.GONE);
						Superficie4T.setVisibility(View.GONE);
						Superficie5T.setVisibility(View.GONE);
						Superficie6T.setVisibility(View.GONE);
						Superficie7T.setVisibility(View.GONE);
						Superficie8T.setVisibility(View.GONE);
						Superficie9I.setVisibility(View.GONE);
						Superficie10T.setVisibility(View.GONE);
					}
				});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate2);
		a.reset();
		bVerMercurioTextoSuperficie.clearAnimation();
		bVerMercurioTextoSuperficie.startAnimation(a);

		// ORBITA ROTACION
		bVerMercurioTextoOrbitaRotacion = (Button) findViewById(R.id.VerMercurioTextoOrbitaRotacion);
		OrbitaRotacion1T = (TextView) findViewById(R.id.OrbitaRotacion1T);
		OrbitaRotacion2T = (TextView) findViewById(R.id.OrbitaRotacion2T);
		OrbitaRotacion3T = (TextView) findViewById(R.id.OrbitaRotacion3T);
		OrbitaRotacion4I = (ImageView) findViewById(R.id.OrbitaRotacion4I);
		OrbitaRotacion5T = (TextView) findViewById(R.id.OrbitaRotacion5T);
		bOcultarMercurioTextoOrbitaRotacion = (Button) findViewById(R.id.OcultarMercurioTextoOrbitaRotacion);

		OrbitaRotacion1T.setVisibility(View.GONE);
		OrbitaRotacion2T.setVisibility(View.GONE);
		OrbitaRotacion3T.setVisibility(View.GONE);
		OrbitaRotacion4I.setVisibility(View.GONE);
		OrbitaRotacion5T.setVisibility(View.GONE);
		bOcultarMercurioTextoOrbitaRotacion.setVisibility(View.GONE);

		bVerMercurioTextoOrbitaRotacion
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						OrbitaRotacion1T.setVisibility(View.VISIBLE);
						OrbitaRotacion2T.setVisibility(View.VISIBLE);
						OrbitaRotacion3T.setVisibility(View.VISIBLE);
						OrbitaRotacion4I.setVisibility(View.VISIBLE);
						OrbitaRotacion5T.setVisibility(View.VISIBLE);
						bOcultarMercurioTextoOrbitaRotacion
								.setVisibility(View.VISIBLE);
					}
				});

		bOcultarMercurioTextoOrbitaRotacion
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						OrbitaRotacion1T.setVisibility(View.GONE);
						OrbitaRotacion2T.setVisibility(View.GONE);
						OrbitaRotacion3T.setVisibility(View.GONE);
						OrbitaRotacion4I.setVisibility(View.GONE);
						OrbitaRotacion5T.setVisibility(View.GONE);
						bOcultarMercurioTextoOrbitaRotacion
								.setVisibility(View.GONE);
					}
				});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate3);
		a.reset();
		bVerMercurioTextoOrbitaRotacion.clearAnimation();
		bVerMercurioTextoOrbitaRotacion.startAnimation(a);

		// OBSERVACION ESTUDIO
		bVerMercurioTextoObservacionEstudio = (Button) findViewById(R.id.VerMercurioTextoObservacionEstudio);
		ObservacionEstudio1T = (TextView) findViewById(R.id.ObservacionEstudio1T);
		ObservacionEstudio2T = (TextView) findViewById(R.id.ObservacionEstudio2T);
		ObservacionEstudio3T = (TextView) findViewById(R.id.ObservacionEstudio3T);
		ObservacionEstudio4I = (ImageView) findViewById(R.id.ObservacionEstudio4I);
		ObservacionEstudio5T = (TextView) findViewById(R.id.ObservacionEstudio5T);
		ObservacionEstudio6T = (TextView) findViewById(R.id.ObservacionEstudio6T);
		ObservacionEstudio7T = (TextView) findViewById(R.id.ObservacionEstudio7T);
		ObservacionEstudio8I = (ImageView) findViewById(R.id.ObservacionEstudio8I);
		ObservacionEstudio9T = (TextView) findViewById(R.id.ObservacionEstudio9T);
		bOcultarMercurioTextoObservacionEstudio = (Button) findViewById(R.id.OcultarMercurioTextoObservacionEstudio);

		ObservacionEstudio1T.setVisibility(View.GONE);
		ObservacionEstudio2T.setVisibility(View.GONE);
		ObservacionEstudio3T.setVisibility(View.GONE);
		ObservacionEstudio4I.setVisibility(View.GONE);
		ObservacionEstudio5T.setVisibility(View.GONE);
		ObservacionEstudio6T.setVisibility(View.GONE);
		ObservacionEstudio7T.setVisibility(View.GONE);
		ObservacionEstudio8I.setVisibility(View.GONE);
		ObservacionEstudio9T.setVisibility(View.GONE);
		bOcultarMercurioTextoObservacionEstudio.setVisibility(View.GONE);

		bVerMercurioTextoObservacionEstudio
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						ObservacionEstudio1T.setVisibility(View.VISIBLE);
						ObservacionEstudio2T.setVisibility(View.VISIBLE);
						ObservacionEstudio3T.setVisibility(View.VISIBLE);
						ObservacionEstudio4I.setVisibility(View.VISIBLE);
						ObservacionEstudio5T.setVisibility(View.VISIBLE);
						ObservacionEstudio6T.setVisibility(View.VISIBLE);
						ObservacionEstudio7T.setVisibility(View.VISIBLE);
						ObservacionEstudio8I.setVisibility(View.VISIBLE);
						ObservacionEstudio9T.setVisibility(View.VISIBLE);
						bOcultarMercurioTextoObservacionEstudio
								.setVisibility(View.VISIBLE);
					}
				});

		bOcultarMercurioTextoObservacionEstudio
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						ObservacionEstudio1T.setVisibility(View.GONE);
						ObservacionEstudio2T.setVisibility(View.GONE);
						ObservacionEstudio3T.setVisibility(View.GONE);
						ObservacionEstudio4I.setVisibility(View.GONE);
						ObservacionEstudio5T.setVisibility(View.GONE);
						ObservacionEstudio6T.setVisibility(View.GONE);
						ObservacionEstudio7T.setVisibility(View.GONE);
						ObservacionEstudio8I.setVisibility(View.GONE);
						ObservacionEstudio9T.setVisibility(View.GONE);
						bOcultarMercurioTextoObservacionEstudio
								.setVisibility(View.GONE);
					}
				});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate4);
		a.reset();
		bVerMercurioTextoObservacionEstudio.clearAnimation();
		bVerMercurioTextoObservacionEstudio.startAnimation(a);

	}

	@Override
	public void onBackPressed() {
		Intent intent = new Intent(this, Planetas.class);
		startActivity(intent);
	}

}
