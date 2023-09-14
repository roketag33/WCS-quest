function hello (name: string) {
    console.log("Hello " + name);
}
const  firstname = "bob";



hello(firstname);
hello(firstname + " marley");

function concat (a: string, b:string){
    return a + b;
}

const wcs = concat("wild",concat("code","school"))

console.log(wcs);

