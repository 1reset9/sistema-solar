package com.master;

import android.app.Application;

public class MyApp extends Application {

	private int tabSeleccionado = 0;

	public int getTabSeleccionado() {
		return tabSeleccionado;
	}

	public void setTabSeleccionado(int tabSeleccionado) {
		this.tabSeleccionado = tabSeleccionado;
	}

}
