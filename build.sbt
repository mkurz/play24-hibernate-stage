name := """testjpa"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaJpa,
  cache,
  javaWs,
  "org.hibernate" % "hibernate-entitymanager" % "4.3.10.Final",
  javaJpa.exclude("org.hibernate.javax.persistence", "hibernate-jpa-2.0-api") // needed for Play 2.3.x
)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
// routesGenerator := InjectedRoutesGenerator
