name := "StudyJFX"

version := "1.0-SNAPSHOT"

jfxSettings

JFX.mainClass := Some("application.Main")

JFX.javaOnly := true

libraryDependencies ++= Seq(
  "org.controlsfx" % "controlsfx" % "8.0.5",
  "org.mockito" % "mockito-all" % "1.9.5" % "test->default",
  "com.novocode" % "junit-interface" % "0.10" % "test->default"
)

javacOptions ++= Seq(
  "-source", "1.8",
  "-encoding", "UTF-8"
)
