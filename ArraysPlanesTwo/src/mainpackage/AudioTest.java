package mainpackage;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class AudioTest {
   public void playSound() {
      try {
         File file = new File("radarSound.wav");
         AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
         Clip clip = AudioSystem.getClip();
         clip.open(audioInputStream);
         clip.start();
         //Thread.sleep(clip.getMicrosecondLength() / 1000);
         
         Thread.sleep(2000);
         // Play the clip for the second time
         clip.setFramePosition(0);
         clip.start();
         
         Thread.sleep(2000);
         // Play the clip for the second time
         clip.setFramePosition(0);
         clip.start();
         
         Thread.sleep(1000);
         // Play the clip for the second time
         clip.setFramePosition(0);
         clip.start();
         
         Thread.sleep(1000);
         // Play the clip for the second time
         clip.setFramePosition(0);
         clip.start();
         
         Thread.sleep(500);
         // Play the clip for the second time
         clip.setFramePosition(0);
         clip.start();
         
         Thread.sleep(500);
         // Play the clip for the second time
         clip.loop(Clip.LOOP_CONTINUOUSLY);
         clip.setFramePosition(0);
         clip.start();
         
         
         
         Thread.sleep(3000);
         // Play the clip for the second time
         clip.stop();
         
         
         File voice = new File("voice.mp3");
         AudioInputStream audioInputStreamTwo = AudioSystem.getAudioInputStream(voice);
         Clip clipVoice = AudioSystem.getClip();
         clipVoice.open(audioInputStreamTwo);
         clipVoice.start();
         
         
         
         
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}