import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CoreTest {

    @Test
    fun `test the core`() {
        //arrange
        //act
        val sut = Core()

        //assert
        assertThat(sut).isNotNull
    }
}