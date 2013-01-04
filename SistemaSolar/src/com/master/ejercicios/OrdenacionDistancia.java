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

			// Variable para actualizar la lista seg�n el desplazamiento sea
			// hacia arriba (-1),
			// donde se restar�n posiciones, o sea hacia abajo (+1), donde se
			// sumar�n posiciones
			int desplazamiento = -1;

			// Si el desplazamiento es hacia abajo se sumar�n posiciones
			if (desde < hasta) {
				desplazamiento = 1;
			}

			// Planeta que se arrastra desde la posici�n desde
			String planetaArrastrado = inicioOrdenacionesDistancia[desde];

			// Se reordena la lista seg�n el desplazamiento
			for (int i = desde; i != hasta; i = i + desplazamiento) {
				inicioOrdenacionesDistancia[i] = inicioOrdenacionesDistancia[i
						+ desplazamiento];
			}

			// En la posici�n hasta de la lista ponemos el planeta que se ha
			// arrastrado hasta esa posici�n
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

		// Inicializamos la lista que escuchar� los eventos
		touchLista = (TouchInterceptor) getListView();
		touchLista.setDropListener(listaDropListener);
		registerForContextMenu(touchLista);

	}

	// M�todo que detecta cuando se pincha una fila de la lista
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
