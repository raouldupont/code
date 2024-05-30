package Tech.Raoul.sa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path ="test" )
public class TestController {

    @GetMapping(path = "string")
    public String getString(){
        return "Chaine de caractère transmise par Raoul.Tech";
    }

    @GetMapping(path = "list")
    public List<String> getList(){
        return List.of("chaine de caractère", "envoyé par le programmeur");
    }
}
