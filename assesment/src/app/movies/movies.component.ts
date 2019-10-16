import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {
  movies : any [] =[];
  search ;
  url;
  constructor(private http : HttpClient) { }

  ngOnInit() {
  }
  ngDoCheck (){
    this.getMovies();
  }
  searchMovie(event){
    this.search=event.target.value;
    console.log(event.target.value);
  }
  getMovies(){
    this.url=`http://www.omdbapi.com/?s=${this.search}&apikey=6bc4aa3e`;
    this.http.get<any> (this.url).subscribe(data=>{
      this.movies=data.search;
    },err=> {
      console.log(err);
    },()=>{
      console.log('movies got successfull');
    })
  }
}
