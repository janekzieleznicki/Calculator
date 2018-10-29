package learning.calc.calculator

import org.junit.Assert
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class CalcModelTest {
    fun additionProvider(): Array<Array<Int>> {
        return arrayOf(
            arrayOf(1,2,3),
            arrayOf(3,6,9),
            arrayOf(Int.MAX_VALUE,1, Int.MIN_VALUE),
            arrayOf(Int.MIN_VALUE,-1, Int.MAX_VALUE)
//            arrayOf(1,1,1)
        )
    }

    @Test
    fun addition_left_and_right_should_make_result (){
        additionProvider().forEach {
                action: Array<Int> ->
            // arrange
            val calc = CalcModel()
            calc.left = action[0]
            calc.right = action[1]
            // act
            val output = calc.add()
            // assert
            Assert.assertEquals(action[2], output)
        }
    }
//    @Test
//    fun substraction (){
//        // arrange
//        val calc = CalcModel()
//        calc.left = left; calc.right = right
//        // act
//        val output = calc.substract()
//        // assert
//       Assert.assertEquals(output, result)
//    }
}
