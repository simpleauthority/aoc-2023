plugins {
    id("java")
}

group = "dev.jacobandersen.codechallenges"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.apache.commons:commons-text:1.12.0")
    implementation("org.apache.commons:commons-lang3:3.17.0")
    implementation("org.jgrapht:jgrapht-core:1.5.2")
    implementation("org.ejml:ejml-simple:0.43.1")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}