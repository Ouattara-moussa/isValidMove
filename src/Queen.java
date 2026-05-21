class Queen extends Piece {
    boolean isValidMove(Position newPosition) {
        // la vérification des limites de Piece
        if (!super.isValidMove(newPosition)) {
            return false;
        }

        // Déplacement spécifique de la reine

        // Horizontale

        if (position.row == newPosition.row) {
            return true;
        }

        // Verticale
        if (position.column == newPosition.column) {
            return true;
        }

        // Diagonale
        if (Math.abs(position.row - newPosition.row) ==
                Math.abs(position.column - newPosition.column)) {
            return true;
        }

        return false;
    }
}
