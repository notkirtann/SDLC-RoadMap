import express from 'express';

const app = express()

app.get('/',(req,res)=>{
    console.log(`server is accessed on host machine`);
    res.send(`server is running fuckin fine bruhh`);
})

app.listen(8000,()=>{
    console.log(`Here we go!`);
})