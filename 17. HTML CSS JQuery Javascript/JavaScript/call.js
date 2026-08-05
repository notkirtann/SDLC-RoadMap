function setUsernameWithoutCall(username){
    this.username = username;
    console.log('getting called but not return due to local refrence');
    
}

function setDetailsWithoutCall(username,password,email){
    setUsernameWithoutCall(username)
    this.password = password
    this.email = email
}

const A = new setDetailsWithoutCall("cristiano",7,"cristiano@cr7.com")
console.log(A);


// using call and this we will be able to get username also as username is getting called 
//but refernce is in his own execution contest which is setUsername 
// using call and this we can change it. refer Chai aur Code video on call and this

function setUsername(username){
    this.username = username;
    console.log('getting called and also returning');
}

function setDetails(username,password,email){
    setUsername.call(this,username)
    this.password = password
    this.email = email
}

const B = new setDetails("notkirtann",123,"kirtan@fb.com")
console.log(B);

// NOW all this thing can be done in class using SUPER keyword
