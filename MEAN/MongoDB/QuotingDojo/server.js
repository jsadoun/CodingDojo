//REQUIREMENTS
var express = require("express"); //requires Express module
var bodyParser = require("body-parser"); //requires body-parser to recieve post-data from clients
var app = express(); //creates the Express app
var mongoose = require('mongoose');


//APPLIES SETTINGS
app.use(express.static(__dirname + "/static")); // sets Static folder in directory
app.set("views", __dirname + "/views"); //sets Views folder in directory
app.set('view engine', 'ejs'); //sets View Engine to EJS

app.use(bodyParser.urlencoded({extended: true})); //integrates body-parser w App



//MODULES
mongoose.connect('mongodb://localhost/quoting_dojo'); //Mongoose connects server.js to MongoDB (if not database is present, it will create one)
var Quote = new mongoose.Schema({ //sets attributes to a module 
    name:  { type: String, required: true, minlength: 3},
    quote: { type: String, required: true, maxlength: 250}},
    {timestamps: true }); //creates timestamp
mongoose.model('Quote', Quote); // Setting this Schema in our Models to 'Quote', aka changing the table name
var Quote = mongoose.model('Quote'); // We are retrieving this Schema from our Models, named 'Quote'



//ROUTES
//root route
app.get('/', function(request, response) {
    response.render("index");
});

//quotes route
app.get('/quotes', function(request, response) {
    Quote.find({}, function (err, quotes) {
        response.render("quotes", {quote: quotes})
    });
});

//add user requests
app.post('/add', function(request, response) {
    console.log("POST DATA", request.body); // creates a new Quote with the corresponding name&quote from request.body
    var quote = new Quote ({
        name: request.body.name,
        quote: request.body.quote,
        });
    quote.save(function (err) { //saves info into database and runs a callback funct checking for errors
        if(err) {
            console.log('something went wrong');    // if there is an error console.log that something went wrong!
        } else { 
            console.log('successfully added a user!'); // else log that we did well, then redirect to the root route
            response.redirect('/quotes');
        }
    });
});


//SETS OUR SERVER TO LISTEN TO PORT:8000
app.listen(8000, function () {
    console.log("send n00dz to port 8000");
});
