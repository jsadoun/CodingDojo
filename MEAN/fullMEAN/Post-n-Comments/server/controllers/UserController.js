let User = require("mongoose").model("User");

class UserController{
    all(req,res){
        User.find({}, (err,users)=> {
            if(users){
                return res.json(users);
            }else{
                return res.json({errors: "Failed to retrieve users"});
            }
        });
    }

    register(req,res){
        User.findOne({email:req.body.email}, (err,user)=> {
            if(user){
                return res.json({errors:"A user with this email already exists!"});
            }else{
                let newUser = new User (req.body);

                newUser.save((err)=> {
                    if(err){
                        return res.json({errors:newUser.errors});
                    }else{
                        req.session.user_id = newUser.id;
                        return res.json(newUser);
                    }
                });
            }
        });
    }

    login(req,res){
        User.findOne({email:req.body.email}, (err,user)=> {
            if(!user){
                return res.json({errors:"No user with this email was found."});
            }else{
                if(req.body.password == user.password){
                    req.session.user_id = user.id;
                    return res.json(user);
                }else{
                    return res.json({errors:"Invalid password."});
                }
            }
        });
    }

    logout(req, res){
        req.session.user_id = null;
        return res.json(false);

    }
    session(req, res){
        if(req.session.user_id){
            User.findOne({_id:req.session.user_id}, (err,user)=>{
                if(err){
                    return res.json({errors:"Failed to validate session"});
                }else{
                    return res.json(user);
                }
            });
        }else{
            return res.json({errors:"Invalid Session"});
        }
    }

    dashboard(){
        
    }
}

module.exports = new UserController();