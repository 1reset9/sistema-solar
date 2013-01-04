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
import android.widget.TableLayout;
import android.widget.TextView;

public class SistemaSolarPlanetasEnanos extends Activity {

	private Button bVerPlanetasEnanosDefinicion;
	private Button bOcultarPlanetasEnanosDefinicion;
	private TextView PlanetasEnanosDefinicion1T;
	private TableLayout tPlanetasEnanosDefinicion;
	private TextView PlanetasEnanosDefinicion3T;
	private TextView PlanetasEnanosDefinicion4T;

	private TextView PlanetasEnanosDefinicion5T;
	private ImageView PlanetasEnanosDefinicion6I;
	private TextView PlanetasEnanosDefinicion7C;
	private TextView PlanetasEnanosDefinicion8T;
	private ImageView PlanetasEnanosDefinicion9I;
	private TextView PlanetasEnanosDefinicion10C;

	private Button bVerPlanetasEnanosCeres;
	private Button bOcultarPlanetasEnanosCeres;
	private ImageView PlanetasEnanosCeresI;
	private TextView PlanetasEnanosCeresC;
	private TableLayout tPlanetasEnanosCeres;

	private Button bVerPlanetasEnanosPluto;
	private Button bOcultarPlanetasEnanosPluto;
	private ImageView PlanetasEnanosPlutoI;
	private TextView PlanetasEnanosPlutoC;
	private TableLayout tPlanetasEnanosPluto;

	private Button bVerPlanetasEnanosEris;
	private Button bOcultarPlanetasEnanosEris;
	private ImageView PlanetasEnanosErisI;
	private TextView PlanetasEnanosErisC;
	private TableLayout tPlanetasEnanosEris;

	private Button bVerPlanetasEnanosMakemake;
	private Button bOcultarPlanetasEnanosMakemake;
	private ImageView PlanetasEnanosMakemakeI;
	private TextView PlanetasEnanosMakemakeC;
	private TableLayout tPlanetasEnanosMakemake;

