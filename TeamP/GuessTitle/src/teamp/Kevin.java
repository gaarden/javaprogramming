package teamp;

import java.util.Locale;
import javax.speech.Central;
import javax.speech.EngineException;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;

public class Kevin {
	Synthesizer synthesizer;

	public Kevin() {
		try {
			System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
			Central.registerEngineCentral("com.sun.speech.freetts.jsapi.FreeTTSEngineCentral");
			synthesizer = Central.createSynthesizer(new SynthesizerModeDesc(Locale.US));
			synthesizer.allocate();
		} catch (EngineException e) {
			e.printStackTrace();
		}
	}

	void speak(String comment) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				synthesizer.cancel();// 이전 멘트 중단하기
				synthesizer.speakPlainText(comment, null);// speak

			}
		}).start();
	}

	public static void main(String[] args) {
		Kevin kevin = new Kevin();
		kevin.speak("start game");
	}
}