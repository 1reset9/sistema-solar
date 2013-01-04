package com.master.planetas.saturno;

import android.app.TabActivity;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

import com.master.MyApp;
import com.master.R;
import com.master.planetas.saturno.PlanetasSaturnoExtra;
import com.master.planetas.saturno.PlanetasSaturnoFotos;
import com.master.planetas.saturno.PlanetasSaturnoTexto;
import com.master.planetas.saturno.PlanetasSaturnoVideo;
import com.master.utilidades.Utilidades;

public class PlanetasSaturno extends TabActivity {

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.planetas_planeta);

		TabHost tabHost = getTabHost();
		Resources res = getResources();

		MyApp myApp = ((MyApp) getApplicationContext());
		int tabSeleccionado = myApp.getTabSeleccionado();

		tabHost = Utilidades.crearTabHost(getBaseContext(), tabHost,
				res.getDrawable(R.drawable.tab_fondo),
				PlanetasSaturnoVideo.class,
				res.getDrawable(R.drawable.tab_fondo),
				PlanetasSaturnoTexto.class,
				res.getDrawable(R.drawable.tab_fondo),
				PlanetasSaturnoFotos.class,
				res.getDrawable(R.drawable.tab_fondo),
				PlanetasSaturnoExtra.class);

	}

}