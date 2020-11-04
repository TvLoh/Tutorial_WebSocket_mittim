plugins {
    application
    java
    id("org.springframework.boot") version("2.3.5.RELEASE")
}

repositories {
    jcenter()
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter:2.3.5.RELEASE")
    implementation("org.springframework.boot:spring-boot-starter-websocket:2.3.5.RELEASE")
    implementation("org.webjars:webjars-locator-core:0.46")
    implementation("org.webjars:sockjs-client:1.0.2")
    implementation("org.webjars:stomp-websocket:2.3.3")
    implementation("org.webjars:bootstrap:3.3.7")
    implementation("org.webjars:jquery:3.1.1-1")
    compileOnly("org.projectlombok:lombok:1.18.16")
    annotationProcessor("org.projectlombok:lombok:1.18.16")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.6.2")
}

application {
    mainClass.set("de.adesso.WsApplication")
}

tasks.test {
    useJUnitPlatform()
}
