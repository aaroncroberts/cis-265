# *******************************************************
#   Build script for the project files
#   - packages require folder strucutre in order to 
#   - correctly link with the java command
# *******************************************************
echo 'Compiling project files...'

# compile the java files and packages
javac Main.java robertsa/Song.java

# all done
echo 'Done!'