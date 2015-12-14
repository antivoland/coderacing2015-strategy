import model.Car;
import model.Game;
import model.Move;
import model.World;

public class CrashStrategy implements Strategy {
    private final double enginePower;

    public CrashStrategy(double enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public void move(Car self, World world, Game game, Move move) {
        move.setEnginePower(enginePower);

//        if (lastSpeedY * self.getSpeedY() < 0) {
//            return;
//        }
//        lastSpeedY = self.getSpeedY();
//
//        if (world.getTick() > game.getInitialFreezeDurationTicks() + 230) {
//            move.setBrake(true);
//        }
//
//        if (world.getTick() > game.getInitialFreezeDurationTicks() + 320) {
//            return;
//        }

        Logger.log(self, world, game, move);
    }
}
