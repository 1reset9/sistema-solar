package com.master.planetas.neptuno;

import android.app.TabActivity;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

import com.master.MyApp;
import com.master.R;
import com.master.planetas.neptuno.PlanetasNeptunoFotos;
import com.master.planetas.neptuno.PlanetasNeptunoTexto;
import com.master.planetas.neptuno.PlanetasNeptunoVideo;
import com.master.utilidades.Utilidades;

public class PlanetasNeptuno extends TabActivity {

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.planetas_planeta);

		TabHost tabHost = getTabHost();
		Resources res = getResources();

		MyApp myApp = ((MyApp) getApplicationContext());
		int tabSeleccionado = myApp.getTabSeleccionado();

		tabHost = Utilidades.crearTabHost(getBaseContext(), tabHost,
				res.getDrawable(R.drawable.tab_fondo),
				PlanetasNeptunoVideo.class,
				res.getDrawable(R.drawable.tab_fondo),
				PlanetasNeptunoTexto.class,
				res.getDrawable(R.drawable.tab_fondo),
				PlanetasNeptunoFotos.class);

	}

}
