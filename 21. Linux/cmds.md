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
    - `rm -f`: Force remove files without prompting for confirmation
    - `rm -rf`: Force remove directories and their contents recursively without prompting for confirmation
    - `rm -i`: Prompt for confirmation before removing files or directories
    - `rm -r index.html index.css index.js`: Remove multiple files or directories
- `rmdir`: Remove empty directories
- `man`: Display the manual for a command
    - `man ls`: Display the manual for the `ls` command
- `cp`: Copy files or directories
    - `cp -r`: Copy directories and their contents recursively
    - `cp file1 file2`: Copy files to a new location
    - `cp file1 file2 /destination/`: Copy files to a new location
    - `cp file1 file2 file3 /destination/`: Copy multiple files to a new location
- `mv`: Move or rename files or directories
    - `mv oldname newname`: Rename a file or directory
    - `mv file1 file2 /destination/`: Move files to a new location
- `touch`: Create an empty file or update the timestamp of an existing file
- `cat`: Concatenate and display file contents
    -  `cat >> file.txt`: Append text to a file
- `head`: Display the first few lines of a file
    - `head -n 10 file.txt`: Display the first 10 lines of a file
- `tail`: Display the last few lines of a file
    - `tail -n 10 file.txt`: Display the last 10 lines of a file
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
- `touch index.html index.css index.js`: Create multiple files at once

- `nano script.sh`: Open the shell script file in the nano text editor to add commands

- `bash script.sh`: Run a shell script using the Bash shell

- `chmod`: Change file permissions    
    - `chmod +x script.sh`: Make a shell script executable
    - `chmod 755 script.sh`: Set read, write, and execute permissions for the owner, and read and execute permissions for others
    - `chmod 644 file.txt`: Set read and write permissions for the owner, and read-only permissions for others
- `chown`: Change file ownership

## process management
- `ps aux`: Display detailed information about all running processes
    - `ps aux | grep process_name`: Search for a specific process by name
- `kill`: Terminate a running process
    - `kill PID`: Terminate a process by its Process ID
    - `kill -9 PID`: Force terminate a process by its Process ID
    - `pkill process_name`: Terminate a process by its name
- `top`: Display real-time information about running processes and system resource usage
- `htop`: An interactive process viewer that provides a more user-friendly interface than `top` (may need to be installed separately)

## networking commands
- `ping`: Test network connectivity to a specific host
    - `ping example.com`: Send ICMP echo requests to the specified host
    - `ping -c 4 example.com`: Send a specific number of ICMP echo requests to the specified host
- `ifconfig`: Display network interface configuration (may require installation of net-tools package)
- `ip addr`: Display network interface configuration using the `ip` command
- `netstat`: Display network connections, routing tables, and interface statistics (may require installation of net-tools package)
- `ss`: Display socket statistics and network connections
- `traceroute`: Trace the route packets take to reach a specific host (may require installation of traceroute package)
- `curl`: Transfer data from or to a server using various protocols (HTTP, HTTPS, FTP, etc.)
    - `curl http://example.com`: Fetch the content of the specified URL
    - `curl -O http://example.com/file.txt`: Download a file from the specified URL and save it with the same name
    - `curl -I http://example.com`: Fetch the HTTP headers of the specified URL
- `wget`: Download files from the web (may require installation of wget package)
    - `wget http://example.com/file.txt`: Download a file from the specified URL
    - `wget -c http://example.com/file.txt`: Resume a partially downloaded file from the specified URL
    - `wget -r http://example.com`: Download an entire website recursively from the specified URL

## system monitoring commands
- `df`: Display disk space usage for mounted filesystems
    - `df -h`: Display disk space usage in a human-readable format (e.g., in GB or MB)
- `du`: Display disk usage for files and directories
    - `du -h`: Display disk usage in a human-readable format
    - `du -sh /directory/`: Display the total disk usage of a specific directory    
- `free`: Display memory usage information
    - `free -h`: Display memory usage in a human-readable format

## docker commands
- `docker --version`: Check the installed Docker version
- `docker pull image_name`: Download a Docker image from a registry
- `docker images`: List all downloaded Docker images
- `docker ps`: List all running Docker containers
- `docker ps -a`: List all Docker containers, including stopped ones
- `docker run -d --name container_name image_name`: Run a Docker container in detached mode with a specified name
- `docker exec -it container_name bash`: Access the shell of a running Docker container
- `docker stop container_name`: Stop a running Docker container
- `docker rm container_name`: Remove a stopped Docker container
- `docker rmi image_name`: Remove a Docker image



