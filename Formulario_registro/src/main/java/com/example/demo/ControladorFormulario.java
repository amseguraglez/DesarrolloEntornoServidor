package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorFormulario {

	@RequestMapping(value="/formulario", method=RequestMethod.GET)
	public String hola_get() {

		return "formulario";
	}

	@RequestMapping(value="/formulario", method=RequestMethod.POST)
	public String hola_post(Model modelo,
			@RequestParam String nombre,
			@RequestParam String primerApellido,
			@RequestParam String segundoApellido,
			@RequestParam String email,
			@RequestParam Integer dia,
			@RequestParam String mes,
			@RequestParam Integer anio,
			@RequestParam String contrasena,
			@RequestParam String sexo,
			@RequestParam String direccion,
			@RequestParam String estudios,
			@RequestParam String intereses) {

		modelo.addAttribute("nombre_form", nombre);
		modelo.addAttribute("primerApellido_form", primerApellido);
		modelo.addAttribute("segundoApellido_form", segundoApellido);
		modelo.addAttribute("email_form", email);
		modelo.addAttribute("dia_form", dia);
		modelo.addAttribute("mes_form", mes);
		modelo.addAttribute("anio_form", anio);
		modelo.addAttribute("contrasena_form", contrasena);
		modelo.addAttribute("sexo_form", sexo);
		modelo.addAttribute("direccion_form", direccion);
		modelo.addAttribute("estudios_form", estudios);
		modelo.addAttribute("intereses_form", intereses);

		return "datosFormulario";
	}
	
}