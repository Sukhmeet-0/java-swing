@echo off 
echo Enter the name of the Main class
set/p "name=>"

cd classes
echo Main-class: %ch%manifest.txt
jar -cfm %name%.jar manifest.txt *
echo successfully created

cd..
move classes\%name%.jar %name%.jar
del classes\manifest.txt
pause