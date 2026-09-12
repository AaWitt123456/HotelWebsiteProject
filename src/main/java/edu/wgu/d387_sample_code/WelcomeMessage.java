package edu.wgu.d387_sample_code;

import java.util.Locale;
import java.util.ResourceBundle;


public class WelcomeMessage implements Runnable {

    private final Locale locale;
    private String message;

    public WelcomeMessage(Locale locale) {
        this.locale = locale;
    }

    public String getMessage() {
        if (message == null) {
            ResourceBundle bundle = ResourceBundle.getBundle("welcome", locale);
            message = bundle.getString("welcome");

        }

        return message;
    }

    @Override
    public void run() {
    }

}

