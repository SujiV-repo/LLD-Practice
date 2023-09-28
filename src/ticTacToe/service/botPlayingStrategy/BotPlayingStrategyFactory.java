package ticTacToe.service.botPlayingStrategy;

public class BotPlayingStrategyFactory {

    public BotPlayingStrategy getBotPlayingStrategy(BotPlayingStrategies strategies){
        return switch (strategies){
            case RANDOMBOTPLAYINGSTRATEGY -> new RandomBotPlayingStrategy();
        };
    }
}
