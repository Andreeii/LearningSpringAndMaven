package songs;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

    //private constructor for factory method
    private ClassicalMusic(){};
    //factory method
    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public void doMyInit(){
        System.out.println("Doing my initializaation ");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }
    public String getSong() {
        return "Vivaldi - FourSeason";
    }

}
