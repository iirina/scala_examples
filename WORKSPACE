rules_scala_version="a89d44f7ef67d93dedfc9888630f48d7723516f7" # update this as needed

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")
http_archive(
             name = "io_bazel_rules_scala",
             url = "https://github.com/bazelbuild/rules_scala/archive/%s.zip"%rules_scala_version,
             type = "zip",
             strip_prefix= "rules_scala-%s" % rules_scala_version
             )

load("@io_bazel_rules_scala//scala:scala.bzl", "scala_repositories")
scala_repositories()

load("@io_bazel_rules_scala//scala:toolchains.bzl", "scala_register_toolchains")
scala_register_toolchains()

load("@io_bazel_rules_scala//scala:scala_maven_import_external.bzl", "scala_maven_import_external")
scala_maven_import_external(
	name = "scala-swing",
	artifact = "org.scala-lang.modules:scala-swing_2.11:jar:2.1.0",
	server_urls = [
        "http://central.maven.org/maven2/",
    ],
    licenses = ["notice"],
)