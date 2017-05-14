name := "untitled"

version := "1.0"

scalaVersion := "2.11.5"


lazy val sample1 = project.in(file("sample1")).
enablePlugins(JavaAppPackaging).
enablePlugins(DockerPlugin)

lazy val sample2 = project.in(file("sample2")).
enablePlugins(JavaAppPackaging).
enablePlugins(DockerPlugin)
