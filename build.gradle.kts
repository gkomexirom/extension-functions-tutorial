plugins {
    kotlin("jvm") version "1.9.23"
}

group = "com.german"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-html-jvm:0.11.0")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.14.+")

    // Optional: Jackson core and annotations if not already included
    implementation("com.fasterxml.jackson.core:jackson-databind:2.14.+")
    implementation("com.fasterxml.jackson.core:jackson-core:2.14.+")
    implementation("com.fasterxml.jackson.core:jackson-annotations:2.14.+")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}