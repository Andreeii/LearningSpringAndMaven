package songs;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {

    public String getSong() {
        return "New Devide - Linking Park";
    }
}
