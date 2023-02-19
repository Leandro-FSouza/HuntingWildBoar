package Game;
import Classes.*;
import  Bestiary.*;

import javax.swing.*;


public class Prologue {
    public void startGame() {
        JOptionPane.showMessageDialog(
                null,"Welcome to the \"HWB\" - let's kill some wild boars "
        );
        String nameCharacter = JOptionPane.showInputDialog("What's your name?");
        Object[] classesAvailable = {"Warrior","Archer","Wizzard"};
        int selectClass = JOptionPane.showOptionDialog(
                null,
                "Choice a class below",
                "Class Selection",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                classesAvailable,
                classesAvailable[0]
        );

    }
}
