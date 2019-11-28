import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-event-binding',
  templateUrl: './event-binding.component.html',
  styleUrls: ['./event-binding.component.css']
})
export class EventBindingComponent implements OnInit {
  constructor() {}
  inputData = '';
  printAlertmsg (){
    alert('Hello this is rehan');
  }


  ngOnInit() {
  }
  dataInput(event) {
    console.log(event.target.value);
    this.inputData = event.target.value;
  }
}
