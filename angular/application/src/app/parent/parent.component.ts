import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
  selectedCar ;
  cars = [
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2012/05/29/00/43/car-49278__340.jpg',
      name : 'Bugati'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2017/03/20/08/05/rickshaw-2158447__340.jpg',
      name : 'Aston Martin'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2014/05/03/00/57/vintage-car-336676__340.jpg',
      name : 'Custom'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2017/03/27/14/37/asia-2179107__340.jpg',
      name : 'Rikshaw'
    }
  ]
  constructor() { }

  ngOnInit() {
  }
  sendCar(car){
    this.selectedCar=car;
    console.log(car);
  }
}
