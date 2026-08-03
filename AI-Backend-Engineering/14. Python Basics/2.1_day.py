
#? Inbuild modules in python
# are those modules which are already installed with python and can be used without installing them separately. 
# some of the inbuild modules are #@ os, sys, math, random, datetime, time, re, json, csv, etc.

# ! OS module
import os  as operating_system
print("List of you directoy files:",operating_system.listdir())
print("your Current Directory:",operating_system.getcwd())

for file in operating_system.listdir():
    print(file)

print("------------------------------------------------")
# ! sys module
import sys as system
print("Python version:",system.version)
print("Python version info:",system.version_info)
print("Platform:",system.platform)

print("------------------------------------------------")
# ! self module import
import LearningImport
LearningImport.RealMadrid(15)
print((379/647)*100)

print("------------------------------------------------")
# ! importing specific function from a module
from importlib import reload
reload(LearningImport)
from LearningImport import UCL
UCL("Bayern Munich",6)