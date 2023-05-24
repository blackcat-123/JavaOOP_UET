public class Bishop extends Piece {

    /**
     * hi.
     */
    public Bishop(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }

    /**
     * hi.
     */
    public Bishop(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    @Override
    public String getSymbol() {
        return "B";
    }

    @Override
    public boolean canMove(Board board, int x, int y) {
        if (!board.validate(x, y)) {
            return false;
        }

        if (x > this.getCoordinatesX()) {
            for (int i = 1; i < y - this.getCoordinatesY(); i++) {
                if (board.getAt(this.getCoordinatesX() + i, this.getCoordinatesY() + i) != null) {
                    return false;
                }
            }
            for (int i = 1; i < this.getCoordinatesY() - y; i++) {
                if (board.getAt(this.getCoordinatesX() + i, this.getCoordinatesY() - i) != null) {
                    return false;
                }
            }
        }
        if (x < this.getCoordinatesX()) {
            for (int i = 1; i < y - this.getCoordinatesY(); i++) {
                if (board.getAt(this.getCoordinatesX() - i, this.getCoordinatesY() + i) != null) {
                    return false;
                }
            }
            for (int i = 1; i < this.getCoordinatesY() - y; i++) {
                if (board.getAt(this.getCoordinatesX() - i, this.getCoordinatesY() - i) != null) {
                    return false;
                }
            }
        }

        if (board.getAt(x, y) != null) {
            return !board.getAt(x, y).getColor().equals(this.getColor());
        }
        return true;
    }
} 