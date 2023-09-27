package ticTacToe.service.winningStrategy;

import ticTacToe.models.Board;
import ticTacToe.models.Player;
import ticTacToe.models.Move;

public interface WinningStrategy {

    Player checkWinner(Board board, Move lastMove);
}
