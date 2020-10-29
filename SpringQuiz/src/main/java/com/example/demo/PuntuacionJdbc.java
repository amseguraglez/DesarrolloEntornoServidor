package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

//import com.example.model.Puntuacion;

@Repository
public class PuntuacionJdbc implements PuntuacionDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int guardar(Puntuacion puntuacion) {
		return jdbcTemplate.update("insert into resultados_springsession (nombrejugador, puntuacionjugador, clasificacionjugador) values(?,?,?)",
				puntuacion.getNombrejugador(), puntuacion.getPuntuacionjugador(), puntuacion.getClasificacionjugador());
	}

	@Override
	public List<Puntuacion> encuentraTodos() {
		return jdbcTemplate.query("select * from resultados_springsession", 
				(rs, rowNum) -> new Puntuacion(rs.getLong("idjugador"), rs.getString("nombrejugador"),
						rs.getInt("puntuacionjugador"), rs.getString("clasificacionjugador")));
	}
	

}
