package cn.ncut.java.designpattern.commandpattern.command;


import cn.ncut.java.designpattern.commandpattern.device.Light;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.Off();
    }

    @Override
    public void undo() {
        light.On();
    }

}
