let mongoose = require("mongoose");
let ObjectId = mongoose.Schema.Types.ObjectId;

let user = mongoose.model("User",new mongoose.Schema({

  email:{type:String, required:true, minlength:1, maxlength:255},
  password:{type:String, required:true, minlength:4, maxlength:12}

},{timestamps:true}));
