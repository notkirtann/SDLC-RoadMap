print('starting with python')

def Madrid(trophy):
    print("Real Madrid has:",trophy,"La Liga Titles")

Madrid(36)

#? learning importing function from different file.
from LearningImport import RealMadrid
RealMadrid(15)

#? PYTHON UNDER THE HOOD THEORY
#!  INNER WORKING
# while installing python one more thing also gets install that is pyhon VM(virtual machine)
# compile to byte code and then execute by python VM. byte code is a low level code which is platform independent and can be executed on any machine which has python VM.

#@ .pyc file is a compiled version of python file which is generated when we import a module. it is stored in __pycache__ folder. it helps in faster execution of the code as it does not need to be compiled again. if the source code is changed then the .pyc file will be regenerated.
# it is also called frozen binaries as it is a compiled version of the souce code. it is not human readable and can not be modified. it is used to protect the source code from being modified by others. it is also used to distribute the code without sharing the source code. it is also used to improve the performance of the code as it does not need to be compiled again.

# __pycache__ changes based on souce changes and python version. if we change the source code then the .pyc file will be regenerated and if we change the python version then the .pyc file will be regenerated. it is also used to store the compiled version of the code for different python versions. it is also used to store the compiled version of the code for different platforms. it is also used to store the compiled version of the code for different architectures. it is also used to store the compiled version of the code for different operating systems. it is also used to store the compiled version of the code for different python implementations. it is also used to store the compiled version of the code for different python versions and platforms. it is also used to store the compiled version of the code for different python versions and architectures. it is also used to store the compiled version of the code for different python versions and operating systems. it is also used to store the compiled version of the code for different python versions and python implementations.

# @ BYTES CODE is not a machine code that you can execute directly on your machine. It is just a python specific interpretation.

# Different pythons : jpython, iron python, cpython(Standard), pypy, stackless python, micro python, circuit python, brython, skulpt, transcrypt, nuitka, pyodide, pyjs, py2js, pyjs.

#? Python Shell
#! IDLE SHELL is a shell used for 