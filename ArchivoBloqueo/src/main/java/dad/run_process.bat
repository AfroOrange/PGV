@echo off
rem Compilar los programas Java
javac FileWriterProcess.java
javac FileReaderProcess.java
rem Ejecutar el proceso de escritura en segundo plano
start java FileWriterProcess create
rem Ejecutar el proceso de lectura en otra ventana de consola
start java FileReaderProcess