package com.example.demo;

import java.math.BigDecimal;

/* POJO */
public class Puntuacion {
	private Long idjugador;
	private String nombrejugador;
	private int puntuacionjugador;
	private String clasificacionjugador;

	public Puntuacion() {

	}

	public Puntuacion(Long idjugador, String nombrejugador, int puntuacionjugador, String clasificacionjugador) {
		this.idjugador = idjugador;
		this.nombrejugador = nombrejugador;
		this.puntuacionjugador = puntuacionjugador;
		this.clasificacionjugador = clasificacionjugador;
	}
	
	public Puntuacion(String nombrejugador, int puntuacionjugador, String clasificacionjugador) {
		this.nombrejugador = nombrejugador;
		this.puntuacionjugador = puntuacionjugador;
		this.clasificacionjugador = clasificacionjugador;
	}

	public Long getIdjugador() {
		return idjugador;
	}

	public void setIdjugador(Long idjugador) {
		this.idjugador = idjugador;
	}

	public String getNombrejugador() {
		return nombrejugador;
	}

	public void setNombrejugador(String nombrejugador) {
		this.nombrejugador = nombrejugador;
	}

	public int getPuntuacionjugador() {
		return puntuacionjugador;
	}

	public void setPuntuacionjugador(int puntuacionjugador) {
		this.puntuacionjugador = puntuacionjugador;
	}

	public String getClasificacionjugador() {
		return clasificacionjugador;
	}

	public void setClasificacionjugador(String clasificacionjugador) {
		this.clasificacionjugador = clasificacionjugador;
	}

}
