package cn.ncut.java.designpattern.facadepattern.hometheater;

/**
 * 外观模式：提供一个统一的接口，来访问子系统中一群功能相关接口
 * 外观模式定义了一个高层接口，让子系统更容易使用
 * 功能汇聚；对外解耦
 * <p>
 * 外观模式与命令模式各自侧重点
 * 外观模式：对外提供接口的简化，使用更简单
 * 命令模式：对命令的封装，控制与被控制之间的解耦
 */
public class HomeTheaterFacade {
    private TheaterLights mTheaterLights;
    private Popcorn mPopcorn;
    private Stereo mStereo;
    private Projector mProjector;
    private Screen mScreen;
    private DVDPlayer mDVDPlayer;

    public HomeTheaterFacade() {
        mTheaterLights = TheaterLights.getInstance();
        mPopcorn = Popcorn.getInstance();
        mStereo = Stereo.getInstance();
        mProjector = Projector.getInstance();
        mScreen = Screen.getInstance();
        mDVDPlayer = DVDPlayer.getInstance();
    }

    public void ready() {
        mPopcorn.on();
        mPopcorn.pop();
        mScreen.down();
        mProjector.on();
        mStereo.on();
        mDVDPlayer.on();
        mDVDPlayer.setdvd();
        mTheaterLights.dim(10);
    }

    public void end() {
        mPopcorn.off();
        mTheaterLights.bright();
        mScreen.up();
        mProjector.off();
        mStereo.off();

        mDVDPlayer.setdvd();
        mDVDPlayer.off();
    }

    public void play() {
        mDVDPlayer.play();
    }

    public void pause() {
        mDVDPlayer.pause();
    }
}
