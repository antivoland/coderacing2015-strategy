import model.Car;
import model.Game;
import model.Move;
import model.World;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Logger {
    private static DecimalFormatSymbols symbols() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator(',');
        return symbols;
    }

    private static final DecimalFormat FORMAT = new DecimalFormat("#.##########", symbols());

    public static void log(Car self, World world, Game game, Move move) {
        System.out.println(String.format("%s;%s;%s;%s;%s;%s;%s;%s",
                world.getTick(),
                FORMAT.format(self.getX()),
                FORMAT.format(self.getY()),
                FORMAT.format(self.getSpeedX()),
                FORMAT.format(self.getSpeedY()),
                FORMAT.format(self.getEnginePower()),
                FORMAT.format(self.getWheelTurn()),
                FORMAT.format(self.getAngle())
        ));
    }
}
