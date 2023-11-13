package com.example.myapplication;

import android.app.Activity;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class Mice {
    private final List<Mouse> mice;
    private final Activity activity;

    public Mice(Activity activity, int mode) {
        this.activity = activity;
        this.mice = new ArrayList<>();
        findAllMice(mode);
    }

    public void findAllMice(int mode) {
       /* Button buttonMouse = (Button) activity.findViewById(R.id.buttonMouse);
        mice.add(new Mouse(buttonMouse));
        buttonMouse = (Button) activity.findViewById(R.id.buttonMouse2);
        mice.add(new Mouse(buttonMouse));
        buttonMouse = (Button) activity.findViewById(R.id.buttonMouse3);
        mice.add(new Mouse(buttonMouse));
        buttonMouse = (Button) activity.findViewById(R.id.buttonMouse4);
        mice.add(new Mouse(buttonMouse));
        buttonMouse = (Button) activity.findViewById(R.id.buttonMouse5);
        mice.add(new Mouse(buttonMouse));
        buttonMouse = (Button) activity.findViewById(R.id.buttonMouse6);
        mice.add(new Mouse(buttonMouse));
        buttonMouse = (Button) activity.findViewById(R.id.buttonMouse7);
        mice.add(new Mouse(buttonMouse));
        buttonMouse = (Button) activity.findViewById(R.id.buttonMouse8);
        mice.add(new Mouse(buttonMouse));
        buttonMouse = (Button) activity.findViewById(R.id.buttonMouse9);
        mice.add(new Mouse(buttonMouse));
        buttonMouse = (Button) activity.findViewById(R.id.buttonMouse10);
        mice.add(new Mouse(buttonMouse));*/

        Button[] buttons = new Button[mode];
        int[] buttonIds = {
                R.id.buttonMouse, R.id.buttonMouse2, R.id.buttonMouse3,
                R.id.buttonMouse4, R.id.buttonMouse5, R.id.buttonMouse6,
                R.id.buttonMouse7, R.id.buttonMouse8, R.id.buttonMouse9,
                R.id.buttonMouse10, R.id.buttonMouse11, R.id.buttonMouse12,
                R.id.buttonMouse13, R.id.buttonMouse14, R.id.buttonMouse15
        };

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = activity.findViewById(buttonIds[i]);
            mice.add(new Mouse(buttons[i]));
        }
    }

        public void startAllMice() {
        for (Mouse mouse : mice) {
            mouse.startRunning();
        }
    }

    public void stopAllMice() {
        for (Mouse mouse : mice) {
            mouse.stopRunning();
        }
    }
}
