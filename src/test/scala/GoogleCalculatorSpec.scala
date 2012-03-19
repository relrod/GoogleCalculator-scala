import org.scalatest.FunSpec
import me.elrod.GoogleCalculator._

class GoogleCalculatorSpec extends FunSpec {
  describe("The library") {
    it("should correctly retrieve the result of 2+2") {
      assert(GoogleCalculator.calculate("2 + 2", secure = false) == "2 + 2 = 4")
      assert(GoogleCalculator.calculate("2 + 2", secure = true) == "2 + 2 = 4")
    }

    it("should correctly retrieve an approximation of Pi") {
      assert(GoogleCalculator.calculate("pi", secure = false).startsWith("pi = 3.1415"))
      assert(GoogleCalculator.calculate("pi", secure = true).startsWith("pi = 3.1415"))
    }
  }
}
