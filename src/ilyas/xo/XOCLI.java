package ilyas.xo;

import ilyas.xo.model.Field;
import ilyas.xo.model.Figure;
import ilyas.xo.model.Game;
import ilyas.xo.model.Player;
import ilyas.xo.view.ConsoleView;

public class XOCLI {

    public static void main(String[] args) {
        final String name1 = "Ilyas";
        final String name2 = "Ernzar";

        final Player[] players = new Player[2];
        players[0] = new Player(name1, Figure.X);
        players[0] = new Player(name2, Figure.O);

        final Game gameXO = new Game(players, new Field(3), "XO");

        final ConsoleView consoleView = new ConsoleView();
        consoleView.show(gameXO);
        while (consoleView.move(gameXO)) {
            consoleView.show(gameXO);
        }
    }

}
