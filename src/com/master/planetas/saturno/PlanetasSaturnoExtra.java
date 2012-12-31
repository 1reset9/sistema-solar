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
import android.widget.TextView;

import com.master.Planetas;
import com.master.R;

public class PlanetasSaturnoExtra extends Activity {

	private Button bVerSaturnoExtraTextoAnillos;
	private Button bOcultarSaturnoExtraTextoAnillos;
	private TextView SaturnoExtraTextoAnillos1T;
	private TextView SaturnoExtraTextoAnillos2T;
	private ImageView SaturnoExtraTextoAnillos3I;
	private TextView SaturnoExtraTextoAnillos4C;

	private Button bVerSaturnoExtraTextoDistribucion;
	private Button bOcultarSaturnoExtraTextoDistribucion;
	private TextView SaturnoExtraTextoDistribucion1T;
	private ImageView SaturnoExtraTextoDistribucion2I;
	private TextView SaturnoExtraTextoDistribucion3C;
	private TextView SaturnoExtraTextoDistribucion4T;
	private ImageView SaturnoExtraTextoDistribucion5I;
	private TextView SaturnoExtraTextoDistribucion6C;

	private Button bVerSaturnoExtraTextoComposicion;
	private Button bOcultarSaturnoExtraTextoComposicion;
	private TextView SaturnoExtraTextoComposicion1T;
	private TextView SaturnoExtraTextoComposicion2T;
	private ImageView SaturnoExtraTextoComposicion3I;
	private TextView SaturnoExtraTextoComposicion4C;

