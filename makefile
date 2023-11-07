# makefile for use with the quantum algorithm simulator project.

# Run this to compile all the java files.  This finds all the java files 
# in the src directory, adds them to a list in the utl directory then
# compiles them all.  The compiled programs are .class files and are
# put in the cls directory.
.PHONY : j
j :
	find src -name *.java -print > utl/project.list; \
	javac -d cls @utl/project.list

# This runs the main method in Complex.java
.PHONY : 1
1 :
	java -classpath cls edu.su.engr101.quantum.Complex

# This runs the main method in ComplexTest.java
1t :
	java -classpath cls edu.su.engr101.tests.quantum.ComplexTest

# This runs the main method in ComplexMatrix.java
.PHONY : 2
2 :
	java -classpath cls edu.su.engr101.quantum.ComplexMatrix

# This runs the main method in ComplexMatrixTest.java
.PHONY : 2t
2t :
	java -classpath cls edu.su.engr101.tests.quantum.ComplexMatrixTest

# This runs the main method in QuantumGateFactory.java
.PHONY : 3
3 :
	java -classpath cls edu.su.engr101.quantum.QuantumGateFactory

# This runs the main method in QuantumGateFactoryTest.java
.PHONY : 3t
3t :
	java -classpath cls edu.su.engr101.tests.quantum.QuantumGateFactoryTest

# This runs the main method in .java
.PHONY : 4
4 :
	java -classpath cls edu.su.engr101.quantum.QuantumAlgorithms

# This runs the main method in QuantumAlgorithmsTest.java
.PHONY : 4t
4t :
	java -classpath cls edu.su.engr101.tests.quantum.QuantumAlgorithmsTest

# This creates the javadoc documentation and puts it in the jdoc directory.
.PHONY : jdoc
jdoc :
	javadoc -d jdoc -version -author -linksource -source 11 \
        -footer "<FONT COLOR="#786">Shenandoah University</FONT>" \
	-group "Quantum Simulation" edu.su.engr101* \
	-sourcepath src edu.su.engr101.quantum edu.su.engr101.tests.quantum

