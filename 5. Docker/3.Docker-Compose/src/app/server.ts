import express from "express";
import type {Response,Request} from 'express'

const app = express();

app.get("/", (req:Request, res:Response) => {
  return res.json({
    message: `Hello from Typescript Server`,
  });
});

export default app;
