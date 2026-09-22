FROM ubuntu

# installing nodejs and npm
RUN apt-get update
RUN apt install -y curl
RUN curl -sL https://deb.nodesource.com/setup_25.x -o /tmp/nodesource_setup.sh
RUN bash /tmp/nodesource_setup.sh
RUN apt install -y nodejs

WORKDIR /home/app-1

# copying source code file to docker img
COPY index.ts /home/app-1/index.ts
COPY package.json /home/app-1/package.json
COPY package-lock.json /home/app-1/package-lock.json
# installing dependencies
RUN npm install
# cmd to run app when container starts
CMD ["node", "index.ts"]