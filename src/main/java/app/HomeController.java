package app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class HomeController {
	@RequestMapping({ "/", "index", "home" })
	String index(Model model) {
		return "test";
	}
}
