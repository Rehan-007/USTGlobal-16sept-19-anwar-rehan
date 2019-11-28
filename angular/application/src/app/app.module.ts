import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FormsComponent } from './forms/forms.component';
import { FormAComponent } from './forms/form-a/form-a.component';
import { FormBComponent } from './forms/form-b/form-b.component';
import { FormcComponent } from './forms/formc/formc.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { CommentComponent } from './comment/comment.component';
import { CommentDetailsComponent } from './comment-details/comment-details.component';
import { RegisterComponent } from './register/register.component';
import { FormEComponent } from './forms/form-e/form-e.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FormsComponent,
    FormAComponent,
    FormBComponent,
    FormcComponent,
    ParentComponent,
    ChildComponent,
    CommentComponent,
    CommentDetailsComponent,
    RegisterComponent,
    FormEComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
