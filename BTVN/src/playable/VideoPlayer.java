package playable;

public class VideoPlayer implements IPlayable{
    @Override
    public void play() {
        System.out.println("Đang phát video...");
    }
}
