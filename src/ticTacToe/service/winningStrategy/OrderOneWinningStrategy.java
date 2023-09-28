package ticTacToe.service.winningStrategy;

import ticTacToe.models.Board;
import ticTacToe.models.Move;
import ticTacToe.models.Player;

import java.io.CharArrayWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderOneWinningStrategy implements WinningStrategy{

    private int dimension;
    private List<HashMap<Character, Integer>> rowHashMaps;
    private List<HashMap<Character, Integer>> colHashMaps;
    private HashMap<Character, Integer> topLeftHashMap;
    private HashMap<Character, Integer> topRightHashMap;
    private HashMap<Character, Integer> cornerHashMap;

    public OrderOneWinningStrategy(int dimension) {
        this.dimension = dimension;
        this.colHashMaps = new ArrayList<>();
        this.rowHashMaps = new ArrayList<>();
        this.topLeftHashMap = new HashMap<>();
        this.topRightHashMap = new HashMap<>();
        this.cornerHashMap = new HashMap<>();

        for(int i = 0; i < dimension; i++){
            rowHashMaps.add(new HashMap<>());
            colHashMaps.add(new HashMap<>());
        }
    }

    @Override
    public Player checkWinner(Board board, Move lastMove) {
        Player player = lastMove.getPlayer();
        char symbol = player.getSymbol();
        int row = lastMove.getCell().getRow();
        int col = lastMove.getCell().getCol();

        if(checkRowWin(row, symbol)){
            return player;
        }
        else if (checkColumnWin(col, symbol)) {
            return player;
        } else if (isTopLeftDiagonalCell(row, col) && checkTopLeftDiagonalWin(symbol)) {
            return player;
        }
        else if (isTopRightDiagonalCell(row, col) && checkTopRightDiagonalWin(symbol)) {
            return player;
        }
        else if(isCornerCell(row, col) && checkCornerWin(symbol)){
            return player;
        }
        return null;
    }

    private boolean isTopLeftDiagonalCell(int row, int col){
        return row == col;
    }

    private boolean isTopRightDiagonalCell(int row, int col){
        return (row + col) == (dimension-1);
    }

    private boolean isCornerCell(int row, int col){
        if(row == 0 || row == dimension-1){
            return col == 0 || col == dimension - 1;
        }
        return false;
    }

    private boolean checkRowWin(int row, char symbol){
        rowHashMaps.get(row).putIfAbsent(symbol, 0);

        rowHashMaps.get(row).put(symbol, rowHashMaps.get(row).get(symbol)+1);

        return rowHashMaps.get(row).get(symbol) == dimension;
    }

    private boolean checkColumnWin(int col, char symbol){
        colHashMaps.get(col).putIfAbsent(symbol, 0);

        colHashMaps.get(col).put(symbol, colHashMaps.get(col).get(symbol) + 1);

        return colHashMaps.get(col).get(symbol) == dimension;
    }

    private boolean checkTopRightDiagonalWin(char symbol){
        topRightHashMap.putIfAbsent(symbol, 0);

        topRightHashMap.put(symbol, topRightHashMap.get(symbol)+1);

        return topRightHashMap.get(symbol) == dimension;
    }

    private boolean checkTopLeftDiagonalWin(char symbol){
        topLeftHashMap.putIfAbsent(symbol, 0);
        topLeftHashMap.put(symbol, topLeftHashMap.get(symbol)+1);
        return topLeftHashMap.get(symbol) == dimension;
    }

    private boolean checkCornerWin(char symbol){
        cornerHashMap.putIfAbsent(symbol, 0);
        cornerHashMap.put(symbol, cornerHashMap.get(symbol)+1);

        return cornerHashMap.get(symbol) == dimension;
    }
}
