package Adapter;

public class AVIPlayer implements AdvanceMediaPlayer{
    @Override
    public void playAdvanceFormat(AdvanceFormat advanceFormat) {
        System.out.println("playing using Advance Media Player" + advanceFormat.getFileToPlay() + advanceFormat.getFormatToPlay() + advanceFormat.getResolution());
    }
}
