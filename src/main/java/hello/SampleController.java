package hello;

import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

import static java.lang.String.format;

@RestController
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    String home() {
        return format("Hello World: %s", LocalDateTime.now()) ;
    }
}