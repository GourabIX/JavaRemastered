package com.gourabix;

public class Xbox implements IGamingConsole {
    @Override
    public void powerOn() {
        System.out.println("Xbox One X is powering on...");
        System.out.println("Tap the 'X' button to start.");
        System.out.println();
    }

    @Override
    public boolean accountSignIn() {
        System.out.println("Signing into account: ThunderHunterNine");
        return true;
    }

    @Override
    public void downloadGame(String game) {
        System.out.println("Now downloading: " + game);
    }

    @Override
    public void installGame(String game) {
        System.out.println("Now installing: " + game);
    }

    @Override
    public void playGame(String game) {
        System.out.println("Now playing: " + game);
    }

    @Override
    public void powerOff() {
        System.out.println("PLAY HAS NO LIMITS!");
        System.out.println("Xbox is shutting down...");
        System.out.println();
    }
}
