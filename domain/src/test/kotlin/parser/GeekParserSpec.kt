package parser

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class GeekParserSpec : BehaviorSpec() {
    init {
        Given("given") {
            val text = """*'혁신금융 아이콘' SVB(실리콘밸리 은행) 급성장과 급파산의 전말* 
------------------------------
- '벤처 대출' 영역 개척, 미국내 16위 금융그룹으로 성장  
- 혁신 스타트업의 친구로 인식. 연평균 22% 성장, 투자회수율도 38.6%  
- 무리한 채권투자 화근... 급격한 파산 오명  
- 실리콘밸리 은행 그룹(SVB)은 왜 혁신 은행으로 평가받았나?  
- 혁신 은행의 낡은 결정  
- "전염을 막아라" ... 금융 당국의 ...
------------------------------
https://news.hada.io/topic?id=8674&utm_source=googlechat&utm_medium=bot&utm_campaign=989"""
            When("when") {
                val result = GeekParser().parseText(text)
                Then("then") {
                    result.url shouldBe "https://news.hada.io/topic?id=8674&utm_source=googlechat&utm_medium=bot&utm_campaign=989"
                    result.title shouldBe """*'혁신금융 아이콘' SVB(실리콘밸리 은행) 급성장과 급파산의 전말* """
                    result.data shouldBe text
                }
            }
        }
    }
}