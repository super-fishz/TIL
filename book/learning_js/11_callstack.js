function a() {
    console.log('a: calling b')
    b()
    console.log('a: done')
}

function b() {
    console.log('b: calling c')
    try {
        c()
        // 에러 처먹기... <- 이러지 말자....
    } catch(err) {}
    console.log('b: done')
}

function c() {
    console.log('c: throwing error')
    throw new Error('c error')
    console.log('c: done')
}

function d() {
    console.log('d: calling c')
    c()
    console.log('d: done')
}

function logMyErrors(e) {
    console.log(e)
}

// call a
try {
    a()
} catch (err) {
    console.log(err.stack)
}
// call d
try {
    d()
} catch (err) {
    console.log(err.stack)
}
try {
    throw 'myException'; // generates an exception
 }
 catch (e) {
    // statements to handle any exceptions
    logMyErrors(e); // pass exception object to error handler
 }