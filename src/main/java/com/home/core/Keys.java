package com.home.core;

/**
 * Created by igor.bogdanov on 17.08.2016.
 */
public enum Keys {
    SPACE(0x20),
    F1(0x70),
    F2(0x71),
    F3(0x72),
    F4(0x73),
    F5(0x74),
    F6(0x75),
    F7(0x76),
    F8(0x77),
    F9(0x78),
    F10(0x79),
    F11(0x7A),
    F12(0x7B);

    private int keyId;

    Keys(int keyId) {
        this.keyId = keyId;
    }

    public int getCode(){
        return this.keyId;
    }
}
