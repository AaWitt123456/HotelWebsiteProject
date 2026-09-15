package edu.wgu.d387_sample_code;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class TimeController {

    @GetMapping("/presentation")
    public String timeZoneConvert() {

        return Time.MeetingTime();

    }




}
