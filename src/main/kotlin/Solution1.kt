package org.example

class Solution1 : Solution {
    override fun solve(number: Int): String {
        var answer = "1"

        for (i in 1 until number) {
            answer = lookAndSay(answer)
        }

        return getMiddleTwoCharacters(answer)
    }

    private fun lookAndSay(sequence: String): String {
        val result = StringBuilder()
        var i = 0

        while (i < sequence.length) {
            var count = 1
            while (i + 1 < sequence.length && sequence[i] == sequence[i + 1]) {
                i++
                count++
            }
            result.append(count).append(sequence[i])
            i++
        }

        return result.toString()
    }

    private fun getMiddleTwoCharacters(s: String): String {
        val length = s.length
        val midStart = (length - 2) / 2
        val midEnd = midStart + 2
        return if (length < 2) s else s.substring(midStart, midEnd)
    }
}