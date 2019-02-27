package guru.springframework.joke.jokeapp.Controllers;

import guru.springframework.joke.jokeapp.Services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }
    @RequestMapping({"/",""})
    public String showJokes(Model model){
        model.addAttribute("joke",jokeService.getJoke());
        return "chucknorris";//the view name of chucknorris is being retuned to the template.
    }
}
