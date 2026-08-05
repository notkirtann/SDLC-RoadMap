// $ OBJECT IN TypeScript

let Tea: {
    name:string;
    cost:number;
    isHot:boolean;
    indegredient:string[]
}
Tea ={
    name:"Adrak CHai",
    cost:50,
    isHot:true,
    indegredient:["mai","kya","khud","pr"]
}

type club ={
    name:string;
    rank:number;
    UclQualified:boolean;
    Captains:string[]
}
const RealMadrid:club={
    name:"Real Madrid",
    rank:1,
    UclQualified:true,
    Captains:["Dani","Fede","Vini","Courtois"]
}

//$ DUCK Typing
type Club ={
    name:string
}
let fcb:Club ={name:"FC Barca"}
let rm ={name:"Real Madrid",champs:true}
fcb=rm;

// good practise
type Item={name:string,quantity:number}
type Address={street:string,pincode:number}

type Order = {
    id:string
    item:Item[]
    address:Address
}

// eg-1
type League ={
    name:string
    nation:string
    teams:number
}
const updateLeague = (updates:Partial<League>)=>{
        console.log("updating chai with",updates);
}
updateLeague({name:"La Liga"})
updateLeague({nation:"Spain"})
updateLeague({})

// eg-2
type Manchester ={
    name?:string
    found?:number
}
const Utd = (club:Required<Manchester>)=>{
    console.log(club);
    
} 
Utd({name:"Manchester",found:1905}) //---> with required even optional data becomes mandatory.

// eg-3
type Player ={
    name:string
    price:number
    available:boolean
}

type BasicBuyOption = Pick<Player,"name"|"price">

const PlayerInfo:BasicBuyOption ={
    name:"Valverde",
    price:220
}
// eg-4
// ! in this you use---> type PublicPlayer = Omit<Player,"price"> 
// will omit price from new publicPlayer you will create