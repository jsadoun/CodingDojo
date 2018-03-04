let mongoose = require("mongoose");
let fs    = require("fs");
let path   = require("path");
let modelPath = path.join(__dirname,"../models");
//Connect to your database here
mongoose.connect("mongodb://localhost/post-n-comments");
mongoose.Promise = global.Promise;
fs.readdirSync(modelPath).forEach(function(file) {
  if(file.indexOf(".js") >= 0) {
    require(modelPath+"/"+file);
  }
});
