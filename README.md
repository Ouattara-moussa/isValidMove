# Exercice 5 – Queen

## À faire
- Créer la classe `Queen` qui hérite de `Piece`
- Remplacer la méthode `isValidMove`
- Ajouter les règles de déplacement de la reine

## Règles
- Horizontale (même ligne)
- Verticale (même colonne)
- Diagonale (|Δrow| = |Δcol|)

## Code

```java
class Queen extends Piece {
    boolean isValidMove(Position newPosition) {
        if (!super.isValidMove(newPosition)) {
            return false;
        }

        if (position.row == newPosition.row) return true;
        if (position.column == newPosition.column) return true;
        if (Math.abs(position.row - newPosition.row) ==
            Math.abs(position.column - newPosition.column)) return true;

        return false;
    }
}
