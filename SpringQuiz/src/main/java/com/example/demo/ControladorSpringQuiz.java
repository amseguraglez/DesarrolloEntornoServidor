package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorSpringQuiz {
	private int contador;
	private final int respuestaCorrecta = 2;
	private final int miniRespuestaCorrecta = 1;

	/* inicio */
	@GetMapping("/inicio")
	public String process(HttpSession session) {
		return "inicio";
	}

	@PostMapping("/inicio")
	public String persistMessage(@RequestParam("nombre") String nombre, HttpServletRequest request) {
		if (nombre != null) {
			request.getSession().setAttribute("nombre", nombre);
			return "pregunta1";
		}
		return "redirect:/inicio";
	}

	/* pregunta1 */
	@GetMapping("/pregunta1")
	public String process1(HttpSession session) {
		return "pregunta1";
	}

	@PostMapping("/pregunta1")
	public String persistMessage1(HttpServletRequest request) {
		String pregunta1 = request.getParameter("pregunta1");
		if (pregunta1.equals("Pasas")) {
			request.getSession().setAttribute("contador", contador + respuestaCorrecta);
		}
		return "pregunta2";
	}

	/* pregunta2 */
	@GetMapping("/pregunta2")
	public String process2(HttpSession session) {
		return "pregunta2";
	}

	@PostMapping("/pregunta2")
	public String persistMessage2(HttpServletRequest request) {
		String pregunta2 = request.getParameter("pregunta2");
		if (pregunta2.equals("Un tipo de corte")) {
			request.getSession().setAttribute("contador", contador + respuestaCorrecta);
		}
		return "pregunta3";
	}

	/* pregunta3 */
	@GetMapping("/pregunta3")
	public String process3(HttpSession session) {
		return "pregunta3";
	}

	@PostMapping("/pregunta3")
	public String persistMessage3(HttpServletRequest request) {
		String pregunta3 = request.getParameter("pregunta3");
		if (pregunta3.equals("Espesar con ayuda de huevo, harina, mantequilla...")) {
			request.getSession().setAttribute("contador", contador + respuestaCorrecta);
		}
		return "pregunta4";
	}

	/* pregunta4 */
	@GetMapping("/pregunta4")
	public String process4(HttpSession session) {
		return "pregunta4";
	}

	@PostMapping("/pregunta4")
	public String persistMessage4(HttpServletRequest request) {
		String pregunta4 = request.getParameter("pregunta4");
		switch (pregunta4) {
		case "Patata":
			request.getSession().setAttribute("contador", contador + miniRespuestaCorrecta);
			break;
		case "Huevo":
			request.getSession().setAttribute("contador", contador + miniRespuestaCorrecta);
			break;
		case "Aceite":
			request.getSession().setAttribute("contador", contador + miniRespuestaCorrecta);
			break;
		case "Ajo":
			request.getSession().setAttribute("contador", contador + miniRespuestaCorrecta);
			break;
		case "Sal":
			request.getSession().setAttribute("contador", contador + miniRespuestaCorrecta);
			break;
		case "Lim&oacute;n":
			request.getSession().setAttribute("contador", contador + respuestaCorrecta);
			break;
		default:
			break;
		}
		return "pregunta5";
	}
	
	/* pregunta5 */
	@GetMapping("/pregunta5")
	public String process5(HttpSession session) {
		return "pregunta5";
	}

	@PostMapping("/pregunta5")
	public String persistMessage5(HttpServletRequest request) {
		String pregunta5 = request.getParameter("pregunta5");
		if (pregunta5.equals("Cocinar alimentos lentamente en az&uacute;car o en grasa")) {
			request.getSession().setAttribute("contador", contador + respuestaCorrecta);
		}
		return "pregunta6";
	}
	
	/* pregunta6 */
	@GetMapping("/pregunta6")
	public String process6(HttpSession session) {
		return "pregunta6";
	}

	@PostMapping("/pregunta6")
	public String persistMessage6(HttpServletRequest request) {
		String pregunta6 = request.getParameter("pregunta6");
		if (pregunta6.equals("Envolverla en tocino para que no se seque al cocinarla")) {
			request.getSession().setAttribute("contador", contador + respuestaCorrecta);
		}
		return "pregunta7";
	}
	
	/* pregunta7 */
	@GetMapping("/pregunta7")
	public String process7(HttpSession session) {
		return "pregunta7";
	}

	@PostMapping("/pregunta7")
	public String persistMessage7(HttpServletRequest request) {
		String pregunta7 = request.getParameter("pregunta7");
		if (pregunta7.equals("Parisina")) {
			request.getSession().setAttribute("contador", contador + respuestaCorrecta);
		}
		return "pregunta8";
	}
	
	/* pregunta8 */
	@GetMapping("/pregunta8")
	public String process8(HttpSession session) {
		return "pregunta8";
	}

	@PostMapping("/pregunta8")
	public String persistMessage8(HttpServletRequest request) {
		String pregunta8 = request.getParameter("pregunta8");
		switch (pregunta8) {
		case "Aguacate":
			request.getSession().setAttribute("contador", contador + miniRespuestaCorrecta);
			break;
		case "Cebolla":
			request.getSession().setAttribute("contador", contador + miniRespuestaCorrecta);
			break;
		case "Lima":
			request.getSession().setAttribute("contador", contador + miniRespuestaCorrecta);
			break;
		case "Cilantro":
			request.getSession().setAttribute("contador", contador + miniRespuestaCorrecta);
			break;
		case "Sal":
			request.getSession().setAttribute("contador", contador + miniRespuestaCorrecta);
			break;
		case "Lim&oacute;n":
			request.getSession().setAttribute("contador", contador + respuestaCorrecta);
			break;
		case "Tomate":
			request.getSession().setAttribute("contador", contador + respuestaCorrecta);
			break;
		case "Pimiento":
			request.getSession().setAttribute("contador", contador + respuestaCorrecta);
			break;
		default:
			break;
		}
		return "pregunta9";
	}

	/* fin sesión */
	@PostMapping("/destroy")
	public String destroySession(HttpServletRequest request) {
		request.getSession().invalidate();
		return "redirect:/inicio";
	}
}
