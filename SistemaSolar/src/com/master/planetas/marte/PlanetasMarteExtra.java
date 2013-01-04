package com.master.planetas.marte;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.master.Planetas;
import com.master.R;

public class PlanetasMarteExtra extends Activity {

	private Button bVerMarteExtraTextoExploracion;
	private Button bMarteExtraTextoExploracion;
	private TextView MarteExtraTextoExploracion1T;
	private TextView MarteExtraTextoExploracion2T;

	private Button bVerMarteExtraTexto70s;
	private Button bOcultarMarteExtraTexto70s;
	private TextView Extra70s1T;
	private TextView Extra70s2T;
	private TextView Extra70s3T;

	private Button bVerMarteExtraTexto8090s;
	private Button bOcultarMarteExtraTexto8090s;
	private TextView Extra8090s1T;
	private TextView Extra8090s2T;
	private ImageView Extra8090s3I;
	private TextView Extra8090s4C;

	private Button bVerMarteExtraTextos21;
	private Button bOcultarMarteExtraTextos21;
	private TextView s211T;
	private TextView s212T;
	private ImageView s213I;
	private TextView s214C;
	private TextView s215T;
	private TextView s216T;
	private ImageView s217I;
	private TextView s218C;
	private TextView s219T;
	private TextView s2110T;
	private ImageView s2111I;
	private TextView s2112C;
	private TextView s2113T;
	private TextView s2114T;
	private ImageView s2115I;
	private TextView s2116C;
	private TextView s2117T;
	private TextView s2118T;
	private ImageView s2119I;
	private TextView s2120C;
	private TextView s2121T;
	private ImageView s2122I;
	private TextView s2123C;

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.planetas_marte_extra);

		// EXPLORACION
		bVerMarteExtraTextoExploracion = (Button) findViewById(R.id.VerMarteExtraTextoExploracion);
		MarteExtraTextoExploracion1T = (TextView) findViewById(R.id.MarteExtraTextoExploracion1T);
		MarteExtraTextoExploracion2T = (TextView) findViewById(R.id.MarteExtraTextoExploracion2T);
		bMarteExtraTextoExploracion = (Button) findViewById(R.id.OcultarMarteExtraTextoExploracion);

		MarteExtraTextoExploracion1T.setVisibility(View.GONE);
		MarteExtraTextoExploracion2T.setVisibility(View.GONE);
		bMarteExtraTextoExploracion.setVisibility(View.GONE);

		bVerMarteExtraTextoExploracion
				.setOnClickListener(new OnClickListener() {
					public void onClick(View view) {
						MarteExtraTextoExploracion1T
								.setVisibility(View.VISIBLE);
						MarteExtraTextoExploracion2T
								.setVisibility(View.VISIBLE);
						bMarteExtraTextoExploracion.setVisibility(View.VISIBLE);
					}
				});

		bMarteExtraTextoExploracion.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				MarteExtraTextoExploracion1T.setVisibility(View.GONE);
				MarteExtraTextoExploracion2T.setVisibility(View.GONE);
				bMarteExtraTextoExploracion.setVisibility(View.GONE);
			}
		});

		Animation a = AnimationUtils.loadAnimation(this, R.anim.rotate1);
		a.reset();
		bVerMarteExtraTextoExploracion.clearAnimation();
		bVerMarteExtraTextoExploracion.startAnimation(a);

		// 1970-1979
		bVerMarteExtraTexto70s = (Button) findViewById(R.id.VerMarteExtraTexto70s);
		bOcultarMarteExtraTexto70s = (Button) findViewById(R.id.OcultarMarteExtraTexto70s);

		Extra70s1T = (TextView) findViewById(R.id.Extra70s1T);
		Extra70s2T = (TextView) findViewById(R.id.Extra70s2T);
		Extra70s3T = (TextView) findViewById(R.id.Extra70s3T);

		bOcultarMarteExtraTexto70s.setVisibility(View.GONE);
		Extra70s1T.setVisibility(View.GONE);
		Extra70s2T.setVisibility(View.GONE);
		Extra70s3T.setVisibility(View.GONE);

		bVerMarteExtraTexto70s.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				bOcultarMarteExtraTexto70s.setVisibility(View.VISIBLE);
				Extra70s1T.setVisibility(View.VISIBLE);
				Extra70s2T.setVisibility(View.VISIBLE);
				Extra70s3T.setVisibility(View.VISIBLE);
			}
		});

		bOcultarMarteExtraTexto70s.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				bOcultarMarteExtraTexto70s.setVisibility(View.GONE);
				Extra70s1T.setVisibility(View.GONE);
				Extra70s2T.setVisibility(View.GONE);
				Extra70s3T.setVisibility(View.GONE);
			}
		});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate2);
		a.reset();
		bVerMarteExtraTexto70s.clearAnimation();
		bVerMarteExtraTexto70s.startAnimation(a);

		// 1980-1999
		bVerMarteExtraTexto8090s = (Button) findViewById(R.id.VerMarteExtraTexto8090s);
		bOcultarMarteExtraTexto8090s = (Button) findViewById(R.id.OcultarMarteExtraTexto8090s);

		Extra8090s1T = (TextView) findViewById(R.id.Extra8090s1T);
		Extra8090s2T = (TextView) findViewById(R.id.Extra8090s2T);
		Extra8090s3I = (ImageView) findViewById(R.id.Extra8090s3I);
		Extra8090s4C = (TextView) findViewById(R.id.Extra8090s4C);

		bOcultarMarteExtraTexto8090s.setVisibility(View.GONE);
		Extra8090s1T.setVisibility(View.GONE);
		Extra8090s2T.setVisibility(View.GONE);
		Extra8090s3I.setVisibility(View.GONE);
		Extra8090s4C.setVisibility(View.GONE);

		bVerMarteExtraTexto8090s.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				bOcultarMarteExtraTexto8090s.setVisibility(View.VISIBLE);
				Extra8090s1T.setVisibility(View.VISIBLE);
				Extra8090s2T.setVisibility(View.VISIBLE);
				Extra8090s3I.setVisibility(View.VISIBLE);
				Extra8090s4C.setVisibility(View.VISIBLE);
			}
		});

		bOcultarMarteExtraTexto8090s.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				bOcultarMarteExtraTexto8090s.setVisibility(View.GONE);
				Extra8090s1T.setVisibility(View.GONE);
				Extra8090s2T.setVisibility(View.GONE);
				Extra8090s3I.setVisibility(View.GONE);
				Extra8090s4C.setVisibility(View.GONE);
			}
		});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate3);
		a.reset();
		bVerMarteExtraTexto8090s.clearAnimation();
		bVerMarteExtraTexto8090s.startAnimation(a);

		// Siglo XXI
		bVerMarteExtraTextos21 = (Button) findViewById(R.id.VerMarteExtraTextos21);
		bOcultarMarteExtraTextos21 = (Button) findViewById(R.id.OcultarMarteExtraTextos21);

		s211T = (TextView) findViewById(R.id.s211T);
		s212T = (TextView) findViewById(R.id.s212T);
		s213I = (ImageView) findViewById(R.id.s213I);
		s214C = (TextView) findViewById(R.id.s214C);
		s215T = (TextView) findViewById(R.id.s215T);
		s216T = (TextView) findViewById(R.id.s216T);
		s217I = (ImageView) findViewById(R.id.s217I);
		s218C = (TextView) findViewById(R.id.s218C);
		s219T = (TextView) findViewById(R.id.s219T);
		s2110T = (TextView) findViewById(R.id.s2110T);
		s2111I = (ImageView) findViewById(R.id.s2111I);
		s2112C = (TextView) findViewById(R.id.s2112C);
		s2113T = (TextView) findViewById(R.id.s2113T);
		s2114T = (TextView) findViewById(R.id.s2114T);
		s2115I = (ImageView) findViewById(R.id.s2115I);
		s2116C = (TextView) findViewById(R.id.s2116C);
		s2117T = (TextView) findViewById(R.id.s2117T);
		s2118T = (TextView) findViewById(R.id.s2118T);
		s2119I = (ImageView) findViewById(R.id.s2119I);
		s2120C = (TextView) findViewById(R.id.s2120C);
		s2121T = (TextView) findViewById(R.id.s2121T);
		s2122I = (ImageView) findViewById(R.id.s2122I);
		s2123C = (TextView) findViewById(R.id.s2123C);

		s211T.setVisibility(View.GONE);
		s211T.setVisibility(View.GONE);
		s212T.setVisibility(View.GONE);
		s213I.setVisibility(View.GONE);
		s214C.setVisibility(View.GONE);
		s215T.setVisibility(View.GONE);
		s216T.setVisibility(View.GONE);
		s217I.setVisibility(View.GONE);
		s218C.setVisibility(View.GONE);
		s219T.setVisibility(View.GONE);
		s2110T.setVisibility(View.GONE);
		s2111I.setVisibility(View.GONE);
		s2112C.setVisibility(View.GONE);
		s2113T.setVisibility(View.GONE);
		s2114T.setVisibility(View.GONE);
		s2115I.setVisibility(View.GONE);
		s2116C.setVisibility(View.GONE);
		s2117T.setVisibility(View.GONE);
		s2118T.setVisibility(View.GONE);
		s2119I.setVisibility(View.GONE);
		s2120C.setVisibility(View.GONE);
		s2121T.setVisibility(View.GONE);
		s2122I.setVisibility(View.GONE);
		s2123C.setVisibility(View.GONE);
		bOcultarMarteExtraTextos21.setVisibility(View.GONE);

		bVerMarteExtraTextos21.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				bOcultarMarteExtraTextos21.setVisibility(View.VISIBLE);
				s211T.setVisibility(View.VISIBLE);
				s211T.setVisibility(View.VISIBLE);
				s212T.setVisibility(View.VISIBLE);
				s213I.setVisibility(View.VISIBLE);
				s214C.setVisibility(View.VISIBLE);
				s215T.setVisibility(View.VISIBLE);
				s216T.setVisibility(View.VISIBLE);
				s217I.setVisibility(View.VISIBLE);
				s218C.setVisibility(View.VISIBLE);
				s219T.setVisibility(View.VISIBLE);
				s2110T.setVisibility(View.VISIBLE);
				s2111I.setVisibility(View.VISIBLE);
				s2112C.setVisibility(View.VISIBLE);
				s2113T.setVisibility(View.VISIBLE);
				s2114T.setVisibility(View.VISIBLE);
				s2115I.setVisibility(View.VISIBLE);
				s2116C.setVisibility(View.VISIBLE);
				s2117T.setVisibility(View.VISIBLE);
				s2118T.setVisibility(View.VISIBLE);
				s2119I.setVisibility(View.VISIBLE);
				s2120C.setVisibility(View.VISIBLE);
				s2121T.setVisibility(View.VISIBLE);
				s2122I.setVisibility(View.VISIBLE);
				s2123C.setVisibility(View.VISIBLE);

			}
		});

		bOcultarMarteExtraTextos21.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				bOcultarMarteExtraTextos21.setVisibility(View.GONE);
				s211T.setVisibility(View.GONE);
				s211T.setVisibility(View.GONE);
				s212T.setVisibility(View.GONE);
				s213I.setVisibility(View.GONE);
				s214C.setVisibility(View.GONE);
				s215T.setVisibility(View.GONE);
				s216T.setVisibility(View.GONE);
				s217I.setVisibility(View.GONE);
				s218C.setVisibility(View.GONE);
				s219T.setVisibility(View.GONE);
				s2110T.setVisibility(View.GONE);
				s2111I.setVisibility(View.GONE);
				s2112C.setVisibility(View.GONE);
				s2113T.setVisibility(View.GONE);
				s2114T.setVisibility(View.GONE);
				s2115I.setVisibility(View.GONE);
				s2116C.setVisibility(View.GONE);
				s2117T.setVisibility(View.GONE);
				s2118T.setVisibility(View.GONE);
				s2119I.setVisibility(View.GONE);
				s2120C.setVisibility(View.GONE);
				s2121T.setVisibility(View.GONE);
				s2122I.setVisibility(View.GONE);
				s2123C.setVisibility(View.GONE);
			}
		});

		a = AnimationUtils.loadAnimation(this, R.anim.rotate4);
		a.reset();
		bVerMarteExtraTextos21.clearAnimation();
		bVerMarteExtraTextos21.startAnimation(a);

	}

	@Override
	public void onBackPressed() {
		Intent intent = new Intent(this, Planetas.class);
		startActivity(intent);
	}

}