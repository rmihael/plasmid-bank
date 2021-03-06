object Versions extends WebJarsVersions with ScalaJSVersions with RdfVersions with SharedVersions
{
	val scala = "2.11.6"

	val akkaHttp = "1.0-RC3"

	val ammonite = "0.3.0"

}

trait ScalaJSVersions {

	val jqueryFacade = "0.5"

	val jsext = "0.5"

	val dom = "0.8.0"

	val binding = "0.8.0"

}

//versions for libs that are shared between client and server
trait SharedVersions
{
	val autowire = "0.2.5"

	val scalaRx = "0.2.8"

	val quicklens = "1.3.1"

	val scalaTags = "0.5.1"

	val scalaCSS = "0.2.0"

	val productCollections = "1.4.2"

	val utest = "0.3.1"
}

trait WebJarsVersions {

	val jquery =  "2.1.3"

	val semanticUI = "1.12.3"

	val selectize = "0.12.0"
}

trait RdfVersions {

  val bananaRdf = "0.8.1"

  val sesame = "2.8.3"
}
