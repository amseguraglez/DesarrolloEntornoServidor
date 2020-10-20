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
	private static int contador;

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
			contador += 2;
			return "pregunta2";
		} 
		return "redirect:/pregunta1";
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
			contador += 2;
			return "pregunta3";
		} 
		return "redirect:/pregunta2";
	}

	/* fin sesión */
	@PostMapping("/destroy")
	public String destroySession(HttpServletRequest request) {
		request.getSession().invalidate();
		return "redirect:/inicio";
	}
}
