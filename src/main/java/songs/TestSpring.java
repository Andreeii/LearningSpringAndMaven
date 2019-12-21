package songs;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aplicationContext.xml");

        ClassicalMusic classicalMusic = context.getBean("musicBean1",ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());



//       Music music =  context.getBean("musicBean",Music.class);
//       MusicPlayer musicPlayer = new MusicPlayer(music);

//
//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer",MusicPlayer.class);
//        MusicPlayer musicPlayer2 = context.getBean("musicPlayer",MusicPlayer.class);
//
//
//        System.out.println(musicPlayer1);
//        musicPlayer1.setVolume(90);
//        System.out.println(musicPlayer2);
//        musicPlayer1.playMusicList();
//
//        System.out.println(musicPlayer1.getName());
//        System.out.println(musicPlayer1.getVolume());
//
//        System.out.println(musicPlayer2.getName());
//        System.out.println(musicPlayer2.getVolume());

        context.close();
    }
}
