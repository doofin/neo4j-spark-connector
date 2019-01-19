val thisScalaVersion = "2.12.8"
resolvers ++= Seq(
  Resolver.mavenLocal
//  "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/",
//  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/releases",
//  "scala-integration" at "https://scala-ci.typesafe.com/artifactory/scala-integration/"
)
cancelable in Scope.Global := true
scalaVersion in ThisBuild := thisScalaVersion

 
libraryDependencies += "org.neo4j.driver" % "neo4j-java-driver" % "1.7.2"
 
libraryDependencies += "org.apache.spark" %% "spark-core" % "2.4.0"
 
libraryDependencies += "org.apache.spark" %% "spark-graphx" % "2.4.0"
 
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.0"
 
libraryDependencies += "org.graphframes" %% "graphframes" % "0.7.1-SNAPSHOT-spark-gf"
 
libraryDependencies += "junit" % "junit" % "4.12"
 
libraryDependencies += "org.neo4j.test" % "neo4j-harness" % "3.5.1"
 
libraryDependencies += "io.netty" % "netty-all" % "4.1.30.Final"
 
libraryDependencies += "org.bouncycastle" % "bcprov-jdk15on" % "1.53"
