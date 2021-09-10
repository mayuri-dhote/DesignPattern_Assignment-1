package com.codemate.solid;

public class Desktop {

    private Monitor monitor;
    private Keyboard keyboard;

    public Desktop(Keyboard keyboard, Monitor monitor) {
        this.monitor = monitor;
        this.keyboard = keyboard;
    }
}

interface Keyboard {
}
class Monitor {
}
class QwertyKeyBoard implements Keyboard {
}