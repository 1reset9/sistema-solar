package com.master.utilidades;

import com.master.MyApp;
import com.master.R;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

public class Utilidades {

	public static final TextView darEstilo(Context context, TextView txtTab,
			String texto, Drawable fondo) {

		Resources res = context.getResources();

		txtTab.setText(texto);
		txtTab.setTypeface(null, Typeface.BOLD);
		txtTab.setTextAppearance(context,
				android.R.style.Theme_Holo_Light_DarkActionBar);
		txtTab.setBackgroundDrawable(fondo);
		txtTab.setTextColor(res.getColor(R.color.tab_texto));
		txtTab.setGravity(Gravity.CENTER);
		txtTab.setTextSize(res.getInteger(R.integer.tab_text_size));

		return txtTab;
	}

	public static final TabHost crearTabHost(Context context, TabHost tabHost,
			Drawable fondoVideo, Class claseVideo, Drawable fondoTexto,
			Class claseTexto, Drawable fondoFotos, Class claseFotos) {

		TabHost.TabSpec spec;
		Intent intent;

		String textoVideo = context.getString(R.string.tab_video);
		String textoTexto = context.getString(R.string.tab_texto);
		String textoFotos = context.getString(R.string.tab_fotos);

		// pestaña1
		TextView txtTab1 = new TextView(context);
		txtTab1 = Utilidades
				.darEstilo(context, txtTab1, textoVideo, fondoVideo);
		intent = new Intent().setClass(context, claseVideo);
		spec = tabHost.newTabSpec("Video");
		spec.setIndicator(txtTab1);
		spec.setContent(intent);
		tabHost.addTab(spec);

		// pestaña2
		TextView txtTab2 = new TextView(context);
		txtTab2 = Utilidades
				.darEstilo(context, txtTab2, textoTexto, fondoTexto);
		intent = new Intent().setClass(context, claseTexto);
		spec = tabHost.newTabSpec("Texto");
		spec.setIndicator(txtTab2);
		spec.setContent(intent);
		tabHost.addTab(spec);

		// pestaña3
		TextView txtTab3 = new TextView(context);
		txtTab3 = Utilidades
				.darEstilo(context, txtTab3, textoFotos, fondoFotos);
		intent = new Intent().setClass(context, claseFotos);
		spec = tabHost.newTabSpec("Fotos");
		spec.setIndicator(txtTab3);
		spec.setContent(intent);
		tabHost.addTab(spec);

		MyApp myApp = ((MyApp) context.getApplicationContext());
		int tabSeleccionado = myApp.getTabSeleccionado();
		tabHost.setCurrentTab(tabSeleccionado);

		return tabHost;
	}

	public static final TabHost crearTabHost(Context context, TabHost tabHost,
			Drawable fondoVideo, Class claseVideo, Drawable fondoTexto,
			Class claseTexto, Drawable fondoFotos, Class claseFotos,
			Drawable fondoExtra, Class claseExtra) {

		TabHost.TabSpec spec;
		Intent intent;

		String textoExtra = context.getString(R.string.tab_extra); // (pasar
																	// como
																	// parámetro)

		tabHost = Utilidades.crearTabHost(context, tabHost, fondoVideo,
				claseVideo, fondoTexto, claseTexto, fondoFotos, claseFotos);

		// pestaña4
		TextView txtTab4 = new TextView(context);
		txtTab4 = Utilidades
				.darEstilo(context, txtTab4, textoExtra, fondoExtra);
		intent = new Intent().setClass(context, claseExtra);
		spec = tabHost.newTabSpec("Extra");
		spec.setIndicator(txtTab4);
		spec.setContent(intent);
		tabHost.addTab(spec);

		MyApp myApp = ((MyApp) context.getApplicationContext());
		int tabSeleccionado = myApp.getTabSeleccionado();
		tabHost.setCurrentTab(tabSeleccionado);

		return tabHost;
	}

	public int convertirDpaPx(int dp, Context context) {

		final float densidad = context.getResources().getDisplayMetrics().density;
		return (int) (dp * densidad + 0.5f);
	}

