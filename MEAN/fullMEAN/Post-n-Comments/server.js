let express = require("express");
let session = require("express-session");
let bParse  = require("body-parser");
let mongoose = require("mongoose");
let cookie  = require("cookie");
let bcrypt  = require("bcrypt");
let path   = require("path");
let app   = express();
let port   = 8000;
//Change this to the Angular path
app.use(express.static(path.join(__dirname,'/client/dist')));
app.use(bParse.json());
app.use(bParse.urlencoded({ extended: true }));
app.use(session({secret:"key"}));

require("./server/config/mongoose.js");
require("./server/config/routes.js") (app);

app.listen(port,()=>{
  console.log("listening on port "+port);
});
