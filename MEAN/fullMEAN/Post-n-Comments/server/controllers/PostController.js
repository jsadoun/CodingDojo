let Post = require("mongoose").model("Post");
let Comment = require("mongoose").model("Comment");

class PostController{
    // /posts/new
    create(req,res){
        let post = new Post(req.body);
        post._user = req.session.user_id;

        post.save((err)=>{
            if(err){
                return res.json({errors:post.errors});
            }else{
                return res.json(post);
            }
        });
    }

    // /posts
    all(req,res){
        Post.find({}, (err,posts)=>{
            if(err){
                return res.json({errors:posts.errors});
            }else{
                return res.json(posts);
            }
        });
    }

    // "/posts/123"
    findById(req,res){
        Post.findOne({_id:req.params.id})
        .populate("Comments")
        .populate("User")
        .exec(
            (err,post)=>{
                if(err){
                    return res.json({errors:"Error looking up post."});
                }else{
                    return res.json(post);
                }
            }
        );
    }
}
