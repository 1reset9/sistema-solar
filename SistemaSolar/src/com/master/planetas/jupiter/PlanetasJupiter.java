package com.master.planetas.jupiter;

import android.app.TabActivity;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

import com.master.MyApp;
import com.master.R;
import com.master.planetas.jupiter.PlanetasJupiterExtra;
import com.master.planetas.jupiter.PlanetasJupiterFotos;
import com.master.planetas.jupiter.PlanetasJupiterTexto;
import com.master.planetas.jupiter.PlanetasJupiterVideo;
import com.master.utilidades.Utilidades;

public class PlanetasJupiter extends TabActivity {

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.planetas_planeta);

		TabHost tabHost = getTabHost();
		Resources res = getResources();

		MyApp myApp = ((MyApp) getApplicationContext());
		int tabSeleccionado = myApp.getTabSeleccionado();

		tabHost = Utilidades.crearTabHost(getBaseContext(), tabHost,
				res.getDrawable(R.drawable.tab_fondo),
				PlanetasJupiterVideo.class,
				res.getDrawable(R.drawable.tab_fondo),
				PlanetasJupiterTexto.class,
				res.getDrawable(R.drawable.tab_fondo),
				PlanetasJupiterFotos.class,
				res.getDrawable(R.drawable.tab_fondo),
				PlanetasJupiterExtra.class);

	}

}
