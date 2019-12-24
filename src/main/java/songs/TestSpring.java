package songs;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aplicationContext.xml");

//        Music music = context.getBean("rockMusic",Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//
//
//        Music music1 = context.getBean("classicalMusic",Music.class);
//        MusicPlayer musicPlayer1 = new MusicPlayer(music1);
//
//        musicPlayer1.playMusic();
//        musicPlayer.playMusic();

//        MusicPlayer musicPlayer =context.getBean("musicPlayer",MusicPlayer.class);
//        musicPlayer.playMusic();

        Computer computer = context.getBean("computer",Computer.class);
        System.out.println(computer);
        context.close();
    }
}
