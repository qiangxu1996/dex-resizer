plugins {
    application
}

group = "edu.purdue.dsnl"
version = "1.0-SNAPSHOT"

application {
    mainClassName = "edu.purdue.dsnl.dexresizer.DexResizer"
}

repositories {
    mavenCentral()
}

dependencies {
    compile("com.github.lanchon.dexpatcher:multidexlib2:2.2.7")
    testCompile("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_11
}