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

	@PostMapping("/destroy")
	public String destroySession(HttpServletRequest request) {
		request.getSession().invalidate();
		return "redirect:/inicio";
	}
}
