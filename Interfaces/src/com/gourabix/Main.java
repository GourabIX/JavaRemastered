package com.gourabix;

public class Main {

    public static void main(String[] args) {
        IGamingConsole ps4pro = new PlayStation();
        ps4pro.powerOn();
        boolean statusPs4pro = ps4pro.accountSignIn();
        if (statusPs4pro) {
            ps4pro.downloadGame("The Last of Us Part II");
            ps4pro.installGame("The Last of Us Part II");
            ps4pro.playGame("The Last of Us Part II");
        }
        ps4pro.powerOff();

        IGamingConsole xboxOneX = new Xbox();
        xboxOneX.powerOn();
        boolean statusXbox = xboxOneX.accountSignIn();
        if (statusXbox) {
            xboxOneX.downloadGame("The Witcher 3");
            xboxOneX.installGame("The Witcher 3");
            xboxOneX.playGame("The Witcher 3");
        }
        xboxOneX.powerOff();

        // Both the xboxOneX and the ps4pro objects are instances of classes that implement the
        // IGamingConsole interface. So we can make both objects of "type" IGamingConsole.
        // So this expression, if executed would be invalid:

        // PlayStation ps4pro1 = new PlayStation();
        // PlayStation xboxOneX1 = new Xbox();              <-- This is wrong.
    }
}
