scalaVersion := "2.11.8"

name := "word-count"
organization := "dataproc.codelab"
version := "1.0"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.3.2",
  "org.apache.spark" %% "spark-sql" % "2.3.2",
  "org.scala-lang" %% "scala-library" % "2.11.8",
  "com.google.cloud" % "google-cloud-storage" % "1.113.11"
)

