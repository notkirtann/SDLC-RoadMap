import express from "express";
import Redis from "ioredis";

const app = express();
const redis = new Redis(process.env.REDIS_URL || "redis://localhost:6379");
const PORT = process.env.PORT || 3000;

app.use(express.json());

const BANNER_KEY = "app:banner";

app.post("/banner", async (req, res) => {
  log("Updating banner in Redis cache...");
  await redis.set(BANNER_KEY, JSON.stringify(req.body));
  res.status(200).send("Banner updated successfully");
});

app.get("/banner", async (req, res) => {
  log("Fetching banner from Redis cache...");
  const banner = await redis.get(BANNER_KEY);
  if (banner) {
    res.status(200).json(JSON.parse(banner));
  } else {
    res.status(404).send("Banner not found");
  }
});

app.delete("/banner", async (req, res) => {
  await redis.del(BANNER_KEY);
  res.status(200).send("Banner deleted successfully");
});

app.get("/banner/exists", async (req, res) => {
  const exists = await redis.exists(BANNER_KEY);
  res.status(200).json({ exists: exists === 1 });
});

app.listen(PORT, () => {
  console.log(`Server is running on  http://localhost:${PORT}`);
});
