package com.master.sistemaSolar.sol;

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

import com.master.R;
import com.master.SistemaSolar;

public class SistemaSolarSolTexto extends Activity {

	private Button bVerSolTextoEstructura;
	private Button bOcultarSolTextoEstructura;
	private TextView SolTextoEstructura;
	private TableLayout tTablaSolEstructura;
	private ImageView SolTextoEstructuraI;
	private TextView SolTextoEstructuraC;

	private Button bVerSolTextoHeliosfera;
	private Button bOcultarVerSolTextoHeliosfera;
	private TextView SolTextoHeliosfera1T;
	private TextView SolTextoHeliosfera2T;
	private ImageView SolTextoHeliosferaI;
	private TextView SolTextoHeliosferaC;

	private Button bVerSolObservacionExploracion;
	private Button bOcultarSolObservacionExploracion;
	private TextView SolObservacionExploracion1T;
	private TextView SolObservacionExploracion2T;
	private TextView SolObservacionExploracion3T;
	private ImageView SolObservacionExploracionI;
	private TextView SolObservacionExploracionC;

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.sistema_solar_sol_texto);

		// ESTRUCTURA
		bVerSolTextoEstructura = (Button) findViewById(R.id.VerSolTextoEstructura);
		SolTextoEstructura = (TextView) findViewById(R.id.SolTextoEstructura);
		bOcultarSolTextoEstructura = (Button) findViewById(R.id.OcultarSolTextoEstructura);
		tTablaSolEstructura = (TableLayout) findViewById(R.id.TablaSolEstructura);
		SolTextoEstructuraI = (ImageView) findViewById(R.id.SolTextoEstructuraI);
		SolTextoEstructuraC = (TextView) findViewById(R.id.SolTextoEstructuraC);

		SolTextoEstructura.setVisibility(View.GONE);
		bOcultarSolTextoEstructura.setVisibility(View.GONE);
		tTablaSolEstructura.setVisibility(View.GONE);
		SolTextoEstructuraI.setVisibility(View.GONE);
		SolTextoEstructuraC.setVisibility(View.GONE);

		bVerSolTextoEstructura.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				SolTextoEstructura.setVisibility(View.VISIBLE);
				bOcultarSolTextoEstructura.setVisibility(View.VISIBLE);
				tTablaSolEstructura.setVisibility(View.VISIBLE);
				SolTextoEstructuraI.setVisibility(View.VISIBLE);
				SolTextoEstructuraC.setVisibility(View.VISIBLE);
			}
		});

		bOcultarSolTextoEstructura.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				SolTextoEstructura.setVisibility(View.GONE);
				bOcultarSolTextoEstructura.setVisibility(View.GONE);
				tTablaSolEstructura.setVisibility(View.GONE);
				SolTextoEstructuraI.setVisibility(View.GONE);
				SolTextoEstructuraC.setVisibility(View.GONE);
			}
		});

		Animation a = AnimationUtils.loadAnimation(this, R.anim.rotate1);
		a.reset();
		bVerSolTextoEstructura.clearAnimation();
		bVerSolTextoEstructura.startAnimation(a);

		// HELIOSFERA
		bVerSolTextoHeliosfera = (Button) findViewById(R.id.VerSolTextoHeliosfera);
		bOcultarVerSolTextoHeliosfera = (Button) findViewById(R.id.OcultarSolTextoHeliosfera);
		SolTextoHeliosfera1T = (TextView) findViewById(R.id.SolTextoHeliosfera1T);
		SolTextoHeliosfera2T = (TextView) findViewById(R.id.SolTextoHeliosfera2T);
		SolTextoHeliosferaI = (ImageView) findViewById(R.id.SolTextoHeliosferaI);
		SolTextoHeliosferaC = (TextView) findViewById(R.id.SolTextoHeliosferaC);

		bOcultarVerSolTextoHeliosfera.setVisibility(View.GONE);
		SolTextoHeliosfera1T.setVisibility(View.GONE);
		SolTextoHeliosfera2T.setVisibility(View.GONE);
		SolTextoHeliosferaI.setVisibility(View.GONE);
		SolTextoHeliosferaC.setVisibility(View.GONE);

		bVerSolTextoHeliosfera.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				bOcultarVerSolTextoHeliosfera.setVisibility(View.VISIBLE);
				SolTextoHeliosfera1T.setVisibility(View.VISIBLE);
				SolTextoHeliosfera2T.setVisibility(View.VISIBLE);
				SolTextoHeliosferaI.setVisibility(View.VISIBLE);
				SolTextoHeliosferaC.setVisibility(View.VISIBLE);
			}
		});

		bOcultarVerSolTextoHeliosfera.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				bOcultarVerSolTextoHeliosfera.setVisibility(View.GONE);
				SolTextoHeliosfera1T.setVisibility(View.GONE);
				SolTextoHeliosfera2T.setVisibility(View.GONE);
				SolTextoHeliosferaI.setVisibility(View.GONE);
				SolTextoHeliosferaC.setVisibility(View.GONE);
			}
		});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate2);
		a.reset();
		bVerSolTextoHeliosfera.clearAnimation();
		bVerSolTextoHeliosfera.startAnimation(a);

		// OBSERVACIÓN Y EXPLORACIÓN
		bVerSolObservacionExploracion = (Button) findViewById(R.id.VerSolObservacionExploracion);
		SolObservacionExploracion1T = (TextView) findViewById(R.id.SolObservacionExploracion1T);
		SolObservacionExploracion2T = (TextView) findViewById(R.id.SolObservacionExploracion2T);
		SolObservacionExploracion3T = (TextView) findViewById(R.id.SolObservacionExploracion3T);
		SolObservacionExploracionI = (ImageView) findViewById(R.id.SolObservacionExploracionI);
		SolObservacionExploracionC = (TextView) findViewById(R.id.SolObservacionExploracionC);
		bOcultarSolObservacionExploracion = (Button) findViewById(R.id.OcultarSolObservacionExploracion);

		SolObservacionExploracion1T.setVisibility(View.GONE);
		SolObservacionExploracion2T.setVisibility(View.GONE);
		SolObservacionExploracion3T.setVisibility(View.GONE);
		SolObservacionExploracionI.setVisibility(View.GONE);
		SolObservacionExploracionC.setVisibility(View.GONE);
		bOcultarSolObservacionExploracion.setVisibility(View.GONE);

		bVerSolObservacionExploracion.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				SolObservacionExploracion1T.setVisibility(View.VISIBLE);
				SolObservacionExploracion2T.setVisibility(View.VISIBLE);
				SolObservacionExploracion3T.setVisibility(View.VISIBLE);
				SolObservacionExploracionI.setVisibility(View.VISIBLE);
				SolObservacionExploracionC.setVisibility(View.VISIBLE);
				bOcultarSolObservacionExploracion.setVisibility(View.VISIBLE);
			}
		});

		bOcultarSolObservacionExploracion
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						SolObservacionExploracion1T.setVisibility(View.GONE);
						SolObservacionExploracion2T.setVisibility(View.GONE);
						SolObservacionExploracion3T.setVisibility(View.GONE);
						SolObservacionExploracionI.setVisibility(View.GONE);
						SolObservacionExploracionC.setVisibility(View.GONE);
						bOcultarSolObservacionExploracion
								.setVisibility(View.GONE);
					}
				});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate3);
		a.reset();
		bVerSolObservacionExploracion.clearAnimation();
		bVerSolObservacionExploracion.startAnimation(a);

	}

	@Override
	public void onBackPressed() {
		Intent intent = new Intent(this, SistemaSolar.class);
		startActivity(intent);
	}

}
