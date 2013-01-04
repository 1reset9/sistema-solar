package com.master.planetas.marte;

import android.app.TabActivity;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

import com.master.MyApp;
import com.master.R;

import com.master.planetas.marte.PlanetasMarteExtra;
import com.master.planetas.marte.PlanetasMarteFotos;
import com.master.planetas.marte.PlanetasMarteTexto;
import com.master.planetas.marte.PlanetasMarteVideo;
import com.master.utilidades.Utilidades;

public class PlanetasMarte extends TabActivity {

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
						PlanetasMarteVideo.class,
						res.getDrawable(R.drawable.tab_fondo),
						PlanetasMarteTexto.class,
						res.getDrawable(R.drawable.tab_fondo),
						PlanetasMarteFotos.class,
						res.getDrawable(R.drawable.tab_fondo),
						PlanetasMarteExtra.class);

	}

}