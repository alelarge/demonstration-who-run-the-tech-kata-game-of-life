import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


class GridTest {
    @Test
    fun `must return all positions of the neighbours at the center of the grid`() {
        val grid = Grid(3, 3)
        val cellNeighbourPositions = grid.getNeighbourPositions(Position(1, 1), 1)
        assertThat(cellNeighbourPositions).isEqualTo(setOf(
            Position(0, 0), Position(0, 1), Position(0, 2),
            Position(1, 0), Position(1, 2),
            Position(2, 0), Position(2, 1), Position(2, 2)))
    }

    @Test
    fun `must return all positions of the neighbours of the cell at bottom right`() {
        val grid = Grid(3, 3)
        val cellNeighbourPositions = grid.getNeighbourPositions(Position(2, 2), 1)
        val expectedNeighbours = setOf<Position>(

        )
        Assertions.assertThat(expectedNeighbours.toSet()).isEqualTo(cellNeighbourPositions.toSet())
    }
}