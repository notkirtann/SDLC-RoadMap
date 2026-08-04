FROM node:22.22.0-alpine3.23 as base

# Stage 1 of building
FROM base as builder
WORKDIR /project/build

COPY package*.json .
COPY tsconfig.json .

RUN npm install

COPY /src /src

RUN npm run build

# Stage 2
FROM base as runner

WORKDIR /home/app

COPY --from=builder /project/build/dist dist/ 
COPY --from=builder /project/build/package*.json .

RUN npm install --omit=dev


RUN addgroup --system --gid 1001 executer
RUN adduser --system -uid 1001 executer

USER executer

EXPOSE 8000
ENV PORT=8000

CMD [ "npm","start" ]