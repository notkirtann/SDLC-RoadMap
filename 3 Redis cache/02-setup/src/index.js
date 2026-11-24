import express from "express";
import mongoose from "mongoose";
import Redis from "ioredis";

const app = express();
const redis = new Redis(process.env.REDIS_URL || "redis://localhost:6379");
const PORT = process.env.PORT || 3000;
const MONGO_URI =
  process.env.MONGO_URI || "mongodb://localhost:27017/my_redis_database";

app.use(express.json());
app.get("/redis", async (req, res) => {
  const reply = await redis.ping();
  res.send(`Redis is ${reply}`);
});

app.get("/mongo", async (req, res) => {
  try {
    await mongoose.connect(MONGO_URI);
    res.json({
      message: "MongoDB is connected",
      status: mongoose.connection.readyState,
      database: mongoose.connection.name,
    });
  } catch (error) {
    res.status(500).json({ message: "MongoDB connection failed" });
  }
});

app.listen(PORT, () => {
  console.log(`Server is running on port ${PORT}`);
});
