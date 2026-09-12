package edu.wgu.d387_sample_code;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class WelcomeController {
    @GetMapping("/welcome")

    public ResponseEntity<String> getWelcomeMessage(@RequestParam("lang") String language) {

        Locale locale = Locale.forLanguageTag(language);
        WelcomeMessage welcomeMessage = new WelcomeMessage(locale);
        return new ResponseEntity<>(welcomeMessage.getMessage(), HttpStatus.OK);


    }
}
