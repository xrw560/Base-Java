package cn.ncut.java.base.springannotation.springrunorder;

import org.springframework.stereotype.Component;

@Component
public class Three {
    public Three() {
        System.out.println("three");
    }

    public Three(String three) {
        System.out.println(three);
    }
}
