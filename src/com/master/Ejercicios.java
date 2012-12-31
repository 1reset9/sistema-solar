package com.master;

import com.master.ejercicios.OrdenacionDistancia;
import com.master.ejercicios.OrdenacionTamano;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Ejercicios extends Activity {

	private Button bIntroduccion;
	private Button bFormacion;

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.ejercicios);

		bIntroduccion = (Button) findViewById(R.id.OrdenacionDistancia);
		bIntroduccion.setOnClickListener(new OnClickListener() {

			public void onClick(View view) {
				lanzarOrdenacionDistancia();
			}
		});

		bFormacion = (Button) findViewById(R.id.OrdenacionTamano);
		bFormacion.setOnClickListener(new OnClickListener() {

			public void onClick(View view) {
				lanzarOrdenacionTamano();
			}
		});

	}

	protected void lanzarOrdenacionDistancia() {
		Intent i = new Intent(this, OrdenacionDistancia.class);
		startActivity(i);
	}

	protected void lanzarOrdenacionTamano() {
		Intent i = new Intent(this, OrdenacionTamano.class);
		startActivity(i);
	}

}
