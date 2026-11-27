import express from "express";
import Redis from "ioredis";

const app = express();
const redis = new Redis(process.env.REDIS_URL || "redis://localhost:6379");
const PORT = process.env.PORT || 3000;

app.use(express.json());

function otpKey(phoneNumber) {
  return `otp:${phoneNumber}`;
}

app.post("/otp", async (req, res) => {
  const { phoneNumber } = req.body;
  if (!phoneNumber) {
    return res.status(400).send("Phone number is required");
  }

  const otp = Math.floor(100000 + Math.random() * 900000).toString();
  await redis.set(otpKey(phoneNumber), otp, "EX", 30);

  res.json({ message: "OTP sent successfully", otp });
});

app.post("/otp/verify", async (req, res) => {
  const { phoneNumber, otp } = req.body;
  if (!phoneNumber || !otp) {
    return res.status(400).send("Phone number and OTP are required");
  }

  const otpValue = await redis.get(otpKey(phoneNumber));
  if (otpValue !== String(otp)) {
    return res.status(400).send("Invalid OTP");
  }

  await redis.del(otpKey(phoneNumber));
  res.send("OTP verified successfully");
});

app.get("/otp/:phoneNumber/ttl", async (req, res) => {
  const { phoneNumber } = req.params;
  const ttl = await redis.ttl(otpKey(phoneNumber));
  res.status(200).json({ phoneNumber, ttl });
});

app.listen(PORT, () => {
  console.log(`Server is running on http://localhost:${PORT}`);
});
