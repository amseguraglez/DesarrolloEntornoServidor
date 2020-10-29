package com.example.demo;

import java.util.List;

//import com.example.model.Puntuacion;

public interface PuntuacionDao {
	int guardar(Puntuacion puntuacion);
	List<Puntuacion> encuentraTodos();

}
