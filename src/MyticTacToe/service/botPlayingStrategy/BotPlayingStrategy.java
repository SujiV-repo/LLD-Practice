package MyticTacToe.service.botPlayingStrategy;

import MyticTacToe.exception.GameOverException;
import MyticTacToe.models.Board;
import MyticTacToe.models.Move;

public interface BotPlayingStrategy {
    Move makeMove(Board board) throws GameOverException;
}
