package TV;

// 2.1 Task 1

public class Television {
    private int channel;
    private boolean tvOn;

    public Television() {
        tvOn = false;
    }

    void setChannel(int newChannel) {
        if (tvOn) channel = newChannel;
    }

    int getChannel() {
        return channel;
    }

    boolean isOn() {
        return tvOn;
    }

    void pressOnOff() {
        tvOn = !tvOn;
    }
}
