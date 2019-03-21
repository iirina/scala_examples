load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")

scala_binary(
	name = "hello-world",
	srcs = ["hello-world/src/main/scala/Main.scala"],
	main_class = "Main"
)

scala_test(
	name = "CubeCalculatorTest",
	srcs = ["scala-test/src/test/scala/CubeCalculatorTest.scala"],
	deps = [":CubeCalculator"]
)

scala_library(
	name = "CubeCalculator",
	srcs = ["scala-test/src/main/scala/CubeCalculator.scala"],
)
