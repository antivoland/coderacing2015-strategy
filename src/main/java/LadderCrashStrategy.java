import model.Car;
import model.Game;
import model.Move;
import model.World;

public class LadderCrashStrategy implements Strategy {
    private double lastSpeedY = 0;

    @Override
    public void move(Car self, World world, Game game, Move move) {
        move.setEnginePower(1.0);
        if (world.getTick() > game.getInitialFreezeDurationTicks()) {
//            move.setUseNitro(true);
        }

        if (world.getTick() > game.getInitialFreezeDurationTicks() + 200) {
            move.setEnginePower(0.5);
        }

        if (world.getTick() > game.getInitialFreezeDurationTicks() + 200) {
            move.setEnginePower(0.2);
        }

//        if (world.getTick() > 500) {
//            return;
//        }

        Logger.log(self, world, game, move);
    }
}
