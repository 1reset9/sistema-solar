package com.master.planetas.jupiter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ViewSwitcher.ViewFactory;

import com.master.Planetas;
import com.master.R;
import com.master.planetas.jupiter.PlanetasJupiterFotos.ImageAdapter;
import com.master.utilidades.ArraysIdImagenes;
import com.master.utilidades.Utilidades;

public class PlanetasJupiterFotos extends Activity implements ViewFactory {

	Utilidades utilidades = new Utilidades();
	ArraysIdImagenes arraysIdImagenes = new ArraysIdImagenes();

	private Integer[] idImagenes = arraysIdImagenes.getJupiterIdImagenes();
	private String[] idTextos;
	private String[] idCreditos;
	// este componente permite cierta animación para que aparezcan y
	// desaparezcan las imágenes
	private ImageSwitcher imageSwitcher;

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.planetas_fotos);

		idTextos = getResources().getStringArray(
				R.array.jupiter_id_fotos_textos);
		idCreditos = getResources().getStringArray(
				R.array.jupiter_id_fotos_creditos);

		final TextView textoImagen = (TextView) findViewById(R.id.galeria_texto);
		final TextView imagenCredito = (TextView) findViewById(R.id.galeria_texto_credit);

		imageSwitcher = (ImageSwitcher) findViewById(R.id.galeria_imagen_seleccionada);
		imageSwitcher.setFactory(this);

		// se inicializa la pantalla con la primera imagen
		imageSwitcher.setImageResource(idImagenes[0]);
		textoImagen.setText(idTextos[0]);
		imagenCredito.setText(idCreditos[0]);

		// se pone una animación para que entren por la izquierda y salgan por
		// la derecha
		imageSwitcher.setInAnimation(AnimationUtils.loadAnimation(this,
				android.R.anim.slide_in_left));
		imageSwitcher.setOutAnimation(AnimationUtils.loadAnimation(this,
				android.R.anim.slide_out_right));

		Gallery gallery = (Gallery) findViewById(R.id.galeria);
		gallery.setAdapter(new ImageAdapter(this));
		gallery.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {
				imageSwitcher.setImageResource(idImagenes[position]);
				textoImagen.setText(idTextos[position]);
				imagenCredito.setText(idCreditos[position]);
			}
		});
	}

	// se crea una nueva vista para poder mostrar la imagen seleccionada
	public View makeView() {
		ImageView imageView = new ImageView(this);
		imageView.setBackgroundColor(0xFF000000);
		imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
		imageView.setLayoutParams(new ImageSwitcher.LayoutParams(
				LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT));
		return imageView;
	}

	// Adapter para unir la vista de la galería con la imagen en tamaño grande
	public class ImageAdapter extends BaseAdapter {
		private Context context;
		private int itemBackground;

		public ImageAdapter(Context c) {
			context = c;

			// estilo de la galería
			TypedArray a = obtainStyledAttributes(R.styleable.Gallery1);
			itemBackground = a.getResourceId(
					R.styleable.Gallery1_android_galleryItemBackground, 0);
			a.recycle();
		}

		// número de imágenes
		public int getCount() {
			return idImagenes.length;
		}

		// se devuelve el objeto
		public Object getItem(int position) {
			return position;
		}

		// el id de la imagen
		public long getItemId(int position) {
			return position;
		}

		// devuelve la vista de la galería con la imagen en la posición
		// especificada
		public View getView(int position, View convertView, ViewGroup parent) {

			Resources res = getResources();
			int ancho = utilidades.convertirDpaPx(
					res.getInteger(R.integer.gallery_ancho), context);
			int alto = utilidades.convertirDpaPx(
					res.getInteger(R.integer.gallery_alto), context);

			ImageView imageView = new ImageView(context);

			imageView.setImageResource(idImagenes[position]);
			imageView.setScaleType(ImageView.ScaleType.FIT_XY);
			imageView.setLayoutParams(new Gallery.LayoutParams(ancho, alto));
			imageView.setBackgroundResource(itemBackground);

			return imageView;
		}
	}

	// para volver a la pantalla de planetas al pinchar el botón atrás del
	// dispositivo
	@Override
	public void onBackPressed() {
		Intent intent = new Intent(this, Planetas.class);
		startActivity(intent);
	}

}
