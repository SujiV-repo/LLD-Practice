package MyticTacToe.service.winningStrategy;

public class WinningStrategyFactory {
    public WinningStrategy getWinningStrategy(WinningStrategies winningStrategies, int dimension){
        return switch (winningStrategies){
            case ORDERONE_WINNINGSTRATEGY -> new OrderOneWinningStrategy(dimension);
        };
    }
}
