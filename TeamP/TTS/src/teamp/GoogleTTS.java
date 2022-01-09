package teamp;
//Imports the Google Cloud client library
import com.google.cloud.texttospeech.v1.AudioConfig;
import com.google.cloud.texttospeech.v1.AudioEncoding;
import com.google.cloud.texttospeech.v1.SsmlVoiceGender;
import com.google.cloud.texttospeech.v1.SynthesisInput;
import com.google.cloud.texttospeech.v1.SynthesizeSpeechResponse;
import com.google.cloud.texttospeech.v1.TextToSpeechClient;
import com.google.cloud.texttospeech.v1.VoiceSelectionParams;
import com.google.protobuf.ByteString;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class GoogleTTS {

   public String lyrics;

   public GoogleTTS() {
      System.out.println("Google TTS");
   }

   /**
    * Demonstrates using the Text-to-Speech API.
    * 
    * @throws IOException
    */
   public void CreateMP3(String lyrics) throws IOException {
      // Instantiates a client
      try (TextToSpeechClient textToSpeechClient = TextToSpeechClient.create()) {
         // Set the text input to be synthesized
         SynthesisInput input = SynthesisInput.newBuilder().setText(lyrics).build();

         // Build the voice request, select the language code ("en-US") and the ssml
         // voice gender
         // ("neutral")
         VoiceSelectionParams voice = VoiceSelectionParams.newBuilder().setLanguageCode("ko-KR")
               .setSsmlGender(SsmlVoiceGender.NEUTRAL).build();

         // Select the type of audio file you want returned
         AudioConfig audioConfig = AudioConfig.newBuilder().setAudioEncoding(AudioEncoding.MP3).build();

         // Perform the text-to-speech request on the text input with the selected voice
         // parameters and audio file type
         SynthesizeSpeechResponse response = textToSpeechClient.synthesizeSpeech(input, voice, audioConfig);

         // Get the audio contents from the response
         ByteString audioContents = response.getAudioContent();

         // Write the response to the output file.
         try (OutputStream out = new FileOutputStream("output.mp3")) {
            out.write(audioContents.toByteArray());
         }

         SynthesizeSpeechResponse correct = textToSpeechClient
               .synthesizeSpeech(SynthesisInput.newBuilder().setText("정답입니다").build(), voice, audioConfig);

         // Get the audio contents from the response
         ByteString correctaudioContents = correct.getAudioContent();
         try (OutputStream correctout = new FileOutputStream("correct.mp3")) {
            correctout.write(correctaudioContents.toByteArray());
         }

         SynthesizeSpeechResponse wrong = textToSpeechClient
               .synthesizeSpeech(SynthesisInput.newBuilder().setText("삐, 오답입니다.").build(), voice, audioConfig);

         // Get the audio contents from the response
         ByteString wrongaudioContents = wrong.getAudioContent();
         try (OutputStream wrongout = new FileOutputStream("wrong.mp3")) {
            wrongout.write(wrongaudioContents.toByteArray());
         }
         SynthesizeSpeechResponse pass = textToSpeechClient.synthesizeSpeech(
               SynthesisInput.newBuilder().setText("패스! 다음문제로 넘어갑니다.").build(), voice, audioConfig);

         // Get the audio contents from the response
         ByteString passaudioContents = pass.getAudioContent();
         try (OutputStream passout = new FileOutputStream("pass.mp3")) {
            passout.write(passaudioContents.toByteArray());
         }
      }
   }

   public void PlayMP3() {
      try {
         FileInputStream fileInputStream = new FileInputStream("output.mp3");
         Player player = new Player(fileInputStream);
         player.play();
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (JavaLayerException e) {
         e.printStackTrace();
      }

   }

   public void PlayMP3(int i) {
      // 정답
      if (i == 1) {
         try {
            FileInputStream fileInputStream = new FileInputStream("correct.mp3");
            Player player = new Player(fileInputStream);
            player.play();
         } catch (FileNotFoundException e) {
            e.printStackTrace();
         } catch (JavaLayerException e) {
            e.printStackTrace();
         }
      }
      // 오답
      else if (i == 2) {
         try {
            FileInputStream fileInputStream = new FileInputStream("wrong.mp3");
            Player player = new Player(fileInputStream);
            player.play();
         } catch (FileNotFoundException e) {
            e.printStackTrace();
         } catch (JavaLayerException e) {
            e.printStackTrace();
         }
      }
      // pass
      else if (i == 3) {
         try {
            FileInputStream fileInputStream = new FileInputStream("pass.mp3");
            Player player = new Player(fileInputStream);
            player.play();
         } catch (FileNotFoundException e) {
            e.printStackTrace();
         } catch (JavaLayerException e) {
            e.printStackTrace();
         }
      }
   }
}