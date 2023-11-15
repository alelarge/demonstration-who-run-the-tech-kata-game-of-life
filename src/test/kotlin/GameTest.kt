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
}