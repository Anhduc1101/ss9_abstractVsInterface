package playable;

public class AudioPlayer implements IPlayable{
    @Override
    public void play() {
        System.out.println("Đang phát audio...");
    }
}
