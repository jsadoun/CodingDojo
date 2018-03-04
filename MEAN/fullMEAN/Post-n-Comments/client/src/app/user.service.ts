import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { Router, ActivatedRoute, Params } from "@angular/router";

@Injectable()
export class UserService {
  
  constructor(private _http:HttpClient) { 

  }

  register(user, cb){
    this._http.post("/register", user)
    .subscribe(data=>cb(data));
  }

  login(user,cb){
    this._http.post("/login",user)
    .subscribe(
      data=>cb(data),
      err=>cb(err)
    );
  }

  session(cb){
    this._http.get("/session")
    .subscribe(data=>cb(data));
  }

  logout(){
    this._http.get("/logout")
    .subscribe(data=>{})
  }

  createPost(post, cb){
    this._http.post("/posts/new", post)
    .subscribe(data=>cb(data));
  }

  allPosts(cb){
    this._http.get("/posts")
    .subscribe(data=>cb(data));
  }

  getPostById(cb){
    
  }

  dashboard(cb){
    this._http.get("/dashboard")
    .subscribe(data=>cb(data));
  }
}
