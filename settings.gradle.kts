plugins {
    id("com.gradle.enterprise") version "3.10"
}

gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
        publishOnFailure()
    }
}

rootProject.name = "devops-example"

include("utils")
include("example")

