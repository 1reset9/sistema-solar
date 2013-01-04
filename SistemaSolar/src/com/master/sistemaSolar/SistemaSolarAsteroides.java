package com.master.sistemaSolar;

import com.master.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SistemaSolarAsteroides extends Activity {

	private Button bVerAsteroidesCinturonAsteroides;
	private Button bOcultarAsteroidesCinturonAsteroides;
	private TextView AsteroidesCinturonAsteroidesT;
	private ImageView AsteroidesCinturonAsteroidesI;
	private TextView AsteroidesCinturonAsteroidesC;
	private TextView AsteroidesCinturonAsteroidesT2;
	private ImageView AsteroidesCinturonAsteroidesI2;

	private Button bVerAsteroidesCercanosTierra;
	private Button bOcultarAsteroidesCercanosTierra;
	private TextView AsteroidesCercanosTierraT;
	private TextView AsteroidesCercanosTierraT2;
	private ImageView AsteroidesCercanosTierraI;
	private TextView AsteroidesCercanosTierraC;

	private Button bVerAsteroidesTroyanos;
	private Button bOcultarAsteroidesTroyanos;
	private TextView AsteroidesTroyanosT;

	private Button bVerAsteroidesCentauros;
	private Button bOcultarAsteroidesCentauros;
	private TextView AsteroidesCentaurosT;
	private TextView AsteroidesCentaurosT2;
	private ImageView AsteroidesCentaurosI;
	private TextView AsteroidesCentaurosC;

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.sistema_solar_asteroides);

		// CINTURÓN DE ASTEROIDES
		bVerAsteroidesCinturonAsteroides = (Button) findViewById(R.id.VerAsteroidesCinturonAsteroides);
		AsteroidesCinturonAsteroidesT = (TextView) findViewById(R.id.AsteroidesCinturonAsteroidesT);
		AsteroidesCinturonAsteroidesI = (ImageView) findViewById(R.id.AsteroidesCinturonAsteroidesI);
		AsteroidesCinturonAsteroidesC = (TextView) findViewById(R.id.AsteroidesCinturonAsteroidesC);
		AsteroidesCinturonAsteroidesT2 = (TextView) findViewById(R.id.AsteroidesCinturonAsteroidesT2);
		AsteroidesCinturonAsteroidesI2 = (ImageView) findViewById(R.id.AsteroidesCinturonAsteroidesI2);
		bOcultarAsteroidesCinturonAsteroides = (Button) findViewById(R.id.OcultarAsteroidesCinturonAsteroides);

		AsteroidesCinturonAsteroidesT.setVisibility(View.GONE);
		AsteroidesCinturonAsteroidesI.setVisibility(View.GONE);
		AsteroidesCinturonAsteroidesC.setVisibility(View.GONE);
		AsteroidesCinturonAsteroidesT2.setVisibility(View.GONE);
		AsteroidesCinturonAsteroidesI2.setVisibility(View.GONE);
		bOcultarAsteroidesCinturonAsteroides.setVisibility(View.GONE);

		bVerAsteroidesCinturonAsteroides
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						AsteroidesCinturonAsteroidesT
								.setVisibility(View.VISIBLE);
						AsteroidesCinturonAsteroidesI
								.setVisibility(View.VISIBLE);
						AsteroidesCinturonAsteroidesC
								.setVisibility(View.VISIBLE);
						AsteroidesCinturonAsteroidesT2
								.setVisibility(View.VISIBLE);
						AsteroidesCinturonAsteroidesI2
								.setVisibility(View.VISIBLE);
						bOcultarAsteroidesCinturonAsteroides
								.setVisibility(View.VISIBLE);
					}
				});

		bOcultarAsteroidesCinturonAsteroides
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						AsteroidesCinturonAsteroidesT.setVisibility(View.GONE);
						AsteroidesCinturonAsteroidesI.setVisibility(View.GONE);
						AsteroidesCinturonAsteroidesC.setVisibility(View.GONE);
						AsteroidesCinturonAsteroidesT2.setVisibility(View.GONE);
						AsteroidesCinturonAsteroidesI2.setVisibility(View.GONE);
						bOcultarAsteroidesCinturonAsteroides
								.setVisibility(View.GONE);
					}
				});

		Animation a = AnimationUtils.loadAnimation(this, R.anim.rotate1);
		a.reset();
		bVerAsteroidesCinturonAsteroides.clearAnimation();
		bVerAsteroidesCinturonAsteroides.startAnimation(a);

		// ASTEROIDES CERCANOS A LA TIERRA
		bVerAsteroidesCercanosTierra = (Button) findViewById(R.id.VerAsteroidesCercanosTierra);
		AsteroidesCercanosTierraT = (TextView) findViewById(R.id.AsteroidesCercanosTierraT);
		AsteroidesCercanosTierraT2 = (TextView) findViewById(R.id.AsteroidesCercanosTierraT2);
		AsteroidesCercanosTierraI = (ImageView) findViewById(R.id.AsteroidesCercanosTierraI);
		AsteroidesCercanosTierraC = (TextView) findViewById(R.id.AsteroidesCercanosTierraC);
		bOcultarAsteroidesCercanosTierra = (Button) findViewById(R.id.OcultarAsteroidesCercanosTierra);

		AsteroidesCercanosTierraT.setVisibility(View.GONE);
		AsteroidesCercanosTierraT2.setVisibility(View.GONE);
		AsteroidesCercanosTierraI.setVisibility(View.GONE);
		AsteroidesCercanosTierraC.setVisibility(View.GONE);
		bOcultarAsteroidesCercanosTierra.setVisibility(View.GONE);

		bVerAsteroidesCercanosTierra.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				AsteroidesCercanosTierraT.setVisibility(View.VISIBLE);
				AsteroidesCercanosTierraT2.setVisibility(View.VISIBLE);
				AsteroidesCercanosTierraI.setVisibility(View.VISIBLE);
				AsteroidesCercanosTierraC.setVisibility(View.VISIBLE);
				bOcultarAsteroidesCercanosTierra.setVisibility(View.VISIBLE);
			}
		});

		bOcultarAsteroidesCercanosTierra
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						AsteroidesCercanosTierraT.setVisibility(View.GONE);
						AsteroidesCercanosTierraT2.setVisibility(View.GONE);
						AsteroidesCercanosTierraI.setVisibility(View.GONE);
						AsteroidesCercanosTierraC.setVisibility(View.GONE);
						bOcultarAsteroidesCercanosTierra
								.setVisibility(View.GONE);
					}
				});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate2);
		a.reset();
		bVerAsteroidesCercanosTierra.clearAnimation();
		bVerAsteroidesCercanosTierra.startAnimation(a);

		// ASTEROIDES TROYANOS
		bVerAsteroidesTroyanos = (Button) findViewById(R.id.VerAsteroidesTroyanos);
		AsteroidesTroyanosT = (TextView) findViewById(R.id.AsteroidesTroyanosT);
		bOcultarAsteroidesTroyanos = (Button) findViewById(R.id.OcultarAsteroidesTroyanos);

		AsteroidesTroyanosT.setVisibility(View.GONE);
		bOcultarAsteroidesTroyanos.setVisibility(View.GONE);

		bVerAsteroidesTroyanos.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				AsteroidesTroyanosT.setVisibility(View.VISIBLE);
				bOcultarAsteroidesTroyanos.setVisibility(View.VISIBLE);
			}
		});

		bOcultarAsteroidesTroyanos.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				AsteroidesTroyanosT.setVisibility(View.GONE);
				bOcultarAsteroidesTroyanos.setVisibility(View.GONE);
			}
		});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate3);
		a.reset();
		bVerAsteroidesTroyanos.clearAnimation();
		bVerAsteroidesTroyanos.startAnimation(a);

		// ASTEROIDES CENTAUROS
		bVerAsteroidesCentauros = (Button) findViewById(R.id.VerAsteroidesCentauros);
		AsteroidesCentaurosT = (TextView) findViewById(R.id.AsteroidesCentaurosT);
		AsteroidesCentaurosT2 = (TextView) findViewById(R.id.AsteroidesCentaurosT2);
		AsteroidesCentaurosI = (ImageView) findViewById(R.id.AsteroidesCentaurosI);
		AsteroidesCentaurosC = (TextView) findViewById(R.id.AsteroidesCentaurosC);
		bOcultarAsteroidesCentauros = (Button) findViewById(R.id.OcultarAsteroidesCentauros);

		AsteroidesCentaurosT.setVisibility(View.GONE);
		AsteroidesCentaurosT2.setVisibility(View.GONE);
		AsteroidesCentaurosI.setVisibility(View.GONE);
		AsteroidesCentaurosC.setVisibility(View.GONE);
		bOcultarAsteroidesCentauros.setVisibility(View.GONE);

		bVerAsteroidesCentauros.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				AsteroidesCentaurosT.setVisibility(View.VISIBLE);
				AsteroidesCentaurosT2.setVisibility(View.VISIBLE);
				AsteroidesCentaurosI.setVisibility(View.VISIBLE);
				AsteroidesCentaurosC.setVisibility(View.VISIBLE);
				bOcultarAsteroidesCentauros.setVisibility(View.VISIBLE);
			}
		});

		bOcultarAsteroidesCentauros.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				AsteroidesCentaurosT.setVisibility(View.GONE);
				AsteroidesCentaurosT2.setVisibility(View.GONE);
				AsteroidesCentaurosI.setVisibility(View.GONE);
				AsteroidesCentaurosC.setVisibility(View.GONE);
				bOcultarAsteroidesCentauros.setVisibility(View.GONE);
			}
		});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate4);
		a.reset();
		bVerAsteroidesCentauros.clearAnimation();
		bVerAsteroidesCentauros.startAnimation(a);

	}

}
