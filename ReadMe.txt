README FILE

Author(s): Sriram Krishnan,prateek dobriyal
e-mail(s): skrishn5@binghamton.edu,pdobriy1@binghamton.edu


PURPOSE:

This project is to calculate total duration,effort,cost and carbon footprint based on student completion of orientation checklist.


PERCENT COMPLETE:

I believe I have completed 100% of this project.

PATTERN USED:
Builder pattern

REASONS:
As it is an itinerary of the list of things a student has to complete for his orientation 
and construct results based on the type of choice provided by the student builder pattern would be 
a wise choice to implement for this kind of scenario.

FILES:
  Included with this project are 5 files:
  FileProcessor.java-For processing files
  Driver.java-main class
  Results-store the results
 Interfaces:For each activity(dormselection,ride,registration,buying books) and calculations(cost,effort,duration,carbonfootprint),workshop interface to construct the object
  
  README, the text file you are presently reading

DATASTRUCTURE:
Map to store the results of the calculations 

Reasons:
Map used because 
1. It helps in displaying the key value pairs where key is type of estimation and value is the calculation


SAMPLE OUTPUT:

cost in dollars:1113
TotalEffort in calories:34
CarbonFootPrint in tonnes of CO2:21
Duration in minutes:57


TO COMPILE:
navigate to the krishnan_sriram_dobriyal_prateek/studentorientation and type in terminal:
 ant -buildfile build.xml all

## To clean:
ant -buildfile build.xml clean






TO RUN:

java Driver <your input file> <your output file>

## To run by specifying arguments from command line 
ant -buildfile build.xml run



BIBLIOGRAPHY:

This serves as evidence that we are in no way intending Academic Dishonesty.

