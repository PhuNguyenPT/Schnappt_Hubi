# Schnappt_Hubi
FRA_UAS OOP Project with Java

This file is an instruction on how to run our JavaFX application from the JAR file. Here are the steps you can follow:

I. Check for Java Installation:
Before running the JAR file, ensure that Java is installed on your computer.
	1) Press Windows + R to open the Run dialog.
	2) Type cmd and press Enter.
	3) In the Command Prompt, type java -version.
	4) If Java is installed, it will display the Java version. If not, proceed to the next step.
If Java is not installed, download and install it for free:
	1) Open a web browser and visit the Java download page: https://www.oracle.com/java/technologies/downloads/
	2) Choose the appropriate download link for your machine (“Windows” or "macOS" version).
	3) Double-click the downloaded installer file and follow the installation instructions.
	4) Restart the computer after installation.

II. Since my JAR file is a JavaFX application, it requires the JavaFX SDK:
If JavaFX SDK is not installed, download and install it for free:
	1) Open a web browser and visit the Oracle website: https://www.oracle.com/java/technologies/install-javafx-sdk.html
	2) Choose the appropriate download link for your machine
	3) Double-click the downloaded EXE file to run the installer.
	4) Follow the installation wizard steps.
	5) Note the default installation location (e.g., C:\Program Files\JavaFX\javafx-sdk-version).

III. Run the JAR file:
Once Java and JavaFX SDK are installed, you can run the JAR file:
	1) Locate the JAR file on your computer.
	2) Open the terminal (Command Prompt): Press Windows + R, type cmd, and press Enter.
	3) Change the directory to where the JAR file is located: Use the cd command to navigate to the JAR file’s directory (e.g., cd path/to/your/jarfile). path/to/your/javafxsdk/lib
	4) Run the JAR file using the command line: Type java --module-path "path/to/your/javafxsdk/lib" --add-modules javafx.controls,javafx.fxml -jar TheJarFileName.jar
	5) Press Enter.
*** Please remember: 
	a) Change the path/to/your/javafxsdk/lib with the actual path to the lib folder of JavaFX SDK in your computer (look back to step 5) when you install the JavaFX SDK, this path could be C:\Program Files\JavaFX\javafx-sdk-version/lib)
	b) Change the TheJarFileName with the actual name of the JAR file in your computer (by default, our application name is App.jar)

IV. Optional: Extract Contents from JAR:
If you want to explore the contents of our JAR file, you can use a program like WinRAR to extract the files from the JAR archive.
