/**
 * @return {Function}
 */
var createHelloWorld = function() {
    
    return function(...args) {
        var outpur= "Hello World";
        return outpur;
    }
};

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */