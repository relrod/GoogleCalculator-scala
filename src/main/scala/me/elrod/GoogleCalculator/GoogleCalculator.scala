package me.elrod.GoogleCalculator
import java.net.URLEncoder
import org.jsoup.Jsoup
import org.jsoup.nodes.Document

object GoogleCalculator {
  System.setProperty("http.agent", "Mozilla/5.0 (X11; Linux x86_64; rv:13.0) Gecko/20120222 Firefox/13.0a1")

  def calculate(query: String, secure: Boolean = true): String = {
    val encodedQuery: String = URLEncoder.encode(query, "UTF-8").replace("+", "%20")
    val protocol = if (secure) "https" else "http"
    val doc: Document = Jsoup.connect(protocol + "://www.google.com/search?q=" + encodedQuery).get()
    doc.select("h2.r b").text
  }
}
