import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DashboardComponent } from './dashboard/dashboard.component';
import { UserComponent } from './user/user.component';
import { PostComponent } from './post/post.component';

const routes: Routes = [
  {path:"register", component:UserComponent},
  {path:"dashboard", component:DashboardComponent},
  { path: '', pathMatch: 'full', redirectTo: '/register' },
  { path: '**', component:UserComponent },
  {path: "posts", component:PostComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
