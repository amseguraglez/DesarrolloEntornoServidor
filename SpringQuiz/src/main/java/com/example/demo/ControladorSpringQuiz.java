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
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorSpringQuiz {
	private int contador;
	private final int respuestaCorrecta = 2;
	private final int miniRespuestaCorrecta = 1;
	private ModelAndView mav;

	/* inicio */
	@GetMapping("/inicio")
	public String process0(HttpSession session) {
		return "inicio";
	}

	@PostMapping("/inicio")
	public String persistMessage0(@RequestParam("nombre") String nombre, HttpServletRequest request) {
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
		if (pregunta1 != null) {
			if (pregunta1.equals("Pasas")) {
				request.getSession().setAttribute("contador", contador += respuestaCorrecta);
			}
		} else
			return "redirect:/pregunta1";
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
		if (pregunta2 != null) {
			if (pregunta2.equals("Un tipo de corte")) {
				request.getSession().setAttribute("contador", contador += respuestaCorrecta);
			}
		} else
			return "redirect:/pregunta2";
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
		if (pregunta3 != null) {
			if (pregunta3.equals("Espesar con ayuda de huevo, harina, mantequilla...")) {
				request.getSession().setAttribute("contador", contador += respuestaCorrecta);
			}
		} else
			return "redirect:/pregunta3";
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
		if (pregunta4 != null) {
			switch (pregunta4) {
			case "Huevo":
				request.getSession().setAttribute("contador", contador += miniRespuestaCorrecta);
				// break;
			case "Aceite":
				request.getSession().setAttribute("contador", contador += miniRespuestaCorrecta);
				// break;
			case "Ajo":
				request.getSession().setAttribute("contador", contador += miniRespuestaCorrecta);
				// break;
			case "Sal":
				request.getSession().setAttribute("contador", contador += miniRespuestaCorrecta);
				// break;
			case "Lim&oacute;n":
				request.getSession().setAttribute("contador", contador += miniRespuestaCorrecta);
				// break;
			default:
				request.getSession().setAttribute("contador", contador += 0);
			}
		} else
			return "redirect:/pregunta4";
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
		if (pregunta5 != null) {
			if (pregunta5.equals("Cocinar alimentos lentamente en az&uacute;car o en grasa")) {
				request.getSession().setAttribute("contador", contador += respuestaCorrecta);
			}
		} else
			return "redirect:/pregunta5";
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
		if (pregunta6 != null) {
			if (pregunta6.equals("Envolverla en tocino para que no se seque al cocinarla")) {
				request.getSession().setAttribute("contador", contador += respuestaCorrecta);
			}
		} else
			return "redirect:/pregunta6";
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
		if (pregunta7 != null) {
			if (pregunta7.equals("Parisina")) {
				request.getSession().setAttribute("contador", contador += respuestaCorrecta);
			}
		} else
			return "redirect:/pregunta7";
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
		if (pregunta8 != null) {
			switch (pregunta8) {
			case "Aguacate":
				request.getSession().setAttribute("contador", contador += miniRespuestaCorrecta);
				// break;
			case "Cebolla":
				request.getSession().setAttribute("contador", contador += miniRespuestaCorrecta);
				// break;
			case "Lima":
				request.getSession().setAttribute("contador", contador += miniRespuestaCorrecta);
				// break;
			case "Cilantro":
				request.getSession().setAttribute("contador", contador += miniRespuestaCorrecta);
				// break;
			case "Sal":
				request.getSession().setAttribute("contador", contador += miniRespuestaCorrecta);
				// break;
			case "Tomate":
				request.getSession().setAttribute("contador", contador += miniRespuestaCorrecta);
				// break;
			case "Pimiento":
				request.getSession().setAttribute("contador", contador += miniRespuestaCorrecta);
				// break;
			case "Lim&oacute;n":
				request.getSession().setAttribute("contador", contador += miniRespuestaCorrecta);
			default:
				request.getSession().setAttribute("contador", contador += 0);
			}
		} else
			return "redirect:/pregunta8";
		return "pregunta9";
	}

	/* pregunta9 */
	@GetMapping("/pregunta9")
	public String process9(HttpSession session) {
		return "pregunta9";
	}

	@PostMapping("/pregunta9")
	public String persistMessage9(HttpServletRequest request) {
		String pregunta9 = request.getParameter("pregunta9");
		if (pregunta9 != null) {
			if (pregunta9.equals("200 grados")) {
				request.getSession().setAttribute("contador", contador += respuestaCorrecta);
			}
		} else
			return "redirect:/pregunta9";
		return "pregunta10";
	}

	/* pregunta10 */
	@GetMapping("/pregunta10")
	public String process10(HttpSession session) {
		return "pregunta10";
	}

	@PostMapping("/pregunta10")
	public String persistMessage10(HttpServletRequest request) {
		String pregunta10 = request.getParameter("pregunta10");
		if (pregunta10 != null) {
			if (pregunta10.length() <= 30)
				request.getSession().setAttribute("contador", contador += 1);
			else if (pregunta10.length() >= 31 && pregunta10.length() <= 80)
				request.getSession().setAttribute("contador", contador += 2);
			else if (pregunta10.length() >= 81 && pregunta10.length() <= 140)
				request.getSession().setAttribute("contador", contador += 3);
			else if (pregunta10.length() >= 141)
				request.getSession().setAttribute("contador", contador += 4);
			else
				request.getSession().setAttribute("contador", contador += 0);
		} else
			return "redirect:/pregunta10";
		return "redirect:/final";
	}

	@GetMapping("/final")
	public ModelAndView process11(HttpSession session) {
		mav = new ModelAndView();
		mav.setViewName("final");
		int resultado = (int) session.getAttribute("contador");
		mav.addObject("contador", resultado);
		String jugador = (String) session.getAttribute("nombre");
		mav.addObject("nombre", jugador);
		return mav;
	}
	
	@PostMapping("/final")
	public String persistMessage11(HttpServletRequest request) {
		contador = 0;
		return "inicio";
	}

	/* fin sesión */
//	@PostMapping("/destroy")
//	public String destroySession(HttpServletRequest request) {
//		request.getSession().invalidate();
//		return "redirect:/inicio";
//	}
}
