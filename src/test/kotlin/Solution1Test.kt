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
                Arguments.of(1, "1"),
                Arguments.of(2, "11"),
                Arguments.of(3, "21"),
                Arguments.of(4, "1211"),
                Arguments.of(5, "111221")
            )
    }
}