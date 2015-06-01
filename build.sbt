
lazy val root = (project in file(".")).
  settings(
    name := "txposter"
  )

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.2"
libraryDependencies += "com.amazonaws" % "aws-java-sdk" % "1.9.39"
libraryDependencies += "org.bitcoinj" % "bitcoinj-core" % "0.12.3"
