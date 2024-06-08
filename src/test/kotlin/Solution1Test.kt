import org.example.Solution1
import org.junit.jupiter.api.Assertions.assertEquals

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class Solution1Test {
    private val solution = Solution1()

    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun `test`(input: Int, expected: String) {
        assertEquals(expected, solution.solve(input))
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> =
            Stream.of(
                Arguments.of(4, "12"),
                Arguments.of(5, "21"),
                Arguments.of(6, "22"),
                Arguments.of(7, "12"),
                Arguments.of(8, "21")
            )
    }
}