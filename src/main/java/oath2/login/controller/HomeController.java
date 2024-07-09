package oath2.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/loginSuccess")
    public String loginSuccess() {
        return "redirect:/";
    }

    @GetMapping("/loginFailure")
    public String loginFailure() {
        return "redirect:/login?error";
    }

    @GetMapping("/")
    public String home() {
        return "home";
    }
}
