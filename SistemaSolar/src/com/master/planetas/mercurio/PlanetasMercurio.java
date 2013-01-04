package com.master.planetas.mercurio;

import com.master.MyApp;
import com.master.R;
import com.master.utilidades.Utilidades;

import android.app.TabActivity;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

public class PlanetasMercurio extends TabActivity {

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.planetas_planeta);

		TabHost tabHost = getTabHost();
		Resources res = getResources();

		MyApp myApp = ((MyApp) getApplicationContext());
		int tabSeleccionado = myApp.getTabSeleccionado();

		tabHost = Utilidades.crearTabHost(getBaseContext(), tabHost,
				res.getDrawable(R.drawable.tab_fondo),
				PlanetasMercurioVideo.class,
				res.getDrawable(R.drawable.tab_fondo),
				PlanetasMercurioTexto.class,
				res.getDrawable(R.drawable.tab_fondo),
				PlanetasMercurioFotos.class);

	}

}