	// Método para mostrar la información de la distancia al pinchar a la
	// derecha de cada fila
	public void ordenacionesMostrarDistancia(Context context,
			ViewGroup viewGroup, String seleccionado, int posicion) {

		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		View layout = inflater.inflate(R.layout.ordenaciones_toast, viewGroup);

		ImageView imageView = (ImageView) layout
				.findViewById(R.id.imagen_toast);

		// Se asigna la imagen correspondiente según el planeta seleccionado
		if (seleccionado.equals("Mercurio")) {
			imageView.setImageResource(R.drawable.distancia_mercurio);
		}
		if (seleccionado.equals("Venus")) {
			imageView.setImageResource(R.drawable.distancia_venus);
		}
		if (seleccionado.equals("Tierra")) {
			imageView.setImageResource(R.drawable.distancia_tierra);
		}
		if (seleccionado.equals("Marte")) {
			imageView.setImageResource(R.drawable.distancia_marte);
		}
		if (seleccionado.equals("Jupiter")) {
			imageView.setImageResource(R.drawable.distancia_jupiter);
		}
		if (seleccionado.equals("Saturno")) {
			imageView.setImageResource(R.drawable.distancia_saturno);
		}
		if (seleccionado.equals("Urano")) {
			imageView.setImageResource(R.drawable.distancia_urano);
		}
		if (seleccionado.equals("Neptuno")) {
			imageView.setImageResource(R.drawable.distancia_neptuno);
		}

		Toast toast = new Toast(context);
		toast.setGravity(Gravity.CENTER, 0, 0);
		toast.setDuration(Toast.LENGTH_LONG);
		toast.setView(layout);
		toast.show();

	}

	// Método para mostrar la información del tamaño al pinchar a la
	// derecha de cada fila
	public void ordenacionesMostrarTamano(Context context, ViewGroup viewGroup,
			String seleccionado, int posicion) {

		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		View layout = inflater.inflate(R.layout.ordenaciones_toast, viewGroup);

		ImageView imageView = (ImageView) layout
				.findViewById(R.id.imagen_toast);

		// Se asigna la imagen correspondiente según el planeta seleccionado
		if (seleccionado.equals("Mercurio")) {
			imageView.setImageResource(R.drawable.tamano_mercurio);
		}
		if (seleccionado.equals("Venus")) {
			imageView.setImageResource(R.drawable.tamano_venus);
		}
		if (seleccionado.equals("Tierra")) {
			imageView.setImageResource(R.drawable.tamano_tierra);
		}
		if (seleccionado.equals("Marte")) {
			imageView.setImageResource(R.drawable.tamano_marte);
		}
		if (seleccionado.equals("Jupiter")) {
			imageView.setImageResource(R.drawable.tamano_jupiter);
		}
		if (seleccionado.equals("Saturno")) {
			imageView.setImageResource(R.drawable.tamano_saturno);
		}
		if (seleccionado.equals("Urano")) {
			imageView.setImageResource(R.drawable.tamano_urano);
		}
		if (seleccionado.equals("Neptuno")) {
			imageView.setImageResource(R.drawable.tamano_neptuno);
		}

		Toast toast = new Toast(context);
		toast.setGravity(Gravity.CENTER, 0, 0);
		toast.setDuration(Toast.LENGTH_LONG);
		toast.setView(layout);
		toast.show();

	}

	public ImageView ordenaDistanciaImagenInicial(ImageView imageView,
			String planeta, int posicion) {

		if (planeta.equals("Mercurio")) {

			if (posicion == 0) {
				imageView.setImageResource(R.drawable.lista_mercurio_v);
			} else {
				imageView.setImageResource(R.drawable.lista_mercurio_r);
			}

		} else if (planeta.equals("Venus")) {

			if (posicion == 1) {
				imageView.setImageResource(R.drawable.lista_venus_v);
			} else {
				imageView.setImageResource(R.drawable.lista_venus_r);
			}

		} else if (planeta.equals("Tierra")) {

			if (posicion == 2) {
				imageView.setImageResource(R.drawable.lista_tierra_v);
			} else {
				imageView.setImageResource(R.drawable.lista_tierra_r);
			}

		} else if (planeta.equals("Marte")) {

			if (posicion == 3) {
				imageView.setImageResource(R.drawable.lista_marte_v);
			} else {
				imageView.setImageResource(R.drawable.lista_marte_r);
			}

		} else if (planeta.equals("Jupiter")) {

			if (posicion == 4) {
				imageView.setImageResource(R.drawable.lista_jupiter_v);
			} else {
				imageView.setImageResource(R.drawable.lista_jupiter_r);
			}

		} else if (planeta.equals("Saturno")) {

			if (posicion == 5) {
				imageView.setImageResource(R.drawable.lista_saturno_v);
			} else {
				imageView.setImageResource(R.drawable.lista_saturno_r);
			}

		} else if (planeta.equals("Urano")) {

			if (posicion == 6) {
				imageView.setImageResource(R.drawable.lista_urano_v);
			} else {
				imageView.setImageResource(R.drawable.lista_urano_r);
			}

		} else if (planeta.equals("Neptuno")) {

			if (posicion == 7) {
				imageView.setImageResource(R.drawable.lista_neptuno_v);
			} else {
				imageView.setImageResource(R.drawable.lista_neptuno_r);
			}

		}

		return imageView;

	}

