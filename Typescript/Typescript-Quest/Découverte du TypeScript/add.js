function hello(name) {
    console.log("Hello " + name);
}
var firstname = "bob";
hello(firstname);
hello(firstname + " marley");
function concat(a, b) {
    return a + b;
}
var wcs = concat("wild", concat("code", "school"));
console.log(wcs);
