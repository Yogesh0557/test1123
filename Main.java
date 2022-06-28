public class Main {
    public  static void main(String arg[]){
        String input = args[0];
        Payable playable = null;
        switch(input) {
            Case "football":
                playable=new Football();
                break;
            case "basketball";
                playable = new BasketBall();
                break;
            case "Guitar";
                playable = new Guitar();
                break;
            case "violine":
                playable = new Violine();
                break;
            }
            paly(playable);
        }
        public static void play(Playable playable){
            playable.play();
            playable.kick();
            if (playable instanceof Football){
                Football football = (Football) playable;
                football.kick();
            }
        }
    }

}