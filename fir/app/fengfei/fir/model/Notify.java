package fengfei.fir.model;

/**
 * @User: tietang
 */
public class Notify {
    public byte position;
    public boolean isNotify;

    public Notify(byte position, boolean notify) {
        this.position = position;
        isNotify = notify;
    }
}