	private Button bVerPlanetasEnanosHaumea;
	private Button bOcultarPlanetasEnanosHaumea;
	private ImageView PlanetasEnanosHaumeaI;
	private TextView PlanetasEnanosHaumeaC;
	private TableLayout tPlanetasEnanosHaumea;

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.sistema_solar_planetas_enanos);

		// DEFINICION
		bVerPlanetasEnanosDefinicion = (Button) findViewById(R.id.VerPlanetasEnanosDefinicion);
		PlanetasEnanosDefinicion1T = (TextView) findViewById(R.id.PlanetasEnanosDefinicion1T);
		tPlanetasEnanosDefinicion = (TableLayout) findViewById(R.id.TablaPlanetasEnanosDefinicion);
		PlanetasEnanosDefinicion3T = (TextView) findViewById(R.id.PlanetasEnanosDefinicion3T);
		PlanetasEnanosDefinicion4T = (TextView) findViewById(R.id.PlanetasEnanosDefinicion4T);
		bOcultarPlanetasEnanosDefinicion = (Button) findViewById(R.id.OcultarPlanetasEnanosDefinicion);

		PlanetasEnanosDefinicion5T = (TextView) findViewById(R.id.PlanetasEnanosDefinicion5T);
		PlanetasEnanosDefinicion6I = (ImageView) findViewById(R.id.PlanetasEnanosDefinicion6I);
		PlanetasEnanosDefinicion7C = (TextView) findViewById(R.id.PlanetasEnanosDefinicion7C);
		PlanetasEnanosDefinicion8T = (TextView) findViewById(R.id.PlanetasEnanosDefinicion8T);
		PlanetasEnanosDefinicion9I = (ImageView) findViewById(R.id.PlanetasEnanosDefinicion9I);
		PlanetasEnanosDefinicion10C = (TextView) findViewById(R.id.PlanetasEnanosDefinicion10C);

		PlanetasEnanosDefinicion1T.setVisibility(View.GONE);
		tPlanetasEnanosDefinicion.setVisibility(View.GONE);
		PlanetasEnanosDefinicion3T.setVisibility(View.GONE);
		PlanetasEnanosDefinicion4T.setVisibility(View.GONE);
		bOcultarPlanetasEnanosDefinicion.setVisibility(View.GONE);
		PlanetasEnanosDefinicion5T.setVisibility(View.GONE);
		PlanetasEnanosDefinicion6I.setVisibility(View.GONE);
		PlanetasEnanosDefinicion7C.setVisibility(View.GONE);
		PlanetasEnanosDefinicion8T.setVisibility(View.GONE);
		PlanetasEnanosDefinicion9I.setVisibility(View.GONE);
		PlanetasEnanosDefinicion10C.setVisibility(View.GONE);

		bVerPlanetasEnanosDefinicion.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				PlanetasEnanosDefinicion1T.setVisibility(View.VISIBLE);
				tPlanetasEnanosDefinicion.setVisibility(View.VISIBLE);
				PlanetasEnanosDefinicion3T.setVisibility(View.VISIBLE);
				PlanetasEnanosDefinicion4T.setVisibility(View.VISIBLE);
				bOcultarPlanetasEnanosDefinicion.setVisibility(View.VISIBLE);
				PlanetasEnanosDefinicion5T.setVisibility(View.VISIBLE);
				PlanetasEnanosDefinicion6I.setVisibility(View.VISIBLE);
				PlanetasEnanosDefinicion7C.setVisibility(View.VISIBLE);
				PlanetasEnanosDefinicion8T.setVisibility(View.VISIBLE);
				PlanetasEnanosDefinicion9I.setVisibility(View.VISIBLE);
				PlanetasEnanosDefinicion10C.setVisibility(View.VISIBLE);
			}
		});

		bOcultarPlanetasEnanosDefinicion
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						PlanetasEnanosDefinicion1T.setVisibility(View.GONE);
						tPlanetasEnanosDefinicion.setVisibility(View.GONE);
						PlanetasEnanosDefinicion3T.setVisibility(View.GONE);
						PlanetasEnanosDefinicion4T.setVisibility(View.GONE);
						bOcultarPlanetasEnanosDefinicion
								.setVisibility(View.GONE);
						PlanetasEnanosDefinicion5T.setVisibility(View.GONE);
						PlanetasEnanosDefinicion6I.setVisibility(View.GONE);
						PlanetasEnanosDefinicion7C.setVisibility(View.GONE);
						PlanetasEnanosDefinicion8T.setVisibility(View.GONE);
						PlanetasEnanosDefinicion9I.setVisibility(View.GONE);
						PlanetasEnanosDefinicion10C.setVisibility(View.GONE);
					}
				});

		Animation a = AnimationUtils.loadAnimation(this, R.anim.rotate1);
		a.reset();
		bVerPlanetasEnanosDefinicion.clearAnimation();
		bVerPlanetasEnanosDefinicion.startAnimation(a);

		// CERES
		bVerPlanetasEnanosCeres = (Button) findViewById(R.id.VerPlanetasEnanosCeres);
		PlanetasEnanosCeresI = (ImageView) findViewById(R.id.PlanetasEnanosCeresI);
		PlanetasEnanosCeresC = (TextView) findViewById(R.id.PlanetasEnanosCeresC);
		tPlanetasEnanosCeres = (TableLayout) findViewById(R.id.TablaPlanetasEnanosCeres);
		bOcultarPlanetasEnanosCeres = (Button) findViewById(R.id.OcultarPlanetasEnanosCeres);

		PlanetasEnanosCeresI.setVisibility(View.GONE);
		PlanetasEnanosCeresC.setVisibility(View.GONE);
		tPlanetasEnanosCeres.setVisibility(View.GONE);
		bOcultarPlanetasEnanosCeres.setVisibility(View.GONE);

		bVerPlanetasEnanosCeres.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				PlanetasEnanosCeresI.setVisibility(View.VISIBLE);
				PlanetasEnanosCeresC.setVisibility(View.VISIBLE);
				tPlanetasEnanosCeres.setVisibility(View.VISIBLE);
				bOcultarPlanetasEnanosCeres.setVisibility(View.VISIBLE);
			}
		});

		bOcultarPlanetasEnanosCeres.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				PlanetasEnanosCeresI.setVisibility(View.GONE);
				PlanetasEnanosCeresC.setVisibility(View.GONE);
				tPlanetasEnanosCeres.setVisibility(View.GONE);
				bOcultarPlanetasEnanosCeres.setVisibility(View.GONE);
			}
		});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate2);
		a.reset();
		bVerPlanetasEnanosCeres.clearAnimation();
		bVerPlanetasEnanosCeres.startAnimation(a);

		// PLUTO
		bVerPlanetasEnanosPluto = (Button) findViewById(R.id.VerPlanetasEnanosPluto);
		PlanetasEnanosPlutoI = (ImageView) findViewById(R.id.PlanetasEnanosPlutoI);
		PlanetasEnanosPlutoC = (TextView) findViewById(R.id.PlanetasEnanosPlutoC);
		tPlanetasEnanosPluto = (TableLayout) findViewById(R.id.TablaPlanetasEnanosPluto);
		bOcultarPlanetasEnanosPluto = (Button) findViewById(R.id.OcultarPlanetasEnanosPluto);

		PlanetasEnanosPlutoI.setVisibility(View.GONE);
		PlanetasEnanosPlutoC.setVisibility(View.GONE);
		tPlanetasEnanosPluto.setVisibility(View.GONE);
		bOcultarPlanetasEnanosPluto.setVisibility(View.GONE);

		bVerPlanetasEnanosPluto.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				PlanetasEnanosPlutoI.setVisibility(View.VISIBLE);
				PlanetasEnanosPlutoC.setVisibility(View.VISIBLE);
				tPlanetasEnanosPluto.setVisibility(View.VISIBLE);
				bOcultarPlanetasEnanosPluto.setVisibility(View.VISIBLE);
			}
		});

		bOcultarPlanetasEnanosPluto.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				PlanetasEnanosPlutoI.setVisibility(View.GONE);
				PlanetasEnanosPlutoC.setVisibility(View.GONE);
				tPlanetasEnanosPluto.setVisibility(View.GONE);
				bOcultarPlanetasEnanosPluto.setVisibility(View.GONE);
			}
		});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate3);
		a.reset();
		bVerPlanetasEnanosPluto.clearAnimation();
		bVerPlanetasEnanosPluto.startAnimation(a);

		// Eris
		bVerPlanetasEnanosEris = (Button) findViewById(R.id.VerPlanetasEnanosEris);
		PlanetasEnanosErisI = (ImageView) findViewById(R.id.PlanetasEnanosErisI);
		PlanetasEnanosErisC = (TextView) findViewById(R.id.PlanetasEnanosErisC);
		tPlanetasEnanosEris = (TableLayout) findViewById(R.id.TablaPlanetasEnanosEris);
		bOcultarPlanetasEnanosEris = (Button) findViewById(R.id.OcultarPlanetasEnanosEris);

		PlanetasEnanosErisI.setVisibility(View.GONE);
		PlanetasEnanosErisC.setVisibility(View.GONE);
		tPlanetasEnanosEris.setVisibility(View.GONE);
		bOcultarPlanetasEnanosEris.setVisibility(View.GONE);

		bVerPlanetasEnanosEris.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				PlanetasEnanosErisI.setVisibility(View.VISIBLE);
				PlanetasEnanosErisC.setVisibility(View.VISIBLE);
				tPlanetasEnanosEris.setVisibility(View.VISIBLE);
				bOcultarPlanetasEnanosEris.setVisibility(View.VISIBLE);
			}
		});

		bOcultarPlanetasEnanosEris.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				PlanetasEnanosErisI.setVisibility(View.GONE);
				PlanetasEnanosErisC.setVisibility(View.GONE);
				tPlanetasEnanosEris.setVisibility(View.GONE);
				bOcultarPlanetasEnanosEris.setVisibility(View.GONE);
			}
		});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate4);
		a.reset();
		bVerPlanetasEnanosEris.clearAnimation();
		bVerPlanetasEnanosEris.startAnimation(a);

		// Makemake
		bVerPlanetasEnanosMakemake = (Button) findViewById(R.id.VerPlanetasEnanosMakemake);
		PlanetasEnanosMakemakeI = (ImageView) findViewById(R.id.PlanetasEnanosMakemakeI);
		PlanetasEnanosMakemakeC = (TextView) findViewById(R.id.PlanetasEnanosMakemakeC);
		tPlanetasEnanosMakemake = (TableLayout) findViewById(R.id.TablaPlanetasEnanosMakemake);
		bOcultarPlanetasEnanosMakemake = (Button) findViewById(R.id.OcultarPlanetasEnanosMakemake);

		PlanetasEnanosMakemakeI.setVisibility(View.GONE);
		PlanetasEnanosMakemakeC.setVisibility(View.GONE);
		tPlanetasEnanosMakemake.setVisibility(View.GONE);
		bOcultarPlanetasEnanosMakemake.setVisibility(View.GONE);

		bVerPlanetasEnanosMakemake.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				PlanetasEnanosMakemakeI.setVisibility(View.VISIBLE);
				PlanetasEnanosMakemakeC.setVisibility(View.VISIBLE);
				tPlanetasEnanosMakemake.setVisibility(View.VISIBLE);
				bOcultarPlanetasEnanosMakemake.setVisibility(View.VISIBLE);
			}
		});

		bOcultarPlanetasEnanosMakemake
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						PlanetasEnanosMakemakeI.setVisibility(View.GONE);
						PlanetasEnanosMakemakeC.setVisibility(View.GONE);
						tPlanetasEnanosMakemake.setVisibility(View.GONE);
						bOcultarPlanetasEnanosMakemake.setVisibility(View.GONE);
					}
				});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate5);
		a.reset();
		bVerPlanetasEnanosMakemake.clearAnimation();
		bVerPlanetasEnanosMakemake.startAnimation(a);

		// Haumea
		bVerPlanetasEnanosHaumea = (Button) findViewById(R.id.VerPlanetasEnanosHaumea);
		PlanetasEnanosHaumeaI = (ImageView) findViewById(R.id.PlanetasEnanosHaumeaI);
		PlanetasEnanosHaumeaC = (TextView) findViewById(R.id.PlanetasEnanosHaumeaC);
		tPlanetasEnanosHaumea = (TableLayout) findViewById(R.id.TablaPlanetasEnanosHaumea);
		bOcultarPlanetasEnanosHaumea = (Button) findViewById(R.id.OcultarPlanetasEnanosHaumea);

		PlanetasEnanosHaumeaI.setVisibility(View.GONE);
		PlanetasEnanosHaumeaC.setVisibility(View.GONE);
		tPlanetasEnanosHaumea.setVisibility(View.GONE);
		bOcultarPlanetasEnanosHaumea.setVisibility(View.GONE);

		bVerPlanetasEnanosHaumea.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				PlanetasEnanosHaumeaI.setVisibility(View.VISIBLE);
				PlanetasEnanosHaumeaC.setVisibility(View.VISIBLE);
				tPlanetasEnanosHaumea.setVisibility(View.VISIBLE);
				bOcultarPlanetasEnanosHaumea.setVisibility(View.VISIBLE);
			}
		});

		bOcultarPlanetasEnanosHaumea.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				PlanetasEnanosHaumeaI.setVisibility(View.GONE);
				PlanetasEnanosHaumeaC.setVisibility(View.GONE);
				tPlanetasEnanosHaumea.setVisibility(View.GONE);
				bOcultarPlanetasEnanosHaumea.setVisibility(View.GONE);
			}
		});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate6);
		a.reset();
		bVerPlanetasEnanosHaumea.clearAnimation();
		bVerPlanetasEnanosHaumea.startAnimation(a);

	}

}
