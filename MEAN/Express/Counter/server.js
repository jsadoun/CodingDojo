var express = require("express");
var session = require("express-session");
var app = express();

app.use(express.static(__dirname + "/static"));
app.set("views", __dirname + "/views");
app.set('view engine', 'ejs');

// dont use session in future projects
app.use(session({
    secret: 'password',
    resave: true,
    saveUninitialized: true, 
    count : 1
}));

// creates a Count route and increments by 1
app.get('/', function (request, response) {
    if (request.session.count == null)
    {request.session.count = 1;}
    else
    {request.session.count += 1;}
    response.render("index", {count : request.session.count});
})

// creates a Count route which increments by 2
app.get('/add2', function (request, response) {
    if (request.session.count == null)
    {request.session.count = 1;}
    else
    {request.session.count += 2;}
    response.redirect("/");
})

// creates a Reset route which resets count to 1
app.get('/reset', function (request, response) {
    {request.session.count = null;}
    response.redirect("/");
})

app.listen(8000, function () {
    console.log("listening on port 8000");
})
