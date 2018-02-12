var express = require("express");
var bodyParser = require("body-parser");
var app = express();

app.use(express.static(__dirname + "/static"));
app.use(bodyParser.urlencoded({extended: true}));
app.set("views", __dirname + "/views");
app.set('view engine', 'ejs');

app.get('/', function(request, response) {
    response.render("index");
})

app.post('/result', function(request, response) {
    console.log(request.body);
    var userInfo = {
        name: request.body.name,
        location: request.body.location,
        language: request.body.language,
        comment: request.body.comment,
    };
    response.render("result", {
        info: userInfo
    });
})

app.listen(8000, function () {
    console.log("listening on port 8000");
})
