libraryDependencies += "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value

addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.5.4")

addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "0.9.3")

addSbtPlugin("io.crashbox" % "sbt-gpg" % "0.2.0")

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.3.4")
