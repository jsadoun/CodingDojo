import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { Router } from "@angular/router";

@Component({
  selector: 'UserComponent',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})

export class UserComponent implements OnInit {
  private user:any;
  private loggedUser: any;

  constructor(private _us:UserService, private _router:Router) {

  }

  init(){
    this.user = {
      email:"",
      password: "",
      errors:[]
    };

    this.loggedUser = {
      email: "",
      password: "",
      errors: []
    };
  }
  
  ngOnInit() {
    this.init();
    this._us.logout();
  }

  register(){
    this._us.register(this.user,(data)=>{
      if(data.errors){
        this.user.errors = [];
        for(let err in data.errors){
          this.user.errors.push(data.errors[err]);
        }
      }else{
        this._router.navigate(["/dashboard"]);
      }
    });
  }


  login(){
    this._us.login(this.loggedUser, (data)=>{
      if(data.errors){
        this.loggedUser.errors = data.errors;
      }else{
        this.init();
        this._router.navigate(["/dashboard"]);
      }
    });
  }



}
