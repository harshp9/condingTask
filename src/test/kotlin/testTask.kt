import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.fail
import java.lang.IllegalStateException


class testTask {
    @Test
    fun `1 apple`() {
        var totalApples = 1
        val totalCostApples = .60
        assertEquals(0.60, totalCostApples)
    }
    @Test
    fun `1 orange`() {
        var totalOranges = 1
        val totalCostOranges = .25
        assertEquals(0.25, totalCostOranges)
    }

}