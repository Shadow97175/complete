package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
    @PostMapping("/xml-to-yaml")
    @ResponseBody
    public YamlResponse sayHello(@RequestParam(name="xmlbody", required=true) String xmlContent) {
        return new YamlResponse(xmlContent);
    }

}
