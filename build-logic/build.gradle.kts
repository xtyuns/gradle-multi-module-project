plugins {
    `kotlin-dsl`
}

repositories {
    maven("https://mirrors.cloud.tencent.com/nexus/repository/maven-public")
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    val versions = object {
        val kotlinVersion = "1.8.22"
        val springVersion = object {
            val boot = "2.7.13"
            val management = "1.0.15.RELEASE"
        }
    }

    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${versions.kotlinVersion}")
    implementation("org.jetbrains.kotlin:kotlin-allopen:${versions.kotlinVersion}")
    implementation("org.springframework.boot:spring-boot-gradle-plugin:${versions.springVersion.boot}")
    implementation("io.spring.gradle:dependency-management-plugin:${versions.springVersion.management}")
}