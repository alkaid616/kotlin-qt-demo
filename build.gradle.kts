plugins {
    idea
    id("com.github.johnrengelman.shadow") version "+"
    kotlin("jvm") version "1.9.23"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
idea {
    module {
        isDownloadSources = true
        isDownloadJavadoc = true
    }
}
dependencies {
    testImplementation(kotlin("test"))

    //qtjambi
    // https://central.sonatype.com/artifact/io.qtjambi/qtjambi
    implementation("io.qtjambi:qtjambi:6.7.2")
    // https://central.sonatype.com/artifact/io.qtjambi/qtjambi-native-windows-x64
    implementation("io.qtjambi:qtjambi-native-windows-x64:6.7.2")
    implementation("io.qtjambi:qtjambi-native-linux-x64:6.7.2")

    //qtjambi-uitools
    // https://mvnrepository.com/artifact/io.qtjambi/qtjambi-uitools
    implementation("io.qtjambi:qtjambi-uitools:6.7.2")
    // https://central.sonatype.com/artifact/io.qtjambi/qtjambi-uitools-native-windows-x64
    implementation("io.qtjambi:qtjambi-uitools-native-windows-x64:6.7.2")

    //qtjambi-uic
    // https://central.sonatype.com/artifact/io.qtjambi/qtjambi-uic-native-windows-x64
    implementation("io.qtjambi:qtjambi-uic:6.7.2")
    // https://central.sonatype.com/artifact/io.qtjambi/qtjambi-uic-native-windows-x64
    implementation("io.qtjambi:qtjambi-uic-native-windows-x64:6.7.2")

    //qtjambi-network
    // https://central.sonatype.com/artifact/io.qtjambi/qtjambi-network
    implementation("io.qtjambi:qtjambi-network:6.7.2")
    // https://central.sonatype.com/artifact/io.qtjambi/qtjambi-network-native-windows-x64
    implementation("io.qtjambi:qtjambi-network-native-windows-x64:6.7.2")

    //qtjambi-quick
    // https://central.sonatype.com/artifact/io.qtjambi/qtjambi-quick
    implementation("io.qtjambi:qtjambi-quick:6.7.2")
    // https://central.sonatype.com/artifact/io.qtjambi/qtjambi-quick-native-windows-x64
    implementation("io.qtjambi:qtjambi-quick-native-windows-x64:6.7.2")

    //qtjambi-qml
    // https://central.sonatype.com/artifact/io.qtjambi/qtjambi-qml
    implementation("io.qtjambi:qtjambi-qml:6.7.2")
    // https://central.sonatype.com/artifact/io.qtjambi/qtjambi-qml-native-windows-x64
    implementation("io.qtjambi:qtjambi-qml-native-windows-x64:6.7.2")

}

tasks.shadowJar {
    manifest {
        attributes["Main-Class"] = "MainKt"
    }
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}