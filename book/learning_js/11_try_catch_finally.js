try {
    console.log("실행되는 부분")
    throw new Error("something wrong")
    console.log("에러가 발생해서 실행 안되는 부분")
} catch (err) {
    console.log('캐치블록 뿜뿜')
} finally {
    console.log('언제나 마지막에 뿜뿜')
}