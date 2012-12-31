package com.master.sistemaSolar;

import com.master.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;

public class SistemaSolarCompararPlanetas extends Activity implements
		OnItemSelectedListener {

	Spinner spinner1;
	Spinner spinner2;

	TextView cabecera1;
	TextView distancia1;
	TextView diametro1;
	TextView densidad1;
	TextView gravedad1;
	TextView periodo_rotacion1;
	TextView periodo_orbital1;
	TextView velocidad_orbital1;
	TextView temperatura1;
	TextView satelites1;

	TextView cabecera2;
	TextView distancia2;
	TextView diametro2;
	TextView densidad2;
	TextView gravedad2;
	TextView periodo_rotacion2;
	TextView periodo_orbital2;
	TextView velocidad_orbital2;
	TextView temperatura2;
	TextView satelites2;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.sistema_solar_comparar_planetas);

		spinner1 = (Spinner) findViewById(R.id.spinner_comparar_planetas1);
		spinner2 = (Spinner) findViewById(R.id.spinner_comparar_planetas2);

		cabecera1 = (TextView) findViewById(R.id.cabecera_planeta1);
		distancia1 = (TextView) findViewById(R.id.distancia1);
		diametro1 = (TextView) findViewById(R.id.diametro1);
		densidad1 = (TextView) findViewById(R.id.densidad1);
		gravedad1 = (TextView) findViewById(R.id.gravedad1);
		periodo_rotacion1 = (TextView) findViewById(R.id.periodo_rotacion1);
		periodo_orbital1 = (TextView) findViewById(R.id.periodo_orbital1);
		velocidad_orbital1 = (TextView) findViewById(R.id.velocidad_orbital1);
		temperatura1 = (TextView) findViewById(R.id.temperatura1);
		satelites1 = (TextView) findViewById(R.id.satelites1);

		cabecera2 = (TextView) findViewById(R.id.cabecera_planeta2);
		distancia2 = (TextView) findViewById(R.id.distancia2);
		diametro2 = (TextView) findViewById(R.id.diametro2);
		densidad2 = (TextView) findViewById(R.id.densidad2);
		gravedad2 = (TextView) findViewById(R.id.gravedad2);
		periodo_rotacion2 = (TextView) findViewById(R.id.periodo_rotacion2);
		periodo_orbital2 = (TextView) findViewById(R.id.periodo_orbital2);
		velocidad_orbital2 = (TextView) findViewById(R.id.velocidad_orbital2);
		temperatura2 = (TextView) findViewById(R.id.temperatura2);
		satelites2 = (TextView) findViewById(R.id.satelites2);

		spinner1.setOnItemSelectedListener(SistemaSolarCompararPlanetas.this);
		spinner2.setOnItemSelectedListener(SistemaSolarCompararPlanetas.this);

		ArrayAdapter<?> adapter = ArrayAdapter.createFromResource(
				getApplicationContext(), R.array.spinnerCompararPlanetas,
				android.R.layout.simple_spinner_dropdown_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

		spinner1.setAdapter(adapter);
		// Se selecciona inicialmente la Tierra en el planeta de la izquierda
		spinner1.setSelection(2);
		spinner2.setAdapter(adapter);

	}

	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {

		switch (parent.getId()) {
		case R.id.spinner_comparar_planetas1:

			String cabecera1String = parent.getItemAtPosition(position)
					.toString();
			cabecera1.setText(cabecera1String);

			switch (position) {
			case 0:
				compararPlaneta1(
						getResources().getString(R.string.mercurio_distancia),
						getResources().getString(R.string.mercurio_diametro),
						getResources().getString(R.string.mercurio_densidad),
						getResources().getString(R.string.mercurio_gravedad),
						getResources().getString(
								R.string.mercurio_periodo_rotacion),
						getResources().getString(
								R.string.mercurio_periodo_orbital),
						getResources().getString(
								R.string.mercurio_velocidad_orbital),
						getResources().getString(R.string.mercurio_temperatura),
						getResources().getString(R.string.mercurio_satelites));
				break;
			case 1:
				compararPlaneta1(
						getResources().getString(R.string.venus_distancia),
						getResources().getString(R.string.venus_diametro),
						getResources().getString(R.string.venus_densidad),
						getResources().getString(R.string.venus_gravedad),
						getResources().getString(
								R.string.venus_periodo_rotacion),
						getResources()
								.getString(R.string.venus_periodo_orbital),
						getResources().getString(
								R.string.venus_velocidad_orbital),
						getResources().getString(R.string.venus_temperatura),
						getResources().getString(R.string.venus_satelites));
				break;
			case 2:
				compararPlaneta1(
						getResources().getString(R.string.tierra_distancia),
						getResources().getString(R.string.tierra_diametro),
						getResources().getString(R.string.tierra_densidad),
						getResources().getString(R.string.tierra_gravedad),
						getResources().getString(
								R.string.tierra_periodo_rotacion),
						getResources().getString(
								R.string.tierra_periodo_orbital),
						getResources().getString(
								R.string.tierra_velocidad_orbital),
						getResources().getString(R.string.tierra_temperatura),
						getResources().getString(R.string.tierra_satelites));
				break;
			case 3:
				compararPlaneta1(
						getResources().getString(R.string.marte_distancia),
						getResources().getString(R.string.marte_diametro),
						getResources().getString(R.string.marte_densidad),
						getResources().getString(R.string.marte_gravedad),
						getResources().getString(
								R.string.marte_periodo_rotacion),
						getResources()
								.getString(R.string.marte_periodo_orbital),
						getResources().getString(
								R.string.marte_velocidad_orbital),
						getResources().getString(R.string.marte_temperatura),
						getResources().getString(R.string.marte_satelites));
				break;
			case 4:
				compararPlaneta1(
						getResources().getString(R.string.jupiter_distancia),
						getResources().getString(R.string.jupiter_diametro),
						getResources().getString(R.string.jupiter_densidad),
						getResources().getString(R.string.jupiter_gravedad),
						getResources().getString(
								R.string.jupiter_periodo_rotacion),
						getResources().getString(
								R.string.jupiter_periodo_orbital),
						getResources().getString(
								R.string.jupiter_velocidad_orbital),
						getResources().getString(R.string.jupiter_temperatura),
						getResources().getString(R.string.jupiter_satelites));
				break;
			case 5:
				compararPlaneta1(
						getResources().getString(R.string.saturno_distancia),
						getResources().getString(R.string.saturno_diametro),
						getResources().getString(R.string.saturno_densidad),
						getResources().getString(R.string.saturno_gravedad),
						getResources().getString(
								R.string.saturno_periodo_rotacion),
						getResources().getString(
								R.string.saturno_periodo_orbital),
						getResources().getString(
								R.string.saturno_velocidad_orbital),
						getResources().getString(R.string.saturno_temperatura),
						getResources().getString(R.string.saturno_satelites));
				break;
			case 6:
				compararPlaneta1(
						getResources().getString(R.string.urano_distancia),
						getResources().getString(R.string.urano_diametro),
						getResources().getString(R.string.urano_densidad),
						getResources().getString(R.string.urano_gravedad),
						getResources().getString(
								R.string.urano_periodo_rotacion),
						getResources()
								.getString(R.string.urano_periodo_orbital),
						getResources().getString(
								R.string.urano_velocidad_orbital),
						getResources().getString(R.string.urano_temperatura),
						getResources().getString(R.string.urano_satelites));
				break;
			case 7:
				compararPlaneta1(
						getResources().getString(R.string.neptuno_distancia),
						getResources().getString(R.string.neptuno_diametro),
						getResources().getString(R.string.neptuno_densidad),
						getResources().getString(R.string.neptuno_gravedad),
						getResources().getString(
								R.string.neptuno_periodo_rotacion),
						getResources().getString(
								R.string.neptuno_periodo_orbital),
						getResources().getString(
								R.string.neptuno_velocidad_orbital),
						getResources().getString(R.string.neptuno_temperatura),
						getResources().getString(R.string.neptuno_satelites));
				break;
			}

			break;

		case R.id.spinner_comparar_planetas2:

			String cabecera2String = parent.getItemAtPosition(position)
					.toString();
			cabecera2.setText(cabecera2String);

			switch (position) {
			case 0:
				compararPlaneta2(
						getResources().getString(R.string.mercurio_distancia),
						getResources().getString(R.string.mercurio_diametro),
						getResources().getString(R.string.mercurio_densidad),
						getResources().getString(R.string.mercurio_gravedad),
						getResources().getString(
								R.string.mercurio_periodo_rotacion),
						getResources().getString(
								R.string.mercurio_periodo_orbital),
						getResources().getString(
								R.string.mercurio_velocidad_orbital),
						getResources().getString(R.string.mercurio_temperatura),
						getResources().getString(R.string.mercurio_satelites));
				break;
			case 1:
				compararPlaneta2(
						getResources().getString(R.string.venus_distancia),
						getResources().getString(R.string.venus_diametro),
						getResources().getString(R.string.venus_densidad),
						getResources().getString(R.string.venus_gravedad),
						getResources().getString(
								R.string.venus_periodo_rotacion),
						getResources()
								.getString(R.string.venus_periodo_orbital),
						getResources().getString(
								R.string.venus_velocidad_orbital),
						getResources().getString(R.string.venus_temperatura),
						getResources().getString(R.string.venus_satelites));
				break;
			case 2:
				compararPlaneta2(
						getResources().getString(R.string.tierra_distancia),
						getResources().getString(R.string.tierra_diametro),
						getResources().getString(R.string.tierra_densidad),
						getResources().getString(R.string.tierra_gravedad),
						getResources().getString(
								R.string.tierra_periodo_rotacion),
						getResources().getString(
								R.string.tierra_periodo_orbital),
						getResources().getString(
								R.string.tierra_velocidad_orbital),
						getResources().getString(R.string.tierra_temperatura),
						getResources().getString(R.string.tierra_satelites));
				break;
			case 3:
				compararPlaneta2(
						getResources().getString(R.string.marte_distancia),
						getResources().getString(R.string.marte_diametro),
						getResources().getString(R.string.marte_densidad),
						getResources().getString(R.string.marte_gravedad),
						getResources().getString(
								R.string.marte_periodo_rotacion),
						getResources()
								.getString(R.string.marte_periodo_orbital),
						getResources().getString(
								R.string.marte_velocidad_orbital),
						getResources().getString(R.string.marte_temperatura),
						getResources().getString(R.string.marte_satelites));
				break;
			case 4:
				compararPlaneta2(
						getResources().getString(R.string.jupiter_distancia),
						getResources().getString(R.string.jupiter_diametro),
						getResources().getString(R.string.jupiter_densidad),
						getResources().getString(R.string.jupiter_gravedad),
						getResources().getString(
								R.string.jupiter_periodo_rotacion),
						getResources().getString(
								R.string.jupiter_periodo_orbital),
						getResources().getString(
								R.string.jupiter_velocidad_orbital),
						getResources().getString(R.string.jupiter_temperatura),
						getResources().getString(R.string.jupiter_satelites));
				break;
			case 5:
				compararPlaneta2(
						getResources().getString(R.string.saturno_distancia),
						getResources().getString(R.string.saturno_diametro),
						getResources().getString(R.string.saturno_densidad),
						getResources().getString(R.string.saturno_gravedad),
						getResources().getString(
								R.string.saturno_periodo_rotacion),
						getResources().getString(
								R.string.saturno_periodo_orbital),
						getResources().getString(
								R.string.saturno_velocidad_orbital),
						getResources().getString(R.string.saturno_temperatura),
						getResources().getString(R.string.saturno_satelites));
				break;
			case 6:
				compararPlaneta2(
						getResources().getString(R.string.urano_distancia),
						getResources().getString(R.string.urano_diametro),
						getResources().getString(R.string.urano_densidad),
						getResources().getString(R.string.urano_gravedad),
						getResources().getString(
								R.string.urano_periodo_rotacion),
						getResources()
								.getString(R.string.urano_periodo_orbital),
						getResources().getString(
								R.string.urano_velocidad_orbital),
						getResources().getString(R.string.urano_temperatura),
						getResources().getString(R.string.urano_satelites));
				break;
			case 7:
				compararPlaneta2(
						getResources().getString(R.string.neptuno_distancia),
						getResources().getString(R.string.neptuno_diametro),
						getResources().getString(R.string.neptuno_densidad),
						getResources().getString(R.string.neptuno_gravedad),
						getResources().getString(
								R.string.neptuno_periodo_rotacion),
						getResources().getString(
								R.string.neptuno_periodo_orbital),
						getResources().getString(
								R.string.neptuno_velocidad_orbital),
						getResources().getString(R.string.neptuno_temperatura),
						getResources().getString(R.string.neptuno_satelites));
				break;
			}

			break;
		}

	}

	public void onNothingSelected(AdapterView<?> arg0) {

	}

	public void compararPlaneta1(String distancia, String diametro,
			String densidad, String gravedad, String periodo_rotacion,
			String periodo_orbital, String velocidad_orbital,
			String temperatura, String satelites) {

		distancia1.setText(distancia);
		diametro1.setText(diametro);
		densidad1.setText(densidad);
		gravedad1.setText(gravedad);
		periodo_rotacion1.setText(periodo_rotacion);
		periodo_orbital1.setText(periodo_orbital);
		velocidad_orbital1.setText(velocidad_orbital);
		temperatura1.setText(temperatura);
		satelites1.setText(satelites);

	}

	public void compararPlaneta2(String distancia, String diametro,
			String densidad, String gravedad, String periodo_rotacion,
			String periodo_orbital, String velocidad_orbital,
			String temperatura, String satelites) {

		distancia2.setText(distancia);
		diametro2.setText(diametro);
		densidad2.setText(densidad);
		gravedad2.setText(gravedad);
		periodo_rotacion2.setText(periodo_rotacion);
		periodo_orbital2.setText(periodo_orbital);
		velocidad_orbital2.setText(velocidad_orbital);
		temperatura2.setText(temperatura);
		satelites2.setText(satelites);

	}

}