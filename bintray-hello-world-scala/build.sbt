organization := "me.ivanyu.bintrayhelloworld"
name := "bintray-hello-world-scala"

version := "1.0"

scalaVersion := "2.12.3"

publishTo := Some(
  "bintray" at
    "https://api.bintray.com/maven/ivanyu/" +
      "bintray-hello-world-repo/bintray-hello-world-scala/;publish=1")
credentials += Credentials(Path.userHome / ".sbt" / ".credentials")
publishMavenStyle := true

// Not publish sources and/or Javadoc
//packagedArtifacts in publish ~= { m =>
//  val classifiersToExclude = Set(
//    Artifact.SourceClassifier,
//    Artifact.DocClassifier
//  )
//  m.filter { case (art, _) =>
//    art.classifier.forall(c => !classifiersToExclude.contains(c))
//  }
//}


//publishArtifact in Test := true // to add the tests JAR
publishArtifact in Test := false
