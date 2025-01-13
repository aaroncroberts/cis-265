# Java Console

## Getting Started

Java projects are configured for VS Code to leverage build, test, and debugging programs.  Workstation setup is listed below:

### VS Code

Download and follow the installation instructions for the Code Pack for your specific OS. 

**MacOS**
(Java Coding pack for VS Code)[https://aka.ms/vscode-java-installer-mac]

**Windows**
(Java Coding Pack for VS Code)[https://aka.ms/vscode-java-installer-win]

When the installer completes, you will be prompted to launch VS Code.  Click OK and the 'Get Started with Java Development' configuration will walk you through installing the SDK.

### Compiler

Java has many flavors and version must align for developer workstations and server runtimes.  PS App Servers are running Java Version: build 1.8.0_201-b09

The recommendation is to install the OpenJDK version locally for development, and use the build server to sort out the runtime necessary for deployment.  There are features differences between the implementations and if there are concners, use the developer copy from your Oracle license and align with what is on the server.  The imporant thing to understand is that local copies that are not OpenJDK require e license.

(OpenJDK)[https://openjdk.org/projects/jdk8/]

**Oracle Flavors:**

(MacOS JDK 8u201)[https://www.oracle.com/webapps/redirect/signon?nexturl=https://download.oracle.com/otn/java/jdk/8u201-b09/42970487e3af4f5aa5bca3f542482c60/jdk-8u201-macosx-x64.dmg] **Not Apple Silicon**

(Windows JDK 8u201)[https://www.oracle.com/webapps/redirect/signon?nexturl=https://download.oracle.com/otn/java/jdk/8u201-b09/42970487e3af4f5aa5bca3f542482c60/jdk-8u201-windows-x64.exe]

### Extension Pack for VS Code

VS Code has a very useful extension pack that will help in debugging, compiling, and testing java projects:

(Download Extension Pack)[]https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack]
