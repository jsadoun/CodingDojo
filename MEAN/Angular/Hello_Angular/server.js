const express = require("express");
const bodyParser = require("body-parser");
const port = 8000;
const app = express();


//middleware
app.use(bodyParser.json());
app.use(express.static(__dirname + "/hello-angular/dist"));


// mongoose file
require('./server/config/mongoose');

//routes
require('./server/config/routes')(app);

app.listen(port, () => console.log(`send n00dz to port ${port}...`));