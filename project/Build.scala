import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "lemondrops"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      "postgresql" % "postgresql" % "9.1-902.jdbc4",
      "org.hibernate" % "hibernate-entitymanager" % "3.6.9.Final",
      "net.sourceforge.collections" % "collections-generic" % "4.01"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
      // Add your own project settings here
      resolvers += "TAMU Release Repository" at "https://maven.library.tamu.edu/content/repositories/releases/"
    )

}
