import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  greet = '';
  isDisabled = true;
  constructor() { }

  ngOnInit() {
  }
 onClick(event) {
   console.log(event.type);
   this.greet = 'welcome to angular';
 }
}
