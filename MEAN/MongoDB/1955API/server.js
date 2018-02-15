//REQUIREMENTS
var express = require("express");
var bodyParser = require("body-parser");
var mongoose = require("mongoose");
var app = express();
app.use(bodyParser.json()); //sets body-parser to read JSON


//APPLY SETTINGS
mongoose.connect('mongodb://localhost/1955_api'); //creates&connects a DB named 1955_api


//MODELS
var Schema = mongoose.Schema;
var PersonSchema = new mongoose.Schema({
    name: { type: String, required: true} //the only attribute to Person is their name
});

mongoose.model("Person", PersonSchema); //sets our Person's Schema name to Person 
var Person = mongoose.model("Person");


//ROUTES
//creates root route
app.get('/', function(req, res){
    Person.find({}, function(err, person){
        if(err){
           console.log("Returned error", err);
            // respond with JSON
           res.json({message: "Error", error: err});
        } else {
            // respond with JSON
           res.json(person);
        }
     });
});
//ADDS a person to DB by typing person's name in URL
app.get("/new/:name/", function(req, res){
    var person = new Person({name: (req.params.name)});
    person.save(function(err, person){
        if(err){
            console.log("There is a problem saving to DB");
            res.redirect("/");
        } else {
            console.log("Successfully saved person to DB");
            res.redirect("/");
        }
    });
});
//REMOVES a person from the DB by typig the person's name in the URL
app.get("/remove/:name/", function(req, res){
    console.log(req.params);
    Person.remove({name: req.params.name}, function(err){
        console.log("Deleted Person");
        res.redirect("/");
    });
});
//RETRIEVES and SHOWS a *single* person by typing their name into the URL
app.get('/:name/', function (req, res){
    Person.find({name: req.params.name}, function(err, person){
        console.log(person);
        res.json({message: "Retrieving your Person:", person: person});
    });
});


//SETS OUR SERVER TO LISTEN TO PORT8000
app.listen(8000, function(req, res){
    console.log("Listening on port 8000");
});
