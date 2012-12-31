package com.master;

import com.master.utilidades.Utilidades;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class SistemaSolarActivity extends Activity implements
		View.OnTouchListener {

	private Button bSistemaSolar;
	private Button bPlanetas;
	private Button bEjercicios;
	private Button bAcercaDe;

	private ImageView imagen;
	private ImageView fondo;

	Utilidades utilidades = new Utilidades();

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);

		setContentView(R.layout.main);

		// Botón Sistema Solar
		bSistemaSolar = (Button) findViewById(R.id.Boton_SistemaSolar);
		bSistemaSolar.setOnClickListener(new OnClickListener() {

			public void onClick(View view) {
				lanzarSistemaSolar();
			}
		});

		// Botón Planetas
		bPlanetas = (Button) findViewById(R.id.Boton_Planetas);
		bPlanetas.setOnClickListener(new OnClickListener() {

			public void onClick(View view) {
				lanzarPlanetas();
			}
		});

		// Botón Ejercicion
		bEjercicios = (Button) findViewById(R.id.Boton_Ejercicios);
		bEjercicios.setOnClickListener(new OnClickListener() {

			public void onClick(View view) {
				lanzarEjercicios();
			}
		});

		// Botón Acerca de
		bAcercaDe = (Button) findViewById(R.id.Boton_AcercaDe);
		bAcercaDe.setOnClickListener(new OnClickListener() {

			public void onClick(View view) {
				lanzarAcercaDe();
			}
		});

		imagen = (ImageView) findViewById(R.id.imagen);
		fondo = (ImageView) findViewById(R.id.imagenFondo);

		if (imagen != null && fondo != null) {
			// Detectar cuando se pulsa la pantalla
			imagen.setOnTouchListener(this);
		}

	}

	protected void lanzarSistemaSolar() {
		Intent i = new Intent(this, SistemaSolar.class);
		startActivity(i);
	}

	protected void lanzarPlanetas() {
		Intent i = new Intent(this, Planetas.class);
		startActivity(i);
	}

	protected void lanzarEjercicios() {
		Intent i = new Intent(this, Ejercicios.class);
		startActivity(i);
	}

	protected void lanzarAcercaDe() {
		Intent i = new Intent(this, AcercaDe.class);
		startActivity(i);
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {

		final int evX = (int) event.getX();
		final int evY = (int) event.getY();

		switch (event.getAction()) {

		case MotionEvent.ACTION_UP:
			// Obtener el color de la parte de la pantalla pulsada
			int colorPulsado = utilidades.obtenerColor(fondo, evX, evY);
			// Comprobar el planeta que se ha pulsado y mostrar su imagen
			utilidades.mostrarPlaneta(colorPulsado, getApplicationContext());

			break;
		}

		return true;
	}

}