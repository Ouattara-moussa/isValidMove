class Bishop extends Piece {
    boolean isValidMove(Position newPosition) {

        // Déplacement diagonal

        if (Math.abs(position.row - newPosition.row) ==
                Math.abs(position.column - newPosition.column)) {
            return true;
        } else {
            return false;
        }
    }
}
