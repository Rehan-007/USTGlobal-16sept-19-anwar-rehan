import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {
   name = 'Poirei';
   imgUrl = 'https://cdn.pixabay.com/photo/2019/09/26/14/04/etretat-4506073__340.jpg'
   address = 'Btm layout,Ramaappalayout-560068';
   colorName = 'Red';
   isActive = false;
   colSpanValue  = 2;
  constructor() { }

  ngOnInit() {
    setInterval(()=>{
      this.colorName= 'yellow';
      this.isActive = !this.isActive;
    },2000)
  }

}
