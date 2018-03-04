import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { Router } from '@angular/router';
import { User } from "../../../../server/models/User";


@Component({
  selector: 'DashboardComponent',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})

export class DashboardComponent implements OnInit {
  private user: any;
  
  constructor(private _us: UserService, private _router: Router) { }

  init(user){
    this.user = user;
  }

  ngOnInit() {
    this._us.session((data)=>{
        if(data.errors){
          this._router.navigate(["/register"]);
        }else{
          this.user = data;
          this.init(data);
        }
    });
  }

}
