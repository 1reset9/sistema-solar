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
import android.widget.TextView;

public class SistemaSolarFormacion extends Activity {

	private Button bVerFormacionSistemaSolar;
	private Button bOcultarFormacionSistemaSolar;
	private TextView FormacionSistemaSolarT;
	private ImageView FormacionSistemaSolarI;
	private TextView FormacionSistemaSolarC;

	private Button bVerFormacionPlanetasRocosos;
	private Button bOcultarFormacionPlanetasRocosos;
	private TextView FormacionPlanetasRocososT;

	private Button bVerFormacionPlanetasGaseosos;
	private Button bOcultarFormacionPlanetasGaseosos;
	private TextView FormacionPlanetasGaseososT;

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.sistema_solar_formacion);

		// SISTEMA SOLAR
		bVerFormacionSistemaSolar = (Button) findViewById(R.id.VerFormacionSistemaSolar);
		FormacionSistemaSolarT = (TextView) findViewById(R.id.FormacionSistemaSolarT);
		FormacionSistemaSolarI = (ImageView) findViewById(R.id.FormacionSistemaSolarI);
		FormacionSistemaSolarC = (TextView) findViewById(R.id.FormacionSistemaSolarC);
		bOcultarFormacionSistemaSolar = (Button) findViewById(R.id.OcultarFormacionSistemaSolar);

		FormacionSistemaSolarT.setVisibility(View.GONE);
		FormacionSistemaSolarI.setVisibility(View.GONE);
		FormacionSistemaSolarC.setVisibility(View.GONE);
		bOcultarFormacionSistemaSolar.setVisibility(View.GONE);

		bVerFormacionSistemaSolar.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				FormacionSistemaSolarT.setVisibility(View.VISIBLE);
				FormacionSistemaSolarI.setVisibility(View.VISIBLE);
				FormacionSistemaSolarC.setVisibility(View.VISIBLE);
				bOcultarFormacionSistemaSolar.setVisibility(View.VISIBLE);
			}
		});

		bOcultarFormacionSistemaSolar.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				FormacionSistemaSolarT.setVisibility(View.GONE);
				FormacionSistemaSolarI.setVisibility(View.GONE);
				FormacionSistemaSolarC.setVisibility(View.GONE);
				bOcultarFormacionSistemaSolar.setVisibility(View.GONE);
			}
		});

		Animation a = AnimationUtils.loadAnimation(this, R.anim.rotate1);
		a.reset();
		bVerFormacionSistemaSolar.clearAnimation();
		bVerFormacionSistemaSolar.startAnimation(a);

		// PLANETAS ROCOSOS
		bVerFormacionPlanetasRocosos = (Button) findViewById(R.id.VerFormacionPlanetasRocosos);
		FormacionPlanetasRocososT = (TextView) findViewById(R.id.FormacionPlanetasRocososT);
		bOcultarFormacionPlanetasRocosos = (Button) findViewById(R.id.OcultarFormacionPlanetasRocosos);

		FormacionPlanetasRocososT.setVisibility(View.GONE);
		bOcultarFormacionPlanetasRocosos.setVisibility(View.GONE);

		bVerFormacionPlanetasRocosos.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				FormacionPlanetasRocososT.setVisibility(View.VISIBLE);
				bOcultarFormacionPlanetasRocosos.setVisibility(View.VISIBLE);
			}
		});

		bOcultarFormacionPlanetasRocosos
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						FormacionPlanetasRocososT.setVisibility(View.GONE);
						bOcultarFormacionPlanetasRocosos
								.setVisibility(View.GONE);
					}
				});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate2);
		a.reset();
		bVerFormacionPlanetasRocosos.clearAnimation();
		bVerFormacionPlanetasRocosos.startAnimation(a);

		// PLANETAS GASEOSOS
		bVerFormacionPlanetasGaseosos = (Button) findViewById(R.id.VerFormacionPlanetasGaseosos);
		FormacionPlanetasGaseososT = (TextView) findViewById(R.id.FormacionPlanetasGaseososT);
		bOcultarFormacionPlanetasGaseosos = (Button) findViewById(R.id.OcultarFormacionPlanetasGaseosos);

		FormacionPlanetasGaseososT.setVisibility(View.GONE);
		bOcultarFormacionPlanetasGaseosos.setVisibility(View.GONE);

		bVerFormacionPlanetasGaseosos.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				FormacionPlanetasGaseososT.setVisibility(View.VISIBLE);
				bOcultarFormacionPlanetasGaseosos.setVisibility(View.VISIBLE);
			}
		});

		bOcultarFormacionPlanetasGaseosos
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						FormacionPlanetasGaseososT.setVisibility(View.GONE);
						bOcultarFormacionPlanetasGaseosos
								.setVisibility(View.GONE);
					}
				});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate3);
		a.reset();
		bVerFormacionPlanetasGaseosos.clearAnimation();
		bVerFormacionPlanetasGaseosos.startAnimation(a);

	}

}
