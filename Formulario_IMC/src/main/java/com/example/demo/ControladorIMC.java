package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorIMC {

	@RequestMapping(value = "/calculadoraIMC", method = RequestMethod.GET)
	public String hola_get() {

		return "calculadoraIMC";
	}

	@RequestMapping(value="/calculadoraIMC", method=RequestMethod.POST)
	public String hola_post(Model modelo,
			@RequestParam String nombre,
			@RequestParam int edad,
			@RequestParam int sexo,
			@RequestParam double peso,
			@RequestParam double altura) {

		double alturaMetros = altura/100;
		double imc = peso / (Math.pow(alturaMetros, 2));
		double gc = (1.2 * imc) + (0.23 * edad) - (10.8 * sexo) - 5.4;
		String nivelGC;
			
		if (sexo == 1)
			if (gc >= 2.0 && gc < 6.0)
				nivelGC = "Grasa esencial";
			else if (gc >= 6.0 && gc < 14.0)
				nivelGC = "Atletas";
			else if (gc >= 14.0 && gc < 18.0)
				nivelGC = "Fitness";
			else if (gc >= 18.0 && gc <= 25.0)
				nivelGC = "Aceptable";
			else if (gc >= 25.0)
				nivelGC = "Obesidad";
			else
				nivelGC = "Ha habido un problema";
		else if (sexo == 0)
			if (gc >= 10.0 && gc < 14.0)
				nivelGC = "Grasa esencial";
			else if (gc >= 14.0 && gc < 21.0)
				nivelGC = "Atletas";
			else if (gc >= 21.0 && gc < 25.0)
				nivelGC = "Fitness";
			else if (gc >= 25.0 && gc <= 32.0)
				nivelGC = "Aceptable";
			else if (gc >= 32.0)
				nivelGC = "Obesidad";
			else
				nivelGC = "Ha habido un problema";
		else
			nivelGC = "Ha habido un problema";
		
		modelo.addAttribute("nombre_form", nombre);
		modelo.addAttribute("edad_form", edad);
		modelo.addAttribute("sexo_form", sexo);
		modelo.addAttribute("peso_form", peso);
		modelo.addAttribute("altura_form", altura);
		modelo.addAttribute("imc_form", imc);
		modelo.addAttribute("gc_form", gc);
		modelo.addAttribute("nivelGC_form", nivelGC);

		return "datosCalculadoraIMC";
	}

}
