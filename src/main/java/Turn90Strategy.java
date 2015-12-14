import model.Car;
import model.Game;
import model.Move;
import model.World;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Turn90Strategy implements Strategy {
    private static final DecimalFormat FORMAT = new DecimalFormat("#.##########", new DecimalFormatSymbols(Locale.ENGLISH));

    @Override
    public void move(Car self, World world, Game game, Move move) {
        if (world.getTick() > game.getInitialFreezeDurationTicks()) {
            move.setEnginePower(0.5);
        }

        if (world.getTick() > game.getInitialFreezeDurationTicks() + 380) {
            move.setWheelTurn(1.0);
        }

        if (world.getTick() > game.getInitialFreezeDurationTicks() + 445) {
            move.setWheelTurn(0.0);
        }

        if (world.getTick() > game.getInitialFreezeDurationTicks() + 1300) {
            return;
        }

        Logger.log(self, world, game, move);
    }
}

