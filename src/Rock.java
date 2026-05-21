class Rock extends Piece {
    boolean isValidMove(Position newPosition) {

        // Déplacement horizontal ou vertical
        if (position.row == newPosition.row ||
                position.column == newPosition.column) {
            return true;
        } else {
            return false;
        }
    }
}
