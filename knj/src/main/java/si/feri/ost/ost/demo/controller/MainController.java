package si.feri.ost.ost.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    // inject via application.properties
    @Value("${welcome.message}")
    private String message = "Hello World";


    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("message", this.message);
        return "Index";
    }

    @RequestMapping(value = { "/prijava" }, method = RequestMethod.GET)
    public String registracija(Model model) {
        model.addAttribute("message", this.message);
        return "Prijava";
    }
}
