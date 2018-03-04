import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from "@angular/common/http";
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { UserComponent } from './user/user.component';
import {UserService} from './user.service';
import { PostComponent } from './post/post.component';


@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    UserComponent,
    PostComponent
  ],
  imports: [
    FormsModule,
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
  ],
  providers: [
    UserService,
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
