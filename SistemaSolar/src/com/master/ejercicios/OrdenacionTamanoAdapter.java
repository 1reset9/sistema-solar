package com.master.ejercicios;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.master.R;
import com.master.utilidades.Utilidades;

public class OrdenacionTamanoAdapter extends ArrayAdapter<String> {

	private final Context contexto;
	private final String[] planetas;

	// Constructor
	public OrdenacionTamanoAdapter(Context contexto, String[] planetas) {
		super(contexto, R.layout.ordenaciones_fila, planetas);
		this.contexto = contexto;
		this.planetas = planetas;
	}

	@Override
	public View getView(int posicion, View v, ViewGroup parent) {
		
		Utilidades utilidades = new Utilidades();

		// Convertir el layout del xml fila en una vista
		LayoutInflater vista = (LayoutInflater) contexto
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		// Convertir la vista en una imagen
		View fila = vista.inflate(R.layout.ordenaciones_fila, parent, false);
		ImageView imageView = (ImageView) fila.findViewById(R.id.imagen);

		// Nombre del planeta de cada posicion
		String planeta = planetas[posicion];

		// Para cada fila de la lista ponemos la imagen que se corresponda según
		// el array de Strings que se recibe
		imageView = utilidades.ordenaTamanoImagenInicial(imageView, planeta, posicion);

		return fila;
	}

	
	

}
