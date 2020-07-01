package com.gourabix;

public interface IGamingConsole {
    void powerOn();
    boolean accountSignIn();
    void downloadGame(String game);
    void installGame(String game);
    void playGame(String game);
    void powerOff();
}
