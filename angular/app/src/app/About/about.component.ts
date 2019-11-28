import { Component } from '@angular/core';


@Component({
    selector : 'app-about',
    templateUrl : './about.component.html',
    styleUrls : ['./about.component.css']
})


export class AboutComponent {
    isActive = false;
    constructor() {
        setInterval(() => {
          this.isActive = !this.isActive;
        }, 2000 );
    }
    color = 'yellow';
    colorName = 'blue';

}