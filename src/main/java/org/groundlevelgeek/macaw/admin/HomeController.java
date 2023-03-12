package org.groundlevelgeek.macaw.admin;

import jakarta.servlet.http.HttpServletRequest;
import org.groundlevelgeek.macaw.users.document.User;
import org.groundlevelgeek.macaw.users.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class HomeController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String home(HttpServletRequest request, HttpServletRequest response, Model model) {
        List<User> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "index";
    }

    @PostMapping("/users")
    public String saveUser(HttpServletRequest request, HttpServletRequest response, @RequestParam Map<String, String> form, Model model) {
        String name = form.getOrDefault("name", "Default").toString();
        String email = form.getOrDefault("email", "Default").toString();
        String hobby = form.getOrDefault("hobby", "Default").toString();
        userRepository.save(new User(name, email, hobby));

        List<User> users = userRepository.findAll();
        model.addAttribute("users", users);

        return "index";
    }
}
