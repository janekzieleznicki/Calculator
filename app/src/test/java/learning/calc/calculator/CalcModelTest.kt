package learning.calc.calculator

import org.testng.Assert.assertEquals
import org.testng.annotations.DataProvider
import org.testng.annotations.Test


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class CalcModelTest {
    @DataProvider
    fun additionProvider(): Array<Array<Int>> {
        return arrayOf(
            arrayOf(1,2,3),
            arrayOf(3,6,0),
            arrayOf(Int.MAX_VALUE,1, Int.MIN_VALUE),
            arrayOf(Int.MIN_VALUE,-1, Int.MAX_VALUE)
        )
    }

    @Test(dataProvider = "additionProvider")
    fun addition_isCorrect (left: Int, right: Int, res: Int){
        // arrange
        val calc = CalcModel()
        calc.left = left
        calc.right = right
        // act
        var output = calc.add()
        // assert
        assertEquals(output, res)
    }
}
