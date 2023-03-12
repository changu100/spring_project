package parser

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class GeekParserSpec : BehaviorSpec() {
    init {
        Given("given") {
            val text = """title
------------------------------
data
------------------------------
url"""
            When("when") {
                val result = GeekParser().parseText(text)
                Then("then") {
                    result.url shouldBe "url"
                    result.title shouldBe "title"
                    result.data shouldBe text
                }
            }
        }
    }
}
