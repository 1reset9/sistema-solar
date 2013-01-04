package com.master.planetas.venus;

import android.app.TabActivity;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

import com.master.MyApp;
import com.master.R;
import com.master.utilidades.Utilidades;

public class PlanetasVenus extends TabActivity {

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.planetas_planeta);

		TabHost tabHost = getTabHost();
		Resources res = getResources();

		MyApp myApp = ((MyApp) getApplicationContext());
		int tabSeleccionado = myApp.getTabSeleccionado();

		tabHost = Utilidades
				.crearTabHost(getBaseContext(), tabHost,
						res.getDrawable(R.drawable.tab_fondo),
						PlanetasVenusVideo.class,
						res.getDrawable(R.drawable.tab_fondo),
						PlanetasVenusTexto.class,
						res.getDrawable(R.drawable.tab_fondo),
						PlanetasVenusFotos.class);

	}

}