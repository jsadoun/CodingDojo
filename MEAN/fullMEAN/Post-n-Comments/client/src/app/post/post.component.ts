import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';

@Component({
  selector: 'PostComponent',
  templateUrl: './post.component.html',
  styleUrls: ['./post.component.css']
})
export class PostComponent implements OnInit {
  private post: any;
  private posts:any;
  private errs:any;

  constructor(private _us: UserService) { }

  create(){
    this._us.createPost(this.post,(data)=>{
      if(data.errors){
        for(let err in data.errors){
          this.post.errors.push(data.errors[err]);
        }
      }else{
        this.posts.push(data);
      }
    });
  }

  ngOnInit() {
    this.post = {
      content:"",
      errors:[]
    }

    this._us.allPosts(
      (data)=>{
        if(data.errors){
          this.errs.push(data.errors);
        }else{
          this.posts = data;
        }
      }
    );
  }
}
