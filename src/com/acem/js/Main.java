package com.acem.js;

import com.acem.js.ball.BasketBall;
import com.acem.js.ball.Football;
import com.acem.js.musicalinstrument.Guitar;
import com.acem.js.musicalinstrument.Violine;

public class Main {
    public  static void main(String args[]){
        String input = args[0];
        Playable playable = null;
        switch(input) {
            case "football":
                playable = new Football();
                break;
            case "basketball":
                playable = new BasketBall();
                break;
            case "Guitar":
                playable = new Guitar();
                break;
            case "violine":
                playable = new Violine();
                break;
            }
            play(playable);
        }
        public static void play(Playable playable){
            playable.play();
            if (playable instanceof Football){
                Football football = (Football) playable;
                football.kick();
            }
        }
    }
