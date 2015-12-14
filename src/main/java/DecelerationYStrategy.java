import model.Car;
import model.Game;
import model.Move;
import model.World;

public class DecelerationYStrategy implements Strategy {
    @Override
    public void move(Car self, World world, Game game, Move move) {
        if (world.getTick() > game.getInitialFreezeDurationTicks()) {
            move.setEnginePower(1.0);
        }

        if (world.getTick() > game.getInitialFreezeDurationTicks() + 150) {
            move.setEnginePower(0.0);
        }

        if (world.getTick() > game.getInitialFreezeDurationTicks() + 860) {
            return;
        }

        Logger.log(self, world, game, move);
    }
}
