const express = require('express')
const app = express()
const port = 3000

// for template engine
// http://expressjs.com/ko/guide/using-template-engines.html
app.set('view engine', 'pug'); // 기본예제에서 템플릿 엔진을 사용하기 위해서 추가
app.set('views', './')

app.get('/template', (req, res) => res.render('index', { title: 'Hey', message: `Hello ${req.query.name || 'Noname'}!`}))
// for template engine

app.get('/', (req, res) => res.send('Hello World!'))

app.listen(port, function() {
    console.log(`Example app listening on port ${port}!`)
    console.log('')
    console.log(`http://localhost:${port}/`)
    console.log(`http://localhost:${port}/template`)
    console.log(`http://localhost:${port}/template?name=August`)
    console.log(`http://localhost:${port}/template?name=8월`)
})

