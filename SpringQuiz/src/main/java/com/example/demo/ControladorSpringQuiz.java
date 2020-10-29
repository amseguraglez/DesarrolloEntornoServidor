package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//import com.example.dao.PuntuacionDao;
//import com.example.model.Puntuacion;

@Controller
public class ControladorSpringQuiz {
	@Autowired
	private PuntuacionDao puntuaciondao;

	private int puntuacionjugador;
	private final int RESPUESTACORRECTA = 2;
	private final int MINIRESPUESTACORRECTA = 1;

	/* inicio */
	@GetMapping("/inicio")
	public String process0(HttpSession session) {
		return "inicio";
	}

	@PostMapping("/inicio")
	public String persistMessage0(@RequestParam("nombrejugador") String nombrejugador, HttpServletRequest request) {
		if (nombrejugador != null) {
			request.getSession().setAttribute("nombrejugador", nombrejugador);
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
				request.getSession().setAttribute("puntuacionjugador", puntuacionjugador += RESPUESTACORRECTA);
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
				request.getSession().setAttribute("puntuacionjugador", puntuacionjugador += RESPUESTACORRECTA);
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
				request.getSession().setAttribute("puntuacionjugador", puntuacionjugador += RESPUESTACORRECTA);
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
				request.getSession().setAttribute("puntuacionjugador", puntuacionjugador += MINIRESPUESTACORRECTA);
				// break;
			case "Aceite":
				request.getSession().setAttribute("puntuacionjugador", puntuacionjugador += MINIRESPUESTACORRECTA);
				// break;
			case "Ajo":
				request.getSession().setAttribute("puntuacionjugador", puntuacionjugador += MINIRESPUESTACORRECTA);
				// break;
			case "Sal":
				request.getSession().setAttribute("puntuacionjugador", puntuacionjugador += MINIRESPUESTACORRECTA);
				// break;
			case "Lim&oacute;n":
				request.getSession().setAttribute("puntuacionjugador", puntuacionjugador += MINIRESPUESTACORRECTA);
				// break;
			default:
				request.getSession().setAttribute("puntuacionjugador", puntuacionjugador += 0);
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
				request.getSession().setAttribute("puntuacionjugador", puntuacionjugador += RESPUESTACORRECTA);
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
				request.getSession().setAttribute("puntuacionjugador", puntuacionjugador += RESPUESTACORRECTA);
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
				request.getSession().setAttribute("puntuacionjugador", puntuacionjugador += RESPUESTACORRECTA);
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
				request.getSession().setAttribute("puntuacionjugador", puntuacionjugador += MINIRESPUESTACORRECTA);
				// break;
			case "Cebolla":
				request.getSession().setAttribute("puntuacionjugador", puntuacionjugador += MINIRESPUESTACORRECTA);
				// break;
			case "Lima":
				request.getSession().setAttribute("puntuacionjugador", puntuacionjugador += MINIRESPUESTACORRECTA);
				// break;
			case "Cilantro":
				request.getSession().setAttribute("puntuacionjugador", puntuacionjugador += MINIRESPUESTACORRECTA);
				// break;
			case "Sal":
				request.getSession().setAttribute("puntuacionjugador", puntuacionjugador += MINIRESPUESTACORRECTA);
				// break;
			case "Tomate":
				request.getSession().setAttribute("puntuacionjugador", puntuacionjugador += MINIRESPUESTACORRECTA);
				// break;
			case "Pimiento":
				request.getSession().setAttribute("puntuacionjugador", puntuacionjugador += MINIRESPUESTACORRECTA);
				// break;
			case "Lim&oacute;n":
				request.getSession().setAttribute("puntuacionjugador", puntuacionjugador += MINIRESPUESTACORRECTA);
			default:
				request.getSession().setAttribute("puntuacionjugador", puntuacionjugador += 0);
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
				request.getSession().setAttribute("puntuacionjugador", puntuacionjugador += RESPUESTACORRECTA);
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
				request.getSession().setAttribute("puntuacionjugador", puntuacionjugador += 1);
			else if (pregunta10.length() >= 31 && pregunta10.length() <= 80)
				request.getSession().setAttribute("puntuacionjugador", puntuacionjugador += 2);
			else if (pregunta10.length() >= 81 && pregunta10.length() <= 140)
				request.getSession().setAttribute("puntuacionjugador", puntuacionjugador += 3);
			else if (pregunta10.length() >= 141)
				request.getSession().setAttribute("puntuacionjugador", puntuacionjugador += 4);
			else
				request.getSession().setAttribute("puntuacionjugador", puntuacionjugador += 0);
		} else
			return "redirect:/pregunta10";
		return "redirect:/final";
	}

//	@GetMapping("/final")
//	public ModelAndView process11(HttpSession session) {
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("final");
//		int resultado = (int) session.getAttribute("puntuacionjugador");
//		mav.addObject("puntuacionjugador", resultado);
//		String jugador = (String) session.getAttribute("nombrejugador");
//		mav.addObject("nombrejugador", jugador);
//		return mav;
//	}

	/* asignación definitiva y añadido al modelo */
	@RequestMapping(value = "/final", method = RequestMethod.GET)
	public String guardarPuntuacion(Model modelo, HttpSession session) {
		String nombrejugador = (String) session.getAttribute("nombrejugador");
		int puntuacionjugador = (int) session.getAttribute("puntuacionjugador");
		if (puntuacionjugador <= 5)
			session.setAttribute("clasificacionjugador", "Pinche");
		else if (puntuacionjugador >= 6 && puntuacionjugador <= 15)
			session.setAttribute("clasificacionjugador", "Amateur");
		else if (puntuacionjugador >= 16 && puntuacionjugador <= 22)
			session.setAttribute("clasificacionjugador", "Cocinillas");
		else if (puntuacionjugador >= 22 && puntuacionjugador <= 26)
			session.setAttribute("clasificacionjugador", "Gourmet");
		else if (puntuacionjugador >= 27)
			session.setAttribute("clasificacionjugador", "Chef");
		String clasificacionjugador = (String) session.getAttribute("clasificacionjugador");
		Puntuacion puntuacion = new Puntuacion(nombrejugador, puntuacionjugador, clasificacionjugador);
		puntuaciondao.guardar(puntuacion);
		modelo.addAttribute("nombrejugador", nombrejugador);
		modelo.addAttribute("puntuacionjugador", puntuacionjugador);
		List<Puntuacion> puntuaciones = puntuaciondao.encuentraTodos();
		modelo.addAttribute("puntuaciones", puntuaciones);
		return "final";
	}

//	@RequestMapping(value = "/final", method = RequestMethod.POST)
//	public String index(Model modelo) {
//		List<Puntuacion> puntuaciones = puntuaciondao.encuentraTodos();
//		modelo.addAttribute("puntuaciones", puntuaciones);
//		return "redirect:/final";
//	}

	/* fin sesión */
	@PostMapping("/destroy")
	public String destroySession(HttpServletRequest request) {
		request.getSession().invalidate();
		puntuacionjugador = 0;
		return "redirect:/inicio";
	}
}
