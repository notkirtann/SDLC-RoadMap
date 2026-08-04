# Linux Basics Crash Course

## Use of Linux
Linux is a powerful and versatile operating system that is widely used in various fields, including web servers, cloud computing, and software development. It is known for its stability, security, and flexibility, making it a popular choice for both personal and professional use. Linux is also open-source, which means that it is freely available and can be modified to suit specific needs. Learning Linux can be beneficial for developers, system administrators, and anyone interested in technology. It provides a solid foundation for understanding how operating systems work and can enhance your skills in managing and deploying applications in a Linux environment.

### Linux and Containerization 
Linux is the backbone of many modern technologies, including cloud computing and containerization. It is the operating system that powers the majority of web servers and is widely used in data centers around the world. Linux's stability and security make it an ideal choice for hosting applications and services. Additionally, Linux is the preferred operating system for running containers, which are lightweight, portable, and efficient ways to deploy applications. By learning Linux, you can gain a deeper understanding of how these technologies work and how to effectively manage and deploy applications in a Linux environment.

Linux is also commonly used in the development and deployment of applications, especially in the context of containerization and orchestration. Many developers prefer to use Linux for their development environment due to its compatibility with various tools and frameworks. Additionally, Linux is often the operating system of choice for running containers and orchestrating them using tools like Docker and Kubernetes. By learning Linux, you can gain a deeper understanding of how these technologies work and how to effectively manage and deploy applications in a Linux environment.

## Basic Commands
- `ls`: List directory contents
- `cd`: Change directory
    - `cd ..`: Move up one directory
    - `cd ~`: Move to home directory
    - `cd /`: Move to root directory
- `pwd`: Print working directory
- `mkdir`: Make a new directory
    - `mkdir -p`: Create parent directories as needed
    - example: `mkdir -p /Dev/Project/{Frontend,Backend}`: Create a directory structure for a project
- `rm`: Remove files or directories
    - `rm -r`: Remove directories and their contents recursively
- `rmdir`: Remove empty directories
- `man`: Display the manual for a command
- `cp`: Copy files or directories
    - `cp -r`: Copy directories and their contents recursively
- `mv`: Move or rename files or directories
    - `mv oldname newname`: Rename a file or directory
    - `mv file1 file2 /destination/`: Move files to a new location
- `touch`: Create an empty file or update the timestamp of an existing file
- `cat`: Concatenate and display file contents
    -  `cat >> file.txt`: Append text to a file
- `head`: Display the first few lines of a file
    `head -n 10 file.txt`: Display the first 10 lines of a file
- `tail`: Display the last few lines of a file
    `tail -n 10 file.txt`: Display the last 10 lines of a file
- `less`: View file contents one page at a time
- `nano`: A simple text editor for creating and editing files in the terminal
- `vim`: A powerful text editor for creating and editing files in the terminal
- `echo`: Display a line of text or a variable value
    - `echo $HOME`: Display the value of the HOME environment variable
    - `echo "Hello, World!"`: Display the string "Hello, World!"
    - `echo $PATH`: Display the value of the PATH environment variable
    - `echo $SHELL`: Display the value of the SHELL environment variable
- `grep`: Search for a specific pattern in a file or output
    - `grep "pattern" file.txt`: Search for the specified pattern in the file
    - `grep -r "pattern" /directory/`: Search for the specified pattern recursively in a directory
- `find`: Search for files and directories based on various criteria
    - `find /directory/ -name "filename"`: Search for a file with the specified name in a directory
    - `find /directory/ -type f -size +1M`: Search for files larger than 1MB in a directory
- `ps`: Display information about running processes
- `sudo`: Execute a command with superuser privileges

## create and running scripts
- `touch script.sh`: Create a new shell script file
- `nano script.sh`: Open the shell script file in the nano text editor to add commands

- `bash script.sh`: Run a shell script using the Bash shell

- `chmod`: Change file permissions    
- `chown`: Change file ownership
