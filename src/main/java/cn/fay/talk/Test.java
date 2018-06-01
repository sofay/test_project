//package cn.fay.talk;
//
//import com.iflytek.cloud.speech.*;
//
///**
// * Created by fay on 2018/1/9.
// */
//public class Test {
//    public static void main(String[] args) {
//        SpeechUtility.createUtility(SpeechConstant.APPID + "=5a54ae4b");
//        SpeechSynthesizer synthesizer = SpeechSynthesizer.createSynthesizer();
//        synthesizer.setParameter(SpeechConstant.VOICE_NAME, "xiaoyan");
//        synthesizer.setParameter(SpeechConstant.SPEED, "50");
//        synthesizer.setParameter(SpeechConstant.VOLUME, "80");
//        synthesizer.setParameter(SpeechConstant.TTS_AUDIO_PATH, "/tmp/tts");
//        synthesizer.startSpeaking("你好啊，天气怎么样啊?", new SynthesizerListener() {
//            //会话结束回调接口，没有错误时，error为null
//            public void onCompleted(SpeechError error) {
//                System.out.println(error);
//            }
//
//            @Override
//            public void onEvent(int i, int i1, int i2, int i3, Object o, Object o1) {
//                System.out.println(2);
//            }
//
//            //缓冲进度回调
//            //percent为缓冲进度0~100，beginPos为缓冲音频在文本中开始位置，endPos表示缓冲音频在文本中结束位置，info为附加信息。
//            public void onBufferProgress(int percent, int beginPos, int endPos, String info) {
//                System.out.println(3);
//            }
//
//            //开始播放
//            public void onSpeakBegin() {
//                System.out.println(4);
//            }
//
//            //暂停播放
//            public void onSpeakPaused() {
//                System.out.println(4);
//            }
//
//            //播放进度回调
//            //percent为播放进度0~100,beginPos为播放音频在文本中开始位置，endPos表示播放音频在文本中结束位置.
//            public void onSpeakProgress(int percent, int beginPos, int endPos) {
//                System.out.println(5);
//            }
//
//            //恢复播放回调接口
//            public void onSpeakResumed() {
//                System.out.println(6);
//            }
//        });
//    }
//}
