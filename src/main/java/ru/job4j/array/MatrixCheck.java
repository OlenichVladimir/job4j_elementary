package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int j = 0; j < board[column].length; j++) {
            if (board[j][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int j = 0; j < board.length; j++) {
            rsl[j] = board[j][j];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int j = 0; j < board.length; j++) {
            if (board[j][j] == 'X' && (monoHorizontal(board, j) || monoVertical(board, j))) {
                result = true;
                break;
            }
        }
        return result;
    }
}