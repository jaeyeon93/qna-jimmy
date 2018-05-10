package codesqaud.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping("/welcome") // welcome이라는 url로부터 오는 get요청을 수행한다.
    public String helloworld(String name, int age, Model model) { // 요청이 들어오면 helloworld 메소드가 실행된다.
        System.out.println("name : " + name + "age : " + age);
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "welcome"; // welcome이라는 파일을 templates에서 찾는다.
    }
}
