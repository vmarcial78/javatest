const express = require('express')
const index = express()
const port = 8081

index.use(express.static('publichtml'))

index.get('/',(req,res) => {res.status(200).sendFile(__dirname + '/publichtml/index.html')})

//app.use(express.static())

index.listen (port,()=> console.log(`listening on port: ${port} `))
