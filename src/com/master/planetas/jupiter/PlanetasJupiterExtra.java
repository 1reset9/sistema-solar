package com.master.planetas.jupiter;

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

public class PlanetasJupiterExtra extends Activity {

	private Button bVerJupiterExtraTextoSatelites;
	private Button bOcultarJupiterExtraTextoSatelites;
	private TextView JupiterExtraTextoSatelites1T;
	private ImageView JupiterExtraTextoSatelites2I;
	private TextView JupiterExtraTextoSatelites3C;
	private TextView JupiterExtraTextoSatelites4T;

	private Button bVerJupiterExtraTextoIo;
	private Button bOcultarJupiterExtraTextoIo;
	private TextView JupiterExtraTextoIo1T;
	private ImageView JupiterExtraTextoIo2I;
	private TextView JupiterExtraTextoIo3C;
	private TextView JupiterExtraTextoIo4T;
	private ImageView JupiterExtraTextoIo5I;
	private TextView JupiterExtraTextoIo6C;

	private Button bVerJupiterExtraTextoEuropa;
	private Button bOcultarJupiterExtraTextoEuropa;
	private TextView JupiterExtraTextoEuropa1T;
	private ImageView JupiterExtraTextoEuropa2I;
	private TextView JupiterExtraTextoEuropa3C;
	private TextView JupiterExtraTextoEuropa4T;
	private ImageView JupiterExtraTextoEuropa5I;
	private TextView JupiterExtraTextoEuropa6C;

	private Button bVerJupiterExtraTextoGanimedes;
	private Button bOcultarJupiterExtraTextoGanimedes;
	private TextView JupiterExtraTextoGanimedes1T;
	private ImageView JupiterExtraTextoGanimedes2I;
	private TextView JupiterExtraTextoGanimedes3C;
	private TextView JupiterExtraTextoGanimedes4T;
	private ImageView JupiterExtraTextoGanimedes5I;
	private TextView JupiterExtraTextoGanimedes6C;

