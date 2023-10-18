## What is it?
Archetype when creating the sermant project.

## How to use it?
Refer to official website guidance, https://sermant.io/zh/document/developer-guide

## How to deploy?
### 1. Modify archetype version

```properties
archetype.groupId=com.huaweicloud.sermant
archetype.artifactId=sermant-template-archetype
archetype.version=1.2.0 # modify this version before deploy
excludePatterns=*/.idea/**,**/*.iml
```

### 2. Create archetype

Execute maven command:

```shell
mvn archetype:create-from-project -Darchetype.properties=./archetype.properties
```

### 3. Add maven configuration

Add maven plugins configuration into `target/generated-sources/archetype/pom.xml`

```xml
<plugins>
  <plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-gpg-plugin</artifactId>
    <version>3.0.1</version>
    <executions>
      <execution>
        <id>sign-artifacts</id>
        <phase>verify</phase>
        <goals>
          <goal>sign</goal>
        </goals>
      </execution>
    </executions>
  </plugin>
</plugins>
```

Add maven  distributionManagement into `target/generated-sources/archetype/pom.xml`

```xml
<distributionManagement>
  <snapshotRepository>
    <id>ossrh</id>
    <url>https://oss.sonatype.org/content/repositories/snapshots</url>
  </snapshotRepository>
  <repository>
    <id>ossrh</id>
    <url>https://oss.sonatype.org/service/local/staging/deploy/maven2/</url>
  </repository>
</distributionManagement>
```

### 4. Deploy archetype

Execute maven command:

```shell
mvn deploy
```
