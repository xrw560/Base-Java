package cn.ncut.java.designpattern.commandpattern.command;

import cn.ncut.java.designpattern.commandpattern.device.Light;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.On();
    }

    @Override
    public void undo() {
        light.Off();
    }

}
