jvm_binary(
	name = "hello-world-bin",
	basename = "hello-world-basename",
	main = "Main",
	dependencies = [":hello-world"]
)

scala_library(
	name = "hello-world",
	sources = ["hello-world/src/main/scala/Main.scala"],
)

junit_tests(
	name = "CubeCalculatorTest",
	sources = ["scala-test/src/test/scala/CubeCalculatorTest.scala"],
	dependencies = [":CubeCalculator", ":scalatest"]
)

scala_library(
	name = "CubeCalculator",
	sources = ["scala-test/src/main/scala/CubeCalculator.scala"],
)

jar_library(
	name='junit',
    jars = [
      jar(org='junit', name='junit', rev='4.12'),
    ],
)

jar_library(name='scalatest',
	jars = [
  		scala_jar('org.scalatest', 'scalatest', '3.0.0')
	]
)