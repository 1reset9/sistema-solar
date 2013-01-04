package com.master.planetas.luna;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;

import com.master.Planetas;
import com.master.R;

public class PlanetasLunaTexto extends Activity {

	private Button bVerLunaTextoFormacion;
	private Button bOcultarLunaTextoFormacion;
	private TextView LunaTextoFormacionT;
	private ImageView LunaTextoFormacion2I;
	private TextView LunaTextoFormacion3C;

	private Button bVerLunaTextoSuperficie;
	private Button bOcultarLunaTextoSuperficie;
	private TextView Superficie1T;
	private TextView Superficie2T;
	private ImageView Superficie3I;
	private TextView Superficie4C;
	private TextView Superficie5T;
	private TextView Superficie6T;
	private ImageView Superficie7I;
	private TextView Superficie8C;

	private Button bVerLunaTextoFasesLunares;
	private Button bOcultarLunaTextoFasesLunares;
	private TextView FasesLunares1T;

	private Button bVerLunaTextoObservacionEstudio;
	private Button bOcultarLunaTextoObservacionEstudio;
	private TextView ObservacionEstudio1T;
	private ImageView ObservacionEstudio2I;
	private TextView ObservacionEstudio3C;
	private TextView ObservacionEstudio4T;
	private TableLayout ObservacionEstudio5;
	private TextView ObservacionEstudio6T;
	private TextView ObservacionEstudio7T;
	private ImageView ObservacionEstudio8I;
	private TextView ObservacionEstudio9T;
	private TextView ObservacionEstudio10T;
	private ImageView ObservacionEstudio11I;
	private TextView ObservacionEstudio12C;
	private TextView ObservacionEstudio13T;
	private ImageView ObservacionEstudio14I;
	private TextView ObservacionEstudio15C;
	private TextView ObservacionEstudio16T;
	private TextView ObservacionEstudio17T;
	private TextView ObservacionEstudio18T;
	private ImageView ObservacionEstudio19I;
	private TextView ObservacionEstudio20C;

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.planetas_luna_texto);

		// Formación
		bVerLunaTextoFormacion = (Button) findViewById(R.id.VerLunaTextoFormacion);
		LunaTextoFormacionT = (TextView) findViewById(R.id.LunaTextoFormacionT);
		LunaTextoFormacion2I = (ImageView) findViewById(R.id.LunaTextoFormacion2I);
		LunaTextoFormacion3C = (TextView) findViewById(R.id.LunaTextoFormacion3C);
		bOcultarLunaTextoFormacion = (Button) findViewById(R.id.OcultarLunaTextoFormacion);

		LunaTextoFormacionT.setVisibility(View.GONE);
		LunaTextoFormacion2I.setVisibility(View.GONE);
		LunaTextoFormacion3C.setVisibility(View.GONE);
		bOcultarLunaTextoFormacion.setVisibility(View.GONE);

		bVerLunaTextoFormacion.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				LunaTextoFormacionT.setVisibility(View.VISIBLE);
				LunaTextoFormacion2I.setVisibility(View.VISIBLE);
				LunaTextoFormacion3C.setVisibility(View.VISIBLE);
				bOcultarLunaTextoFormacion.setVisibility(View.VISIBLE);
			}
		});

		bOcultarLunaTextoFormacion.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				LunaTextoFormacionT.setVisibility(View.GONE);
				LunaTextoFormacion2I.setVisibility(View.GONE);
				LunaTextoFormacion3C.setVisibility(View.GONE);
				bOcultarLunaTextoFormacion.setVisibility(View.GONE);
			}
		});

		Animation a = AnimationUtils.loadAnimation(this, R.anim.rotate1);
		a.reset();
		bVerLunaTextoFormacion.clearAnimation();
		bVerLunaTextoFormacion.startAnimation(a);

		// Superficie
		bVerLunaTextoSuperficie = (Button) findViewById(R.id.VerLunaTextoSuperficie);
		bOcultarLunaTextoSuperficie = (Button) findViewById(R.id.OcultarLunaTextoSuperficie);
		Superficie1T = (TextView) findViewById(R.id.Superficie1T);
		Superficie2T = (TextView) findViewById(R.id.Superficie2T);
		Superficie3I = (ImageView) findViewById(R.id.Superficie3I);
		Superficie4C = (TextView) findViewById(R.id.Superficie4C);
		Superficie5T = (TextView) findViewById(R.id.Superficie5T);
		Superficie6T = (TextView) findViewById(R.id.Superficie6T);
		Superficie7I = (ImageView) findViewById(R.id.Superficie7I);
		Superficie8C = (TextView) findViewById(R.id.Superficie8C);

		bOcultarLunaTextoSuperficie.setVisibility(View.GONE);
		Superficie1T.setVisibility(View.GONE);
		Superficie2T.setVisibility(View.GONE);
		Superficie3I.setVisibility(View.GONE);
		Superficie4C.setVisibility(View.GONE);
		Superficie5T.setVisibility(View.GONE);
		Superficie6T.setVisibility(View.GONE);
		Superficie7I.setVisibility(View.GONE);
		Superficie8C.setVisibility(View.GONE);

		bVerLunaTextoSuperficie.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				Superficie1T.setVisibility(View.VISIBLE);
				Superficie2T.setVisibility(View.VISIBLE);
				Superficie3I.setVisibility(View.VISIBLE);
				Superficie4C.setVisibility(View.VISIBLE);
				Superficie5T.setVisibility(View.VISIBLE);
				Superficie6T.setVisibility(View.VISIBLE);
				Superficie7I.setVisibility(View.VISIBLE);
				Superficie8C.setVisibility(View.VISIBLE);
				bOcultarLunaTextoSuperficie.setVisibility(View.VISIBLE);
			}
		});

		bOcultarLunaTextoSuperficie.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				Superficie1T.setVisibility(View.GONE);
				Superficie2T.setVisibility(View.GONE);
				Superficie3I.setVisibility(View.GONE);
				Superficie4C.setVisibility(View.GONE);
				Superficie5T.setVisibility(View.GONE);
				Superficie6T.setVisibility(View.GONE);
				Superficie7I.setVisibility(View.GONE);
				Superficie8C.setVisibility(View.GONE);
				bOcultarLunaTextoSuperficie.setVisibility(View.GONE);
			}
		});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate2);
		a.reset();
		bVerLunaTextoSuperficie.clearAnimation();
		bVerLunaTextoSuperficie.startAnimation(a);

		// Fases Lunares
		bVerLunaTextoFasesLunares = (Button) findViewById(R.id.VerLunaTextoFasesLunares);
		bOcultarLunaTextoFasesLunares = (Button) findViewById(R.id.OcultarLunaTextoFasesLunares);
		FasesLunares1T = (TextView) findViewById(R.id.FasesLunares1T);

		FasesLunares1T.setVisibility(View.GONE);
		bOcultarLunaTextoFasesLunares.setVisibility(View.GONE);

		bVerLunaTextoFasesLunares.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				FasesLunares1T.setVisibility(View.VISIBLE);
				bOcultarLunaTextoFasesLunares.setVisibility(View.VISIBLE);
			}
		});

		bOcultarLunaTextoFasesLunares.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				FasesLunares1T.setVisibility(View.GONE);
				bOcultarLunaTextoFasesLunares.setVisibility(View.GONE);
			}
		});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate3);
		a.reset();
		bVerLunaTextoFasesLunares.clearAnimation();
		bVerLunaTextoFasesLunares.startAnimation(a);

		// Texto Observacion Estudio
		bVerLunaTextoObservacionEstudio = (Button) findViewById(R.id.VerLunaTextoObservacionEstudio);
		ObservacionEstudio1T = (TextView) findViewById(R.id.ObservacionEstudio1T);
		ObservacionEstudio2I = (ImageView) findViewById(R.id.ObservacionEstudio2I);
		ObservacionEstudio3C = (TextView) findViewById(R.id.ObservacionEstudio3C);
		ObservacionEstudio4T = (TextView) findViewById(R.id.ObservacionEstudio4T);
		ObservacionEstudio5 = (TableLayout) findViewById(R.id.ObservacionEstudio5);
		ObservacionEstudio6T = (TextView) findViewById(R.id.ObservacionEstudio6T);
		ObservacionEstudio7T = (TextView) findViewById(R.id.ObservacionEstudio7T);
		ObservacionEstudio8I = (ImageView) findViewById(R.id.ObservacionEstudio8I);
		ObservacionEstudio9T = (TextView) findViewById(R.id.ObservacionEstudio9T);
		ObservacionEstudio10T = (TextView) findViewById(R.id.ObservacionEstudio10T);
		ObservacionEstudio11I = (ImageView) findViewById(R.id.ObservacionEstudio11I);
		ObservacionEstudio12C = (TextView) findViewById(R.id.ObservacionEstudio12C);
		ObservacionEstudio13T = (TextView) findViewById(R.id.ObservacionEstudio13T);
		ObservacionEstudio14I = (ImageView) findViewById(R.id.ObservacionEstudio14I);
		ObservacionEstudio15C = (TextView) findViewById(R.id.ObservacionEstudio15C);
		ObservacionEstudio16T = (TextView) findViewById(R.id.ObservacionEstudio16T);
		ObservacionEstudio17T = (TextView) findViewById(R.id.ObservacionEstudio17T);
		ObservacionEstudio18T = (TextView) findViewById(R.id.ObservacionEstudio18T);
		ObservacionEstudio19I = (ImageView) findViewById(R.id.ObservacionEstudio19I);
		ObservacionEstudio20C = (TextView) findViewById(R.id.ObservacionEstudio20C);
		bOcultarLunaTextoObservacionEstudio = (Button) findViewById(R.id.OcultarLunaTextoObservacionEstudio);

		ObservacionEstudio1T.setVisibility(View.GONE);
		ObservacionEstudio2I.setVisibility(View.GONE);
		ObservacionEstudio3C.setVisibility(View.GONE);
		ObservacionEstudio4T.setVisibility(View.GONE);
		ObservacionEstudio5.setVisibility(View.GONE);
		ObservacionEstudio6T.setVisibility(View.GONE);
		ObservacionEstudio7T.setVisibility(View.GONE);
		ObservacionEstudio8I.setVisibility(View.GONE);
		ObservacionEstudio9T.setVisibility(View.GONE);
		ObservacionEstudio10T.setVisibility(View.GONE);
		ObservacionEstudio11I.setVisibility(View.GONE);
		ObservacionEstudio12C.setVisibility(View.GONE);
		ObservacionEstudio13T.setVisibility(View.GONE);
		ObservacionEstudio14I.setVisibility(View.GONE);
		ObservacionEstudio15C.setVisibility(View.GONE);
		ObservacionEstudio16T.setVisibility(View.GONE);
		ObservacionEstudio17T.setVisibility(View.GONE);
		ObservacionEstudio18T.setVisibility(View.GONE);
		ObservacionEstudio19I.setVisibility(View.GONE);
		ObservacionEstudio20C.setVisibility(View.GONE);
		bOcultarLunaTextoObservacionEstudio.setVisibility(View.GONE);

		bVerLunaTextoObservacionEstudio
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						ObservacionEstudio1T.setVisibility(View.VISIBLE);
						ObservacionEstudio2I.setVisibility(View.VISIBLE);
						ObservacionEstudio3C.setVisibility(View.VISIBLE);
						ObservacionEstudio4T.setVisibility(View.VISIBLE);
						ObservacionEstudio5.setVisibility(View.VISIBLE);
						ObservacionEstudio6T.setVisibility(View.VISIBLE);
						ObservacionEstudio7T.setVisibility(View.VISIBLE);
						ObservacionEstudio8I.setVisibility(View.VISIBLE);
						ObservacionEstudio9T.setVisibility(View.VISIBLE);
						ObservacionEstudio10T.setVisibility(View.VISIBLE);
						ObservacionEstudio11I.setVisibility(View.VISIBLE);
						ObservacionEstudio12C.setVisibility(View.VISIBLE);
						ObservacionEstudio13T.setVisibility(View.VISIBLE);
						ObservacionEstudio14I.setVisibility(View.VISIBLE);
						ObservacionEstudio15C.setVisibility(View.VISIBLE);
						ObservacionEstudio16T.setVisibility(View.VISIBLE);
						ObservacionEstudio17T.setVisibility(View.VISIBLE);
						ObservacionEstudio18T.setVisibility(View.VISIBLE);
						ObservacionEstudio19I.setVisibility(View.VISIBLE);
						ObservacionEstudio20C.setVisibility(View.VISIBLE);
						bOcultarLunaTextoObservacionEstudio
								.setVisibility(View.VISIBLE);
					}
				});

		bOcultarLunaTextoObservacionEstudio
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						ObservacionEstudio1T.setVisibility(View.GONE);
						ObservacionEstudio2I.setVisibility(View.GONE);
						ObservacionEstudio3C.setVisibility(View.GONE);
						ObservacionEstudio4T.setVisibility(View.GONE);
						ObservacionEstudio5.setVisibility(View.GONE);
						ObservacionEstudio6T.setVisibility(View.GONE);
						ObservacionEstudio7T.setVisibility(View.GONE);
						ObservacionEstudio8I.setVisibility(View.GONE);
						ObservacionEstudio9T.setVisibility(View.GONE);
						ObservacionEstudio10T.setVisibility(View.GONE);
						ObservacionEstudio11I.setVisibility(View.GONE);
						ObservacionEstudio12C.setVisibility(View.GONE);
						ObservacionEstudio13T.setVisibility(View.GONE);
						ObservacionEstudio14I.setVisibility(View.GONE);
						ObservacionEstudio15C.setVisibility(View.GONE);
						ObservacionEstudio16T.setVisibility(View.GONE);
						ObservacionEstudio17T.setVisibility(View.GONE);
						ObservacionEstudio18T.setVisibility(View.GONE);
						ObservacionEstudio19I.setVisibility(View.GONE);
						ObservacionEstudio20C.setVisibility(View.GONE);
						bOcultarLunaTextoObservacionEstudio
								.setVisibility(View.GONE);
					}
				});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate4);
		a.reset();
		bVerLunaTextoObservacionEstudio.clearAnimation();
		bVerLunaTextoObservacionEstudio.startAnimation(a);

	}

	@Override
	public void onBackPressed() {
		Intent intent = new Intent(this, Planetas.class);
		startActivity(intent);
	}

}
