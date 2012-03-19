import org.scalatest.FunSpec
import me.elrod.GoogleCalculator._

class GoogleCalculatorSpec extends FunSpec {
  describe("The library") {
    it("should correctly retrieve the result of 2+2") {
      assert(GoogleCalculator.calculate("2 + 2") == "2 + 2 = 4")
    }

    it("should correctly retrieve an approximation of Pi") {
      assert(GoogleCalculator.calculate("pi").startsWith("pi = 3.1415"))
    }
  }
}
