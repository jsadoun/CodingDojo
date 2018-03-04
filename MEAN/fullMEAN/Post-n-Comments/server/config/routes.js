let UserController = require("../controllers/UserController.js");
let PostController = require("../controllers/PostController.js");

let path       = require("path");


module.exports = function(app){
    //**** USERS ******
  app.post("/register",UserController.register);
  app.post("/login",UserController.login);
  app.post("/posts/new", PostController.createPost);
  //Catch all route to send the user to the Angular app. Change "public" to your Angular app folder
  app.get("/login",UserController.login);
  app.get("/session", UserController.session);
  app.get("/dashboard", UserController.dashboard);
  app.get("/posts", PostController.allPosts);



    //**** ANGULAR ****
  app.all("*",(req,res,next)=>{
    res.sendFile(path.resolve("./client/dist/index.html"))
  });
}