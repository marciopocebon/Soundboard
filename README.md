# Soundboard

A GUI soundboard application template

## Description

Soundboard is a JavaFX GUI application that allows the user to play sounds by clicking buttons.
This package comes with one sample soundboard.audio file and one button. It is intended to be a template for
creating your own soundboard.

## How to Extend

To get started, open the .fxml layout file and add more buttons similar to the existing button. Define the callback
functions and then implement those functions in the controller. The controller has a sample function that can be
cloned to play different sounds or handle other actions.

## Building and Running

With JetBrains IntelliJ IDEA, create a new project from this existing source. You must edit the
File -> Project Structure and mark the src/ folder as source files before it will recognize the classes.
You may also need to specify the compiler output path.

The audio and images are loaded in a way that only works with JAR files. To set up IntelliJ to create the JAR file,
go to File -> Project Structure -> Artifacts. Add new Jar from Modules with dependencies. Choose the Soundboard module
and specify the main class as soundboard.Main. In the Output Layout tab, create a directory called audio and one called
images, and put the directory contents from the audio and images folders.

## Contact

nanodano@devdungeon.com