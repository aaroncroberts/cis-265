
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

#-----------------------------
#       Maven Test
#-----------------------------
mvn test


#----------------------------------------------------------
#       Manul Test Execution with Junit
#----------------------------------------------------------
#
# Correct the class path
# export CLASSPATH=".:./*"
# export CLASSPATH="$CLASSPATH:$PWD/lib/junit-4.13.2.jar:$PWD/lib/hamcrest-core-1.3.jar:$PWD/bin:"
# echo $CLASSPATH

# # Compile the program files used by the tests
# javac ./src/app/services/WorldService.java -d ./bin

# # Compile the tests
# javac -cp $CLASSPATH tests/app/services/WorldServiceTests.java -d ./bin

# # run the tests
# java -cp $CLASSPATH org.junit.runner.JUnitCore tests.app.services.WorldServiceTests
