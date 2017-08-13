package a.b.cont;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import a.b.model.Computer;
import a.b.service.SystemService;

@Controller
public class Cont {
	@Autowired
	private SystemService serv;

	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String name() {
		return "one";

	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String store(@ModelAttribute("pojo") Computer pojo) {
		serv.store(pojo);
		return "suces";

	}

}
