import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


class GridTest {
    @Test
    fun `initialized a 3x5 grid`(){
        assertThat(grid.rows).isEqualTo(3)
        assertThat(grid.cols).isEqualTo(5)
    }
}