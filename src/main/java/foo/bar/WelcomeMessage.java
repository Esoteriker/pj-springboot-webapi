package foo.bar;

import org.springframework.stereotype.Component;

@Component
public class WelcomeMessage {

    public String getWelcomeMessage() {
        return "welcome to the spring boot app";
    }
}
