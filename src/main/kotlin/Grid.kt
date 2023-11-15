class Grid(val rows: Int, val cols: Int) {
    fun getNeighbourPositions(position: Position, scale: Int): Set<Position> {
        return setOf(-scale to -scale, 0 to -scale, scale to -scale, -scale to 0, scale to 0, -scale to scale, 0 to scale, scale to scale)
            .map { (dx, dy) ->
                val (x, y) = position
                Position(position.x + dx, position.y + dy)
            }
            .filter { (x,y) -> x>=0 && y>=0 && x<rows && y<cols}.toSet()
    }
}