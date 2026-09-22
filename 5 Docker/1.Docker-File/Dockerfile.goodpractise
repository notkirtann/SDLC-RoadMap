FROM node:22.22.0-alpine3.23

WORKDIR /home/app-1/src

COPY package*.json . 
RUN npm install

COPY index.ts index.ts

CMD ["node", "index.ts"]