	private Button bVerSaturnoExtraTextoFormacion;
	private Button bOcultarSaturnoExtraTextoFormacion;
	private TextView SaturnoExtraTextoFormacion1T;

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.planetas_saturno_extra);

		// ANILLOS SATURNO
		bVerSaturnoExtraTextoAnillos = (Button) findViewById(R.id.VerSaturnoExtraTextoAnillos);
		bOcultarSaturnoExtraTextoAnillos = (Button) findViewById(R.id.OcultarSaturnoExtraTextoAnillos);
		SaturnoExtraTextoAnillos1T = (TextView) findViewById(R.id.SaturnoExtraTextoAnillos1T);
		SaturnoExtraTextoAnillos2T = (TextView) findViewById(R.id.SaturnoExtraTextoAnillos2T);
		SaturnoExtraTextoAnillos3I = (ImageView) findViewById(R.id.SaturnoExtraTextoAnillos3I);
		SaturnoExtraTextoAnillos4C = (TextView) findViewById(R.id.SaturnoExtraTextoAnillos4C);

		SaturnoExtraTextoAnillos1T.setVisibility(View.GONE);
		SaturnoExtraTextoAnillos2T.setVisibility(View.GONE);
		SaturnoExtraTextoAnillos3I.setVisibility(View.GONE);
		SaturnoExtraTextoAnillos4C.setVisibility(View.GONE);
		bOcultarSaturnoExtraTextoAnillos.setVisibility(View.GONE);

		bVerSaturnoExtraTextoAnillos.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				SaturnoExtraTextoAnillos1T.setVisibility(View.VISIBLE);
				SaturnoExtraTextoAnillos2T.setVisibility(View.VISIBLE);
				SaturnoExtraTextoAnillos3I.setVisibility(View.VISIBLE);
				SaturnoExtraTextoAnillos4C.setVisibility(View.VISIBLE);
				bOcultarSaturnoExtraTextoAnillos.setVisibility(View.VISIBLE);
			}
		});

		bOcultarSaturnoExtraTextoAnillos
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						SaturnoExtraTextoAnillos1T.setVisibility(View.GONE);
						SaturnoExtraTextoAnillos2T.setVisibility(View.GONE);
						SaturnoExtraTextoAnillos3I.setVisibility(View.GONE);
						SaturnoExtraTextoAnillos4C.setVisibility(View.GONE);
						bOcultarSaturnoExtraTextoAnillos
								.setVisibility(View.GONE);
					}
				});

		Animation a = AnimationUtils.loadAnimation(this, R.anim.rotate1);
		a.reset();
		bVerSaturnoExtraTextoAnillos.clearAnimation();
		bVerSaturnoExtraTextoAnillos.startAnimation(a);

		// DISTRIBUCIÓN
		bVerSaturnoExtraTextoDistribucion = (Button) findViewById(R.id.VerSaturnoExtraTextoDistribucion);
		bOcultarSaturnoExtraTextoDistribucion = (Button) findViewById(R.id.OcultarSaturnoExtraTextoDistribucion);

		SaturnoExtraTextoDistribucion1T = (TextView) findViewById(R.id.SaturnoExtraTextoDistribucion1T);
		SaturnoExtraTextoDistribucion2I = (ImageView) findViewById(R.id.SaturnoExtraTextoDistribucion2I);
		SaturnoExtraTextoDistribucion3C = (TextView) findViewById(R.id.SaturnoExtraTextoDistribucion3C);
		SaturnoExtraTextoDistribucion4T = (TextView) findViewById(R.id.SaturnoExtraTextoDistribucion4T);
		SaturnoExtraTextoDistribucion5I = (ImageView) findViewById(R.id.SaturnoExtraTextoDistribucion5I);
		SaturnoExtraTextoDistribucion6C = (TextView) findViewById(R.id.SaturnoExtraTextoDistribucion6C);

		bOcultarSaturnoExtraTextoDistribucion.setVisibility(View.GONE);
		SaturnoExtraTextoDistribucion1T.setVisibility(View.GONE);
		SaturnoExtraTextoDistribucion2I.setVisibility(View.GONE);
		SaturnoExtraTextoDistribucion3C.setVisibility(View.GONE);
		SaturnoExtraTextoDistribucion4T.setVisibility(View.GONE);
		SaturnoExtraTextoDistribucion5I.setVisibility(View.GONE);
		SaturnoExtraTextoDistribucion6C.setVisibility(View.GONE);

		bVerSaturnoExtraTextoDistribucion
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						bOcultarSaturnoExtraTextoDistribucion
								.setVisibility(View.VISIBLE);
						SaturnoExtraTextoDistribucion1T
								.setVisibility(View.VISIBLE);
						SaturnoExtraTextoDistribucion2I
								.setVisibility(View.VISIBLE);
						SaturnoExtraTextoDistribucion3C
								.setVisibility(View.VISIBLE);
						SaturnoExtraTextoDistribucion4T
								.setVisibility(View.VISIBLE);
						SaturnoExtraTextoDistribucion5I
								.setVisibility(View.VISIBLE);
						SaturnoExtraTextoDistribucion6C
								.setVisibility(View.VISIBLE);
					}
				});

		bOcultarSaturnoExtraTextoDistribucion
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						bOcultarSaturnoExtraTextoDistribucion
								.setVisibility(View.GONE);
						SaturnoExtraTextoDistribucion1T
								.setVisibility(View.GONE);
						SaturnoExtraTextoDistribucion2I
								.setVisibility(View.GONE);
						SaturnoExtraTextoDistribucion3C
								.setVisibility(View.GONE);
						SaturnoExtraTextoDistribucion4T
								.setVisibility(View.GONE);
						SaturnoExtraTextoDistribucion5I
								.setVisibility(View.GONE);
						SaturnoExtraTextoDistribucion6C
								.setVisibility(View.GONE);
					}
				});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate2);
		a.reset();
		bVerSaturnoExtraTextoDistribucion.clearAnimation();
		bVerSaturnoExtraTextoDistribucion.startAnimation(a);

		// COMPOSICION
		bVerSaturnoExtraTextoComposicion = (Button) findViewById(R.id.VerSaturnoExtraTextoComposicion);
		bOcultarSaturnoExtraTextoComposicion = (Button) findViewById(R.id.OcultarSaturnoExtraTextoComposicion);

		SaturnoExtraTextoComposicion1T = (TextView) findViewById(R.id.SaturnoExtraTextoComposicion1T);
		SaturnoExtraTextoComposicion2T = (TextView) findViewById(R.id.SaturnoExtraTextoComposicion2T);
		SaturnoExtraTextoComposicion3I = (ImageView) findViewById(R.id.SaturnoExtraTextoComposicion3I);
		SaturnoExtraTextoComposicion4C = (TextView) findViewById(R.id.SaturnoExtraTextoComposicion4C);

		bOcultarSaturnoExtraTextoComposicion.setVisibility(View.GONE);
		SaturnoExtraTextoComposicion1T.setVisibility(View.GONE);
		SaturnoExtraTextoComposicion2T.setVisibility(View.GONE);
		SaturnoExtraTextoComposicion3I.setVisibility(View.GONE);
		SaturnoExtraTextoComposicion4C.setVisibility(View.GONE);

		bVerSaturnoExtraTextoComposicion
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						bOcultarSaturnoExtraTextoComposicion
								.setVisibility(View.VISIBLE);
						SaturnoExtraTextoComposicion1T
								.setVisibility(View.VISIBLE);
						SaturnoExtraTextoComposicion2T
								.setVisibility(View.VISIBLE);
						SaturnoExtraTextoComposicion3I
								.setVisibility(View.VISIBLE);
						SaturnoExtraTextoComposicion4C
								.setVisibility(View.VISIBLE);
					}
				});

		bOcultarSaturnoExtraTextoComposicion
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						bOcultarSaturnoExtraTextoComposicion
								.setVisibility(View.GONE);
						SaturnoExtraTextoComposicion1T.setVisibility(View.GONE);
						SaturnoExtraTextoComposicion2T.setVisibility(View.GONE);
						SaturnoExtraTextoComposicion3I.setVisibility(View.GONE);
						SaturnoExtraTextoComposicion4C.setVisibility(View.GONE);
					}
				});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate3);
		a.reset();
		bVerSaturnoExtraTextoComposicion.clearAnimation();
		bVerSaturnoExtraTextoComposicion.startAnimation(a);

		// FORMACIÓN
		bVerSaturnoExtraTextoFormacion = (Button) findViewById(R.id.VerSaturnoExtraTextoFormacion);
		bOcultarSaturnoExtraTextoFormacion = (Button) findViewById(R.id.OcultarSaturnoExtraTextoFormacion);

		SaturnoExtraTextoFormacion1T = (TextView) findViewById(R.id.SaturnoExtraTextoFormacion1T);

		bOcultarSaturnoExtraTextoFormacion.setVisibility(View.GONE);
		SaturnoExtraTextoFormacion1T.setVisibility(View.GONE);

		bVerSaturnoExtraTextoFormacion
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						bOcultarSaturnoExtraTextoFormacion
								.setVisibility(View.VISIBLE);
						SaturnoExtraTextoFormacion1T
								.setVisibility(View.VISIBLE);
					}
				});

		bOcultarSaturnoExtraTextoFormacion
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						bOcultarSaturnoExtraTextoFormacion
								.setVisibility(View.GONE);
						SaturnoExtraTextoFormacion1T.setVisibility(View.GONE);
					}
				});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate4);
		a.reset();
		bVerSaturnoExtraTextoFormacion.clearAnimation();
		bVerSaturnoExtraTextoFormacion.startAnimation(a);

	}

	@Override
	public void onBackPressed() {
		Intent intent = new Intent(this, Planetas.class);
		startActivity(intent);
	}

}