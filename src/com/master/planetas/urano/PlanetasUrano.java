package com.master.planetas.urano;

import android.app.TabActivity;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

import com.master.MyApp;
import com.master.R;
import com.master.planetas.urano.PlanetasUranoFotos;
import com.master.planetas.urano.PlanetasUranoTexto;
import com.master.planetas.urano.PlanetasUranoVideo;
import com.master.utilidades.Utilidades;

public class PlanetasUrano extends TabActivity{
	
	public void onCreate(Bundle savedInstanceState){
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.planetas_planeta);
		
        TabHost tabHost = getTabHost();
        Resources res = getResources();
        
		MyApp myApp = ((MyApp)getApplicationContext());
		int tabSeleccionado = myApp.getTabSeleccionado();  
        
        tabHost=Utilidades.crearTabHost(getBaseContext(), tabHost,
        		res.getDrawable(R.drawable.tab_fondo), PlanetasUranoVideo.class, 
        		res.getDrawable(R.drawable.tab_fondo), PlanetasUranoTexto.class, 
        		res.getDrawable(R.drawable.tab_fondo), PlanetasUranoFotos.class); 
        
	}
	
}