	private Button bVerJupiterExtraTextoCalisto;
	private Button bOcultarJupiterExtraTextoCalisto;
	private TextView JupiterExtraTextoCalisto1T;
	private ImageView JupiterExtraTextoCalisto2I;
	private TextView JupiterExtraTextoCalisto3C;
	private TextView JupiterExtraTextoCalisto4T;
	private ImageView JupiterExtraTextoCalisto5I;
	private TextView JupiterExtraTextoCalisto6C;

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.planetas_jupiter_extra);

		// SATÉLITES DE JÚPITER
		bVerJupiterExtraTextoSatelites = (Button) findViewById(R.id.VerJupiterExtraTextoSatelites);
		JupiterExtraTextoSatelites1T = (TextView) findViewById(R.id.JupiterExtraTextoSatelites1T);
		JupiterExtraTextoSatelites2I = (ImageView) findViewById(R.id.JupiterExtraTextoSatelites2I);
		JupiterExtraTextoSatelites3C = (TextView) findViewById(R.id.JupiterExtraTextoSatelites3C);
		JupiterExtraTextoSatelites4T = (TextView) findViewById(R.id.JupiterExtraTextoSatelites4T);
		bOcultarJupiterExtraTextoSatelites = (Button) findViewById(R.id.OcultarJupiterExtraTextoSatelites);

		JupiterExtraTextoSatelites1T.setVisibility(View.GONE);
		JupiterExtraTextoSatelites2I.setVisibility(View.GONE);
		JupiterExtraTextoSatelites3C.setVisibility(View.GONE);
		JupiterExtraTextoSatelites4T.setVisibility(View.GONE);
		bOcultarJupiterExtraTextoSatelites.setVisibility(View.GONE);

		bVerJupiterExtraTextoSatelites
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						JupiterExtraTextoSatelites1T
								.setVisibility(View.VISIBLE);
						JupiterExtraTextoSatelites2I
								.setVisibility(View.VISIBLE);
						JupiterExtraTextoSatelites3C
								.setVisibility(View.VISIBLE);
						JupiterExtraTextoSatelites4T
								.setVisibility(View.VISIBLE);
						bOcultarJupiterExtraTextoSatelites
								.setVisibility(View.VISIBLE);
					}
				});

		bOcultarJupiterExtraTextoSatelites
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						JupiterExtraTextoSatelites1T.setVisibility(View.GONE);
						JupiterExtraTextoSatelites2I.setVisibility(View.GONE);
						JupiterExtraTextoSatelites3C.setVisibility(View.GONE);
						JupiterExtraTextoSatelites4T.setVisibility(View.GONE);
						bOcultarJupiterExtraTextoSatelites
								.setVisibility(View.GONE);
					}
				});

		Animation a = AnimationUtils.loadAnimation(this, R.anim.rotate1);
		a.reset();
		bVerJupiterExtraTextoSatelites.clearAnimation();
		bVerJupiterExtraTextoSatelites.startAnimation(a);

		// Ío
		bVerJupiterExtraTextoIo = (Button) findViewById(R.id.VerJupiterExtraTextoIo);
		bOcultarJupiterExtraTextoIo = (Button) findViewById(R.id.OcultarJupiterExtraTextoIo);

		JupiterExtraTextoIo1T = (TextView) findViewById(R.id.JupiterExtraTextoIo1T);
		JupiterExtraTextoIo2I = (ImageView) findViewById(R.id.JupiterExtraTextoIo2I);
		JupiterExtraTextoIo3C = (TextView) findViewById(R.id.JupiterExtraTextoIo3C);
		JupiterExtraTextoIo4T = (TextView) findViewById(R.id.JupiterExtraTextoIo4T);
		JupiterExtraTextoIo5I = (ImageView) findViewById(R.id.JupiterExtraTextoIo5I);
		JupiterExtraTextoIo6C = (TextView) findViewById(R.id.JupiterExtraTextoIo6C);

		bOcultarJupiterExtraTextoIo.setVisibility(View.GONE);
		JupiterExtraTextoIo1T.setVisibility(View.GONE);
		JupiterExtraTextoIo2I.setVisibility(View.GONE);
		JupiterExtraTextoIo3C.setVisibility(View.GONE);
		JupiterExtraTextoIo4T.setVisibility(View.GONE);
		JupiterExtraTextoIo5I.setVisibility(View.GONE);
		JupiterExtraTextoIo6C.setVisibility(View.GONE);

		bVerJupiterExtraTextoIo.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				bOcultarJupiterExtraTextoIo.setVisibility(View.VISIBLE);
				JupiterExtraTextoIo1T.setVisibility(View.VISIBLE);
				JupiterExtraTextoIo2I.setVisibility(View.VISIBLE);
				JupiterExtraTextoIo3C.setVisibility(View.VISIBLE);
				JupiterExtraTextoIo4T.setVisibility(View.VISIBLE);
				JupiterExtraTextoIo5I.setVisibility(View.VISIBLE);
				JupiterExtraTextoIo6C.setVisibility(View.VISIBLE);
			}
		});

		bOcultarJupiterExtraTextoIo.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				bOcultarJupiterExtraTextoIo.setVisibility(View.GONE);
				JupiterExtraTextoIo1T.setVisibility(View.GONE);
				JupiterExtraTextoIo2I.setVisibility(View.GONE);
				JupiterExtraTextoIo3C.setVisibility(View.GONE);
				JupiterExtraTextoIo4T.setVisibility(View.GONE);
				JupiterExtraTextoIo5I.setVisibility(View.GONE);
				JupiterExtraTextoIo6C.setVisibility(View.GONE);
			}
		});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate2);
		a.reset();
		bVerJupiterExtraTextoIo.clearAnimation();
		bVerJupiterExtraTextoIo.startAnimation(a);

		// Europa
		bVerJupiterExtraTextoEuropa = (Button) findViewById(R.id.VerJupiterExtraTextoEuropa);
		bOcultarJupiterExtraTextoEuropa = (Button) findViewById(R.id.OcultarJupiterExtraTextoEuropa);

		JupiterExtraTextoEuropa1T = (TextView) findViewById(R.id.JupiterExtraTextoEuropa1T);
		JupiterExtraTextoEuropa2I = (ImageView) findViewById(R.id.JupiterExtraTextoEuropa2I);
		JupiterExtraTextoEuropa3C = (TextView) findViewById(R.id.JupiterExtraTextoEuropa3C);
		JupiterExtraTextoEuropa4T = (TextView) findViewById(R.id.JupiterExtraTextoEuropa4T);
		JupiterExtraTextoEuropa5I = (ImageView) findViewById(R.id.JupiterExtraTextoEuropa5I);
		JupiterExtraTextoEuropa6C = (TextView) findViewById(R.id.JupiterExtraTextoEuropa6C);

		bOcultarJupiterExtraTextoEuropa.setVisibility(View.GONE);
		JupiterExtraTextoEuropa1T.setVisibility(View.GONE);
		JupiterExtraTextoEuropa2I.setVisibility(View.GONE);
		JupiterExtraTextoEuropa3C.setVisibility(View.GONE);
		JupiterExtraTextoEuropa4T.setVisibility(View.GONE);
		JupiterExtraTextoEuropa5I.setVisibility(View.GONE);
		JupiterExtraTextoEuropa6C.setVisibility(View.GONE);

		bVerJupiterExtraTextoEuropa.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				bOcultarJupiterExtraTextoEuropa.setVisibility(View.VISIBLE);
				JupiterExtraTextoEuropa1T.setVisibility(View.VISIBLE);
				JupiterExtraTextoEuropa2I.setVisibility(View.VISIBLE);
				JupiterExtraTextoEuropa3C.setVisibility(View.VISIBLE);
				JupiterExtraTextoEuropa4T.setVisibility(View.VISIBLE);
				JupiterExtraTextoEuropa5I.setVisibility(View.VISIBLE);
				JupiterExtraTextoEuropa6C.setVisibility(View.VISIBLE);
			}
		});

		bOcultarJupiterExtraTextoEuropa
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						bOcultarJupiterExtraTextoEuropa
								.setVisibility(View.GONE);
						JupiterExtraTextoEuropa1T.setVisibility(View.GONE);
						JupiterExtraTextoEuropa2I.setVisibility(View.GONE);
						JupiterExtraTextoEuropa3C.setVisibility(View.GONE);
						JupiterExtraTextoEuropa4T.setVisibility(View.GONE);
						JupiterExtraTextoEuropa5I.setVisibility(View.GONE);
						JupiterExtraTextoEuropa6C.setVisibility(View.GONE);
					}
				});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate3);
		a.reset();
		bVerJupiterExtraTextoEuropa.clearAnimation();
		bVerJupiterExtraTextoEuropa.startAnimation(a);

		// Ganimedes
		bVerJupiterExtraTextoGanimedes = (Button) findViewById(R.id.VerJupiterExtraTextoGanimedes);
		bOcultarJupiterExtraTextoGanimedes = (Button) findViewById(R.id.OcultarJupiterExtraTextoGanimedes);

		JupiterExtraTextoGanimedes1T = (TextView) findViewById(R.id.JupiterExtraTextoGanimedes1T);
		JupiterExtraTextoGanimedes2I = (ImageView) findViewById(R.id.JupiterExtraTextoGanimedes2I);
		JupiterExtraTextoGanimedes3C = (TextView) findViewById(R.id.JupiterExtraTextoGanimedes3C);
		JupiterExtraTextoGanimedes4T = (TextView) findViewById(R.id.JupiterExtraTextoGanimedes4T);
		JupiterExtraTextoGanimedes5I = (ImageView) findViewById(R.id.JupiterExtraTextoGanimedes5I);
		JupiterExtraTextoGanimedes6C = (TextView) findViewById(R.id.JupiterExtraTextoGanimedes6C);

		bOcultarJupiterExtraTextoGanimedes.setVisibility(View.GONE);
		JupiterExtraTextoGanimedes1T.setVisibility(View.GONE);
		JupiterExtraTextoGanimedes2I.setVisibility(View.GONE);
		JupiterExtraTextoGanimedes3C.setVisibility(View.GONE);
		JupiterExtraTextoGanimedes4T.setVisibility(View.GONE);
		JupiterExtraTextoGanimedes5I.setVisibility(View.GONE);
		JupiterExtraTextoGanimedes6C.setVisibility(View.GONE);

		bVerJupiterExtraTextoGanimedes
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						bOcultarJupiterExtraTextoGanimedes
								.setVisibility(View.VISIBLE);
						JupiterExtraTextoGanimedes1T
								.setVisibility(View.VISIBLE);
						JupiterExtraTextoGanimedes2I
								.setVisibility(View.VISIBLE);
						JupiterExtraTextoGanimedes3C
								.setVisibility(View.VISIBLE);
						JupiterExtraTextoGanimedes4T
								.setVisibility(View.VISIBLE);
						JupiterExtraTextoGanimedes5I
								.setVisibility(View.VISIBLE);
						JupiterExtraTextoGanimedes6C
								.setVisibility(View.VISIBLE);
					}
				});

		bOcultarJupiterExtraTextoGanimedes
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						bOcultarJupiterExtraTextoGanimedes
								.setVisibility(View.GONE);
						JupiterExtraTextoGanimedes1T.setVisibility(View.GONE);
						JupiterExtraTextoGanimedes2I.setVisibility(View.GONE);
						JupiterExtraTextoGanimedes3C.setVisibility(View.GONE);
						JupiterExtraTextoGanimedes4T.setVisibility(View.GONE);
						JupiterExtraTextoGanimedes5I.setVisibility(View.GONE);
						JupiterExtraTextoGanimedes6C.setVisibility(View.GONE);
					}
				});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate4);
		a.reset();
		bVerJupiterExtraTextoGanimedes.clearAnimation();
		bVerJupiterExtraTextoGanimedes.startAnimation(a);

		// Calisto
		bVerJupiterExtraTextoCalisto = (Button) findViewById(R.id.VerJupiterExtraTextoCalisto);
		bOcultarJupiterExtraTextoCalisto = (Button) findViewById(R.id.OcultarJupiterExtraTextoCalisto);

		JupiterExtraTextoCalisto1T = (TextView) findViewById(R.id.JupiterExtraTextoCalisto1T);
		JupiterExtraTextoCalisto2I = (ImageView) findViewById(R.id.JupiterExtraTextoCalisto2I);
		JupiterExtraTextoCalisto3C = (TextView) findViewById(R.id.JupiterExtraTextoCalisto3C);
		JupiterExtraTextoCalisto4T = (TextView) findViewById(R.id.JupiterExtraTextoCalisto4T);
		JupiterExtraTextoCalisto5I = (ImageView) findViewById(R.id.JupiterExtraTextoCalisto5I);
		JupiterExtraTextoCalisto6C = (TextView) findViewById(R.id.JupiterExtraTextoCalisto6C);

		bOcultarJupiterExtraTextoCalisto.setVisibility(View.GONE);
		JupiterExtraTextoCalisto1T.setVisibility(View.GONE);
		JupiterExtraTextoCalisto2I.setVisibility(View.GONE);
		JupiterExtraTextoCalisto3C.setVisibility(View.GONE);
		JupiterExtraTextoCalisto4T.setVisibility(View.GONE);
		JupiterExtraTextoCalisto5I.setVisibility(View.GONE);
		JupiterExtraTextoCalisto6C.setVisibility(View.GONE);

		bVerJupiterExtraTextoCalisto.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				bOcultarJupiterExtraTextoCalisto.setVisibility(View.VISIBLE);
				JupiterExtraTextoCalisto1T.setVisibility(View.VISIBLE);
				JupiterExtraTextoCalisto2I.setVisibility(View.VISIBLE);
				JupiterExtraTextoCalisto3C.setVisibility(View.VISIBLE);
				JupiterExtraTextoCalisto4T.setVisibility(View.VISIBLE);
				JupiterExtraTextoCalisto5I.setVisibility(View.VISIBLE);
				JupiterExtraTextoCalisto6C.setVisibility(View.VISIBLE);
			}
		});

		bOcultarJupiterExtraTextoCalisto
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						bOcultarJupiterExtraTextoCalisto
								.setVisibility(View.GONE);
						JupiterExtraTextoCalisto1T.setVisibility(View.GONE);
						JupiterExtraTextoCalisto2I.setVisibility(View.GONE);
						JupiterExtraTextoCalisto3C.setVisibility(View.GONE);
						JupiterExtraTextoCalisto4T.setVisibility(View.GONE);
						JupiterExtraTextoCalisto5I.setVisibility(View.GONE);
						JupiterExtraTextoCalisto6C.setVisibility(View.GONE);
					}
				});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate5);
		a.reset();
		bVerJupiterExtraTextoCalisto.clearAnimation();
		bVerJupiterExtraTextoCalisto.startAnimation(a);

	}

	@Override
	public void onBackPressed() {
		Intent intent = new Intent(this, Planetas.class);
		startActivity(intent);
	}

}