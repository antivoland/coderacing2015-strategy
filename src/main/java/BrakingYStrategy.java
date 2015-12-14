import model.Car;
import model.Game;
import model.Move;
import model.World;

public class BrakingYStrategy implements Strategy {
    @Override
    public void move(Car self, World world, Game game, Move move) {
        if (world.getTick() > game.getInitialFreezeDurationTicks()) {
            move.setEnginePower(1.0);
        }

        if (world.getTick() > game.getInitialFreezeDurationTicks() + 230) {
            move.setBrake(true);
        }

        if (world.getTick() > game.getInitialFreezeDurationTicks() + 320) {
            return;
        }

        Logger.log(self, world, game, move);
    }
}
