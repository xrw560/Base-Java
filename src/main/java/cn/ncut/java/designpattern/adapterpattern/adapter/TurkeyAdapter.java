package cn.ncut.java.designpattern.adapterpattern.adapter;

import cn.ncut.java.designpattern.adapterpattern.duck.Duck;
import cn.ncut.java.designpattern.adapterpattern.turkey.Turkey;

/**
 * 对象适配器
 * <p>
 * 目标《-- 适配器 《-- 被适配者
 * 从用户的角度看不到被适配者，是解耦的
 * 用户调用适配器转化出来的目标接口方法
 * 适配器再调用被适配者的相关接口方法
 * 用户收到反馈结果，感觉只是和目标接口交互
 */
public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 6; i++) {
            turkey.fly();
        }
    }

}
