import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class GameTest {
    @Test
    fun `at the start of the game game of life, if I have no living cells then the game is over`(){
        val grid = Grid(3, 3)
        val game = Game(grid, emptyList<Position>())
        assertThat(game.isOver()).isTrue
    }
}