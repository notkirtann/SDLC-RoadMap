const promiseOne = new Promise(function(resolve, reject){
//     setTimeout(function(){
//         resolve("Promise 1 resolved");
//     },1000)
// })

// promiseOne.then(function(result){
//     console.log(result);
// })

// new Promise(function(resolve,reject){
//     setTimeout(function(){
//         let error = true;
//         if(!error){
//             resolve("Promise 2 resolved");
//         }else{
//             reject("Promise 2 rejected");
//         }
//     },1000)
// }).then(function(result){
//     console.log(result)
// }).catch(function(result){
//     console.log(result)
// })


// new Promise(function(resolve,reject){
//     setTimeout(function(){
//         let error = false;
//         if(!error){
//             resolve({name : 'Kirtan', date : '23 Nov 2023'});
//         }else{
//             reject("Promise 3 rejected");
//         }
//     },1000)
// }).then(function(result){
//     console.log(result.name)
// }).catch(function(result){
//     console.log(result)
// }).finally(function(){
//     const din = new Date();
//     console.log((din.getMonth()).toLocaleString())
// })


// const promiseAsync = new Promise(function(resolve,reject){
//     setTimeout(function(){
//         let error = true;
//         if(!error){
//             resolve({name : 'Cristiano', date : 'Ronaldo'});
//         }else{
//             reject("Promise Async Functio rejected");
//         }
//     },1000)
// })

// async function learningAsyncAwait() { //cannot handle error directly 
//                                       //you need to use try catch throw
//     try {
//         const response = await promiseAsync
//         console.log(response)
//     } catch (error) {
//         console.log(error)
//     }
// }
// learningAsyncAwait()

// //fetching data using async await
// async function getData(){
//     const response = await fetch('https://api.github.com/users/notkirtann')
//     const data = await response.json()
//     // console.log(data)
// }
// getData();

// //fecting data using then catch

// fetch('https://api.github.com/users/notkirtann')
// .then((response)=>{
//     return response.json()
// })
// .then((data)=>{
//     console.log(data);
// })
// .catch('Namastee')
