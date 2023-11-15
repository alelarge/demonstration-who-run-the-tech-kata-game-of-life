import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class GameTest {
    @Test
    fun `at the start of the game game of life, if I have no living cells then the game is over`(){
        val grid = Grid(3, 3)
        val game = Game(grid, emptyList<Position>())
        assertThat(game.isOver()).isTrue
    }
    @Test
    fun `at the beginning of the game game of life, if you have living cells, the game continues`(){
        val grid = Grid(3, 3)
        val game = Game(grid, listOf(Position(0,0)))
        assertThat(game.isOver()).isFalse
    }
    @Test
    fun `horizontal cells evolve into vertical cells in the next generation`() {
        //Given
        val grid = Grid(3, 3)
        val initialAliveCells = listOf(
            Position(1, 0), Position(1, 1), Position(1, 2)
        )
        //When
        val game = Game(grid, initialAliveCells)
        //Then

        assertThat(game.getCellAtPosition(Position(1, 0)).isAlive()).isTrue
        assertThat(game.getCellAtPosition(Position(1, 1)).isAlive()).isTrue
        assertThat(game.getCellAtPosition(Position(1, 2)).isAlive()).isTrue

        game.play()

        assertThat(game.getCellAtPosition(Position(0, 1)).isAlive()).isTrue
        assertThat(game.getCellAtPosition(Position(1, 1)).isAlive()).isTrue
        assertThat(game.getCellAtPosition(Position(2, 1)).isAlive()).isTrue
    }
    @Test
    fun `horizontal cells evolve back into horizontal cells in 2 generations`() {
        //Given
        val grid = Grid(3, 3)
        val initialAliveCells = listOf(
            Position(1, 0), Position(1, 1), Position(1, 2)
        )
        //When
        val game = Game(grid, initialAliveCells)
        //Then

        assertThat(game.getCellAtPosition(Position(1, 0)).isAlive()).isTrue
        assertThat(game.getCellAtPosition(Position(1, 1)).isAlive()).isTrue
        assertThat(game.getCellAtPosition(Position(1, 2)).isAlive()).isTrue

        game.play()
        game.play()

        assertThat(game.getCellAtPosition(Position(1, 0)).isAlive()).isTrue
        assertThat(game.getCellAtPosition(Position(1, 1)).isAlive()).isTrue
        assertThat(game.getCellAtPosition(Position(1, 2)).isAlive()).isTrue
    }
}