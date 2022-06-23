fun main() {

    var agoToText: Int = 0


    var rightSecText: String
    var agoToTextMin: Int

    fun RightMin (){
        agoToTextMin = agoToText  % 10
        if ((agoToTextMin == 1) && (agoToText % 100 != 11)){
            rightSecText = "минуту"
        }
        if ((for (agoToTextMin) in (2..4))){
            rightSecText = "минуты"
        }
        else{
            rightSecText = "минут"
    }

        var agoToTextHourPer = agoToText % 24
        var RightHour = when (agoToTextHourPer) {
            1, 21 -> "час"
            2, 3, 4, 22, 23, 24 -> "часа"
            else -> "часов"
        }

        var rightAnswer = when (agoToText) {
            agoToText > 60 -> "только что"
            (agoToText > 61) && (agoToText < 60 * 60) -> RightMin()
            (agoToText > (60*60+1)) && (agoToText < 60*60*24) -> RightHour
            (agoToText > (24*60*60+1)) && (agoToText < 48*60*60) -> "вчера"
            (agoToText > (72*60*60+1)) -> "давно"

        }
    }



}


