fun main() {

    var agoToText: Int = 0
    var rightSecText: String
    var agoToTextMin: Int = (agoToText / 60) % 100

    val rightMin = when (agoToTextMin) {
        1, 21, 31, 41, 51 -> "минуту"
        2, 3, 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54 -> "минуты"
        else -> "минут"
    }

    val agoToTextHourPer = agoToText / 60 / 24
    val rightHour = when (agoToTextHourPer) {
        1, 21 -> "час"
        2, 3, 4, 22, 23, 24 -> "часа"
        else -> "часов"
    }

    var rightAnswer = when {
        agoToText > 60 -> "только что"
        (agoToText > 61) && (agoToText < 60 * 60) -> rightMin
        (agoToText > (60 * 60 + 1)) && (agoToText < 60 * 60 * 24) -> rightHour
        (agoToText > (24 * 60 * 60 + 1)) && (agoToText < 48 * 60 * 60) -> "вчера"
        else -> "давно"
    }
}



