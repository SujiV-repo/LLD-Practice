package MyticTacToe.service.botPlayingStrategy;

import MyticTacToe.exception.GameOverException;
import MyticTacToe.models.Board;
import MyticTacToe.models.Cell;
import MyticTacToe.models.CellState;
import MyticTacToe.models.Move;

import java.util.List;

public class RandomBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Move makeMove(Board board) throws GameOverException {
        List<List<Cell>> matrix = board.getBoard();

        for(int i = 0; i < matrix.size(); i++){
            for(int j = 0; j < matrix.size(); j++){
                if(matrix.get(i).get(j).getCellState().equals(CellState.EMPTY)){
                    return new Move(i, j);
                }
            }
        }

        throw new GameOverException("No new cells to play with, GAME OVER");
    }
}
