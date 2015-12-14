import model.Car;
import model.Game;
import model.Move;
import model.World;

public final class MyStrategy implements Strategy {
    @Override
    public void move(Car self, World world, Game game, Move move) {
//        new Turn90Strategy().move(self, world, game, move);
//        new BrakingYStrategy().move(self, world, game, move);
//        new DecelerationYStrategy().move(self, world, game, move);
//        new CrashStrategy(0.2).move(self, world, game, move);
//        new CrashStrategy(0.5).move(self, world, game, move);
//        new CrashStrategy(1.0).move(self, world, game, move);
//        new NitroCrashStrategy().move(self, world, game, move);
//        new LadderCrashStrategy().move(self, world, game, move);
        new WaggingStrategy().move(self, world, game, move);
    }
}
