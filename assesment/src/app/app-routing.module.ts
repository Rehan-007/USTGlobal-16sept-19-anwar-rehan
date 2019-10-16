import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddMovieComponent } from './add-movie/add-movie.component';
import { LoginComponent } from './login/login.component';
import { MoviesComponent } from './movies/movies.component';


const routes: Routes = [
  {path : 'movie', component: AddMovieComponent},
  {path : 'login', component: LoginComponent},
  {path : 'movies', component: MoviesComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { };
