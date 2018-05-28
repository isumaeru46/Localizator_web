package br.com.iesb.paradigmas.localizator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.iesb.paradigmas.localizator.services.UsuarioService;

@Controller
public class PaginaInicialController {
	
	@RequestMapping("/")
    public String index() {
        return "index";
    }
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		new UsuarioService().find(new Long(0));
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}

	
}
