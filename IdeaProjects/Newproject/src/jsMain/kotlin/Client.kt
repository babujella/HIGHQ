import kotlinx.browser.document
import react.create
import react.dom.render

fun main() {
    val container = document.createElement("div")
    document.body!!.appendChild(container)

    val welcome = Welcome.create {
        name = "Kotlin/JS"
    }
    render(welcome, container)
}
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
<modelVersion>4.0.0</modelVersion>

<groupId>OCJP-DB</groupId>
<artifactId>ocjpdb</artifactId>
<version>1.0-SNAPSHOT</version>

<properties>
<kotlin.version>1.2.0</kotlin.version>
<main.class>stonesoupprogramming.MainKt</main.class>
</properties>

<dependencies>
<dependency>
<groupId>org.apache.derby</groupId>
<artifactId>derby</artifactId>
<version>10.14.1.0</version>
</dependency>
<dependency>
<groupId>org.jetbrains.kotlin</groupId>
<artifactId>kotlin-stdlib-jre8</artifactId>
<version>${kotlin.version}</version>
</dependency>
<dependency>
<groupId>org.jetbrains.kotlin</groupId>
<artifactId>kotlin-test</artifactId>
<version>${kotlin.version}</version>
<scope>test</scope>
</dependency>

</dependencies>

<build>
<sourceDirectory>src/main/kotlin</sourceDirectory>
<plugins>
<plugin>
<groupId>org.jetbrains.kotlin</groupId>
<artifactId>kotlin-maven-plugin</artifactId>
<version>${kotlin.version}</version>
<executions>
<execution>
<id>compile</id>
<phase>compile</phase>
<goals>
<goal>compile</goal>
</goals>
</execution>
<execution>
<id>test-compile</id>
<phase>test-compile</phase>
<goals>
<goal>test-compile</goal>
</goals>
</execution>
</executions>
<configuration>
<jvmTarget>1.8</jvmTarget>
</configuration>
</plugin>
<plugin>
<groupId>org.apache.maven.plugins</groupId>
<artifactId>maven-jar-plugin</artifactId>
<version>2.6</version>
<configuration>
<archive>
<manifest>
<addClasspath>true</addClasspath>
<mainClass>${main.class}</mainClass>
</manifest>
</archive>
</configuration>
</plugin>
<plugin>
<groupId>org.codehaus.mojo</groupId>
<artifactId>exec-maven-plugin</artifactId>
<version>1.2.1</version>
<executions>
<execution>
<phase>test</phase>
<goals>
<goal>java</goal>
</goals>
</execution>
</executions>
<configuration>
<mainClass>${main.class}</mainClass>
</configuration>
</plugin>
</plugins>
</build>

</project>