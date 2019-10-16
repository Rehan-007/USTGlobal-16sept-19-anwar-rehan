import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-add-movie',
  templateUrl: './add-movie.component.html',
  styleUrls: ['./add-movie.component.css']
})
export class AddMovieComponent implements OnInit {
  get movies() {
    return this.form.get('movie');
  }
  get title() {
    return this.form.get('title');
  }
  form = new FormGroup({
    movie : new FormControl('', [Validators.required]),
    title : new FormControl('', [Validators.required]),

  });
  constructor() { }

  ngOnInit() {
  }
  movieData(form) {
    console.log(form);
  }
}
