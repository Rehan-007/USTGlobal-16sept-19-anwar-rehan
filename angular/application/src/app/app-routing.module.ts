import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { FormAComponent } from './forms/form-a/form-a.component';
import { FormBComponent } from './forms/form-b/form-b.component';
import { FormcComponent } from './forms/formc/formc.component';
import { ParentComponent } from './parent/parent.component';
import { CommentDetailsComponent } from './comment-details/comment-details.component';
import { RegisterComponent } from './register/register.component';
import { FormEComponent } from './forms/form-e/form-e.component';


const routes: Routes = [
  {path: 'form-a', component: FormAComponent},
  {path: 'form-b', component: FormBComponent},
  {path: 'form-c', component: FormcComponent},
  {path : 'parent', component: ParentComponent},
  {path : 'comment', component: CommentDetailsComponent},
  {path : 'register', component: RegisterComponent},
  {path : 'form-e', component: FormEComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
