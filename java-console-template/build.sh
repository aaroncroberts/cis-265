
#
# Manual Java Compile
#javac ./src/app/services/WorldService.java -d ./bin


# -----------------------------------------
#   Maven setup and install for build
# -----------------------------------------
#
# wget https://mirrors.estointernet.in/apache/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.tar.gz
# tar -xvf apache-maven-3.6.3-bin.tar.gz
# mv apache-maven-3.6.3 /opt/
# MV_HOME='/opt/apache-maven-3.6.3'
# PATH="$MV_HOME/bin:$PATH"
# export PATH

#
# compile
mvn compile

#
# Package 
# - The name of the JAR file will be based on the project’s <artifactId> and <version> in the pom file
mvn package