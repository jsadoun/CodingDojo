let mongoose = require("mongoose");
let ObjectId = mongoose.Schema.Types.ObjectId;

mongoose.model('Post', new mongoose.Schema({
    content:{type:String, required:[true, "Post content cannot be blank."], minlength:10, maxlength:1044},
    _user:{type:ObjectId,ref:"User"},
    _comments:[{type:ObjectId,ref:"Comments"}]
},{timestamps:true}));