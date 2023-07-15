rootProject.name = "gradle-multi-module-project"

pluginManagement {
    includeBuild("build-logic")
}

include("module-a")
include("module-b")