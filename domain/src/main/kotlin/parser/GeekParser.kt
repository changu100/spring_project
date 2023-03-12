package parser

data class GeekData(
    val url: String,
    val data: String,
    val title: String
)

class GeekParser : Parser<String, GeekData> {
    override fun parseText(source: String): GeekData {
        val textArray = source.split("\n")

        return GeekData(
            url = textArray.last(),
            data = source,
            title = textArray.first()
        )
    }
}