	public ImageView ordenaTamanoImagenInicial(ImageView imageView,
			String planeta, int posicion) {

		if (planeta.equals("Mercurio")) {

			if (posicion == 0) {
				imageView.setImageResource(R.drawable.lista_mercurio_v);
			} else {
				imageView.setImageResource(R.drawable.lista_mercurio_r);
			}

		} else if (planeta.equals("Venus")) {

			if (posicion == 2) {
				imageView.setImageResource(R.drawable.lista_venus_v);
			} else {
				imageView.setImageResource(R.drawable.lista_venus_r);
			}

		} else if (planeta.equals("Tierra")) {

			if (posicion == 3) {
				imageView.setImageResource(R.drawable.lista_tierra_v);
			} else {
				imageView.setImageResource(R.drawable.lista_tierra_r);
			}

		} else if (planeta.equals("Marte")) {

			if (posicion == 1) {
				imageView.setImageResource(R.drawable.lista_marte_v);
			} else {
				imageView.setImageResource(R.drawable.lista_marte_r);
			}

		} else if (planeta.equals("Jupiter")) {

			if (posicion == 7) {
				imageView.setImageResource(R.drawable.lista_jupiter_v);
			} else {
				imageView.setImageResource(R.drawable.lista_jupiter_r);
			}

		} else if (planeta.equals("Saturno")) {

			if (posicion == 6) {
				imageView.setImageResource(R.drawable.lista_saturno_v);
			} else {
				imageView.setImageResource(R.drawable.lista_saturno_r);
			}

		} else if (planeta.equals("Urano")) {

			if (posicion == 5) {
				imageView.setImageResource(R.drawable.lista_urano_v);
			} else {
				imageView.setImageResource(R.drawable.lista_urano_r);
			}

		} else if (planeta.equals("Neptuno")) {

			if (posicion == 4) {
				imageView.setImageResource(R.drawable.lista_neptuno_v);
			} else {
				imageView.setImageResource(R.drawable.lista_neptuno_r);
			}

		}

		return imageView;

	}

	public int obtenerColor(ImageView imagen, int x, int y) {

		imagen.setDrawingCacheEnabled(true);
		Bitmap bitmap = Bitmap.createBitmap(imagen.getDrawingCache());
		imagen.setDrawingCacheEnabled(false);

		return bitmap.getPixel(x, y);
	}

	public boolean comprobarColores(int color1, int color2) {

		boolean iguales = false;

		if (Math.abs(Color.red(color1) - Color.red(color2)) <= Constantes.toleranciaComprobarColores
				&& Math.abs(Color.green(color1) - Color.green(color2)) <= Constantes.toleranciaComprobarColores
				&& Math.abs(Color.blue(color1) - Color.blue(color2)) <= Constantes.toleranciaComprobarColores) {
			iguales = true;
		}

		return iguales;
	}

	public void mostrarPlaneta(int colorPulsado, Context context) {

		Toast toast = new Toast(context);
		ImageView view = new ImageView(context);

		if (!comprobarColores(Color.WHITE, colorPulsado)) {

			if (comprobarColores(Constantes.colorMercurio, colorPulsado)) {
				view.setImageResource(R.drawable.inicio_mercurio);
			} else if (comprobarColores(Constantes.colorVenus, colorPulsado)) {
				view.setImageResource(R.drawable.inicio_venus);
			} else if (comprobarColores(Constantes.colorTierra, colorPulsado)) {
				view.setImageResource(R.drawable.inicio_tierra);
			} else if (comprobarColores(Constantes.colorLuna, colorPulsado)) {
				view.setImageResource(R.drawable.inicio_luna);
			} else if (comprobarColores(Constantes.colorMarte, colorPulsado)) {
				view.setImageResource(R.drawable.inicio_marte);
			} else if (comprobarColores(Constantes.colorJupiter, colorPulsado)) {
				view.setImageResource(R.drawable.inicio_jupiter);
			} else if (comprobarColores(Constantes.colorSaturno, colorPulsado)) {
				view.setImageResource(R.drawable.inicio_saturno);
			} else if (comprobarColores(Constantes.colorUrano, colorPulsado)) {
				view.setImageResource(R.drawable.inicio_urano);
			} else if (comprobarColores(Constantes.colorNeptuno, colorPulsado)) {
				view.setImageResource(R.drawable.inicio_neptuno);
			}

			toast.setView(view);
			toast.show();

		}

	}

}
