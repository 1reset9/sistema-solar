package com.master.planetas.venus;

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

public class PlanetasVenusTexto extends Activity {

	private Button bVerVenusTextoEstructura;
	private Button bOcultarVenusTextoEstructura;
	private TextView VenusTextoEstructura;

	private Button bVerVenusTextoSuperficie;
	private Button bOcultarVenusTextoSuperficie;
	private TextView Superficie1T;
	private TextView Superficie2T;
	private ImageView Superficie3I;
	private TextView Superficie4C;
	private TextView Superficie5T;
	private TextView Superficie6T;
	private ImageView Superficie7I;
	private TextView Superficie8C;
	private TextView Superficie9T;

	private Button bVerVenusTextoOrbitaRotacion;
	private Button bOcultarVenusTextoOrbitaRotacion;
	private TextView OrbitaRotacion1T;
	private TextView OrbitaRotacion2T;
	private TextView OrbitaRotacion3T;

	private Button bVerVenusTextoObservacionEstudio;
	private Button bOcultarVenusTextoObservacionEstudio;
	private TextView ObservacionEstudio1T;
	private ImageView ObservacionEstudio2I;
	private TextView ObservacionEstudio3C;
	private TextView ObservacionEstudio4T;
	private TextView ObservacionEstudio5T;
	private ImageView ObservacionEstudio6I;
	private TextView ObservacionEstudio7C;
	private TextView ObservacionEstudio8T;
	private TextView ObservacionEstudio88T;
	private TextView ObservacionEstudio9T;
	private ImageView ObservacionEstudio10I;
	private TextView ObservacionEstudio11C;

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.planetas_venus_texto);

		// ESTRUCTURA
		bVerVenusTextoEstructura = (Button) findViewById(R.id.VerVenusTextoEstructura);
		VenusTextoEstructura = (TextView) findViewById(R.id.VenusTextoEstructura);
		bOcultarVenusTextoEstructura = (Button) findViewById(R.id.OcultarVenusTextoEstructura);

		VenusTextoEstructura.setVisibility(View.GONE);
		bOcultarVenusTextoEstructura.setVisibility(View.GONE);

		bVerVenusTextoEstructura.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				VenusTextoEstructura.setVisibility(View.VISIBLE);
				bOcultarVenusTextoEstructura.setVisibility(View.VISIBLE);
			}
		});

		bOcultarVenusTextoEstructura.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				VenusTextoEstructura.setVisibility(View.GONE);
				bOcultarVenusTextoEstructura.setVisibility(View.GONE);
			}
		});

		Animation a = AnimationUtils.loadAnimation(this, R.anim.rotate1);
		a.reset();
		bVerVenusTextoEstructura.clearAnimation();
		bVerVenusTextoEstructura.startAnimation(a);

		// SUPERFICIE
		bVerVenusTextoSuperficie = (Button) findViewById(R.id.VerVenusTextoSuperficie);
		bOcultarVenusTextoSuperficie = (Button) findViewById(R.id.OcultarVenusTextoSuperficie);
		Superficie1T = (TextView) findViewById(R.id.Superficie1T);
		Superficie2T = (TextView) findViewById(R.id.Superficie2T);
		Superficie3I = (ImageView) findViewById(R.id.Superficie3I);
		Superficie4C = (TextView) findViewById(R.id.Superficie4C);
		Superficie5T = (TextView) findViewById(R.id.Superficie5T);
		Superficie6T = (TextView) findViewById(R.id.Superficie6T);
		Superficie7I = (ImageView) findViewById(R.id.Superficie7I);
		Superficie8C = (TextView) findViewById(R.id.Superficie8C);
		Superficie9T = (TextView) findViewById(R.id.Superficie9T);

		bOcultarVenusTextoSuperficie.setVisibility(View.GONE);
		Superficie1T.setVisibility(View.GONE);
		Superficie2T.setVisibility(View.GONE);
		Superficie3I.setVisibility(View.GONE);
		Superficie4C.setVisibility(View.GONE);
		Superficie5T.setVisibility(View.GONE);
		Superficie6T.setVisibility(View.GONE);
		Superficie7I.setVisibility(View.GONE);
		Superficie8C.setVisibility(View.GONE);
		Superficie9T.setVisibility(View.GONE);

		bVerVenusTextoSuperficie.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				Superficie1T.setVisibility(View.VISIBLE);
				Superficie2T.setVisibility(View.VISIBLE);
				Superficie3I.setVisibility(View.VISIBLE);
				Superficie4C.setVisibility(View.VISIBLE);
				Superficie5T.setVisibility(View.VISIBLE);
				Superficie6T.setVisibility(View.VISIBLE);
				Superficie7I.setVisibility(View.VISIBLE);
				Superficie8C.setVisibility(View.VISIBLE);
				Superficie9T.setVisibility(View.VISIBLE);
				bOcultarVenusTextoSuperficie.setVisibility(View.VISIBLE);
			}
		});

		bOcultarVenusTextoSuperficie.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				Superficie1T.setVisibility(View.GONE);
				Superficie2T.setVisibility(View.GONE);
				Superficie3I.setVisibility(View.GONE);
				Superficie4C.setVisibility(View.GONE);
				Superficie5T.setVisibility(View.GONE);
				Superficie6T.setVisibility(View.GONE);
				Superficie7I.setVisibility(View.GONE);
				Superficie8C.setVisibility(View.GONE);
				Superficie9T.setVisibility(View.GONE);
				bOcultarVenusTextoSuperficie.setVisibility(View.GONE);
			}
		});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate2);
		a.reset();
		bVerVenusTextoSuperficie.clearAnimation();
		bVerVenusTextoSuperficie.startAnimation(a);

		// ORBITA ROTACION
		bVerVenusTextoOrbitaRotacion = (Button) findViewById(R.id.VerVenusTextoOrbitaRotacion);
		bOcultarVenusTextoOrbitaRotacion = (Button) findViewById(R.id.OcultarVenusTextoOrbitaRotacion);
		OrbitaRotacion1T = (TextView) findViewById(R.id.OrbitaRotacion1T);
		OrbitaRotacion2T = (TextView) findViewById(R.id.OrbitaRotacion2T);
		OrbitaRotacion3T = (TextView) findViewById(R.id.OrbitaRotacion3T);

		OrbitaRotacion1T.setVisibility(View.GONE);
		OrbitaRotacion2T.setVisibility(View.GONE);
		OrbitaRotacion3T.setVisibility(View.GONE);
		bOcultarVenusTextoOrbitaRotacion.setVisibility(View.GONE);

		bVerVenusTextoOrbitaRotacion.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				OrbitaRotacion1T.setVisibility(View.VISIBLE);
				OrbitaRotacion2T.setVisibility(View.VISIBLE);
				OrbitaRotacion3T.setVisibility(View.VISIBLE);
				bOcultarVenusTextoOrbitaRotacion.setVisibility(View.VISIBLE);
			}
		});

		bOcultarVenusTextoOrbitaRotacion
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						OrbitaRotacion1T.setVisibility(View.GONE);
						OrbitaRotacion2T.setVisibility(View.GONE);
						OrbitaRotacion3T.setVisibility(View.GONE);
						bOcultarVenusTextoOrbitaRotacion
								.setVisibility(View.GONE);
					}
				});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate3);
		a.reset();
		bVerVenusTextoOrbitaRotacion.clearAnimation();
		bVerVenusTextoOrbitaRotacion.startAnimation(a);

		// OBSERVACION ESTUDIO
		bVerVenusTextoObservacionEstudio = (Button) findViewById(R.id.VerVenusTextoObservacionEstudio);
		ObservacionEstudio1T = (TextView) findViewById(R.id.ObservacionEstudio1T);
		ObservacionEstudio2I = (ImageView) findViewById(R.id.ObservacionEstudio2I);
		ObservacionEstudio3C = (TextView) findViewById(R.id.ObservacionEstudio3C);
		ObservacionEstudio4T = (TextView) findViewById(R.id.ObservacionEstudio4T);
		ObservacionEstudio5T = (TextView) findViewById(R.id.ObservacionEstudio5T);
		ObservacionEstudio6I = (ImageView) findViewById(R.id.ObservacionEstudio6I);
		ObservacionEstudio7C = (TextView) findViewById(R.id.ObservacionEstudio7C);
		ObservacionEstudio8T = (TextView) findViewById(R.id.ObservacionEstudio8T);
		ObservacionEstudio88T = (TextView) findViewById(R.id.ObservacionEstudio88T);
		ObservacionEstudio9T = (TextView) findViewById(R.id.ObservacionEstudio9T);
		ObservacionEstudio10I = (ImageView) findViewById(R.id.ObservacionEstudio10I);
		ObservacionEstudio11C = (TextView) findViewById(R.id.ObservacionEstudio11C);
		bOcultarVenusTextoObservacionEstudio = (Button) findViewById(R.id.OcultarVenusTextoObservacionEstudio);

		ObservacionEstudio1T.setVisibility(View.GONE);
		ObservacionEstudio2I.setVisibility(View.GONE);
		ObservacionEstudio3C.setVisibility(View.GONE);
		ObservacionEstudio4T.setVisibility(View.GONE);
		ObservacionEstudio5T.setVisibility(View.GONE);
		ObservacionEstudio6I.setVisibility(View.GONE);
		ObservacionEstudio7C.setVisibility(View.GONE);
		ObservacionEstudio8T.setVisibility(View.GONE);
		ObservacionEstudio88T.setVisibility(View.GONE);
		ObservacionEstudio9T.setVisibility(View.GONE);
		ObservacionEstudio10I.setVisibility(View.GONE);
		ObservacionEstudio11C.setVisibility(View.GONE);
		bOcultarVenusTextoObservacionEstudio.setVisibility(View.GONE);

		bVerVenusTextoObservacionEstudio
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						ObservacionEstudio1T.setVisibility(View.VISIBLE);
						ObservacionEstudio2I.setVisibility(View.VISIBLE);
						ObservacionEstudio3C.setVisibility(View.VISIBLE);
						ObservacionEstudio4T.setVisibility(View.VISIBLE);
						ObservacionEstudio5T.setVisibility(View.VISIBLE);
						ObservacionEstudio6I.setVisibility(View.VISIBLE);
						ObservacionEstudio7C.setVisibility(View.VISIBLE);
						ObservacionEstudio8T.setVisibility(View.VISIBLE);
						ObservacionEstudio88T.setVisibility(View.VISIBLE);
						ObservacionEstudio9T.setVisibility(View.VISIBLE);
						ObservacionEstudio10I.setVisibility(View.VISIBLE);
						ObservacionEstudio11C.setVisibility(View.VISIBLE);
						bOcultarVenusTextoObservacionEstudio
								.setVisibility(View.VISIBLE);
					}
				});

		bOcultarVenusTextoObservacionEstudio
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						ObservacionEstudio1T.setVisibility(View.GONE);
						ObservacionEstudio2I.setVisibility(View.GONE);
						ObservacionEstudio3C.setVisibility(View.GONE);
						ObservacionEstudio4T.setVisibility(View.GONE);
						ObservacionEstudio5T.setVisibility(View.GONE);
						ObservacionEstudio6I.setVisibility(View.GONE);
						ObservacionEstudio7C.setVisibility(View.GONE);
						ObservacionEstudio8T.setVisibility(View.GONE);
						ObservacionEstudio88T.setVisibility(View.GONE);
						ObservacionEstudio9T.setVisibility(View.GONE);
						ObservacionEstudio10I.setVisibility(View.GONE);
						ObservacionEstudio11C.setVisibility(View.GONE);
						bOcultarVenusTextoObservacionEstudio
								.setVisibility(View.GONE);
					}
				});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate4);
		a.reset();
		bVerVenusTextoObservacionEstudio.clearAnimation();
		bVerVenusTextoObservacionEstudio.startAnimation(a);

	}

	@Override
	public void onBackPressed() {
		Intent intent = new Intent(this, Planetas.class);
		startActivity(intent);
	}

}
