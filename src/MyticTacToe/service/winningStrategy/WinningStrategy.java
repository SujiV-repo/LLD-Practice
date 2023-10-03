package MyticTacToe.service.winningStrategy;

import MyticTacToe.models.Board;
import MyticTacToe.models.Player;
import MyticTacToe.models.Move;

public interface WinningStrategy {

    Player checkWinner(Board board, Move lastMove);
}
