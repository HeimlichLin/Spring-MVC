package idv.heimlich.controller;
import idv.heimlich.service.GenericService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
	
	@Autowired
	private GenericService webService;
	
	@RequestMapping
	public String doWelcome(Model model) {
		
//		WebService service = new WebService();
		List<String> message = this.webService.getMessage("Heimlich");
		
		model.addAttribute("myMessage", message);
		
		return "welcomeNew";
	}

}
