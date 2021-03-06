package cn.ncut.java.designpattern.commandpattern.command;

import cn.ncut.java.designpattern.commandpattern.device.Light;
import cn.ncut.java.designpattern.commandpattern.device.Stereo;

/**
 * 命令模式：将请求、命令、动作等封装成对象，这样可以让项目使用这些对象来参数化其他对象。
 * 使得命令的请求者和执行者解耦。
 */
public class ControlTest {

    public static void main(String[] args) {
        CommandModeControl control = new CommandModeControl();
        MarcoCommand onmarco, offmarco;
        Light bedroomlight = new Light("BedRoom");
        Light kitchlight = new Light("Kitch");
        Stereo stereo = new Stereo();


        LightOnCommand bedroomlighton = new LightOnCommand(bedroomlight);
        LightOffCommand bedroomlightoff = new LightOffCommand(bedroomlight);
        LightOnCommand kitchlighton = new LightOnCommand(kitchlight);
        LightOffCommand kitchlightoff = new LightOffCommand(kitchlight);

        Command[] oncommands = {bedroomlighton, kitchlighton};
        Command[] offcommands = {bedroomlightoff, kitchlightoff};

        onmarco = new MarcoCommand(oncommands);
        offmarco = new MarcoCommand(offcommands);

        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        StereoAddVolCommand stereoaddvol = new StereoAddVolCommand(stereo);
        StereoSubVolCommand stereosubvol = new StereoSubVolCommand(stereo);

        control.setCommand(0, bedroomlighton, bedroomlightoff);
        control.setCommand(1, kitchlighton, kitchlightoff);
        control.setCommand(2, stereoOn, stereoOff);
        control.setCommand(3, stereoaddvol, stereosubvol);
        control.setCommand(4, onmarco, offmarco);

        control.onButton(0);
        control.undoButton();
        //control.offButton(0);
        control.onButton(1);
        control.offButton(1);
        control.onButton(2);
        control.onButton(3);

        control.offButton(3);
        control.undoButton();
        control.offButton(2);
        control.undoButton();
        control.onButton(4);
        control.offButton(4);
    }

}
