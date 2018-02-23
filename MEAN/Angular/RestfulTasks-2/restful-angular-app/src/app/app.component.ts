import { Component, OnInit } from '@angular/core';
import { TaskService } from './task.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent implements OnInit {  
  title = 'Restful Tasks API';
  num: number;
  randNum: number;
  str: string;
  first_name: string;
  snacks: string[];
  loggedIn: boolean;
  constructor(private _taskService: TaskService){}
  ngOnInit() {
    this.getTasksFromService();
    this.num = 7;
    this.randNum = Math.floor( (Math.random() * 2) + 1);
    this.str = 'Hello Angular Developer!';
    this.first_name = 'Alpha';
    this.snacks = ["brushed suede", "cookie"];
    this.loggedIn = true;
  }
  tasks = [];
  getTasksFromService(){
    let observable = this._taskService.getTasks();
    observable.subscribe(data => {
      console.log("Got our tasks!", data)
      this.tasks = data['tasks'];
    });
  }
}