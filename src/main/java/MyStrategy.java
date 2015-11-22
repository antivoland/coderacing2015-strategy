import model.Car;
import model.Game;
import model.Move;
import model.World;

public final class MyStrategy implements Strategy {
    @Override
    public void move(Car self, World world, Game game, Move move) {
        if (world.getTick() > game.getInitialFreezeDurationTicks()) {
//            move.setUseNitro(true);
            move.setEnginePower(0.5);
        }

        if (world.getTick() > game.getInitialFreezeDurationTicks() + 380) {
//            move.setEnginePower(0.0);
            move.setWheelTurn(1.0);
//            move.movesetBrake(true);
        }

        if (world.getTick() > game.getInitialFreezeDurationTicks() + 445) {
//            move.setEnginePower(1.0);
            move.setWheelTurn(0.0);
//            move.movesetBrake(true);
        }

//        if (world.getTick() > game.getInitialFreezeDurationTicks() + 300) {
//            move.setWheelTurn(0.0);
//        }

//        System.out.println(String.format("t: %s, x: %s, y: %s, vx: %s, vy: %s",
//                world.getTick(), self.getX(), self.getY(), self.getSpeedX(), self.getSpeedY()));

        System.out.println(String.format("%s;%s;%s;%s;%s;%s;%s",
                world.getTick(), self.getX(), self.getY(), self.getSpeedX(), self.getSpeedY(),
                self.getWheelTurn(), self.getAngle()));
    }
}
