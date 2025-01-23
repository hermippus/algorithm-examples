plugins {
    id("java")
    id("org.graalvm.buildtools.native") version "0.10.4"
}

group = "me.hermippus"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
}

graalvmNative {
    binaries {
        named("main") {
            imageName.set("algorithm-examples")
            mainClass.set("me.hermippus.Main")
            buildArgs.addAll("-Ob", "--gc=G1")
        }
    }
}

tasks.withType(Jar::class) {
    manifest {
        attributes["Manifest-Version"] = "1.0"
        attributes["Main-Class"] = "me.hermippus.Main"
    }
}