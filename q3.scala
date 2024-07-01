import java.math.RoundingMode
object Main extends App{
    def RoundedMean(num1:Int,num2:Int):Double={
        val mean=(num1.toDouble+num2.toDouble)/2.0
        BigDecimal(mean).setScale(2,BigDecimal.RoundingMode.HALF_UP).toDouble

    }
    println(RoundedMean(23233,553))
}