package com.master.ejercicios;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.master.R;
import com.master.utilidades.ArraysOrdenaciones;
import com.master.utilidades.TouchInterceptor;
import com.master.utilidades.Utilidades;

public class OrdenacionDistancia extends ListActivity {

	// Array con las posiciones iniciales desordenadas de los planetas a ordenar
	ArraysOrdenaciones arraysOrdenaciones = new ArraysOrdenaciones();
	private String[] inicioOrdenacionesDistancia = arraysOrdenaciones
			.getInicioOrdenacionesDistancia();

	// Clase del framework de Android para arrastrar elementos de una lista
	private TouchInterceptor touchLista;

	private TouchInterceptor.DropListener listaDropListener = new TouchInterceptor.DropListener() {

		public void drop(int desde, int hasta) {

			// Variable para actualizar la lista según el desplazamiento sea
			// hacia arriba (-1),
			// donde se restarán posiciones, o sea hacia abajo (+1), donde se
			// sumarán posiciones
			int desplazamiento = -1;

			// Si el desplazamiento es hacia abajo se sumarán posiciones
			if (desde < hasta) {
				desplazamiento = 1;
			}

			// Planeta que se arrastra desde la posición desde
			String planetaArrastrado = inicioOrdenacionesDistancia[desde];

			// Se reordena la lista según el desplazamiento
			for (int i = desde; i != hasta; i = i + desplazamiento) {
				inicioOrdenacionesDistancia[i] = inicioOrdenacionesDistancia[i
						+ desplazamiento];
			}

			// En la posición hasta de la lista ponemos el planeta que se ha
			// arrastrado hasta esa posición
			inicioOrdenacionesDistancia[hasta] = planetaArrastrado;

			// Se notifica que la lista ha cambiado para que se actualice la
			// vista
			((BaseAdapter) touchLista.getAdapter()).notifyDataSetChanged();
		}
	};

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ordenacion_distancia);

		// Formato de las filas definido en la clase ImagenArrayAdapter
		setListAdapter(new OrdenacionDistanciaAdapter(this,
				inicioOrdenacionesDistancia));

		// Inicializamos la lista que escuchará los eventos
		touchLista = (TouchInterceptor) getListView();
		touchLista.setDropListener(listaDropListener);
		registerForContextMenu(touchLista);

	}

	// Método que detecta cuando se pincha una fila de la lista
	protected void onListItemClick(ListView lista, View vista, int posicion,
			long id) {

		Utilidades utilidades = new Utilidades();
		String seleccionado = inicioOrdenacionesDistancia[posicion];

		utilidades.ordenacionesMostrarDistancia(getApplicationContext(),
				(ViewGroup) findViewById(R.id.toast_layout_id), seleccionado,
				posicion);

	}

	// get para devolver la lista para obtener el nombre del planeta que se va a
	// arrastrar
	public TouchInterceptor getTouchLista() {
		return touchLista;
	}

}
