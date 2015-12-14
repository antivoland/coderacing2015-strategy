import model.Car;
import model.Game;
import model.Move;
import model.World;

public class WaggingStrategy implements Strategy {
    private double lastSpeedY = 0;

    @Override
    public void move(Car self, World world, Game game, Move move) {
        move.setEnginePower(1.0);
        if (world.getTick() > game.getInitialFreezeDurationTicks()) {
//            move.setUseNitro(true);
        }

        if (world.getTick() > game.getInitialFreezeDurationTicks() + 50) {
            move.setWheelTurn(0.5);
        }

        if (world.getTick() > game.getInitialFreezeDurationTicks() + 80) {
            move.setWheelTurn(-1.0);
        }

        if (world.getTick() > game.getInitialFreezeDurationTicks() + 115) {
            move.setWheelTurn(1.0);
        }

        if (world.getTick() > game.getInitialFreezeDurationTicks() + 160) {
            move.setWheelTurn(-1.0);
        }

        if (world.getTick() > game.getInitialFreezeDurationTicks() + 200) {
            move.setWheelTurn(1.0);
        }

        if (world.getTick() > game.getInitialFreezeDurationTicks() + 233) {
            move.setWheelTurn(0.0);
        }
        
//
//        if (world.getTick() > game.getInitialFreezeDurationTicks() + 230) {
//            move.setBrake(true);
//        }
//
//        if (world.getTick() > 500) {
//            return;
//        }

        Logger.log(self, world, game, move);
    }
}
